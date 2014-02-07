import java.util.*;

public class User
{
    private String name;
    private ArrayList<Article> articles;

    public User(String name)
    {
        this.name = name;
    }

    public static void main(String[] args)
    {
        System.out.println("main");
    }

    public String getName()
    {
        return this.name;
    }

    public ArrayList<Article> getArticles()
    {
        return this.articles;
    }


}