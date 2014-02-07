import java.util.*;

public class Community {
    
    public String topic;
    public ArrayList<Article> articles;
    public ArrayList<User> users;

    public Community(String genre) {
        topic = genre;
    }


    public String getTopic() {
        return topic;
    }

    public void addUser(User a) {
        if (!users.contains(a)) {
            users.add(a);
        }
    }

    public void addArticle(Article a) {
        if (!articles.contains(a)) {
            articles.add(a);
        }
        
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }




}
