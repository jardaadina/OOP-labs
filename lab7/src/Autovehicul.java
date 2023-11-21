public class Autovehicul {
     Sofer sofer;
     double vitezaMaxima;
     double vitezaCurenta;

    public Autovehicul(Sofer sofer)
    {
        this.sofer=sofer;
    }

    public Autovehicul()
    {}

    public void accelereaza(int delta)
    {
        vitezaCurenta=vitezaCurenta+delta;
    }
}
