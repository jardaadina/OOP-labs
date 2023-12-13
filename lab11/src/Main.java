import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        JLabel l = new JLabel ("useraname");
        JTextField tf = new JTextField("");
        tf.setColumns(15);
        panel1.add(l);
        panel1.add(tf);
        panel1.setLayout(new FlowLayout());

        JLabel pass = new JLabel ("password");
        JTextField passf = new JTextField("");
        passf.setColumns(15);
        panel2.add(pass);
        panel2.add(passf);

        JCheckBox box = new JCheckBox("Term & Conditions");

       JButton logIN = new JButton("LOGIN");
       panel3.add(logIN);

       JLabel succesLabel=new JLabel("not logged in");

//       logIN.addActionListener(new LoginListener());

        logIN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                succesLabel.setText("succesfuly logged in");
            }
        });

//        JButton b2 = new JButton("Button 2");
//        JButton b3 = new JButton("Button 3");
//        panel2.add(b1);
//        panel2.add(b2);
//        panel2.add(b3);

        JPanel p = new JPanel();
        p.add(panel1);
        p.add(panel2);
        p.add(box);
        p.add(panel3);
        p.add(succesLabel);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        frame.setContentPane(p);
        frame.setVisible(true);
        }
    }
//TEMA PROBLEMA 3.4 LAB 11 DE PE TEAMS, PRIMA CERINTA MAI EXACT