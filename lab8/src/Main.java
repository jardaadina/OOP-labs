import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
          //interfetele nu au atribute au doar metode abstracte
          //cuvantul cheie va fi implements
        Masina m=new Masina("mercedes", "blue", 1);
        Student s=new Student("adina", 1, m);
        Student s1;
        s1=s.clone();
        System.out.println(s);
        System.out.println(s1);

       s1.masina.vopseste("verde");
        System.out.println(s);
        System.out.println(s1);

        Masina m1=new Masina("mercedes", "blue", 3);
        Masina m2=new Masina("audi", "blue", 1);
        Masina m3=new Masina("tesla", "blue", 2);
        System.out.println("\n");

        Masina[] masina;
        masina=new Masina[3];
        masina[0]=m1;
        masina[1]=m2;
        masina[2]=m3;

        for(int i=0; i<3; i++)
        {
            System.out.println(masina[i]);
        }
        Arrays.sort(masina);
        System.out.println("\n");
        for(int i=0; i<3; i++)
        {
            System.out.println(masina[i]);
        }

        String a1="ana are mere";
        String a2="antonia are mere";

        System.out.println(a1.compareTo(a2));

        //3.4 tema
    }
}