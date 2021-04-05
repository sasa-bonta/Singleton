package com.company.Lab3.Observer;

import java.util.Observable;

public class NewsAgency extends Observable {
    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }

    public String getNews() {
        return news;
    }
}
