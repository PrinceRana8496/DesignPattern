package org.prince.behavior.observer;

public class ObserverDemo {
    public static void main(String[] args) {

        YouTubeChannel channel = new YouTubeChannel();

        Subscriber s1 = new Subscriber("Prince");
        Subscriber s2 = new Subscriber("Rahul");

        channel.subscribe(s1);
        channel.subscribe(s2);

        channel.uploadVideo("Observer Pattern Explained");
    }
}
