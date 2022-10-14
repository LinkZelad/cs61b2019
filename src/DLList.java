public class DLList {
    public static class IntNode {
        public IntNode prex;
        public int item;
        public IntNode next;
        public IntNode(IntNode p, int x, IntNode n){
            prex = p;
            item = x;
            next = n;
        }
    }

    private IntNode sentF;
    private int size = 0;
    public DLList(){
        sentF = new IntNode(sentF, 63, null);
        size = 0;
    }
    public DLList(int x){
        sentF = new IntNode(sentF, 63, null);
        sentF.next = new IntNode(sentF, x, sentF);
        size++;
    }

    public void addFirst(int x){
        sentF.next.prex = new IntNode(sentF, x, sentF.next);
        sentF.next = sentF.next.prex;
        size++;
    }
    public int getFirst(){
        return sentF.next.item;
    }

    public int size(){
        return size;
    }

    public static void main(String[] args){
        DLList dl = new DLList(2) ;
        // dl.addFirst(2);
        dl.addFirst(1);
        System.out.println(dl.getFirst());
    }
}
