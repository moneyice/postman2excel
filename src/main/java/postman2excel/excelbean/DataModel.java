/**
 * @author SargerasWang
 */
package postman2excel.excelbean;


import postman2excel.processor.ExcelCell;

/**
 * The <code>DataModel</code>
 * 
 * @author SargerasWang Created at 2014年8月7日 下午5:09:29
 */
public class DataModel {
    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    private int order;

    @ExcelCell(index = 0)
    private String owner;
    @ExcelCell(index = 1)
    private String testcase;
    @ExcelCell(index = 2)
    private String domain;
    @ExcelCell(index = 3)
    private String api;
    @ExcelCell(index = 4)
    private String scenario;
    @ExcelCell(index = 5)
    private String testdata;
    @ExcelCell(index = 6)
    private String header;
    @ExcelCell(index = 7)
    private String inputPayload;


    public DataModel() {

    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTestcase() {
        return testcase;
    }

    public void setTestcase(String testcase) {
        this.testcase = testcase;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    public String getTestdata() {
        return testdata;
    }

    public void setTestdata(String testdata) {
        this.testdata = testdata;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getInputPayload() {
        return inputPayload;
    }

    public void setInputPayload(String inputPayload) {
        this.inputPayload = inputPayload;
    }
}
