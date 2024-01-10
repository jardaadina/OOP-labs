public class Biblioteca {
    Carte[] lista;

    public Biblioteca(int elemente)
    {
        lista=new Carte[elemente];
    }

    public void adaugaCarti( Carte a)
    {
        int n=lista.length;
         n++;
         int ok=1;
        for(int i=0; i<n; i++)
        {
            if(a.getId()==lista[i].getId())
            {
                ok=0;
            }
        }
        if(ok==1 && a.getCopiiDisponibile()>0)
        {
            lista[n-1]=a;
        }

    }
}
