package com.example.service;

import com.example.model.Note;
import com.example.repository.NoteRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NoteServiceIntegrationTest {

    @Autowired
    private NoteService noteService;
    @Autowired
    private NoteRepository noteRepository;

    @Before
    public void setUp() {
        //Очищаем базуданных перед каждым тестом
        noteRepository.deleteAll();
    }

    @Test
    public void getAllNotesIntegrationTest() {
        Note note = new Note("TestTitle", "TestContent");
        noteService.createNote(note);
        List<Note> notes = noteService.getAllNotes();
        assertTrue(notes.size() > 0);
        assertEquals(note.getHeader(), notes.get(0).getHeader());
    }

}
