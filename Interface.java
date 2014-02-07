import java.util.*;

public class Interface
{
  public int articleCounter;
  public HashMap<String,User> usersByName;
  public HashMap<String,Article> articlesByName;
  public HashMap<String,Community> communitiesByName;
  public ArrayList<Article> allArticles;
  public ArrayList<User> allUsers;
  public ArrayList<Community> allCommunities;
   
    public Interface() {
      articleCounter = 0;
      usersByName = new HashMap<String,User>();
      articlesByName = new HashMap<String,Article>();
      communitiesByName = new HashMap<String,Community>();
      allArticles = new ArrayList<Article>();
      allUsers = ArrayList<User>(); 
      allCommunities = ArrayList<Community>();
    } 

    public void addArticle(String author, String title, String content, ArrayList<String> keywords, ArrayList<Community> communities)
    {

    }
    
    public void printAllUsers() {
      for (User user : allUsers) {
        System.out.println(user.getName()) {
      } 
    } 
    
    public void printAllArticles() {
      for (Article article: allArticles) {
        System.out.println(articles.getName()) {
      } 
    
    }
    
    public void printAllArticlesFromUser(String username) {
      User user = 
      if (user == null) {
        return;
      }
      System.out.print 
      for (Article : user.articles) {
        System. 
    } 

    public void printAllArticlesFromCommunity(String comm) {

    }
 
    public void printArticlesFromPast(String days) {

    }

    public printTopArticles(String num) {

    }

    public void addUser(String userName) 
    {

    }

    public void addCommunity(String topic)
    {

    }
    

    public static void main(String[] args)
    {

    }

}
