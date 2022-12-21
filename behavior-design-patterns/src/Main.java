import ObserverPattern.NewsMachine;
import ObserverPattern.NewsSubscriber;

public class Main {
    public static void main(String[] args) {
        testObserverPattern();
    }

    public static void testObserverPattern(){
        NewsMachine newsMachine = new NewsMachine();
        NewsSubscriber sub1 = new NewsSubscriber("Kyle Kim");
        NewsSubscriber sub2 = new NewsSubscriber("Grace Kim");
        NewsSubscriber sub3 = new NewsSubscriber("Alex Lee");

        newsMachine.add(sub1);
        newsMachine.add(sub2);
        newsMachine.add(sub3);

        newsMachine.setNewsInfo("News Title 1", "News Contents 1");
        newsMachine.printAllInfo();

        newsMachine.delete(sub1);

        newsMachine.setNewsInfo("News Title 500", "News Contents 500");
        newsMachine.printAllInfo();
    }
}