package problema.boabe;
import java.math.BigInteger;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nrCasute=64; //nr de casute de pe tabla de sah
		BigInteger totBoabe=BigInteger.ZERO;
		BigInteger seDubleaza=BigInteger.ONE;
		
		for(int i=1; i<=nrCasute; i++)
		{
			totBoabe=totBoabe.add(seDubleaza);
			seDubleaza=seDubleaza.multiply(BigInteger.valueOf(2));
		}
		System.out.println("nr de boabe este " + totBoabe);

	}
}
