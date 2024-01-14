import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     Student<String, Integer> s1 = new Student<>("Sergei",25);
     System.out.println(s1);

     Student<String, Integer> s2 = new Student<>("Maria",25);
     Student<String, Integer> s3 = new Student<>("Boris",25);

     List<Student<String,Integer>> listStud = new ArrayList<>();
     listStud.add(s1);
     listStud.add(s2);
     listStud.add(s3);

     StudentGroup<String, Integer> group = new StudentGroup<>(listStud,5182);
     for(Student<String, Integer> stud : group){
         System.out.println(stud);
     }
    }
}