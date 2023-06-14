import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer,Student> tM = new TreeMap<>(new OrderByNoComparator().reversed());

        tM.put(104,new Student(70,31,"YAHYA24"));
        tM.put(102,new Student(50,32,"AYIBOGANRECO24"));
        tM.put(103,new Student(49,33,"RESUL24"));

        for(Student i:tM.values()){
            System.out.println(i.getName());
        }



    }
}
