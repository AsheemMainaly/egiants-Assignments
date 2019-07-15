import java.util.Stack;
public class Stac {
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(111);
        s.push(222);
        s.push(333);
        System.out.println(s);
        System.out.println(s.search(111));
        s.pop();
                System.out.println(s);
                        System.out.println(s.peek());
                        System.out.println(s.isEmpty());
                        s.clear();
                            System.out.println(s.isEmpty());




    }
}
