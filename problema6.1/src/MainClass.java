public class MainClass {
    public static void main(String[] args) {
        // Creare calendar de lucru
        CalendarLucru calendarLucru = new CalendarLucru();

        // Creare lucrator
        Lucrator gigel = new Lucrator("Gigel", calendarLucru);

        // Testare metode lucreaza pentru zile lucratoare
        try {
            gigel.lucreaza("Luni");
            gigel.lucreaza("Marti");
            gigel.lucreaza("Miercuri");
            gigel.lucreaza("Joi");
            gigel.lucreaza("Vineri");
        } catch (ExceptieZiNelucratoare e) {
            System.out.println(e.getMessage());
        }

        try {
            gigel.lucreaza("Sambata");
            gigel.lucreaza("Duminica");
        } catch (ExceptieZiNelucratoare e) {
            System.out.println(e.getMessage());
        }
        
        try {
            gigel.lucreaza("Inexistenta");
        } catch (ExceptieZiNelucratoare e) {
            System.out.println(e.getMessage());
        }
    }
}
