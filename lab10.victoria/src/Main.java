import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> cars=new ArrayList<String>();
        cars.add("Dacia");
        cars.add("Renault");
        cars.add("Toyota");

        /*for(String car: cars)
        {
            if(car.equals("Dacia"))
            {
                car="Logan";
            }
        }*/

       for(int i=0; i<cars.size(); i++)
        {
            if(cars.get(i).equals("Dacia"))
            {
                cars.set(i, "Logan");
            }
        }

        System.out.println(cars);

       ListIterator<String>carsIT=cars.listIterator();

        while(carsIT.hasNext())
        {

            if(carsIT.next().equals("Dacia"))
            {
                carsIT.set("Logan");
            }
        }

        System.out.println(cars);
        //.next() ne returneaza urmatorul element si .hasNext():ne zice daca mai avem elemente

        String[] chat={ "Buna", "Buna", "ce", "mai", "faci"};
        //avem .put(), .get(), .containsKey() care returneaza true sau false

        Map<String, Integer>conversatie=new HashMap<String, Integer>();

        for(int i=0; i<chat.length; i++)
        {
            if(conversatie.containsKey(chat[i]))
            {
                int key=conversatie.get(chat[i]);
                key++;
                conversatie.put(chat[i], key);
            }
            else
            {
                conversatie.put(chat[i], 1);
            }
        }

        for(Map.Entry<String, Integer>entry:conversatie.entrySet())
        {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}