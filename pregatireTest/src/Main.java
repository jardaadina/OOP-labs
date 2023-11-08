import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Sofer sofer= new Sofer("Adina", 12345, 20);
        Rezervor rezervor=new Rezervor(200, 50);
        Autovehicul auto= new Autovehicul(sofer, "audi", Color.CYAN, 70, 200, 3, 6, rezervor);
        auto.accelerare(50);
        System.out.println(auto);
        auto.schimbaTreapta(2);
        System.out.println(auto);
        auto.decelerare(20);
        System.out.println(auto);
        auto.schimbaTreapta(-2);
        System.out.println(auto);
        auto.accelerare(101);
        System.out.println(auto);
        auto.oprire();
        System.out.println(auto);

    }
}