package com.example.free;
public abstract class Note {
    protected String title;
    protected String createdDate;
    public Note() {
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCreatedDate() {
        return createdDate;
    }
    public abstract void getSummary();

}