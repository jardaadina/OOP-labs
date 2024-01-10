public class Xsi0Model
{
    private char[][] tablaJoc;
    private char jucator;

    //initializez tabla, fiecare buton in sine o sa aiba spatiu liber daca nu are X sau 0 pe el
    void intializareTabla()
    {
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                tablaJoc[i][j]=' ';
            }
        }
    }

    Xsi0Model()
    {
        tablaJoc=new char[3][3];
        jucator='X';
        intializareTabla();
    }

    public char getJucator()
    {
        return jucator;
    }

    public char[][] getTablaJoc()
    {
        return tablaJoc;
    }

    boolean adaugaXsau0(int row, int col, char jucator)
    {
        //daca cumva nu ma aflu in cadrul tablei sau dac atabla este plina nu mai pot sa adaug nimic
        if(row<0 || row>=3 || col<0 || col>=3 || tablaJoc[row][col]!= ' ')
        {
            return false;
        }
        tablaJoc[row][col]=jucator;//daca nu adaug jucator care ia valoarea x sau 0
        return true;
    }

    //am facut o metoda care schimba jucatorul in fucntie de ce jucator a, avut anterior
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

    //verific daca tabla este full
    boolean tablaFull()
    {
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                if(tablaJoc[i][j] == ' ')
                {
                    return false;
                }
            }
        }
        return true;
    }

    //verific cine a castigat, daca au elemente identice aflu castigatorul
    char verificaCastigator()
    {
        //verific fiecare linie si coloana
        for(int i=0; i<3; i++)
        {
            if(tablaJoc[i][0] != ' ' && tablaJoc[i][0] == tablaJoc[i][1] && tablaJoc[i][1] == tablaJoc[i][2])
            {
                return tablaJoc[i][0];
            }
            if (tablaJoc[0][i] != ' ' && tablaJoc[0][i] == tablaJoc[1][i] && tablaJoc[1][i] == tablaJoc[2][i])
            {
                return tablaJoc[0][i];
            }
        }
        //verific diagonalele
        if(tablaJoc[0][0] != ' ' && tablaJoc[0][0] == tablaJoc[1][1] && tablaJoc[1][1] == tablaJoc[2][2])
        {
            return tablaJoc[0][0];
        }

        if(tablaJoc[0][2] != ' ' && tablaJoc[0][2] == tablaJoc[1][1] && tablaJoc[1][1] == tablaJoc[2][0])
        {
           return tablaJoc[0][2];
        }
        return ' ';
    }
}
