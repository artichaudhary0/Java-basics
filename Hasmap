import java.util.HashMap;
import java.util.Map;

public class StudentManagementHasMap {

    public static void main(String[] args) {
        // create records using hasmap
        HashMap<Integer,String> student = new HashMap<>();

        // adding students to the Hasmap (Create)


        student.put(1,"Arti");
        // student.put(2,"terste4as"); // discard
        student.put(2,"Alex");
        student.put(3,"Bob");
        student.put(4,"Charlie");

        // display (Read)
        for(Map.Entry<Integer,String> entry : student.entrySet() ) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // remove
        student.remove(2);
        for(Map.Entry<Integer,String> entry : student.entrySet() ) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // iterate through for each
        if(student.containsKey(2))
            System.out.println(student.get(2));
        else
            System.out.println(student.get(1));









    }




}
