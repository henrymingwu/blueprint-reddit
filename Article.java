import java.util.*;

public class Article {

private int favorites;
private int date;
private User user;
private ArrayList<Community> communities;
private ArrayList<String> keywords;
private String title;
private String content;

public Article(int fav,int date, User user, ArrayList<Community> comm, 
  ArrayList<String> keys, String title, String content) {
  this.favorites = fav;
  this.date = date;
  this.user = user;
  this.communities = comm;
  this.keywords = keys; 
  this.title = title; 
  this.content = content;
}

public int getFavorites() {
  return this.favorites;  
}

public int getDate() {
  return this.date;  
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

public int setDate(int date) {
  this.date = date;
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
