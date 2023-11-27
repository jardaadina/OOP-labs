public class Persoana implements Comparable{
    String nume;
    String prenume;
    int varsta;

    public Persoana(String nume, String prenume, int varsta)
    {
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
    }

    @Override
    public String toString() {
        return " numele presoanei este " + nume + " " + prenume + ", iar varsta acesteia este " + varsta + " de ani";
    }

    @Override
    public int compareTo(Object o) {
        Persoana temp=(Persoana) o;
        /*f(id< temp.id)
            return -1;
        else if(id== temp.id)
            return 0;
        else
            return 1;*/
        return (varsta - temp.varsta);
       // return nume.compareTo(temp.nume);
    }

}
