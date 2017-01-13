package postma2excel.postmanbean;
import java.util.List;
public class Collection {
private String id;

private String name;

private String description;

private List<String> order ;

private List<Folder> folders ;

private long timestamp;

private String owner;


private List<Request> requests ;

public void setId(String id){
this.id = id;
}
public String getId(){
return this.id;
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
public void setOrder(List<String> order){
this.order = order;
}
public List<String> getOrder(){
return this.order;
}
public void setFolders(List<Folder> folders){
this.folders = folders;
}
public List<Folder> getFolders(){
return this.folders;
}
public void setTimestamp(long timestamp){
this.timestamp = timestamp;
}
public long getTimestamp(){
return this.timestamp;
}
public void setOwner(String owner){
this.owner = owner;
}
public String getOwner(){
return this.owner;
}

public void setRequests(List<Request> requests){
this.requests = requests;
}
public List<Request> getRequests(){
return this.requests;
}

}