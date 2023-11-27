import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Persoana p=new Persoana("Jarda", "Adina", 20);
        //System.out.println(p);

        Persoana p1=new Persoana("Clonta", "Stefania", 20);
        Persoana p2=new Persoana("Sulea", "Alexandra", 19);
        Persoana p3=new Persoana("Kulcear", "Noemi", 18);
        Persoana p4=new Persoana("Jarda", "Ionut", 16);

        Persoana[] oameni;
        oameni=new Persoana[5];
        oameni[0]=p;
        oameni[1]=p1;
        oameni[2]=p2;
        oameni[3]=p3;
        oameni[4]=p4;

        for(int i=0; i<5; i++)
        {
            System.out.println(oameni[i]);
        }

        Arrays.sort(oameni);
        System.out.println("\n");

        for(int i=0; i<5; i++)
        {
            System.out.println(oameni[i]);
        }

    }
}