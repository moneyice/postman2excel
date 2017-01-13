package postman2excel;

import com.alibaba.fastjson.JSON;
import com.google.common.io.Files;
import postma2excel.postmanbean.Collection;
import postma2excel.postmanbean.Request;
import postman2excel.excelbean.DataModel;
import postman2excel.processor.ExcelSheet;
import postman2excel.processor.ExcelUtil;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

/**
 * Created by bing.a.qian on 1/13/2017.
 */
public class Postman2Excel {
    private Properties properties;
    private String[] headers = {"Owner","TestCase","Domain","API","Scenario","Test Data","Header","Input payload","Expected result","Output payload","status","Issue"};
    public Postman2Excel(){
        properties = new Properties();
        try {
            properties.load(new FileInputStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public void run(){
        String rootFolder=properties.getProperty("postman.json.directory");
        File rootFolderDirectory=new File(rootFolder);
        File outputFile=new File(properties.getProperty("output.file"));

        File[] files=rootFolderDirectory.listFiles();
        List<ExcelSheet<DataModel>> sheetList=new ArrayList<ExcelSheet<DataModel>>();
        for (File file: files) {
            ExcelSheet<DataModel> sheetModel=convertSheetModel(file);
            if(sheetModel!=null){
                sheetList.add(sheetModel);
            }
        }
        try {
            OutputStream out =new FileOutputStream(outputFile);
            ExcelUtil.exportExcel(sheetList, out);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ExcelSheet<DataModel> convertSheetModel(File file) {
        ExcelSheet<DataModel> sheetModel=null;

        try {
            String rs = Files.toString(file, Charset.forName("UTF-8"));
            Collection collection = JSON.parseObject(rs, Collection.class);
            java.util.Collection<DataModel> dataModelList= convertDataModel(collection);
            sheetModel=new ExcelSheet<DataModel>();
            String[] nameSnippets=file.getName().split("_");
            if(nameSnippets.length<=1){
                sheetModel.setSheetName(nameSnippets[0]);
            }else{
                sheetModel.setSheetName(nameSnippets[1]);
            }

            sheetModel.setDataset(dataModelList);
            sheetModel.setHeaders(headers);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sheetModel;
    }

    private java.util.Collection<DataModel> convertDataModel(Collection collection){
        List<Request> requestList=collection.getRequests();
        final List<String> orderList= collection.getOrder();
        String owner=properties.getProperty("owner.name");

        Collections.sort(requestList, new Comparator<Request>() {
            public int compare(Request r1, Request r2) {
                Integer positionData1=getPosition(orderList,r1);
                Integer positionData2=getPosition(orderList,r2);
                return positionData1.compareTo(positionData2);
            }

            private int getPosition(List<String> orderList, Request r) {
                for (int i = 0; i < orderList.size(); i++) {
                    if(orderList.get(i).equals(r.getId())){
                        return i;
                    }
                }
                return 0;
            }
        });

        java.util.Collection<DataModel> dataset=new ArrayList<DataModel>();
        for (Request request: requestList) {
            DataModel model=new DataModel();
            model.setOwner(owner);
            model.setTestcase(request.getName());
            model.setDomain("domain");
            model.setApi("API");
            model.setScenario("scenario");
            model.setTestdata(request.getMethod()+" "+request.getUrl());
            model.setHeader(request.getHeaders());
            model.setInputPayload(request.getRawModeData());
            dataset.add(model);
        }
        return dataset;
    }


}
