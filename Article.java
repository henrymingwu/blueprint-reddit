import java.util.*;

public class Article {

private int favorites;
private User user;
private ArrayList<Community> communities;
private ArrayList<String> keywords;
private String title;
private String content;

public int getFavorites() {
  return this.favorites;  
}

public User getUser() {
  return this.user;  
}

public ArrayList<Community> getCommunity() {
  return this.communities;
}

public ArrayList<String> getKeywords() {
  return this.keywords;
}

public String getTitle() {
  return this.title;
}

public String getContent() {
  return this.content;
}

public int setFavorites(int num) {
  this.favorites = num; 
}

public User setUser(User user) {
  this.user = user;
}

public ArrayList<Community> setCommunity(Community comm) {
  this.community = comm;
}

public ArrayList<String> setKeywords(ArrayList<String> keys) {
  this.keywords = keys;
}

public String setTitle(String title) {
  this.title = title;
}

public String setContent(String con) {
  this.content = con;
}
