package com.company.Lab3.Observer;

public class CheckNews {

    public static void checkNews(NewsAgency observable) {
        if (observable.getNews().equals("news")) {
            System.out.println("Got news");
        } else {
            System.out.println("No news");
        }
    }

    public static void main(String[] args) {
        Reader observer = new Reader();

        NewsAgency observable1 = new NewsAgency();
        NewsAgency observable2 = new NewsAgency();
        NewsAgency observable3 = new NewsAgency();

        observable1.addObserver(observer);
        observable1.setNews("news");

        observable2.addObserver(observer);
        observable2.setNews("news");

        observable3.addObserver(observer);
        observable3.setNews("hot dogs");

        checkNews(observable1);
        checkNews(observable2);
        checkNews(observable3);
    }
}
