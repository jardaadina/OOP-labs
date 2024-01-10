public class Inventar {
    Produs[] lista;
    public Inventar(int elm)
    {
        lista= new Produs[elm];
    }

    public void adaugaProdus( Produs p)
    {
        int n=lista.length;
        n++;
        int ok=1;
        for(int i=0; i<n-1; i++)
        {
            if(lista[i]==null)
            {
                ok=1;
            }
           else if(p.getNume().equals(lista[i].getNume()))
            {
                ok=0;
            }
        }
        if(ok==1 && p.getCantitateInStoc()>0)
        {
            lista[n-2]=p;
        }
        else
        {
            System.out.println("EROARE! cantitate prea mica sau produs deja existent");
        }
    }

    public void listeazaProduse()
    {
        for(int i=0; i< lista.length; i++)
        {
            if(lista[i]!=null)
            {
                System.out.println(lista[i].getNume());
            }

        }
    }
    public Produs gasesteProdusDupaNume(String nume)
    {
        Inventar listaSecundara=new Inventar(lista.length);
        for(int i=0; i< lista.length; i++)
        {
            if(lista[i]== null)
            {
                System.out.println("Produsul nu a fost gasit!");
            }
            else if(lista[i].getNume().equals(nume))
            {
                return lista[i];
            }
            else {
                System.out.println("Produsul nu a fost gasit!");
            }
        }
        return null;
    }

}
