import java.util.ArrayList;

class Ctest1 {

    public static void main(String[] args) {

ArrayList <Emp>al = new ArrayList<Emp>();
    Emp e = new Emp (111, "asheem");
    Emp e2 = new Emp (112, "elisha");
    Emp e3 = new Emp (113, "hamrobaby");
al.add(e);
al.add(e2);
al.add(e3);
for(Emp e1 : al){
    System.out.println(e1.ename + e1.eid);
}
 ArrayList<Student>al1 = new ArrayList<Student>();

    Student s = new Student(999, "hero");
    al1.add(s);
for(Student s1 : al1){
    System.out.println(s1.sname + s1.sid);
}

    ArrayList<Integer>al2 = new ArrayList<Integer>();
     al2.add(12);
     System.out.println(al2);

     ArrayList<String>al3 = new ArrayList<String>();
     al3.add("asheem");
     System.out.println(al3);

ArrayList al4 = new ArrayList(al3);
System.out.println(al4);
 }

}
