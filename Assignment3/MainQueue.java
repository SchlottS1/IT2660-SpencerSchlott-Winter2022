public class MainQueue
{
    public static void main(String[] args)
    {
        Queue q = new Queue(3);
        Listing l;
        Listing l1 = new Listing("Bill", "1st Avenue", "123 4567");
        Listing l2 = new Listing("Becky", "2nd Avenue", "456 3232");
        Listing l3 = new Listing("Mike", "3rd Avenue", "333 3333");
        Listing l4 = new Listing("Carol", "4th Avenue", "444 4444");

        System.out.println(q.deque());
        System.out.println(q.enque(l1));
        System.out.println(q.enque(l2));
        System.out.println(q.enque(l3));
        System.out.println(q.enque(l4));
        q.showAll();

        l = q.deque();
        System.out.println(l.toString());
        l = q.deque();
        System.out.println(l.toString());
        l = q.deque();
        System.out.println(l.toString());

        l = q.deque();
        System.out.println(l);
        System.exit(0);
    }
}