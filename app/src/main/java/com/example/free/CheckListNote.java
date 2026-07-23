package com.example.free;
public class CheckListNote extends Note {
    public String item;
    public CheckListNote() {

    }
    public void addItem(String item) {
        this.item = item;
    }
    @Override
    public void getSummary() {
        System.out.println("Title : " + title + " Date : " + createdDate + " Item : " + item);
    }

}