package com.robosh.copy;

public class WikiPage implements Copyable{
    private int id;
    private String title;
    private String text;

    public WikiPage(int id, String title, String text) {
        this.id = id;
        this.title = title;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "WikePage{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}' + '\n';
    }

    public Copyable copy() {
        WikiPage copy = new WikiPage(id, title, text);
        return copy;
    }
}
