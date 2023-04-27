import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args) {
        try{
            //create an object
            currencyConvert curr_conv = new currencyConvert();

            //Used JFrame to create window
            curr_conv.setTitle("Currency Converter"); 
            curr_conv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            curr_conv.setSize(300, 400);
            curr_conv.setLocationRelativeTo(null);
            curr_conv.setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}