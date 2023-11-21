public class Main {
    public static void main(String[] args) {

        Inventar inventar=new Inventar(5);
        Furnizor furnizor=new Furnizor("SRL1", "info1", 1);
        Furnizor furnizor1=new Furnizor();
        Produs p=new Produs();
        Produs produs1=new Produs("lapte", furnizor, 6, 3);
        Produs produs2=new Produs("oua", furnizor, 1, 100);
        Produs produs3=new Produs("piept de pui", furnizor, 25, 10);
        Produs produs4=new Produs("paste", furnizor, 4, 15);
        Produs produs5=new Produs("ciocolata", furnizor, 3, 20);
        System.out.println(produs1);
        System.out.println(produs2);
        System.out.println(produs3);
        System.out.println(produs4);
        System.out.println(produs5);

        inventar.adaugaProdus(produs1);
        inventar.listeazaProduse();
        inventar.adaugaProdus(produs2);
        inventar.listeazaProduse();
        inventar.adaugaProdus(produs3);
        inventar.listeazaProduse();
        inventar.adaugaProdus(produs4);
        inventar.listeazaProduse();
        inventar.adaugaProdus(produs5);
        inventar.listeazaProduse();
        inventar.gasesteProdusDupaNume(produs1.getNume());

    }
}