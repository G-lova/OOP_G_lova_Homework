package Seminar7.view;

import Seminar7.controller.NoteController;
import Seminar7.log.Logger;
import Seminar7.model.Note;
import Seminar7.util.Commands;

import java.util.List;
import java.util.Scanner;

public class NoteView {
    private final NoteController noteController;

    public NoteView(NoteController noteController) {
        this.noteController = noteController;
    }

    public void run(){
        Commands com;

        while (true) {
            String command = prompt("Введите команду: ");
            com = Commands.valueOf(command);
            StringBuilder logStr = new StringBuilder(com.toString());
            logStr.append(": ");
            if (com == Commands.EXIT) {
                logStr.append("successful");
                Logger log = new Logger(logStr.toString());
                return;
            }
            switch (com) {
                case CREATE:
                    String title = prompt("Заголовок: ");
                    String text = prompt("Текст: ");
                    Note noteToCreate = new Note(title, text);
                    noteController.saveNote(noteToCreate);
                    logStr.append("successful: ").append(noteToCreate.getId())
                            .append(",").append(title).append(",")
                            .append(text);
                    break;
                case READ:
                    String id = prompt("Идентификатор пользователя: ");
                    try {
                        Note noteToRead = noteController.readNote(Long.parseLong(id));
                        System.out.println(noteToRead);
                        System.out.println();
                        logStr.append("successful: ").append("ID: ").append(noteToRead.getId());
                    } catch (Exception e) {
                        logStr.append("ERROR ").append(e);
                        Logger log = new Logger(logStr.toString());
                        throw new RuntimeException(e);
                    }
                    break;
                case LIST:
                    List<Note> notes = noteController.getAllNotes();
                    System.out.println("----------");
                    for(Note note: notes) {
                        System.out.println(note);
                        System.out.println("----------");
                    }
                    logStr.append("successful");
                    break;
                case UPDATE:
                    long noteId = Long.parseLong(prompt("Input note id: "));
                    String updateTitle = prompt("Заголовок: ");
                    String updateText = prompt("Текст: ");
                    Note updatedNote = new Note(updateTitle, updateText);
                    noteController.userUpdate(noteId, updatedNote);
                    logStr.append("successful: ").append(noteId).append(",").append(updateTitle)
                            .append(",").append(updateText);
                    break;
                case DELETE:
                    long noteToDelId = Long.parseLong(prompt("Input note id: "));
                    noteController.noteDelete(noteToDelId);
                    logStr.append("successful: ID: ").append(noteToDelId);
                    break;
            }
            Logger log = new Logger(logStr.toString());
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}