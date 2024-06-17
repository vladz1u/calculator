import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator {
    static String text1 = "";
    static String sign = "";

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Calculator");
        jFrame.setLayout(null);
        jFrame.setSize(320, 400);

        JTextField jTextField = new JTextField();
        jTextField.setEditable(false);
        jTextField.setSize(300, 50);
        jTextField.setLocation(10, 10);
        jFrame.add(jTextField);

        JButton jButton1 = new JButton("1");
        jButton1.setSize(60, 40);
        jButton1.setLocation(10, 70);
        jFrame.add(jButton1);
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"1");
            }
        });

        JButton jButton2 = new JButton("2");
        jButton2.setSize(60, 40);
        jButton2.setLocation(80, 70);
        jFrame.add(jButton2);
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"2");
            }
        });

        JButton jButton3 = new JButton("3");
        jButton3.setSize(60, 40);
        jButton3.setLocation(150, 70);
        jFrame.add(jButton3);
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"3");
            }
        });

        JButton jButton4 = new JButton("4");
        jButton4.setSize(60, 40);
        jButton4.setLocation(10, 120);
        jFrame.add(jButton4);
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"4");
            }
        });

        JButton jButton5 = new JButton("5");
        jButton5.setSize(60, 40);
        jButton5.setLocation(80, 120);
        jFrame.add(jButton5);
        jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"5");
            }
        });

        JButton jButton6 = new JButton("6");
        jButton6.setSize(60, 40);
        jButton6.setLocation(150, 120);
        jFrame.add(jButton6);
        jButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"6");
            }
        });

        JButton jButton7 = new JButton("7");
        jButton7.setSize(60, 40);
        jButton7.setLocation(10, 170);
        jFrame.add(jButton7);
        jButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"7");
            }
        });

        JButton jButton8 = new JButton("8");
        jButton8.setSize(60, 40);
        jButton8.setLocation(80, 170);
        jFrame.add(jButton8);
        jButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"8");
            }
        });

        JButton jButton9 = new JButton("9");
        jButton9.setSize(60, 40);
        jButton9.setLocation(150, 170);
        jFrame.add(jButton9);
        jButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"9");
            }
        });

        JButton jButton0 = new JButton("0");
        jButton0.setSize(60, 40);
        jButton0.setLocation(80, 220);
        jFrame.add(jButton0);
        jButton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"0");
            }
        });

        JButton jButtonAdd = new JButton("+");
        jButtonAdd.setSize(60, 40);
        jButtonAdd.setLocation(220, 70);
        jFrame.add(jButtonAdd);
        jButtonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1 = jTextField.getText();
                jTextField.setText("");
                sign = "+";
            }
        });

        JButton jButtonSub = new JButton("-");
        jButtonSub.setSize(60, 40);
        jButtonSub.setLocation(220, 120);
        jFrame.add(jButtonSub);
        jButtonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1 = jTextField.getText();
                jTextField.setText("");
                sign = "-";
            }
        });

        JButton jButtonMul = new JButton("x");
        jButtonMul.setSize(60, 40);
        jButtonMul.setLocation(220, 170);
        jFrame.add(jButtonMul);
        jButtonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1 = jTextField.getText();
                jTextField.setText("");
                sign = "x";
            }
        });

        JButton jButtonDiv = new JButton("/");
        jButtonDiv.setSize(60, 40);
        jButtonDiv.setLocation(220, 220);
        jFrame.add(jButtonDiv);
        jButtonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1 = jTextField.getText();
                jTextField.setText("");
                sign = "/";
            }
        });

        JButton jButtonEq = new JButton("=");
        jButtonEq.setSize(60, 40);
        jButtonEq.setLocation(150, 220);
        jFrame.add(jButtonEq);
        jButtonEq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sign.equals("+")){
                    jTextField.setText(String.valueOf(Integer.parseInt(text1) + Integer.parseInt(jTextField.getText())));
                } else if (sign.equals("-")) {
                    jTextField.setText(String.valueOf(Integer.parseInt(text1) - Integer.parseInt(jTextField.getText())));
                } else if (sign.equals("x")) {
                    jTextField.setText(String.valueOf(Integer.parseInt(text1) * Integer.parseInt(jTextField.getText())));
                } else if (sign.equals("/")) {
                    jTextField.setText(String.valueOf(Integer.parseInt(text1) / Integer.parseInt(jTextField.getText())));
                }
            }
        });

        JButton jButtonClear = new JButton("C");
        jButtonClear.setSize(60, 40);
        jButtonClear.setLocation(10, 220);
        jFrame.add(jButtonClear);
        jButtonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText("");
                text1 = "";
                sign = "";
            }
        });

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Знайшев в інтене
    }
}
