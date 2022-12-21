package ObserverPattern;

public class NewsSubscriber implements Observer{
    private String name;
    private String title;
    private String news;

    public NewsSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String title, String news) {
        this.title = title;
        this.news = news;
    }
}
