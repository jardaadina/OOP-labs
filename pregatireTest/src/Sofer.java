public class Sofer {
    private String nume;
    private int nrPermis;
    private int varsta;

    public Sofer (String nume, int nrPermis, int varsta)
    {
        this.nume=nume;
        this.nrPermis=nrPermis;
        this.varsta=varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrPermis() {
        return nrPermis;
    }

    public void setNrPermis(int nrPermis) {
        this.nrPermis = nrPermis;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
