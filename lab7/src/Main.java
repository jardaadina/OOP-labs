public class Main {
    public static void main(String[] args) {

       /* Autobuz a1=new Autobuz(35);
        Motocicleta m1=new Motocicleta();
        Autovehicul []parcare;
        Autovehicul auto;
        auto=new Autobuz(30);//auto ul meu este si autovehicul si autobuz; asta se numeste polimorfism
        auto.accelereaza(2);//tipul adevarat este cel de dupa new, in cazul acesta autobuz*/


        Caiet c1=new Caiet("matematica");
        Caiet c2=new Caiet("romana");
        Manual m1=new Manual("lb romana");
        Manual m2=new Manual("lb engleza");
        Manual m3=new Manual("biologie");
        Ghiozdan ghiozdan=new Ghiozdan();



        ghiozdan.addCaiet(c1);
        ghiozdan.addCaiet(c2);

        ghiozdan.addManual(m1);
        ghiozdan.addManual(m2);
        ghiozdan.addManual(m3);

        ghiozdan.listeaza();
        //ghiozdan.listeazaLista();

        ghiozdan.getNrCaiete();
        ghiozdan.getNrManuale();
     }
}