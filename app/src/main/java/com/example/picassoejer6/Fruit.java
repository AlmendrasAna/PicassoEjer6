package com.example.picassoejer6;

public class Fruit {
    private String name;
    private String url;
    private String info;

    public Fruit(String name, String url, String info) {
        this.name = name;
        this.url = url;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getInfo() {
        return info;
    }
}
