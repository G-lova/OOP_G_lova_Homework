package Seminar7.repository.impl;

import Seminar7.FileOperation;
import Seminar7.repository.GBRepository;
import Seminar7.model.Note;
import Seminar7.mapper.impl.NoteMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NoteRepository implements GBRepository<Note, Long> {
    private final NoteMapper mapper;
    private final FileOperation operation;

    public NoteRepository(FileOperation operation) {
        this.mapper = new NoteMapper();
        this.operation = operation;
    }

    @Override
    public List<Note> findAll() {
        List<String> lines = operation.readAll();
        List<Note> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.toOutput(line));
        }
        return users;
    }

    @Override
    public Note create(Note note) {
        List<Note> notes = findAll();
        long max = 0L;
        for (Note n : notes) {
            long id = n.getId();
            if (max < id){
                max = id;
            }
        }
        long next = max + 1;
        note.setId(next);
        notes.add(note);
        List<String> lines = new ArrayList<>();
        for (Note n: notes) {
            lines.add(mapper.toInput(n));
        }
        operation.saveAll(lines);
        return note;
    }

    @Override
    public Optional<Note> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Note> update(Long id, Note update) {
        try {
            List<Note> notes = findAll();
            Note updateNote = notes.stream().filter(u -> u.getId().equals(id)).findFirst().get();
            updateNote.setTitle(update.getTitle());
            updateNote.setText(update.getText());
            List<String> list = new ArrayList<>();
            for(Note note: notes) {
                list.add(mapper.toInput(note));
            }
            operation.saveAll(list);
            return Optional.of(updateNote);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean delete(Long id) {
        try {
            List<Note> notes = findAll();
            List<String> list = new ArrayList<>();
            for (Note n : notes) {
                if (n.getId() != id) list.add(mapper.toInput(n));
            }
            operation.saveAll(list);
            return true;
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public NoteMapper getMapper() {
        return mapper;
    }
}