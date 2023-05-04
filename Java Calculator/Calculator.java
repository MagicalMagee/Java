
// To build the buttons, textField, frames
import javax.swing.*;
// To provide event needed for the app
import java.awt.event.*;
// To build the font
import java.awt.*;

// A class that will enable users to interact with the calculator
public class Calculator implements ActionListener{
    // Frame, Font, Buttons
    JFrame frame;
    JTextField txtField;
    JButton[] numButton = new JButton[10];
    JButton[] opButton = new JButton[9];
    JButton addButton, subButton, multiButton, divButton, 
            equalButton, clrButton, delButton, negButton, decButton;
    Font myFont = new Font("Times New Roman", Font.PLAIN, 15);
    
    // Variables for Calculations
    double val1;
    double val2;
    double result;
    char op;
    
    Calculator(){
        
        // Frame of the calculator
        frame = new JFrame("Calculator");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300,450);
        frame.setLayout(null);
        
        // Textfield
        txtField = new JTextField();
        txtField.setBounds(15,10,255,60);
        txtField.setFont(myFont);
        txtField.setEditable(false);
        
        // Operator and Function Buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        divButton = new JButton("/");
        multiButton = new JButton("x");
        clrButton = new JButton("Clr");
        delButton = new JButton("Del");
        equalButton = new JButton("=");
        negButton = new JButton("-");
        decButton = new JButton(".");
        
        // Assign Operator and Function Buttons to an 
        // array to get everything set for the application 
        // for the font, visibility, and as a clickable button
        opButton[0] = addButton;
        opButton[1] = subButton;
        opButton[2] = divButton;
        opButton[3] = multiButton;
        opButton[4] = clrButton;
        opButton[5] = delButton;
        opButton[6] = equalButton;
        opButton[7] = negButton;
        opButton[8] = decButton;
        
        //Number Buttons
        for(int i = 0; i < 10; i++){
            numButton[i] = new JButton(String.valueOf(i));
            numButton[i].addActionListener(this);
            numButton[i].setFont(myFont);
            numButton[i].setFocusable(false);
        }
        
        //Operator Buttons
        for(int i = 0; i < 9; i++){
            opButton[i].addActionListener(this);
            opButton[i].setFont(myFont);
            opButton[i].setFocusable(false);
        }
        
        // Sets each button to its own position, width, and height
        // WIDTH 360 HEIGHT 420
        clrButton.setBounds(15,80,60,60);
        delButton.setBounds(145,80,60,60);
        divButton.setBounds(210,80,60,60);
        numButton[7].setBounds(15,145,60,60);
        numButton[8].setBounds(80,145,60,60);
        numButton[9].setBounds(145,145,60,60);
        multiButton.setBounds(210,145,60,60);
        numButton[4].setBounds(15,210,60,60);
        numButton[5].setBounds(80,210,60,60);
        numButton[6].setBounds(145,210,60,60);
        subButton.setBounds(210,210,60,60);
        numButton[1].setBounds(15,275,60,60);
        numButton[2].setBounds(80,275,60,60);
        numButton[3].setBounds(145,275,60,60);
        addButton.setBounds(210,275,60,60);
        negButton.setBounds(15,340,60,60);
        numButton[0].setBounds(80,340,60,60);
        decButton.setBounds(145,340,60,60);
        equalButton.setBounds(210,340,60,60);
        
        //Opens the calculator
        frame.add(txtField);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(divButton);
        frame.add(numButton[7]);
        frame.add(numButton[8]);
        frame.add(numButton[9]);
        frame.add(multiButton);
        frame.add(numButton[4]);
        frame.add(numButton[5]);
        frame.add(numButton[6]);
        frame.add(subButton);
        frame.add(numButton[1]);
        frame.add(numButton[2]);
        frame.add(numButton[3]);
        frame.add(addButton);
        frame.add(negButton);
        frame.add(numButton[0]);
        frame.add(decButton);
        frame.add(equalButton);
	frame.setVisible(true);
	}
    
    public static void main(String[] args) {
        // Constructs the Calculator
        Calculator calc = new Calculator();
    }
    
    @Override
    public void actionPerformed(ActionEvent act) {
        // TODO Auto-generated method stub
        
        // Clear TextField/Box
        if(act.getSource() == clrButton) {
            txtField.setText("");
        }
        
        // Delete recent input but not the entirety
        if(act.getSource() == delButton) {
            String temp = txtField.getText();
            txtField.setText("");
            for (int i = 0; i < temp.length()-1; i++) {
                txtField.setText(txtField.getText() + temp.charAt(i));
            }
        }
        
        // Takes the string from the txtField and store it as a double for
        // calculation then clear the entire txtField
        if(act.getSource() == divButton) {
            val1 = Double.parseDouble(txtField.getText());
            op = '/';
            txtField.setText("");
        }
        
        // Adds a decimal after the input value
        for(int i = 0; i < 10; i++){
            if(act.getSource() == numButton[i]){
                txtField.setText(txtField.getText().concat(String.valueOf(i)));
            }
        }
        
        // Takes the string from the txtField and store it as a double for
        // calculation then clear the entire txtField
        if(act.getSource() == multiButton) {
            val1 = Double.parseDouble(txtField.getText());
            op = '*';
            txtField.setText("");
        }
        
        // Takes the string from the txtField and store it as a double for
        // calculation then clear the entire txtField
        if(act.getSource() == subButton) {
            val1 = Double.parseDouble(txtField.getText());
            op = '-';
            txtField.setText("");
        }
        
        // Takes the string from the txtField and store it as a double for
        // calculation then clear the entire txtField
        if(act.getSource() == addButton) {
            val1 = Double.parseDouble(txtField.getText());
            op = '+';
            txtField.setText("");
        }
        
        // Takes the string from the txtField and store it as a double then
        // converts it to a negative value for calculation then clear the 
        // entire txtField
        if(act.getSource() == negButton) {
            val1 = Double.parseDouble(txtField.getText());
            val1 = val1 * -1;
            txtField.setText(String.valueOf(val1));
        }
        
        // Takes the string from the txtField and add a decimal point after it
        if(act.getSource() == decButton) {
            txtField.setText(txtField.getText() + ".");
        }
        
        // Takes the string from the txtField and stores the second inputed
        // value as a double then it goes through the switch. When one of the
        // cases has caught the operator that has been inputed in the calculator
        // it will then do the calculations after
        if(act.getSource() == equalButton) {
            val2 = Double.parseDouble(txtField.getText());
            
            // The switch will be able to catch to what operator has been used
            // and it will then do the calculations and store it in result
            switch(op) {
                case '+':
                    result = val1 + val2;
                    break;
                case '-':
                    result = val1 - val2;
                    break;
                case '*':
                    result = val1 * val2;
                    break;
                case '/':
                    result = val1 / val2;
                    break;
            }
            
            // After calculations, the result will be posted in the txtField
            txtField.setText(String.valueOf(result));
            
            // val1 will store the result in the event that any further
            // calculation is needed
            val1 = result;
        }
    }
}