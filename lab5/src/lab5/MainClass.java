package lab5;

public class MainClass {

	public static void main(String[] args)
	{
			NrComplex a=new NrComplex(5, 2);
			NrComplex b=new NrComplex(1, -1);
			NrComplex c=a.adunare(b);
			NrComplex d=a.scadere(b);
			NrComplex e=a.inmultire(b);
			NrComplex f=a.inmultireScalar(2);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
			
			int arr[]=new int[]{5, 10, 1, 3 , 7};
			int[] arr2=arr;
			arr2[1]=5;
			System.out.println(arr[1]);
			for(int i=0; i<arr.length; i++)
			{
				System.out.println(arr[i]);
			}
			//for(int element:arr)
			//{
			//	System.out.println(element);
			//}
			int aux;
			int i=0;
			int j=arr.length-1;
			while(i<j)
			{
				aux=arr[i];
				arr[i]=aux;
				aux=arr[j];
				i++;
				j--;
			}
			NrComplex[][] matrice=new NrComplex[3][3];
			int rows=matrice.length;
			int cols=matrice[0].length;
			MatriceComplex m1=new MatriceComplex(3, 3);
			MatriceComplex m2=new MatriceComplex(3, 3);
			
			for(i=0; i<rows; i++)
			{
				for(j=0; j<cols; j++)
				{
					NrComplex nr=new NrComplex(i+1, j+1);
					matrice[i][j]=nr;
				}
			}
			m1.matrice=matrice;
			m2=m1.add(m1);
			for(i=0; i<rows; i++)
			{
				for(j=0; j<cols; j++)
				{
					System.out.print(m1.matrice[i][j]);
					System.out.print(" ");
				}
				System.out.println("\n");
			}
			for(i=0; i<rows; i++)
			{
				for(j=0; j<cols; j++)
				{
					System.out.print(m2.matrice[i][j]);
					System.out.print(" ");
				}
				System.out.println("\n");
			}
			m2=m2.sub(m1);
			for(i=0; i<rows; i++)
			{
				for(j=0; j<cols; j++)
				{
					System.out.print(m2.matrice[i][j]);
					System.out.print(" ");
				}
				System.out.println("\n");
			}
			m2=m2.multiplyBy(2);
			for(i=0; i<rows; i++)
			{
				for(j=0; j<cols; j++)
				{
					System.out.print(m2.matrice[i][j]);
					System.out.print(" ");
				}
				System.out.println("\n");
			}	
	}

}
