package com.Godman.DiaryApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryAppTest {
    private DiaryApp diaryApp;


    @BeforeEach
    public void setUp() {
        diaryApp = new DiaryApp();
    }
    @Test
    public void testThatDiaryExists() {
        assertNotNull(diaryApp);
    }

    @Test
    public void testThatDiaryIsEmpty(){
        assertEquals( 0, diaryApp.countEntries());
    }

    @Test
    public void testThatDiaryCanWriteAndSaveEntries() {
        diaryApp.write("Best Colour", "Best Food");
        assertEquals(1, diaryApp.countEntries());
    }
    @Test
    public void testThatDiaryCanFindEntry() {
        diaryApp.write("Best Colour", "Best Food");
        Entry result = diaryApp.findEntryById("1");
        assertNotNull(result);
        assertEquals("Best Colour", result.getTitle());
    }
    @Test
    public void testThatDiaryCanFindEntryByTitle() {
        diaryApp.write("Best Colour", "Best Food");
        Entry status = diaryApp.findEntryByTitle("Best Colour");
        assertNotNull(status);
        assertEquals("Best Colour", status.getTitle());
    }
    @Test
    public void testThatDiaryCanWriteMultipleTimes() {
        diaryApp.write("Best Colour", "Best Food");
        diaryApp.write("Best Pet", "Best Sport");
        diaryApp.write("Best Music", "Best Song");
        assertEquals(3, diaryApp.countEntries());
    }
    @Test
    public void testThatDiaryCanDeleteAnEntry(){
        diaryApp.write("Best Colour", "Best Food");
        diaryApp.write("Best Pet", "Best Sport");
        diaryApp.write("Best Music", "Best Song");
        diaryApp.deleteEntryById("2");
        assertEquals(2,diaryApp.countEntries());
    }
    @Test
    public void testThatDiaryCanViewEntry(){
        diaryApp.write("Best Colour", "Best Food");
        diaryApp.write("Best Pet", "Best Sport");
        diaryApp.write("Best Music", "Best Song");

        assertEquals("id for this entry is null\n" +
                " Title is Best Pet\n" +
                " Body is Best Sport.", diaryApp.printEntryById("2"));

    }
    @Test
    public void testThatEntryTitleCanBeEdited(){
        Entry written = diaryApp.write("Best Colour", "Best Food");
        assertEquals(1, diaryApp.countEntries());
        assertEquals("Best colour", written.getTitle());
        diaryApp.editTitle("1", "favourite food");
        assertEquals("Best drink", written.getTitle());
    }




//    }

//    @Test
//    public void writeAnEntry(){
//        assertNotNull(diaryApp);
//    }
//    @Test
//    public void findEntryByTitle(){
//        assertNotNull(diaryApp);
//    }
//
//    @Test
//    public void set
    }
//}
