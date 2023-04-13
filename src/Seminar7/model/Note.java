package Seminar7.model;

import java.util.Date;

public class Note {
    private Long id;
    private String date;
    private String title;
    private String text;

    public Note(String date, String title, String text) {
        this.date = date;
        this.title = title;
        this.text = text;
    }

    public Note(String title, String text) {
        this(new Date().toString(), title, text);
    }

    public Note(Long id, String date, String title, String text) {
        this(date, title, text);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getDate() {
        return date.toString();
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("Идентификатор: %s\nДата: %s\nЗаголовок: %s\nТекст: %s", id, date, title, text);
    }

    @Override
    public boolean equals(Object obj) {
        if (((Note) obj).id == this.id) return true;
        return false;
    }
}