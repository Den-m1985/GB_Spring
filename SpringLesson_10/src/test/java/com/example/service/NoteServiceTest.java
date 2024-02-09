package com.example.service;

import com.example.model.Note;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class NoteServiceTest {
    @InjectMocks
    private NoteService noteService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAllNotesTest() {
        Note note = new Note("TestTitle", "TestContent");
        List<Note> expectedNotes = Collections.singletonList(note);
        when(noteService.getAllNotes()).thenReturn(expectedNotes);
        List<Note> actualNotes = noteService.getAllNotes();
        assertEquals(expectedNotes, actualNotes);
    }

}
