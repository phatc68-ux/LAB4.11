package com.example.free;
public class TextNote extends Note {
    public String content;
    public TextNote() {
    }
    public void getSummary() {
        System.out.println("Title: " + title + ", Date: " + createdDate + ", Content: " + content);
    }
}