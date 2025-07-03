package com.example.myapp;

public class Concert {

    String title;
    String date;

    public Concert(String title, String date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle(){
        return title;
    }

    public String getDate(){
        return date;
    }

   /*public String user;
    public String title;
    public String date;
    public String category;
    private int price;
    public int getPrice() { return price;}
    public String seat;
    public List<String> images;
    public String review;*/    //json 연결 이후 사용
}
