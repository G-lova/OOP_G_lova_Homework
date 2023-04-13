package Seminar7.controller;

import Seminar7.repository.GBRepository;
import Seminar7.model.Note;

import java.util.List;
import java.util.Objects;

public class NoteController {
    private final GBRepository<Note, Long> repository;



    public NoteController(GBRepository<Note, Long> repository) {
        this.repository = repository;
    }

    public void saveNote(Note note) {
        repository.create(note);
    }

    public Note readNote(Long noteId) throws Exception {
        List<Note> notes = repository.findAll();
        for (Note note : notes) {
            if (Objects.equals(note.getId(), noteId)) {
                return note;
            }
        }

        throw new RuntimeException("User not found");
    }

    public Note findUserById(long id) {
        return repository.findById(id).orElseThrow(()-> new RuntimeException("Note not found."));
    }

    public List<Note> getAllNotes() {
        return repository.findAll();
    }

    public boolean userUpdate(long id, Note update) {
        try {
            repository.update(id, update);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public boolean noteDelete(long id){
        try {
            repository.delete(id);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}