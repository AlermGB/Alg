public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);

        list.print();
        System.out.println();
        list.reverse();

        list.print();
    }
}
