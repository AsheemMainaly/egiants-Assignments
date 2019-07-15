import java.util.ArrayList;
public class Cmethod {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add(10);
        al.add("ratan");
        al.add("durga");
        al.add(10.5);
        al.add(20);
        System.out.println(al.size());

        al.add(1, "Asheem");

        System.out.println(al);
        System.out.println(al.size());
        al.remove(0);
        al.remove("ratan");
System.out.println(al);
System.out.println(al.contains("durga"));
System.out.println(al.isEmpty());

Integer i = new Integer(20);
al.remove(i);

System.out.println(al);
al.clear();
System.out.println(al.isEmpty());

    }
}
