package nanales.calc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calc2 implements ActionListener {

    JFrame CalcFrame;
    JPanel CalcPanel;
    JTextField txt, txt2, txt3, txt4;
    int a = 0;
    double num1, num2, res, math;
    char o;

    public void innit() {

        CalcFrame = new JFrame("Calculator");
        CalcFrame.setSize(319, 441);
        CalcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CalcFrame.setLocationRelativeTo(null);

        CalcPanel = new JPanel();
        CalcFrame.setContentPane(CalcPanel);
        CalcPanel.setBackground(Color.WHITE);
        CalcPanel.setLayout(null);

        txt = new JTextField();
        txt.setHorizontalAlignment(SwingConstants.RIGHT);
        txt.setFont(new Font("Tahoma", Font.PLAIN, 35));
        txt.setForeground(Color.black);
        txt.setBounds(10, 40, 283, 40);
        txt.requestFocus();
        CalcPanel.add(txt);

        txt2 = new JTextField();
        txt2.setBounds(175, 11, 35, 27);
        txt2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        txt2.setForeground(Color.BLACK);
        txt2.setBackground(Color.WHITE);
        txt2.setEditable(false);
        CalcPanel.add(txt2);

        txt3 = new JTextField();
        txt3.setHorizontalAlignment(SwingConstants.CENTER);
        txt3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        txt3.setForeground(Color.BLACK);
        txt3.setEditable(false);
        txt3.setColumns(10);
        txt3.setBackground(Color.WHITE);
        txt3.setBounds(210, 11, 30, 27);
        CalcPanel.add(txt3);

        txt4 = new JTextField();
        txt4.setHorizontalAlignment(SwingConstants.CENTER);
        txt4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        txt4.setForeground(Color.BLACK);
        txt4.setEditable(false);
        txt4.setColumns(10);
        txt4.setBackground(Color.WHITE);
        txt4.setBounds(235, 11, 38, 27);
        CalcPanel.add(txt4);

        JButton btn1 = new JButton("1");
        btn1.setBounds(20, 312, 48, 34);
        CalcPanel.add(btn1);

        JButton btn2 = new JButton("2");
        btn2.setBounds(89, 312, 48, 34);
        CalcPanel.add(btn2);

        JButton btn3 = new JButton("3");
        btn3.setBounds(159, 312, 48, 34);
        CalcPanel.add(btn3);

        JButton btn4 = new JButton("4");
        btn4.setBounds(20, 267, 48, 34);
        CalcPanel.add(btn4);

        JButton btn5 = new JButton("5");
        btn5.setBounds(89, 267, 48, 34);
        CalcPanel.add(btn5);

        JButton btn6 = new JButton("6");
        btn6.setBounds(159, 267, 48, 34);
        CalcPanel.add(btn6);

        JButton btn7 = new JButton("7");
        btn7.setBounds(20, 222, 48, 34);
        CalcPanel.add(btn7);

        JButton btn8 = new JButton("8");
        btn8.setBounds(89, 222, 48, 34);
        CalcPanel.add(btn8);

        JButton btn9 = new JButton("9");
        btn9.setBounds(159, 222, 48, 34);
        CalcPanel.add(btn9);

        JButton btn0 = new JButton("0");
        btn0.setBounds(89, 357, 48, 34);
        CalcPanel.add(btn0);

        JButton btnpm = new JButton("+/-");
        btnpm.setBounds(20, 357, 48, 34);
        CalcPanel.add(btnpm);

        JButton btndot = new JButton(".");
        btndot.setBounds(159, 357, 48, 34);
        CalcPanel.add(btndot);

        JButton btnmul = new JButton("*");
        btnmul.setBounds(233, 222, 48, 34);
        CalcPanel.add(btnmul);

        JButton btnminus = new JButton("-");
        btnminus.setBounds(233, 267, 48, 34);
        CalcPanel.add(btnminus);

        JButton btnplus = new JButton("+");
        btnplus.setBounds(233, 312, 48, 34);
        CalcPanel.add(btnplus);

        JButton btnequals = new JButton("=");
        btnequals.setBounds(233, 357, 48, 34);
        CalcPanel.add(btnequals);

        JButton btn1x = new JButton("1/x");
        btn1x.setFont(new Font("Tahoma", Font.PLAIN, 8));
        btn1x.setBounds(20, 177, 48, 34);
        CalcPanel.add(btn1x);

        JButton btnsq = new JButton("x^2");
        btnsq.setFont(new Font("Tahoma", Font.PLAIN, 8));
        btnsq.setBounds(89, 177, 48, 34);
        CalcPanel.add(btnsq);

        JButton btnsqr = new JButton("2√x");
        btnsqr.setFont(new Font("Tahoma", Font.PLAIN, 8));
        btnsqr.setBounds(159, 177, 48, 34);
        CalcPanel.add(btnsqr);

        JButton btndiv = new JButton("÷");
        btndiv.setBounds(233, 177, 48, 34);
        CalcPanel.add(btndiv);

        JButton btnper = new JButton("%");
        btnper.setFont(new Font("Tahoma", Font.PLAIN, 10));
        btnper.setBounds(20, 133, 48, 34);
        CalcPanel.add(btnper);

        JButton btnce = new JButton("CE");
        btnce.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnce.setBounds(89, 133, 48, 34);
        CalcPanel.add(btnce);

        JButton btnc = new JButton("C");
        btnc.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnc.setBounds(159, 133, 48, 34);
        CalcPanel.add(btnc);

        JButton btndel = new JButton("x");
        btndel.setFont(new Font("Tahoma", Font.PLAIN, 8));
        btndel.setBounds(233, 133, 48, 34);
        CalcPanel.add(btndel);

        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn0.addActionListener(this);
        btnpm.addActionListener(this);
        btndot.addActionListener(this);
        btnmul.addActionListener(this);
        btnminus.addActionListener(this);
        btnplus.addActionListener(this);
        btnequals.addActionListener(this);
        btn1x.addActionListener(this);
        btnsq.addActionListener(this);
        btnsqr.addActionListener(this);
        btndiv.addActionListener(this);
        btnper.addActionListener(this);
        btnce.addActionListener(this);
        btnc.addActionListener(this);
        btndel.addActionListener(this);


        CalcFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String nums = e.getActionCommand();
        String ops = e.getActionCommand();
        String del = e.getActionCommand();
        String maths = e.getActionCommand();

        if (nums.equals("1")) {
            if (a == 0) {
                txt.setText(txt.getText() + "1");
            } else {
                txt.setText("");
                txt.setText(txt.getText() + "1");
                a = 0;
            }
        }
        if (nums.equals("2")) {
            if (a == 0) {
                txt.setText(txt.getText() + "2");
            } else {
                txt.setText("");
                txt.setText(txt.getText() + "2");
                a = 0;
            }
        }
        if (nums.equals("3")) {
            if (a == 0) {
                txt.setText(txt.getText() + "3");
            } else {
                txt.setText("");
                txt.setText(txt.getText() + "3");
                a = 0;
            }
        }
        if (nums.equals("4")) {
            if (a == 0) {
                txt.setText(txt.getText() + "4");
            } else {
                txt.setText("");
                txt.setText(txt.getText() + "4");
                a = 0;
            }
        }
        if (nums.equals("5")) {
            if (a == 0) {
                txt.setText(txt.getText() + "5");
            } else {
                txt.setText("");
                txt.setText(txt.getText() + "5");
                a = 0;
            }
        }
        if (nums.equals("6")) {
            if (a == 0) {
                txt.setText(txt.getText() + "6");
            } else {
                txt.setText("");
                txt.setText(txt.getText() + "6");
                a = 0;
            }
        }
        if (nums.equals("7")) {
            if (a == 0) {
                txt.setText(txt.getText() + "7");
            } else {
                txt.setText("");
                txt.setText(txt.getText() + "7");
                a = 0;
            }
        }
        if (nums.equals("8")) {
            if (a == 0) {
                txt.setText(txt.getText() + "8");
            } else {
                txt.setText("");
                txt.setText(txt.getText() + "8");
                a = 0;
            }
        }
        if (nums.equals("9")) {
            if (a == 0) {
                txt.setText(txt.getText() + "9");
            } else {
                txt.setText("");
                txt.setText(txt.getText() + "9");
                a = 0;
            }
        }
        if (nums.equals("0")) {
            if (a == 0) {
                txt.setText(txt.getText() + "0");
            } else {
                txt.setText("");
                txt.setText(txt.getText() + "0");
                a = 0;
            }
        }
        if (nums.equals(".")) {
            if (a == 0) {
                txt.setText(txt.getText() + ".");
            } else {
                txt.setText("");
                txt.setText(txt.getText() + ".");
                a = 0;
            }
        }
        if (nums.equals("+/-")) {
            if (a == 0) {
                txt.setText("-" + txt.getText());
                a = 1;
            } else {
                txt.setText(txt.getText());
            }
        }

        if (ops.equals("+")) {
            if (txt.getText().equals("")) {
                txt.setText("");
                num1 = 0;
                o = '+';
            } else {
                num1 = Double.parseDouble(txt.getText());
                txt2.setText(txt.getText());
                txt3.setText("+");
                txt.setText("");
                txt4.setText("");
                o = '+';

            }
            txt.requestFocus();
        }

        if (ops.equals("-")) {
            if (txt.getText().equals("")) {
                txt.setText("");
                num1 = 0;
                o = '-';
            } else {
                num1 = Double.parseDouble(txt.getText());
                txt2.setText(txt.getText());
                txt3.setText("-");
                txt.setText("");
                txt4.setText("");
                o = '-';

            }
            txt.requestFocus();
        }

        if (ops.equals("*")) {
            if (txt.getText().equals("")) {
                txt.setText("");
                num1 = 0;
                o = '*';
            } else {
                num1 = Double.parseDouble(txt.getText());
                txt2.setText(txt.getText());
                txt3.setText("*");
                txt.setText("");
                txt4.setText("");
                o = '*';

            }
            txt.requestFocus();
        }

        if (ops.equals("÷")) {
            if (txt.getText().equals("")) {
                txt.setText("");
                num1 = 0;
                o = '÷';
            } else {
                num1 = Double.parseDouble(txt.getText());
                txt2.setText(txt.getText());
                txt3.setText("÷");
                txt.setText("");
                txt4.setText("");
                o = '÷';

            }
            txt.requestFocus();
        }

        if (ops.equals("%")) {
            if (txt.getText().equals("")) {
                txt.setText("");
                num1 = 0;
                o = '%';
            } else {
                num1 = Double.parseDouble(txt.getText());
                txt.setText("");
                o = '%';

            }
            txt.requestFocus();
        }

        if (ops.equals("=")) {
            if (txt.getText().equals("")) {
                txt.setText("");
            } else {
                num2 = Double.parseDouble(txt.getText());
                
                switch (o) {
                    case '+':
                        res = num1 + num2;
                        txt4.setText(txt.getText());
                        break;

                    case '-':
                        res = num1 - num2;
                        txt4.setText(txt.getText());
                        break;

                    case '*':
                        res = num1 * num2;
                        txt4.setText(txt.getText());
                        break;

                    case '÷':
                        res = num1 / num2;
                        txt4.setText(txt.getText());
                        break;

                    case '%':
                        res = num1 / 100 * num2;
                        break;
                }
            }
            txt.setText("");
            txt.setText(txt.getText() + res);
        }

        if (del.equals("x")) {
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
            txt.setText(txt.getText().substring(0, txt.getText().length() - 1));

        }
        if (del.equals("CE")) {
            txt.setText("");
        }
        if (del.equals("C")) {
            txt.setText("");
        }

        if (maths.equals("1/x")) {
            if (txt.getText().equals("")) {
                txt.setText("");
            } else {
                math = 1 / Double.parseDouble(txt.getText());
                txt.setText("");
                txt.setText(txt.getText() + math);
            }
        }

        if (maths.equals("x^2")) {
            if (txt.getText().equals("")) {
                txt.setText("");
            } else {
                math = Math.pow(Double.parseDouble(txt.getText()), 2);
                txt3.setText('(' + txt.getText() + ')');
                txt2.setText("sqr");
                txt.setText("");
                txt.setText(txt.getText() + math);
                
            }
        }

        if (maths.equals("2√x")) {
            if (a == 0) {
                txt.setText(txt.getText() + "");
                a = 1;
            } else {
                math = Math.sqrt(Double.parseDouble(txt.getText()));
                txt.setText("");
                txt.setText(txt.getText() + math);
                
                
            }
        }
      
    }
}
