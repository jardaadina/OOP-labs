package lab3;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*if((0.1 + 0.1 + 0.1)==0.3)
		System.out.println("adv");
		else
		System.out.println("fals");*/
		
		//problema4.4
		String str1="Ana are ";
		String str2="mere";
		String str3=str1+str2;
		System.out.println(str3=="Ana are mere");
		System.out.println(str3.equals("Ana are mere"));//mereu cand comparam doua string uri folosim equals
		
		
		/*
		//problema4.2
		int varsta, gen, inaltime;
		varsta=15;
		gen=1;
		inaltime=185;
		short wrap=0;
		wrap=(short)inaltime;
		wrap=(short)(wrap|(gen<<8));
		wrap=(short)(wrap|(varsta<<9));
		
		int inaltime2, gen2, varsta2;
		inaltime2=wrap&0xff;
		gen2=(wrap>>8)&1;
		varsta2=(wrap>>9)&0x7f;
		System.out.println(inaltime + " " +  inaltime2);
		System.out.println(gen + " " + gen2);
		System.out.println(varsta + " " + varsta2);
		
		//problema4.1
		int n=1, m=15;
		
		for(int i=n; i<=m; i++)
		{
			
		}
		*/
		
		//problema4.3
		String str="Maria";
		int c=0, v=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E'  || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
				v++;
			else
				c++;
		}
		System.out.println("nr de vocale este " + v);
		System.out.println("nr de consoane este " + c);
		
		Scanner litera = new Scanner(System.in);//creez obiectul litera ce urmeaza sa fie citit de la tastatura 
		
		System.out.println("introduceti o vocala");
		
		String input=litera.next();//citesc un sir (o vocala) ce se stocheaza in variabila input
		
		if(input.length()==1)//daca sirul meu are o litera continui
		{
			char vocalaCitita=input.charAt(0);//stochez in vocalaCitita primul element al sirului
			
			if(vocalaCitita=='a' || vocalaCitita=='e' || vocalaCitita=='i' || vocalaCitita=='o' || vocalaCitita=='u' || vocalaCitita=='A' || vocalaCitita=='E'  || vocalaCitita=='I' || vocalaCitita=='O' || vocalaCitita=='U')
			{
				System.out.println("vocala citita este: " + vocalaCitita); //daca i vocala continui

					for(int i=0; i<str.length(); i++)//parcurg sirul 
					{
						if(vocalaCitita==str.charAt(i))//daca vocalaCitita e egala cu una din vocalele din sir
						{
							System.out.println("indicele vocalei este: "+ i);//afisez pozitia vocalei
						}
					}
			litera.close();
			}
				else
				{
					System.out.println("ce ati introdus nu e o vocala");
				}
	}

}}

