public class SLListMy {
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode first; 
    private int size = 0;
    public SLListMy(int x) {
        first = new IntNode(x, null);
        size ++;
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
        size++;
    }    

    /** Retrieves the front item from the list. */
    public int getFirst() {
        return first.item;
    }

    /** Adds an item to the end of the list. */
    public void addLast(int x) {
        /* Your Code Here! */
        IntNode add = first;
        while (add.next != null){
            add = add.next;
        }
        add.next = new IntNode(x, null);
        size++;
    }

    public IntNode re_addLast(IntNode n, int x){
        if ( n.next == null ){
            n.next.item = x;
            return n.next;
        }else{
            return re_addLast(n.next, n.item);
        }
    }

    public void re_addLast(int x){
       first = re_addLast(first, x);
       size++;
    }

    public int getLast(){
        IntNode p = first;
        while(p.next != null){
            p = p.next;
        }
        return p.item;
    }

    public static int recursion_size(IntNode n){
        if ( n.next == null ) {
            return 1;
        }
        else{
            return 1 + recursion_size(n.next);
        }
    }

    public int recursion_size(){
        return recursion_size(first);
    }

    /** Returns the number of items in the list using recursion. */
    // public int size() {
    //     /* Your Code Here! */
    //     int count = 0;
    //     IntNode p = first;
    //     while (p != null ){
    //         count++;
    //         p = p.next;
    //     }
    //     return count;
    // }
    public int size(){
        return size;
    }

}