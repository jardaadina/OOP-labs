public class Lucrator {
    String nume;
    CalendarLucru calendar;
    public Lucrator(String nume, CalendarLucru calendar) {
        this.nume = nume;
        this.calendar = calendar;
    }
   /* public void lucreaza(String zi) throws ExceptieZiNelucratoare
    {
        if(zi.equals("samabata")|| zi.equals("duminica")){
            throw new ExceptieZiNelucratoare("Exceptie: lucru in zi nelucratoare");
        }
    }*/

    public void lucreaza(String zi) throws ExceptieZiNelucratoare {
        ZI ziua = calendar.getZi(zi);
        if (ziua != null) {
            if (ziua.esteLucratoare()) {
                System.out.println("Lucratorul " + nume + " lucreaza " + ziua.getNume());
            } else {
                throw new ExceptieZiNelucratoare("Exceptie: lucru in zi nelucratoare");
            }
        } else {
            System.out.println(zi + " nu este o zi a saptamanii");
        }
    }
}

