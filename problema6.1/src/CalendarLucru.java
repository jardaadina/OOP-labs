public class CalendarLucru {
    ZI[] tablou;
    public CalendarLucru(){
        tablou=new ZI[]{
                new ZI("luni",true),
                new ZI("marti",true),
                new ZI("miercuri",true),
                new ZI("joi",true),
                new ZI("vineri",true),
                new ZI("sambata",false),
                new ZI("duminica",false)
        };
    }
    public ZI getZi(String numeZi) {
        for (ZI zi : tablou) {
            if (zi.getNume().equalsIgnoreCase(numeZi)) {
                return zi;
            }
        }
        return null;
    }
}

