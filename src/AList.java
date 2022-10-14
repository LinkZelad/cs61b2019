/** Array based list.
 *  @author Josh Hug
 */

public class AList {
    /** Creates an empty list. */
    private int[] item;
    private int size;
    private int FACTOR;
    public AList() {
        item = new int[100];
        size = 0;
    }

    public void resize(int n){
        int[] add = new int[n+1];
        System.arraycopy(item, 0, add, 0, size);
        item = add;
    }
    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        if(size == item.length){
            resize(size * FACTOR);
        }
        item[size] = x;
        size++;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return item[size-1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return item[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;        
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast() {
        size--;
        return item[size];
    }
} 