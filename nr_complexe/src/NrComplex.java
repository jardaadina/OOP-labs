public class NrComplex {
    private int parteReala;
    private int parteIm;

    public NrComplex(int parteReala, int parteIm)
    {
        this.parteReala=parteReala;
        this.parteIm=parteIm;
    }

    public NrComplex adunare(NrComplex x)
    {
        NrComplex rezultat= new NrComplex(x.parteReala+parteReala, x.parteIm+parteIm);
        return rezultat;
    }

    public NrComplex scadere(NrComplex x)
    {
        NrComplex rezultat=new NrComplex(parteReala-x.parteReala, parteIm-x.parteIm);
        return rezultat;
    }
    public NrComplex inmultire(NrComplex x)
    {
        NrComplex rezultat= new NrComplex(0,0);
        rezultat.parteReala=parteReala * x.parteReala + parteIm * x.parteIm;
        rezultat.parteIm=parteIm * x.parteReala + parteReala * x.parteIm;
        return rezultat;
    }

    public NrComplex inmultireScalar(int s)
    {
        NrComplex rezultat=new NrComplex(s*parteReala, s*parteIm);
        return rezultat;
    }

    @Override
    public String toString() {
        return parteReala + "j*" + parteIm;
    }
}
