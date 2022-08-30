import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        FUNCTIONS f = new FUNCTIONS();


        JFrame frame = new JFrame("Basic Calculator");
        frame.setSize(400, 550);
        frame.getContentPane().setBackground(Color.BLUE);

        JLabel copyrightL = new JLabel("© 2022 Shahinur Alam Bhuiyan, All rights reserved.");
        frame.add(copyrightL);
        copyrightL.setBounds(30, 450, 400, 50);
        copyrightL.setFont(new Font("Serif",  Font.ITALIC, 13));
//        copyrightL.setForeground();

        // -----------------------------------------------------

        JTextField display = new JTextField();
        frame.add(display);
        display.setBounds(15, 15, 370, 60);
        display.setEnabled(false);

        display.setFont(new Font ("Serif", Font.BOLD, 20));


        // -----------------------------------------------------

        JButton b_seven = new JButton("7");
        frame.add(b_seven);
        b_seven.setBounds(15, 90, 113, 60);

        JButton b_eight = new JButton("8");
        frame.add(b_eight);
        b_eight.setBounds(144, 90, 113, 60);

        JButton b_nine = new JButton("9");
        frame.add(b_nine);
        b_nine.setBounds(270, 90, 113, 60);


        b_seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.equals(null))
                    display.setText("7");
                else
                    display.setText(display.getText().concat("7"));
            }
        });

        b_eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.equals(null))
                    display.setText("8");
                else
                    display.setText(display.getText().concat("8"));
            }
        });

        b_nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.equals(null))
                    display.setText("9");
                else
                    display.setText(display.getText().concat("9"));
            }
        });

        // -----------------------------------------------------
        JButton b_four = new JButton("4");
        frame.add(b_four);
        b_four.setBounds(15, 165, 113, 60);

        JButton b_five = new JButton("5");
        frame.add(b_five);
        b_five.setBounds(144, 165, 113, 60);

        JButton b_six = new JButton("6");
        frame.add(b_six);
        b_six.setBounds(270, 165, 113, 60);

        b_four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.equals(null))
                    display.setText("4");
                else
                    display.setText(display.getText().concat("4"));
            }
        });

        b_five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.equals(null))
                    display.setText("5");
                else
                    display.setText(display.getText().concat("5"));
            }
        });

        b_six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.equals(null))
                    display.setText("6");
                else
                    display.setText(display.getText().concat("6"));
            }
        });

        // -----------------------------------------------------
        JButton b_one = new JButton("1");
        frame.add(b_one);
        b_one.setBounds(15, 240, 113, 60);

        JButton b_two = new JButton("2");
        frame.add(b_two);
        b_two.setBounds(144, 240, 113, 60);

        JButton b_three = new JButton("3");
        frame.add(b_three);
        b_three.setBounds(270, 240, 113, 60);

        b_one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.equals(null))
                    display.setText("1");
                else
                    display.setText(display.getText().concat("1"));
            }
        });

        b_two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.equals(null))
                    display.setText("2");
                else
                    display.setText(display.getText().concat("2"));
            }
        });

        b_three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.equals(null))
                    display.setText("3");
                else
                    display.setText(display.getText().concat("3"));
            }
        });

        // -----------------------------------------------------
        JButton b_zero = new JButton("0");
        frame.add(b_zero);
        b_zero.setBounds(15, 315, 113, 60);

        JButton b_plus = new JButton("+");
        frame.add(b_plus);
        b_plus.setBounds(144, 315, 113, 60);

        JButton b_minus = new JButton("-");
        frame.add(b_minus);
        b_minus.setBounds(270, 315, 113, 60);

        b_zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.equals(null))
                    display.setText("0");
                else
                    display.setText(display.getText().concat("0"));
            }
        });
        b_plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                 f.doSum(Integer.parseInt(display.getText()), display.getText());
                display.setText(display.getText().concat("+"));
            }
        });

        b_minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                 f.doSum(Integer.parseInt(display.getText()), display.getText());
                display.setText(display.getText().concat("-"));
            }
        });

        // -----------------------------------------------------
        JButton b_clear = new JButton("CLEAR");
        frame.add(b_clear);
        b_clear.setBounds(15, 390, 242, 60);

        JButton b_equal = new JButton("=");
        frame.add(b_equal);
        b_equal.setBounds(270, 390, 113, 60);

        b_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(null);
            }
        });

        b_equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                for(int i = 0; i < display.getText().length(); i++)
//                {
                    int count = -1;
                    int lengthOfString = display.getText().length();
                    if(display.getText().contains("+"))
                    {
                        count = display.getText().indexOf('+');
                    }
                    else if(display.getText().contains("-"))
                    {
                        count = display.getText().indexOf('-');
                    }
                    String firstPart = display.getText().substring(0, count);
                    String secondPart = display.getText().substring(count+1,lengthOfString);

                    if(display.getText().contains("+"))
                    {
                        int sum = Integer.parseInt(firstPart) + Integer.parseInt(secondPart);
                        display.setText(Integer.toString(sum));
                    }
                    else if(display.getText().contains("-"))
                    {
                        int subtract = Integer.parseInt(firstPart) - Integer.parseInt(secondPart);
                        display.setText(Integer.toString(subtract));
                    }
//                }
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
    }
}



class FUNCTIONS{
    public int doSum(int prevSum, String str)
    {
        int sum = prevSum + Integer.parseInt(str);
        return sum;
    };
}