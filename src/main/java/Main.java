import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main {
    public static class Calculator extends JFrame implements ActionListener, WindowListener {
        private TextField field = new TextField();
        private JButton b7 = new JButton("7");
        private JButton b8 = new JButton("8");
        private JButton b9 = new JButton("9");
        private JButton b4 = new JButton("4");
        private JButton b5 = new JButton("5");
        private JButton b6 = new JButton("6");
        private JButton b1 = new JButton("1");
        private JButton b2 = new JButton("2");
        private JButton b3 = new JButton("3");
        private JButton bDot = new JButton(".");
        private JButton b0 = new JButton("0");
        private JButton bPar = new JButton("=");
        private JButton bC = new JButton("C");
        private JButton bDivision = new JButton("/");
        private JButton bMultiplication = new JButton("*");
        private JButton bMinus = new JButton("-");
        private JButton bPlus = new JButton("+");
        private String text = "";
        private int a = 0;
        private int b = 0;
        private char z;

        public Calculator() {
            Font font = new Font("Arial", Font.BOLD, 32);
            setTitle("Calculator");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setBounds(900, 200, 370, 500);
            setLayout(null);
            field.setBounds(30, 40, 300, 60);
            add(field);
            field.setFont(font);
            b7.setBounds(30,120,60,60);
            b7.setFont(font);
            add(b7);
            b8.setBounds(110,120,60,60);
            b8.setFont(font);
            add(b8);
            b9.setBounds(190,120,60,60);
            b9.setFont(font);
            add(b9);
            bC.setBounds(270,120,60,60);
            bC.setFont(font);
            add(bC);
            b4.setBounds(30,200,60,60);
            b4.setFont(font);
            add(b4);
            b5.setBounds(110,200,60,60);
            b5.setFont(font);
            add(b5);
            b6.setBounds(190,200,60,60);
            b6.setFont(font);
            add(b6);
            bDivision.setBounds(270,200,60,60);
            bDivision.setFont(font);
            add(bDivision);
            b1.setBounds(30,280,60,60);
            b1.setFont(font);
            add(b1);
            b2.setBounds(110,280,60,60);
            b2.setFont(font);
            add(b2);
            b3.setBounds(190,280,60,60);
            b3.setFont(font);
            add(b3);
            bMultiplication.setBounds(270,280,60,60);
            bMultiplication.setFont(font);
            add(bMultiplication);
            b0.setBounds(110,360,60,60);
            b0.setFont(font);
            add(b0);
            bPar.setBounds(190,360,60,60);
            bPar.setFont(font);
            add(bPar);
            bMinus.setBounds(270,360,60,60);
            bMinus.setFont(font);
            add(bMinus);
            bPlus.setBounds(30,360,60,60);
            bPlus.setFont(font);
            add(bPlus);
            b0.addActionListener(this);
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
            b6.addActionListener(this);
            b7.addActionListener(this);
            b8.addActionListener(this);
            b9.addActionListener(this);
            bMinus.addActionListener(this);
            bMultiplication.addActionListener(this);
            bPar.addActionListener(this);
            bPlus.addActionListener(this);
            bDot.addActionListener(this);
            bDivision.addActionListener(this);
            bC.addActionListener(this);
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==b0){
                text = text + b0.getText();
                field.setText(text);
            }
            if (e.getSource()==bC){
                text = "";
                field.setText(text);
            }
            if (e.getSource()==b1){
                text = text + b1.getText();
                field.setText(text);
            }
            if (e.getSource()==b2){
                text = text + b2.getText();
                field.setText(text);
            }
            if (e.getSource()==b3){
                text = text + b3.getText();
                field.setText(text);
            }
            if (e.getSource()==b4){
                text = text + b4.getText();
                field.setText(text);
            }
            if (e.getSource()==b5){
                text = text + b5.getText();
                field.setText(text);
            }
            if (e.getSource()==b6){
                text = text + b6.getText();
                field.setText(text);
            }
            if (e.getSource()==b7){
                text = text + b7.getText();
                field.setText(text);
            }
            if (e.getSource()==b8){
                text = text + b8.getText();
                field.setText(text);
            }
            if (e.getSource()==b9){
                text = text + b9.getText();
                field.setText(text);
            }
            if (e.getSource()==bDivision){
                a = Integer.parseInt(text);
                field.setText(text + bDivision.getText());
                text = "";
                z = '/';
            }
            if (e.getSource()==bMinus){
                a = Integer.parseInt(text);
                field.setText(text + bMinus.getText());
                text = "";
                z = '-';
            }
            if (e.getSource()==bMultiplication){
                a = Integer.parseInt(text);
                field.setText(text + bMultiplication.getText());
                text = "";
                z = '*';
            }
            if (e.getSource()==bPlus){
                a = Integer.parseInt(text);
                field.setText(text + bPlus.getText());
                text = "";
                z = '+';
            }
            if (e.getSource()==bPar){
                if (z == '+'){
                    b = Integer.parseInt(text);
                    field.setText(String.valueOf(a + b));
                }
                if (z == '-'){
                    b = Integer.parseInt(text);
                    field.setText(String.valueOf(a - b));
                }
                if (z == '*'){
                    b = Integer.parseInt(text);
                    field.setText(String.valueOf(a * b));
                }
                if (z == '/'){
                    b = Integer.parseInt(text);
                    field.setText(String.valueOf(a / b));
                }
            }
        }

        @Override
        public void windowOpened(WindowEvent e) {

        }
        @Override
        public void windowClosing(WindowEvent e) {

        }
        @Override
        public void windowClosed(WindowEvent e) {

        }
        @Override
        public void windowIconified(WindowEvent e) {

        }
        @Override
        public void windowDeiconified(WindowEvent e) {

        }
        @Override
        public void windowActivated(WindowEvent e) {

        }
        @Override
        public void windowDeactivated(WindowEvent e) {

        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}