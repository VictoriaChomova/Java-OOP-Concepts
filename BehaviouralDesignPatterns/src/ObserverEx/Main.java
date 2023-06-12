package ObserverEx;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency ();

        NewChannel newsChannel1 = new NewChannel ();
        NewChannel newsChannel2 = new NewChannel ();

        newsAgency.registerObserver (newsChannel1);
        newsAgency.registerObserver (newsChannel2);

        newsAgency.setNews ("Breaking news: Java example code for Observer pattern!");

        newsAgency.removeObserver (newsChannel2);

        newsAgency.setNews ("More breaking news: Java example code for Observer pattern improved!");
    }
}
