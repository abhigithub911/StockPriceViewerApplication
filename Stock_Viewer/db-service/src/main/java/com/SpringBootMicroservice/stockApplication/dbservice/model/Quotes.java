package com.SpringBootMicroservice.stockApplication.dbservice.model;

import java.util.List;

//The model that the user is going to push
public class Quotes {

    private String username;
    private List<String> quotes;

    public Quotes() {
    }

    public Quotes(String username, List<String> quotes) {
        this.username = username;
        this.quotes = quotes;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<String> quotes) {
        this.quotes = quotes;
    }
}
