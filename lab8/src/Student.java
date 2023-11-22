public class Student implements Cloneable {
     String nume;
     int id;
     Masina masina;

     public Student(String nume, int id, Masina masina)
     {
         this.nume=nume;
         this.id=id;
         this.masina=masina;
     }

     public Student clone()
     {
         Student copieStudent;
         try {
            copieStudent= (Student)(super.clone());
         } catch (Exception e) {
             System.out.println("NOT CLONABLE");
             return null;
         }
         //copieStudent.masina=masina.clone(); is 2 metode de a face deepCopy
         copieStudent.masina=new Masina(masina.marca, masina.culoare, masina.id);
         return copieStudent;
     }

    @Override
    public String toString() {
        return " numele studentului este " + nume + " id ul acestuia este " + id + " iar masina pe care o detine este " + masina;
    }
}
