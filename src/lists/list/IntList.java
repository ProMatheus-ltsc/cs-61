package lists.list;

/**
 * @author liyunfei
 */
public class IntList {
    public int first;

    public IntList rest;

    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }

    /**
     * return the size of the list
     * @return
     */
    public int size(){
        if (rest == null){
            return 1;
        }
        return 1 + this.rest.size();
    }

    /**
     * return the size of list using no recursion
     * @return
     */
    public int iterativeSize(){
        IntList p = this;
        int totalSize = 0;
        while (p != null){
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);


        System.out.println("L.size() = " + L.size());
        System.out.println("L.iterativeSize() = " + L.iterativeSize());
    }
}
