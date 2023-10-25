package lab4;

import java.awt.Color;

public class Autovehicul {

	private String marca;
	float vitezaCurenta;
	float vitezaMaxima;
	int treaptaCurenta;
	int trepteDisponibile;
	Color culoare;
	Sofer sofer;
	
	public String getMarca(String marca)
	{
		return marca;
	}
	public void setMarca(String marca)
	{
		this.marca=marca;
	}
	public float getViteza(float vitezaCurenta)
	{
		return vitezaCurenta;
	}
	public void setViteza(float vitezaCurenta)
	{
		this.vitezaCurenta=vitezaCurenta;
	}
	public Color getCuloare(Color culoare)
	{
		return culoare;
	}
	public void setCuloare(Color culoare)
	{
		this.culoare=culoare;
	}
	public int getTreapta(int treaptaCurenta)
	{
		return treaptaCurenta;
	}
	public void setTreapta(int treaptaCurenta)
	{
		this.treaptaCurenta=treaptaCurenta;
	}
	public Autovehicul(Sofer sofer, String marca, float vitezaMaxima, float vitezaCurenta, int treaptaCurenta, int trepteDisponibile, Color culoare)
	{
		this.marca=marca;
		this.vitezaMaxima=vitezaMaxima;
		this.vitezaCurenta=vitezaCurenta;
		this.treaptaCurenta=treaptaCurenta;
		this.trepteDisponibile=trepteDisponibile;
		this.culoare=culoare;
		this.sofer=sofer;
	}
	public void accelerare(float delta)
	{
		vitezaCurenta=vitezaCurenta+delta;
		if(vitezaCurenta>vitezaMaxima)
		{
			vitezaCurenta=vitezaMaxima;
		}
	}
	public void decelerare(float delta)
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
	public void schimbareTrepte(int delta)
	{
		treaptaCurenta=treaptaCurenta+delta;
		if(treaptaCurenta<0)
		{
			treaptaCurenta=0;
		}
		else
		{
			if(treaptaCurenta>trepteDisponibile)
			{
				treaptaCurenta=trepteDisponibile;
			}	
		}
	}
	@Override
	public String toString()
	{
		return "marca este " + marca + " viteza curenta este " + vitezaCurenta + " si se afla in treapta de viteza "+ treaptaCurenta + " soferul este "+ sofer.getNume() + " are varsta de " + sofer.getVarsta() + " iar numarul sau de permis este " + sofer.getNrPermis();
	}
	
	
}
