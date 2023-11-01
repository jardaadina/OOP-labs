package lab5;

public class NrComplex {

	private int parteReala;
	private int parteIm;
	
	public NrComplex(int parteReala, int parteIm)
	{
		this.parteReala=parteReala;
		this.parteIm=parteIm;
	}
	public NrComplex adunare(NrComplex b)
	{
		NrComplex rezultat=new NrComplex(0, 0);
		rezultat.parteReala=b.parteReala+parteReala;
		rezultat.parteIm=b.parteIm+parteIm;
		return rezultat;
	}
	public NrComplex scadere(NrComplex b)
	{
		NrComplex rezultat=new NrComplex(0, 0);
		rezultat.parteReala=b.parteReala-parteReala;
		rezultat.parteIm=b.parteIm-parteIm;
		return rezultat;
	}
	
	public NrComplex inmultire(NrComplex b)
	{
		NrComplex rezultat=new NrComplex(0, 0);
		rezultat.parteReala=b.parteReala*parteReala+b.parteIm*parteIm;
		rezultat.parteIm=b.parteReala*parteIm+b.parteIm*parteReala;
		return rezultat;
	}
	
	public NrComplex inmultireScalar(int s)
	{
		NrComplex rezultat=new NrComplex(0, 0);
		rezultat.parteReala=s*parteReala;
		rezultat.parteIm=s*parteIm;
		return rezultat;
	}
	@Override
	public String toString()
	{
		return parteReala + "+" + parteIm + "*i";
	}
	
}

