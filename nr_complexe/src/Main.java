import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        MatriceComplexa m1=new MatriceComplexa(2, 2);
        MatriceComplexa m2=new MatriceComplexa(2, 2);

        int rows=m1.matrice.length;
        int cols=m1.matrice[0].length;

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                NrComplex nr=new NrComplex(i+1,j+1);
                m1.matrice[i][j]=nr;
            }
        }
        m2=m1;

        m2=m2.adunare(m1);

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print(m1.matrice[i][j] + " ");
                //System.out.println(" ");
            }
            System.out.println("\n");
        }

         System.out.println("adunarea matriceor este: ");

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print(m2.matrice[i][j] + " ");
            }
            System.out.println("\n");
        }
         m2=m2.scadere(m1);

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print(m1.matrice[i][j] + " ");
            }
            System.out.println("\n");
        }

         System.out.println("scaderea matriceor este: ");

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print(m2.matrice[i][j] + " ");
            }
            System.out.println("\n");
        }

        m2=m2.inmultireScalar(2);

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print(m1.matrice[i][j] + " ");
            }
            System.out.println("\n");
        }

        System.out.println("matricea inmultita cu scalar este: ");

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print(m2.matrice[i][j] + " ");
            }
            System.out.println("\n");
        }

        Scanner input= new Scanner(System.in);
        System.out.println("introduceti numele");
        String nume;
        nume=input.nextLine();
        System.out.println("numele introdus este: " + nume);
        int nr;
        System.out.println("introduceti un nr");
        nr= input.nextInt();
        System.out.println("nr intordus este: " + nr);
        
    }
}