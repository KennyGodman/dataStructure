package com.Godman.DiaryApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EntryTest {
    Entry entry;

    @BeforeEach
    public void setUp(){
        entry = new Entry("unique", "ink");

    }

    @Test
    public void testThatEntryExist() {
        assertNotNull(entry);
    }

    @Test
    public void testThatEntryHasTitle() {
        entry.setTitle("GodMan");
        assertNotNull("Godman", entry.getTitle());
    }

    @Test
        public void testThatEntryHasBody(){
            entry.setBody("Pages");
            assertEquals("Pages",entry.getBody());
        }
    @Test
    public void testThatEntryHasTime(){
        assertNotNull("23-07-2022 08:11 PM", entry.getLocalDateTime());
    }
}
