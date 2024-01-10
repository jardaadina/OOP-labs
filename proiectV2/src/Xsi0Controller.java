import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Xsi0Controller
{
    private Xsi0Model model;
    private Xsi0view view;
    private char jucator;

    Xsi0Controller( Xsi0Model model, Xsi0view view)
    {
        this.model=model;
        this.view=view;
        this.jucator='X';
        initializareJoc();
    }

    //initializez Jocul
    private void initializareJoc()
    {
        //parcurg fiecare linie si coloana
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
            //setez culoarea background-ului
            view.setCuloare(i, j, Color.PINK);
            //dar si culoarea textului
            view.setText(i, j, model.getTablaJoc()[i][j]);
            //activez butoanele
            view.setButonActiv(i, j, true);
            view.setCuloareSimboluri(i, j, 'X');
            view.setCuloareSimboluri(i, j, '0');

            int initI=i;
            int initJ=j;

            view.addClickCelula(i, j, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    CLickCelula(initI, initJ);
                }
            });
            }
        }
        view.setSize(600, 600);
    }

    private void CLickCelula(int row, int col)
    {
        if(model.getTablaJoc()[row][col] == ' ')
        {
            if(model.adaugaXsau0(row, col, jucator))
            {
                updateView();
                if(!verificaFinal())
                {
                    schimbaJucatorul();
                }
            }
        }
    }

    private void schimbaJucatorul()
    {
        if(jucator == 'X')
        {
            jucator='0';
        }
        else
        {
            jucator='X';
        }
    }

    //actualizam tabela
    private void updateView()
    {
        char[][] tablaJoc= model.getTablaJoc();
        for(int i=0; i<3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                //in functie de ce avem in fiecare celula a tabelei activam sau dezactivam butoanele
                view.setText(i, j, tablaJoc[i][j]);
                view.setButonActiv(i, j, tablaJoc[i][j] == ' ');
                view.setCuloareSimboluri(i, j, tablaJoc[i][j]);
            }
        }
    }

    private boolean verificaFinal()
    {
        char castigator=model.verificaCastigator();
        if(castigator != ' ' || model.tablaFull())
        {
            rezultatulJocului(castigator);
            return true;
        }
        return false;
    }

    private void rezultatulJocului(char castigator)
    {
        if(castigator == 'X')
        {
            JOptionPane.showMessageDialog(view, "X a castigat", " GAME OVER", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(castigator == '0')
        {
            JOptionPane.showMessageDialog(view, "0 a castigat", " GAME OVER", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(view, "REMIZA", " GAME OVER", JOptionPane.INFORMATION_MESSAGE);
        }
        reseteazaJocul();
    }

    private void reseteazaJocul()
    {
        model.intializareTabla();
        updateView();
    }
}
