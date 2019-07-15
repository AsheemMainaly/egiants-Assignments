import java.util.ArrayList;
public class Amethod {

    public static void main(String[] args) {
    ArrayList <Emp> al = new ArrayList<Emp>();
    Emp e1 = new Emp(111, "asheem");
    Emp e2 = new Emp(112, "asheem");
    Emp e3 = new Emp(113, "asheem");
    Emp e4 = new Emp(114, "asheem");
    Emp e5 = new Emp(115, "asheem");
    al.add(e1);
    al.add(e2);
    for(Emp e : al){
        System.out.println(e.eid + "....."+e.ename);

    }
    ArrayList <Emp> al1 = new ArrayList<Emp>();
    al1.addAll(al);
    for(Emp ee : al1){
        System.out.println(ee.eid + "....."+ee.ename);

    }

    al1.add(e3);
    System.out.println(al1.contains(e3));
    System.out.println(al1.containsAll(al));

    al1.remove(e3);
    System.out.println(al1.contains(e3));
    al1.removeAll(al);
    System.out.println(al1.containsAll(al));




}


}
