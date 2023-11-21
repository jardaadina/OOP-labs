public class Produs {
    private String nume;
    private Furnizor furnizor;
    private int pret;
    private int cantitateInStoc;

    public Produs()
    {
        this.nume="-";
        this.furnizor=furnizor;
        this.pret=0;
        this.cantitateInStoc=0;
    }
    public Produs(String nume, Furnizor furnizor, int pret, int cantitateInStoc)
    {
        this.nume=nume;
        this.furnizor=furnizor;
        this.pret=pret;
        this.cantitateInStoc=cantitateInStoc;
    }

    public String getNume() {
        return nume;
    }

    public int getPret() {
        return pret;
    }

    public Furnizor getFurnizor() {
        return furnizor;
    }

    public void setFurnizor(Furnizor furnizor) {
        this.furnizor = furnizor;
    }

    public int getCantitateInStoc() {
        return cantitateInStoc;
    }

    public void setCantitateInStoc(int cantitateInStoc) {
        this.cantitateInStoc = cantitateInStoc;
    }

    @Override
    public String toString() {
        return " numele produsului este " + nume + " furnizorul acestuia este " + furnizor.getNumeSRL() + " pretul este de " + pret + " lei"  + " ,iar numarul de bucati ramase este " + cantitateInStoc;
    }
}
