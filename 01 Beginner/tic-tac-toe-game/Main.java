import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        try {

            //create an object
            TicTacToe tictactoe = new TicTacToe();

            //Used JFrame to create window
            tictactoe.setTitle("Tic Tac Toe");
            tictactoe.setVisible(true);
            tictactoe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            tictactoe.setSize(500, 500);
            tictactoe.setLocationRelativeTo(null);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
