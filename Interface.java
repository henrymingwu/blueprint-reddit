import java.util.*;
import java.io.Console;

public class Interface
{
  public int articleCounter;
  public static HashMap<String,User> usersByName;
  public static HashMap<String,Article> articlesByName;
  public static HashMap<String,Community> communitiesByName;
  public static ArrayList<Article> allArticles;
  public static ArrayList<User> allUsers;
  public static ArrayList<Community> allCommunities;
   
    public Interface() {
      articleCounter = 0;
      usersByName = new HashMap<String,User>();
      articlesByName = new HashMap<String,Article>();
      communitiesByName = new HashMap<String,Community>();
      allArticles = new ArrayList<Article>();
      allUsers = new ArrayList<User>(); 
      allCommunities = new ArrayList<Community>();
    } 

    public static void main(String[] args)
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

  class ArticleDateComparator implements Comparator<Article>{
 
    @Override
    public int compare(Article art1, Article art2) {
        return (art1.getDate() > art2.getDate() ? -1 : (art1.getDate()==art2.getDate() ? 0 : 1));
    }
}
  class ArticleFavoritesComparator implements Comparator<Article>{
 
    @Override
    public int compare(Article art1, Article art2) {
        return (art1.getFavorites() > art2.getFavorites() ? -1 : (art1.getFavorites()==art2.getFavorites() ? 0 : 1));
    }
}

    public void addArticle(String author, String title, String content, ArrayList<String> keywords, ArrayList<Community> communities)
    {

    }
    
    public static void printAllUsers() {
      for (User user : allUsers) {
        System.out.println(user.getName());
      } 
    } 
    
    public static void printAllArticles() {
      for (Article article: allArticles) {

        System.out.println(article.getTitle());
      } 
    
    }

    public void printAllCommunities() {
      for (Community comm: allCommunities) {
        System.out.println(comm.getTopic());
      }
    }
    
    public void printAllArticlesFromUser(String username) {
      User user = userByName.get(username);
      if (user == null) {
        System.out.println("No such username exists"); 
        return;
      }
      System.out.print("Here are the articles from user " + username);
      for (Article : user.articles) {
        System.out.println(article.getTitle());
      }
    } 

    public void printAllArticlesFromCommunity(String comm) {
      Community community = communitiesByName.get(comm);
      if (comm == null) {
        System.out.println("No such commmunity exists"); 
        return;
      }
      for (Article art : community.getArticles()) {
        System.println(art.getTitle());
      } 
    }
    
    public void printAllUsersFromCommunity(String comm) {
      Community community = communitiesByName.get(comm);
      if (comm == null) {
        System.out.println("No such commmunity exists"); 
        return;
      }
      for (User user : community.getUsers()) {
        System.println(user.getName());
      } 
    }
 
    public void printArticlesFromPast(String days) {
     Collections.sort(allArticles, new ArticleDateComparator());
     for (int i = 0; i < day && i < allArticles.size(); i++) {
       System.out.println(allArticles.get(i));
     }
    }

    public printTopArticles(String num) {
     Collections.sort(allArticles, new ArticleFavoritesComparator());
     for (int i = 0; i < day && i < allArticles.size(); i++) {
       System.out.println(allArticles.get(i));
     }
    }

    public void addUser(String userName) 
    {
      User user = new User(userName);
      this.allUsers.add(user);
    }

    public static void addCommunity(String topic)
    {

    }
    
    private static void doUserActions(Console c)
    {
        String nextAction = c.readLine("Commands:\n"
            + "printAll,\n"
            + "printUsersInCommunity,\n"
            + "findUser\n");
        if (nextAction.equals("printAll"))
        {
            printAllUsers();
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

    private static void doArticleActions(Console c)
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

    private static void doCommunityActions(Console c)
    {
        String nextAction = c.readLine("Commands:\n"
            + "printAll,\n"
            + "findCommunity,\n");
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
