import java.util.LinkedList;
public class Linked  {
    public static void main(String[] args){
        LinkedList <String> ll = new LinkedList<String>();
        ll.add("a");
        ll.add("b");
        ll.addFirst("A");
        ll.addLast("B");
        ll.add("asheem");
        ll.add(2,"elisha");
        ll.add("hero");
        System.out.println(ll);
        ll.remove("hero");
        ll.add("sara");
            System.out.println(ll);
        ll.removeLast();
        ll.add("k cha");
        System.out.println(ll);
        ll.remove(6);
        System.out.println(ll);
        ll.clear();
        System.out.println(ll.isEmpty());
    }
}
