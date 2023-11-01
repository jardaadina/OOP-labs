package lab5;

public class MatriceComplex {
	NrComplex[][] matrice;
	
	public MatriceComplex(int rows, int cols)
	{
		matrice=new NrComplex[rows][cols];
	}
	
	public MatriceComplex add(MatriceComplex m)
	{
		int rows=matrice.length;
		int cols=matrice[0].length;
		MatriceComplex rezultat=new MatriceComplex(rows, cols);
		for(int i=0; i<matrice.length; i++)
		{
			for(int j=0; j<matrice.length; j++)
			{
				rezultat.matrice[i][j]=matrice[i][j].adunare(m.matrice[i][j]);
			}
		}
		return rezultat;
	}
	
	public MatriceComplex sub(MatriceComplex m)
	{
		int rows=matrice.length;
		int cols=matrice[0].length;
		MatriceComplex rezultat=new MatriceComplex(rows, cols);
		for(int i=0; i<matrice.length; i++)
		{
			for(int j=0; j<matrice.length; j++)
			{
				rezultat.matrice[i][j]=matrice[i][j].scadere(m.matrice[i][j]);
			}
		}
		return rezultat;
	}
	
	public MatriceComplex multiplyBy( int s)
	{
		int rows=matrice.length;
		int cols=matrice[0].length;
		MatriceComplex rezultat=new MatriceComplex(rows, cols);
		for(int i=0; i<matrice.length; i++)
		{
			for(int j=0; j<matrice.length; j++)
			{
				rezultat.matrice[i][j]=matrice[i][j].inmultireScalar(s);
			}
		}
		return rezultat;
	}
}
