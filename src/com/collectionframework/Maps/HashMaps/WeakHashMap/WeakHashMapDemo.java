package com.collectionframework.Maps.HashMaps.WeakHashMap;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

    private static void simulateAppRunning() {
        try {
            System.out.println("App is running");
            Thread.sleep(5000);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        WeakHashMap<String, Image> imgCache = new WeakHashMap<>();
        imgCache.put(new String("img1"), new Image("img1.jpeg"));
        imgCache.put(new String("img2"), new Image("img2.jpeg"));
        System.out.println(imgCache);
        System.gc();
        simulateAppRunning();
        System.out.println(imgCache);
    }
}

class Image {
    private final String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;

    }
}