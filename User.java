import java.util;

public class User
{
    private string name;
    private ArrayList<Article> articles;

    public User(String name)
    {
        this.name = name;
    }

    public static void main(string[] args)
    {
        System.out.println("main");
    }

    public String getName()
    {
        return this.name;
    }

    public void getArticles()
    {
        return this.articles;
    }


}