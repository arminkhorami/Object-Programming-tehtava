package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Note;
import model.Notebook;

public class NoteController {
    @FXML private TextField titleField;
    @FXML private TextArea contentArea;
    @FXML private TextArea displayArea;

    private Notebook notebook = new Notebook();

    @FXML
    private void addNote() {
        String title = titleField.getText();
        String content = contentArea.getText();

        if (!title.isEmpty()) {
            Note note = new Note(title, content);
            notebook.addNote(note);

            displayArea.appendText("Title: " + note.getTitle() + "\nContent: " + note.getContent() + "\n---\n");

            titleField.clear();
            contentArea.clear();
        }
    }
}