import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        int money = Integer.parseInt(JOptionPane.showInputDialog("enter the amount of cash you would like to convert"));
        String currency = JOptionPane.showInputDialog("Write your currency(USD,EUR,TND,PND)");
        String conv = JOptionPane.showInputDialog("convert currency (USD,EUR,TND,PND)");
        if ("EUR".equals(currency))
        {
            if ("USD".equals(conv))
            {
                double eurusd = money*1.1;
                JOptionPane.showMessageDialog(null,eurusd+"in euros");

            }
            else if ("TND".equals(conv))
            {
                double eurtnd = money*3.39;
                JOptionPane.showMessageDialog(null,eurtnd+" in dinar");

            }
            else if ("PND".equals(conv))
            {
                double eurpnd = money*0.87;
                JOptionPane.showMessageDialog(null,eurpnd+" in pounds");

            }
        }
        else if ("USD".equals(currency))
        {
            if ("EUR".equals(conv))
            {
                double usdeur =money*0.91;
                JOptionPane.showMessageDialog(null,usdeur+" in eur");

            }
            else if ("TND".equals(conv))
            {
                double usdtnd =money*3.08;
                JOptionPane.showMessageDialog(null,usdtnd+" in dinar");

            }
            else if ("PND".equals(conv))
            {
                double usdpnd =money*0.79;
                JOptionPane.showMessageDialog(null,usdpnd+" in pnd");

            }
        }
        else if ("TND".equals(currency))
        {
            if ("EUR".equals(conv))
            {
                double tndeur =money*0.29;
                JOptionPane.showMessageDialog(null,tndeur+" in eur");

            }
            else if ("USD".equals(conv))
            {
                double tndusd =money*0.32;
                JOptionPane.showMessageDialog(null,tndusd+" in dollars");

            }
            else if ("PND".equals(conv))
            {
                double tndpnd =money*0.26;
                JOptionPane.showMessageDialog(null,tndpnd+" in pounds");

            }
        }
        else if ("PND".equals(currency))
        {
            if ("TND".equals(conv))
            {
                double pndtnd =money*3.92;
                JOptionPane.showMessageDialog(null,pndtnd+" in dinars");

            }
            else if ("EUR".equals(conv))
            {
                double pndeur =money*1.15;
                JOptionPane.showMessageDialog(null,pndeur+" in euros");

            }
            else if ("USD".equals(conv))
            {
                double pndusd =money*1.27;
                JOptionPane.showMessageDialog(null,pndusd+" in dollars");

            }
        }
        else {
            JOptionPane.showMessageDialog(null,"please enter a valid currency");
        }
    }
}