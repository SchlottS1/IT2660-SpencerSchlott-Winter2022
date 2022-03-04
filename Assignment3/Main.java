public class Main{

public static void main(String[] args) {
    Stack s = new Stack(3);
    Listing l;
    Listing l1 = new Listing("Bill", "1st Avenue", "123 4567");
    Listing l2 = new Listing("Ann", "2nd Avenue", "456 3232");
    Listing l3 = new Listing("Mike", "3rd Avenue", "333 3333");
    Listing l4 = new Listing("Carol", "4th Avenue", "444 4444");

    System.out.println(s.pop());
    System.out.println(s.push(l1));
    System.out.println(s.push(l2));
    System.out.println(s.push(l3));
    s.showAll();

    l = s.pop();
    System.out.println(l.toString());
    l = s.pop();
    System.out.println(l.toString());
    l = s.pop();
    System.out.println(l.toString());
    l = s.pop();
    System.out.println(l);
    System.exit(0);
    
}
}