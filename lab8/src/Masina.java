import java.awt.*;

public class Masina implements Cloneable, Comparable{
    String marca;
    String culoare;
    int id;

    public Masina(String marca,String culoare, int id)
    {
        this.marca=marca;
        this.culoare=culoare;
        this.id=id;
    }

    public void vopseste(String culoare)
    {
       this.culoare=culoare;
    }

    public Masina clone()
    {
        try {
            return (Masina)(super.clone());
        } catch (Exception e) {
            System.out.println("NOT CLONABLE");
            return null;
        }
    }



    @Override
    public String toString() {
        return " marca masinii este " + marca + " iar culoarea este " + culoare + " si id-ul " + id;
    }

    @Override
    public int compareTo(Object o) {
        Masina temp=(Masina) o;
        /*f(id< temp.id)
            return -1;
        else if(id== temp.id)
            return 0;
        else
            return 1;*/
        return (id - temp.id);
    }
}
