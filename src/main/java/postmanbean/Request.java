package postma2excel.postmanbean;
import java.util.List;
public class Request {
private String id;

private String headers;

private String url;

private PathVariables pathVariables;

private String preRequestScript;

private String method;

private String collectionId;

private List<Data> data ;

private String dataMode;

private String name;

private String description;

private String descriptionFormat;

private long time;

private int version;

private List<Response> responses ;

private String tests;

private String currentHelper;

private HelperAttributes helperAttributes;

private String rawModeData;

public void setId(String id){
this.id = id;
}
public String getId(){
return this.id;
}
public void setHeaders(String headers){
this.headers = headers;
}
public String getHeaders(){
return this.headers;
}
public void setUrl(String url){
this.url = url;
}
public String getUrl(){
return this.url;
}
public void setPathVariables(PathVariables pathVariables){
this.pathVariables = pathVariables;
}
public PathVariables getPathVariables(){
return this.pathVariables;
}
public void setPreRequestScript(String preRequestScript){
this.preRequestScript = preRequestScript;
}
public String getPreRequestScript(){
return this.preRequestScript;
}
public void setMethod(String method){
this.method = method;
}
public String getMethod(){
return this.method;
}
public void setCollectionId(String collectionId){
this.collectionId = collectionId;
}
public String getCollectionId(){
return this.collectionId;
}
public void setData(List<Data> data){
this.data = data;
}
public List<Data> getData(){
return this.data;
}
public void setDataMode(String dataMode){
this.dataMode = dataMode;
}
public String getDataMode(){
return this.dataMode;
}
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
public void setDescription(String description){
this.description = description;
}
public String getDescription(){
return this.description;
}
public void setDescriptionFormat(String descriptionFormat){
this.descriptionFormat = descriptionFormat;
}
public String getDescriptionFormat(){
return this.descriptionFormat;
}
public void setTime(long time){
this.time = time;
}
public long getTime(){
return this.time;
}
public void setVersion(int version){
this.version = version;
}
public int getVersion(){
return this.version;
}
public void setResponses(List<Response> responses){
this.responses = responses;
}
public List<Response> getResponses(){
return this.responses;
}
public void setTests(String tests){
this.tests = tests;
}
public String getTests(){
return this.tests;
}
public void setCurrentHelper(String currentHelper){
this.currentHelper = currentHelper;
}
public String getCurrentHelper(){
return this.currentHelper;
}
public void setHelperAttributes(HelperAttributes helperAttributes){
this.helperAttributes = helperAttributes;
}
public HelperAttributes getHelperAttributes(){
return this.helperAttributes;
}
public void setRawModeData(String rawModeData){
this.rawModeData = rawModeData;
}
public String getRawModeData(){
return this.rawModeData;
}

}