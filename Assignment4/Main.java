public class Main {
    public static void main(String[] args) {
        Node root = new Node("2");
        root.setNextNode(new Node("4"));
        root.getNextNode().setNextNode(new Node("8"));

        root = root.insertNodeAtPosition(new Node("3"), 1);
        root = root.insertNodeAtPosition(new Node("0"), 0);
        root = root.insertNodeAtPosition(new Node("5"), 4);
        root = root.insertNodeAtPosition(new Node("6"), 5);
        root = root.insertNodeAtPosition(new Node("1"), 1);
        root = root.insertNodeAtPosition(new Node("7"), 7);
        root = root.insertNodeAtPosition(new Node("9"), 9);
        root = root.insertNodeAtPosition(new Node("10"), 10);




        root.print();
    }
}
