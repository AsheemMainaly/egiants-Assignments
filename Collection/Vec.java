import java.util.Vector;
public class Vec {
    public static void main(String[] args){
        Vector v = new Vector();
        v.add(2);
        v.add(3);
        v.add(6);
        v.add(6);
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v.size());
Vector v1 = new Vector(3);
v1.add(2);
v1.add(3);
v1.add(6);
v1.add(6);
System.out.println(v1);
System.out.println(v1.capacity());
System.out.println(v1.size());

Vector v2 = new Vector(5,9);
v2.add(2);
v2.add(3);
v2.add(6);
v2.add(6);
v2.add(6);
v2.add(6);

System.out.println(v2);
System.out.println(v2.capacity());
System.out.println(v2.size());

Vector v3 = new Vector(v2);
System.out.println("added data" + v3);
v3.add(45);
v3.add(55);
System.out.println(v3);
System.out.println(v3.capacity());
System.out.println(v3.size());





    }
}
