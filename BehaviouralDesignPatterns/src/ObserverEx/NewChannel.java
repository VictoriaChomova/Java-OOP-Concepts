package ObserverEx;

public class NewChannel implements Observer {
    public String news;

    public void update(String news) {
        this.news = news;
        System.out.println ("Received news: " + news);
    }
}
