import java.awt.*;

public class Autovehicul {
    private String marca;
    private Color culoare;
    private int vitezaCurenta;
    private int vitezaMaxima;
    private int treaptaCurenta;
    private int nrTrepte;
    private Sofer sofer;
    private Rezervor rezervor;
    public Autovehicul(Sofer sofer, String marca, Color culoare, int vitezaCurenta, int vitezaMaxima, int treaptaCurenta, int nrTrepte, Rezervor rezervor)
    {
        this.rezervor=rezervor;
        this.sofer=sofer;
        this.marca=marca;
        this.culoare=culoare;
        this.vitezaCurenta=vitezaCurenta;
        this.vitezaMaxima=vitezaMaxima;
        this.treaptaCurenta=treaptaCurenta;
        this.nrTrepte=nrTrepte;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getCuloare() {
        return culoare;
    }

    public void setCuloare(Color culoare) {
        this.culoare = culoare;
    }

    public int getNrTrepte() {
        return nrTrepte;
    }

    public void setNrTrepte(int nrTrepte) {
        this.nrTrepte = nrTrepte;
    }

    public int getTreaptaCurenta() {
        return treaptaCurenta;
    }

    public void setTreaptaCurenta(int treaptaCurenta) {
        this.treaptaCurenta = treaptaCurenta;
    }

    public int getVitezaCurenta() {
        return vitezaCurenta;
    }

    public void setVitezaCurenta(int vitezaCurenta) {
        this.vitezaCurenta = vitezaCurenta;
    }

    public int getVitezaMaxima() {
        return vitezaMaxima;
    }

    public void setVitezaMaxima(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }

    public void accelerare(int delta)
    {
        vitezaCurenta=vitezaCurenta+delta;
        if(vitezaCurenta>vitezaMaxima)
        {
            vitezaCurenta=vitezaMaxima;
        }
    }
    public void decelerare(int delta)
    {
        vitezaCurenta=vitezaCurenta-delta;
        if(vitezaCurenta<0)
        {
            vitezaCurenta=0;
        }
    }
    public void oprire()
    {
        vitezaCurenta=0;
        treaptaCurenta=0;
    }
    public void schimbaTreapta(int delta)
    {
        treaptaCurenta=treaptaCurenta+delta;
        if(treaptaCurenta<0)
        {
            treaptaCurenta=0;
        }
        else {
            if(treaptaCurenta>nrTrepte)
            {
                treaptaCurenta=nrTrepte;
            }

        }
    }

    @Override
    public String toString() {
        return "soferul se numeste " + sofer.getNume() + " numarul de permis " + sofer.getNrPermis() + " si are varsta de " + sofer.getVarsta() + " ,iar marca autovehiculului este " + marca + " culoarea autovehiculului este " + culoare + " viteza maxima pe care o poate atinge masina este " + vitezaMaxima + " numarul total de trepte este " + nrTrepte + " viteza curenta este " + vitezaCurenta + " treapta curenta de viteza este " + treaptaCurenta + " capacitastea maxima a rezervorului este " + rezervor.getLitriiMax() + " capacitatea minima este " + rezervor.getLitriiMin();
    }

}
