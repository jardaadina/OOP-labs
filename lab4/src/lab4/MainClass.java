package lab4;

import java.awt.Color;

public class MainClass {

	public static void main(String[] args) {
		Sofer soferita=new Sofer(27, 48973, "adina");
		Autovehicul auto=new Autovehicul(soferita, "mercedes", 70, 180, 3, 6, Color.DARK_GRAY);
		System.out.println(auto);
		auto.accelerare(80);
		auto.schimbareTrepte(3);
		System.out.println(auto);
		auto.decelerare(20);
		auto.schimbareTrepte(-2);
		System.out.println(auto);
		auto.oprire();
		System.out.println(auto);
		auto.accelerare(80);
		auto.schimbareTrepte(3);
		System.out.println(auto);
	}

}
