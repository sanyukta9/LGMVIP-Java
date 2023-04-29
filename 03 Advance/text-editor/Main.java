import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //create an object
        textEditor textEditor = new textEditor(null);

        //used jframe to create window
        textEditor.setTitle("Text Editor");
        textEditor.setSize(800, 500);
        textEditor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textEditor.setVisible(true);
        textEditor.setLocationRelativeTo(null);
    }
}

