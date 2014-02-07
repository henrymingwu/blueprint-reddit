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

    public static void main(string[] args)
    {
        Console c = System.console();
        if (c == null)
        {
            System.err.println("No console");
            System.exit(1);
        }

        String firstCommand = c.readLine("Commands:\n"
            + "Users,\n"
            + "Article,\n"
            + "Community\n");
        if (firstCommand.equals("Users"))
        {
            doUserActions(c);
        } 
        else if (firstCommand.equals("Articles"))
        {
            doArticleActions(c);
        }
        else if (firstCommand.equals("Community"))
        {
            doCommunityActions(c);
        }
        else
        {
            System.err.println("Cannot understand. Start over pls");
            System.exit(1);
        }

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

    public void addUser(String userName) 
    {

    }

    public void addCommunity(String topic)
    {

    }
    
    private void doUserActions(Console c)
    {
        String nextAction = c.readLine("Commands:\n"
            + "printAll,\n"
            + "printUsersInCommunity,\n"
            + "findUser\n");
        if (nextAction.equals("printAll"))
        {
            //printAll
        } 
        else if (nextAction.equals("printUsersInCommunity"))
        {
            String community = c.readLine("What community?");

            //printComm
        }
        else if (nextAction.equals("findUser"))
        {
            String userName = c.readLine("What user?");

            //doCommunityActions(c);
        }
        else
        {
            System.err.println("Cannot understand. Start over pls");
            System.exit(1);
        }
    }

    private void doArticleActions(Console c)
    {
        String nextAction = c.readLine("Commands:\n"
            + "printAll,\n"
            + "printArticlesInCommunity,\n"
            + "mostFavorited\n");
        if (nextAction.equals("printAll"))
        {
            //printAll
        } 
        else if (nextAction.equals("printArticlesInCommunity"))
        {
            String community = c.readLine("What community?");

            //printComm
        }
        else if (nextAction.equals("mostFavorited"))
        {
            //doCommunityActions(c);
        }
        else
        {
            System.err.println("Cannot understand. Start over pls");
            System.exit(1);
        }
    }

    private void doCommunityActions(Console c)
    {
        String nextAction = c.readLine("Commands:\n"
            + "printAll,\n"
            + "findCommunity,\n"
        if (nextAction.equals("printAll"))
        {
            //printAll
        } 
        else if (nextAction.equals("findCommunity"))
        {
            String community = c.readLine("What community?");

            //printComm
        }
        else if (nextAction.equals("mostFavorited"))
        {
            //doCommunityActions(c);
        }
        else
        {
            System.err.println("Cannot understand. Start over pls");
            System.exit(1);
        }

    }

}
