package calculator;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Calculator 
{

    public static void main(String[] args) 
    {
        CalculatorGUI app = new CalculatorGUI();
        app.setTitle("Calculator");
        app.setVisible(true);
        app.setSize(300, 300);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
