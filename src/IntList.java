public class IntList {
    public int first;
    public IntList rest;
    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }
    public int Size(){
        if ( rest == null ){
            return 1;
        }
        else{
            return 1 + this.rest.Size();
        }
    }

    public int InteractiveSize(){
        IntList p = this;
        int i = 0;
        while ( p != null ){
            i++;
            p = p.rest;
        }
        return i;
    }
    public int get(int index){
        if ( index < 0 || index > (InteractiveSize()-1)){
            System.out.println("The index out of the bandary!");
            System.exit(1);
        }
        IntList p = this;
        while(index > 0){
            p = p.rest;
            index--;
        }
        return p.first;
    }
}
