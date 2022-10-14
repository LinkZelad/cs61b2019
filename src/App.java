public class App {
    public static void main(String[] args) throws Exception {
        // IntList list = new IntList(7, null);
        // list.rest = new IntList(4, null);
        // list.rest.rest = new IntList(5, null);

        // // System.out.print(list.Size());
        // // System.out.print(list.InteractiveSize());
        // System.out.print(list.get(2));
        SLList sl = new SLList(0);
        sl.addFirst(1);
        sl.addFirst(2);
        sl.addLast(4);
        sl.addLast(5);
        System.out.print(sl.size());
    }

}
