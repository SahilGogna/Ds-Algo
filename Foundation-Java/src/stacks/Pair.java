package stacks;

/**
 * used in ques 54
 */
public class Pair implements Comparable<Pair>{
    int st;
    int et;

    public Pair(int st, int et){
        this.st = st;
        this.et = et;
    }

    @Override
    public int compareTo(Pair other) {
        if(this.st != other.st){
            return this.st - other.st;
        }else {
            return this.et - other.et;
        }
    }
}
