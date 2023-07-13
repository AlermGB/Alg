public class Main {
    public static void main(String[] args) {

        LinkedListS listS = new LinkedListS();

        listS.add(1);
        listS.add(2);
        listS.add(3);
        listS.add(4);
        listS.add(7);
        listS.print();
        System.out.println();
        listS.reverse();
        listS.print();

        System.out.println();
        LinkedList list = new LinkedList();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(17);
        list.print();
        System.out.println();
        list.reverse();
        list.print();
    }
}
