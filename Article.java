import java.util.*;

public class Article {

private int favorites;
private int date;
private User user;
private ArrayList<Community> community;
private ArrayList<String> keywords;
private String title;
private String content;

public Article(int fav,int date, User user, ArrayList<Community> comm, 
  ArrayList<String> keys, String title, String content) {
  this.favorites = fav;
  this.date = date;
  this.user = user;
  this.community = comm;
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
  return this.community;
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

public void setFavorites(int num) {
  this.favorites = num; 
}

public void setDate(int date) {
  this.date = date;
}

public void setUser(User user) {
  this.user = user;
}

public void setCommunity(ArrayList<Community> comm) {
  this.community = comm;
}

public void setKeywords(ArrayList<String> keys) {
  this.keywords = keys;
}

public void setTitle(String title) {
  this.title = title;
}

public void setContent(String con) {
  this.content = con;
}
}
