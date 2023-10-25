package lab4;

public class Sofer {

	int varsta;
	int nrPermis;
	private String nume;
	
	public int getVarsta()
	{
		return varsta;
	}
	public void setVarsta(int varsta)
	{
		this.varsta=varsta;
	}
	public int getNrPermis()
	{
		return nrPermis;
	}
	public void setNrPermis(int nrPermis)
	{
		this.nrPermis=nrPermis;
	}
	public Sofer(int varsta, int nrPermis)
	{
		this.varsta=varsta;
		this.nrPermis=nrPermis;
	}
	public String getNume()
	{
		return nume;
	}
	public void setNUme(String nume)
	{
		this.nume=nume;
	}
	public Sofer(int varsta, int nrPermis, String nume)
	{
		this.varsta=varsta;
		this.nrPermis=nrPermis;
		this.nume=nume;
	}
	
}
