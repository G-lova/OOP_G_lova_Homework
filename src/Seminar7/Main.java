package Seminar7;

import Seminar7.controller.NoteController;
import Seminar7.model.Note;
import Seminar7.repository.GBRepository;
import Seminar7.repository.impl.NoteRepository;
import Seminar7.view.NoteView;

import static Seminar5.notebook.log.Logger.createLogFile;
import static Seminar5.notebook.util.DBConnector.DB_PATH;
import static Seminar5.notebook.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        createLogFile();
        FileOperation fileOperation = new FileOperation(DB_PATH);
        GBRepository<Note, Long> repository = new NoteRepository(fileOperation);
        NoteController controller = new NoteController(repository);
        NoteView view = new NoteView(controller);
        view.run();
    }
}