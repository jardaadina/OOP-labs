import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Xsi0view extends JFrame
{
    //declar o matrice de tipul JButton pe care o numesc butoane
    private JButton[][] butoane;

    //constructorul clasei view
    Xsi0view()
    {
        //ii dam nume jocului
        setTitle("X si 0");

        //setam ca atunci cand apasam pe close sa se inchida fereastra
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //organizez fereastra mea in 3 randuri si 3 coloane
        setLayout(new GridLayout(3,3));

        //initializez matricea de butoane cu 3 randuri si 3 coloane
        butoane=new JButton[3][3];

        //trec cu un for prin fiecare buton
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                butoane[i][j]=new JButton();//creez butoanele
                butoane[i][j].setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
                butoane[i][j].setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 80));//ii zic ce font si ce marime are
                //butoane[i][j].setForeground(Color.BLACK);
                butoane[i][j].setEnabled(false);//il activez
                add(butoane[i][j]);//adaug butoanele
            }
        }
        //dau pack la tot ce am facut pana acum
        pack();
        //si este ideal dupa pack sa dau setVisible ca sa imi apara fereastra
        setVisible(true);
    }
    //fac o metoda care sa imi coloreze backGround-ul
    void setCuloare(int row, int col, Color culoare)
    {
        butoane[row][col].setBackground(culoare);
    }

    void setCuloareSimboluri(int row, int col, char simbol) {
        Color culoareSimbol = (simbol == 'X') ? Color.BLACK : Color.BLACK;

        butoane[row][col].setForeground(culoareSimbol);
        //butoane[row][col].setBackground(Color.white);
    }

    //fac o metoda care sa imi puna text pe fiecare buton, text adica X sau 0
    void setText(int row, int col, char text)
    {
        butoane[row][col].setText(String.valueOf(text));
    }

    //fac o metoda care sa imi face butonul activ sau nu in functie de ce vreau
    void setButonActiv(int row, int col, boolean activare)
    {
        butoane[row][col].setEnabled(activare);
    }

    //fac o metoda pentru apasarea butonului, care se foloseste de interfata ActionListener

    void addClickCelula(int row, int col, ActionListener listener)
    {
        butoane[row][col].addActionListener(listener);
    }
}
