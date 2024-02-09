package com.example.service;

import com.example.model.Note;
import com.example.repository.NoteRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class FillDataBase implements CommandLineRunner {
    private NoteRepository noteRepository;


    @Override
    public void run(String... args) {

        // Добавление нескольких товаров
        noteRepository.save(new Note("message", "Text"));
        noteRepository.save(new Note("message", "Text"));
        noteRepository.save(new Note("message", "Text"));
        noteRepository.save(new Note("message", "Text"));
    }

}
