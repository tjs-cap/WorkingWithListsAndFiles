import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class UsingArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
//        LinkedList<String> names = new LinkedList<>();
        names.add("John");
        names.add("Paul");
        names.add("Ringo");
        names.add("George");
        System.out.println(names);
//        for(String name : names){
//            System.out.print(name + " ");
//        }
        names.remove("John");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("John"));

    }
}
