package com.Godman.DiaryApp;

import java.util.ArrayList;

public class DiaryApp {
    public ArrayList<Entry> getEntries() {
        return entries;
    }

    ArrayList<Entry> entries = new ArrayList<>();
    private String firstName;
    private String lastName;
    private String password;
    private String email;

    public DiaryApp() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int countEntries() {
        return entries.size();
    }

    public Entry write(String title, String body) {
        Entry entry = new Entry(title, body);
        entry.setId((entries.size()+1)+"");
        entries.add(entry);

        return entry;

    }

    public Entry findEntryById(String id) {
        int index = Integer.parseInt(id);
        return entries.get(index - 1);
    }

    public Entry findEntryByTitle(String title) {
        for (int i = 0; i < entries.size(); i++) {
            Entry found = entries.get(i);
            if (found.getTitle().equals(title))
                return found;
        }
        return null;
    }

    public void deleteEntryById(String id) {
        int index = Integer.parseInt(id);
        entries.remove(index-1);
    }

    public String printEntryById(String id) {
        int index = Integer.parseInt(id);
        Entry result = entries.get(index-1);
        return result.toString();
    }

    public String editTitle(String entryId, String newTitle) {
            int index = Integer.parseInt(entryId);
            if(index <= entries.size()){
                Entry toBeEdited = entries.get(index - 1);
                toBeEdited.setTitle(newTitle);
                return "Success";}
            else{
                return "Entry does not exist";
            }
        }
        }


//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        DiaryApp diaryApp = new DiaryApp();
//        String option = "0";
//
//        while (!option.equals("4")){
//            diaryApp.countEntries();
//            System.out.println();
//            System.out.println("Choose an option");
//            System.out.println("1. Create an Entry");
//            System.out.println("2. Search for an Entry");
//            System.out.println("3. Delete an Entry");
//            System.out.println("End");
//            option = input.nextLine();
//            System.out.println();
//
//
//            }
//
//
//        }
//
//    }
//    public static String writeAnEntry(){
//        return;
//    }
//    public static void findEntryByTitle(){
//        return;
//    }
//}?
