package com.example.free;

public class Note {
    //Attribute
    String title;
    String content;
    String createdDate;
    //Method
    void getSummary(){
        System.out.println(title+":"+content+"("+createdDate+")");
    }
}
