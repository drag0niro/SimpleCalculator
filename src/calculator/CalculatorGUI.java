package calculator;

import java.awt.*;
import javax.swing.*;

public class CalculatorGUI extends JFrame
{
    double x;
    double y;
    double z;
    boolean newSolution = false;
    boolean addOp = false;
    boolean subtractOp = false;
    boolean divideOp = false;
    boolean multiplyOp = false;
    
    JPanel gui = new JPanel(new GridLayout(4,1));
    JPanel row1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JPanel row2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JPanel row3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JPanel row4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
                  
    JButton addButton = new JButton("+");
    JButton subtractButton = new JButton("-");
    JButton multiplyButton = new JButton("*");
    JButton divideButton = new JButton("/");
    JButton equalButton = new JButton("=");
    
    JButton zeroButton = new JButton("0");
    JButton oneButton = new JButton("1");
    JButton twoButton = new JButton("2");
    JButton threeButton = new JButton("3");
    JButton fourButton = new JButton("4");
    JButton fiveButton = new JButton("5");
    JButton sixButton = new JButton("6");
    JButton sevenButton = new JButton("7");
    JButton eightButton = new JButton("8");
    JButton nineButton = new JButton("9");
    
    
    JTextArea textArea = new JTextArea();
   

        public CalculatorGUI()
        {
            textArea.setEditable(false);
            
            row1.add(zeroButton);
            row1.add(oneButton);
            row1.add(twoButton);
            row1.add(threeButton);
            row1.add(addButton);
            
            row2.add(fourButton);
            row2.add(fiveButton);
            row2.add(sixButton);
            row2.add(sevenButton);
            row2.add(subtractButton);
            
            row3.add(eightButton);
            row3.add(nineButton);
            row3.add(multiplyButton);
            row3.add(divideButton);
            row3.add(equalButton);
            
            gui.add(row1);
            gui.add(row2);
            gui.add(row3);
            
            add(textArea, BorderLayout.CENTER);
            add(gui, BorderLayout.SOUTH);
            
            zeroButton.addActionListener(event -> zeroDigitPrint());
            oneButton.addActionListener(event -> oneDigitPrint());
            twoButton.addActionListener(event -> twoDigitPrint());
            threeButton.addActionListener(event -> threeDigitPrint());
            addButton.addActionListener(event -> addOperation());
            fourButton.addActionListener(event -> fourDigitPrint());
            fiveButton.addActionListener(event -> fiveDigitPrint());
            sixButton.addActionListener(event -> sixDigitPrint());
            sevenButton.addActionListener(event -> sevenDigitPrint());
            subtractButton.addActionListener(event -> substractOperation());
            eightButton.addActionListener(event -> eightDigitPrint());
            nineButton.addActionListener(event -> nineDigitPrint());
            multiplyButton.addActionListener(event -> multiplyOperation());
            divideButton.addActionListener(event -> divideOperation());
            equalButton.addActionListener(event -> equalOperation());
            
        }

    private void zeroDigitPrint() 
    {
        if (!newSolution)
        textArea.append("0");
        else
        {
            newSolution = false;
            textArea.setText("");
            textArea.append("0");
        }
    }

    private void oneDigitPrint() 
    {
        if (!newSolution)
        textArea.append("1");
        else
        {
            newSolution = false;
            textArea.setText("");
            textArea.append("1");
        }
    }

    private void twoDigitPrint() 
    {
        if (!newSolution)
        textArea.append("2");
        else
        {
            newSolution = false;
            textArea.setText("");
            textArea.append("2");
        }
    }

    private void threeDigitPrint() 
    {
       if (!newSolution)
        textArea.append("3");
        else
        {
            newSolution = false;
            textArea.setText("");
            textArea.append("3");
        }
    }


    private void fourDigitPrint() 
    {
        if (!newSolution)
        textArea.append("4");
        else
        {
            newSolution = false;
            textArea.setText("");
            textArea.append("4");
        }
    }

    private void fiveDigitPrint() 
    {
        if (!newSolution)
        textArea.append("5");
        else
        {
            newSolution = false;
            textArea.setText("");
            textArea.append("5");
        }
    }

    private void sixDigitPrint() 
    {
        if (!newSolution)
        textArea.append("6");
        else
        {
            newSolution = false;
            textArea.setText("");
            textArea.append("6");
        }
    }

    private void sevenDigitPrint() 
    {
        if (!newSolution)
        textArea.append("7");
        else
        {
            newSolution = false;
            textArea.setText("");
            textArea.append("7");
        }
    }

    private void eightDigitPrint() 
    {
        if (!newSolution)
        textArea.append("8");
        else
        {
            newSolution = false;
            textArea.setText("");
            textArea.append("8");
        }
    }

    private void nineDigitPrint() 
    {
        if (!newSolution)
        textArea.append("9");
        else
        {
            newSolution = false;
            textArea.setText("");
            textArea.append("9");
        }
    }
    
    private void addOperation() 
    {
        x = Double.parseDouble(textArea.getText());
        newSolution = true;
        addOp = true;
    }
    
    private void substractOperation() 
    {
        x = Double.parseDouble(textArea.getText());
        newSolution = true;
        subtractOp = true;
    }

    private void multiplyOperation() 
    {
        x = Double.parseDouble(textArea.getText());
        newSolution = true;
        multiplyOp = true;
    }

    private void divideOperation() 
    {
        x = Double.parseDouble(textArea.getText());
        newSolution = true;
        divideOp = true;
    }

    private void equalOperation() 
    {
        y = Double.parseDouble(textArea.getText());
        if (y == 0 && divideOp)
        {
            textArea.setText("Error! You can't divide by 0.");
            newSolution = true;   
        }
        else 
        {
            textArea.setText(solution(x,y));
            addOp = false;
            multiplyOp = false;
            divideOp = false;
            subtractOp = false; 
        }
    }
    
    private String solution(double x, double y)
    {
        this.x = x;
        this.y = y;
        if (addOp)
        z = x+y;    
        else if (multiplyOp)
        z = x*y;       
        else if (divideOp && y != 0)
        z = x/y;         
        else if (subtractOp)
        z = x-y;
        else
        textArea.setText("Error!");
        
        String solution = Double.toString(z);
        newSolution = true;
        return solution;
    }

    
    
}


