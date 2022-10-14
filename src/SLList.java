public class SLList {
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    // private IntNode first; 
    private IntNode sentinel;
    private int size;
    private IntNode last;

    public SLList() {
        // first = null;
        sentinel = new IntNode(63, null);
        size = 0;
    }

    public SLList(int x) {
        // first = new IntNode(x, null);
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        last = sentinel.next;
        size = 1;
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        // first = new IntNode(x, first);
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }    

    /** Retrieves the front item from the list. */
    public int getFirst() {
        // return first.item;
        return sentinel.next.item;
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Adds an item to the end of the list. */
    // public void addLast(int x) {
    //     IntNode p = first;
    //     if (p == null){
    //         first = new IntNode(x, null);
    //         size++;
    //     }else{
    //         while (p.next != null) {
    //             p = p.next;
    //         }
    //         p.next = new IntNode(x, null);
    //         size++;
    //     }
    // public void addLast(int x){
    //     IntNode p = sentinel;
    //     while (p.next != null){
    //         p = p.next;
    //     }
    //     p.next = new IntNode(x, null);
    //     size++;
    // }
    public void addLast( int x ) {
        last.next = new IntNode(x, null);
        last = last.next;
        size++;
    }

    public void insert( int item, int position){
        if(position <= size){
            position -= 1;
            IntNode p = sentinel;
            while(position > 0){
                p = p.next;
                position--;
            }
            p.next = new IntNode(item,p.next);
            size++;
        }else{
            addLast(item);
            size++;
        }
    }

    public void reverse_my(){
        int i = size;
        IntNode p = sentinel.next;
        last = sentinel.next;
        while(i > 1){
            this.addFirst(p.next.item);
            p = p.next;
            i--;
        }
        last.next = null;
    }
    

    public IntNode reverseRecursively(IntNode p){

    }

    public void reverseRecursively(){
    }

    public void printSLList(){
        IntNode p = sentinel.next;
        while(p != null ){
            System.out.print(p.item + " ");
            p = p.next;
        }
        System.out.println("");
    }
        /* Advance p to the end of the list. */

    /** Crashes when you call addLast on an empty SLList. Fix it. */
    public static void main(String[] args) {
        SLList x = new SLList(1);
        x.addFirst(0);
        x.addLast(5);
        x.addFirst(2);
        x.addFirst(6);
        System.out.println(x.getFirst());
        // x.insert(3,6);
        x.printSLList();
        // x.reverse();
        x.reverseRecursively();
        x.printSLList();
    }
}