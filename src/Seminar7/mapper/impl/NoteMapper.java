package Seminar7.mapper.impl;

import Seminar7.mapper.Mapper;
import Seminar7.model.Note;

public class NoteMapper implements Mapper<Note, String> {
    @Override
    public String toInput(Note note) {
        return String.format("%s,%,%s,%s", note.getId(), note.getDate(), note.getTitle(), note.getText());
    }

    @Override
    public Note toOutput(String s) {
        String[] lines = s.split(",");
        long id;
        if (isDigit(lines[0])) {
            id = Long.parseLong(lines[0]);
            return new Note(id, lines[1], lines[2], lines[3]);
        }
        throw new NumberFormatException("Id must be a large number");
    }

    private boolean isDigit(String s) throws NumberFormatException {
        try {
            Long.parseLong(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}