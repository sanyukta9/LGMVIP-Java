import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        //create an object
        ScientificCal ScientificCal = new ScientificCal();

        //use jframe to create window
        ScientificCal.setTitle("Scientific Calculator"); 
        ScientificCal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ScientificCal.setSize(500, 500);
        ScientificCal.setVisible(true);
        ScientificCal.setLocationRelativeTo(null);

    }
}


