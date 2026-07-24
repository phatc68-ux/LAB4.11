package com.example.free;
public class TextNote extends Note {
    private String content;
    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return content;
    }
    @Override
    public void getSummary(){

        System.out.println("Title : " + getTitle() + " Date : " + getCreatedDate() + " Content : " + content);

    }

}