package org.prince.behavior.observer;


import java.util.ArrayList;
import java.util.List;

class YouTubeChannel implements Subject {

    private List<Observer> subscribers = new ArrayList<>();
    private String videoTitle;

    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    public void uploadVideo(String title) {
        this.videoTitle = title;
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.update(videoTitle);
        }
    }
}


