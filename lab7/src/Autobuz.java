public class Autobuz extends Autovehicul{

     int ruta;

    public Autobuz(int ruta)
    {
        super(new Sofer());//sau am putea sa facem in Autovehicul un constructor fara parametru
        this.ruta=ruta;
    }

    @Override
    public void accelereaza(int delta)
    {
        if(vitezaCurenta<vitezaMaxima)
        {
            vitezaCurenta += delta;
        }
    }
}
