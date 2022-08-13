package com.Godman.DiaryApp;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Entry {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
    private String title;
    private String body;

    private LocalDateTime localDateTime = LocalDateTime.now();
    public Entry(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setBody(String body){
        this.body = body;
    }

    public String getTitle() {
        return title;
    }
    public String getBody() {
        return body;
    }

//    @Override
//    public String toString() {
//        return "Entry{" +
//                "id='" + id + '\'' +
//                ", title='" + title + '\'' +
//                ", body='" + body + '\'' +
//                ", localDateTime=" + localDateTime +
//                '}';
//    }

    @Override
    public String toString() {
        return "id for this entry is "+id+
                "\n Title is "+title+ "\n Body is "+body+".";
    }

    public String getLocalDateTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a");
        String dateCreated = dateTimeFormatter.format(localDateTime);
        return dateCreated;
    }



}
