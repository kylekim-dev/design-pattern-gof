package ObserverPattern;

import java.util.ArrayList;

public class NewsMachine implements Publisher {
    private ArrayList<Observer> observers;
    private String title;
    private String news;

    public NewsMachine(){
        observers = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        int index = observers.indexOf(observer);
        observers.remove(index);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers){
            observer.update(this.title, this.news);
        }
    }

    public void setNewsInfo(String title, String news){
        this.title = title;
        this.news = news;
        notifyObserver();
    }

    public String getTitle(){
        return this.title;
    }

    public String getNews(){
        return this.news;
    }

    public void printAllInfo(){
        int observerIndex = 1;
        for (Observer observer: observers){
            System.out.println("Subscriber ID: " + observerIndex + "Title: " + this.title + ", News: " + this.news);
            observerIndex++;
        }
    }
}
