import java.util.Scanner;
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        int money = Integer.parseInt(JOptionPane.showInputDialog("enter the amount of cash you would like to convert"));
        String currency = JOptionPane.showInputDialog("Write your currency(USD,EUR,TND,PND)");
        String conv = JOptionPane.showInputDialog("convert currency (USD,EUR,TND,PND)");
        if ("EUR".equals(currency))
        {

        }
        else if ("USD".equals(currency))
        {

        }
        else if ("TND".equals(currency))
        {

        }
        else if ("PND".equals(currency))
        {

        }
        else {
            JOptionPane.showMessageDialog(null,"please enter a valid currency");
        }
    }
}