public class MatriceComplexa {
    NrComplex[][] matrice;

    public MatriceComplexa(int rows, int cols){
        matrice=new NrComplex[rows][cols];
    }
    public MatriceComplexa adunare(MatriceComplexa a)
    {
        int rows=matrice.length;
        int cols=matrice[0].length;
        MatriceComplexa rez=new MatriceComplexa(rows, cols);
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                rez.matrice[i][j]=matrice[i][j].adunare(a.matrice[i][j]);
            }
        }
        return rez;
    }

    public MatriceComplexa scadere(MatriceComplexa a)
    {
        int rows=matrice.length;
        int cols=matrice[0].length;
        MatriceComplexa rez= new MatriceComplexa(rows, cols);
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                rez.matrice[i][j]=matrice[i][j].scadere(a.matrice[i][j]);
            }
        }
        return rez;
    }
    public MatriceComplexa inmultireScalar(int s)
    {
        int rows= matrice.length;
        int cols= matrice[0].length;
        MatriceComplexa rez=new MatriceComplexa(rows, cols);
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                rez.matrice[i][j]=matrice[i][j].inmultireScalar(s);
            }
        }
        return rez;
    }
}
