package com.bkacad.nnt.lab1listviewd02k11;

import java.io.Serializable;

public class Country implements Serializable {
    private String url;
    private String name;
    private String capital;
    private String description;

    public Country() {
    }

    public Country(String url, String name, String capital, String description) {
        this.url = url;
        this.name = name;
        this.capital = capital;
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Country{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
