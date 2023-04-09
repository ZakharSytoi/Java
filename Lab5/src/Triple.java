import java.util.Comparator;

public class Triple<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> implements Comparable<Triple<T1, T2, T3>> {
    private T1 first;
    private T2 second;
    private T3 third;

    public Triple(T1 first, T2 second, T3 third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    public T3 getThird() {
        return third;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    public void setThird(T3 third) {
        this.third = third;
    }

    @Override
    public int compareTo(Triple<T1, T2, T3> o) {
        if(this.first.compareTo(o.first) == 0){
            if(this.second.compareTo(o.second) == 0){
                return this.third.compareTo(o.third);
            }
            else return this.second.compareTo(o.second);
        }
        else return this.first.compareTo(o.first);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Triple)){
            return false;
        }
        else {
            return this.first.equals(((Triple<?, ?, ?>) obj).first) &&
                    this.second.equals(((Triple<?, ?, ?>) obj).second)&&
                    this.third.equals(((Triple<?, ?, ?>) obj).third);
        }
    }

    @Override
    public String toString() {
        return "Triple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }

    public class TripleComparator implements Comparator<Triple<T1, T2, T3>>{
        @Override
        public int compare(Triple o1, Triple o2) {
            if(o1.first.compareTo(o2.first) == 0){
                if(o1.second.compareTo(o2.second) == 0){
                    return o1.third.compareTo(o2.third);
                }
                else return o1.second.compareTo(o2.second);
            }
            else return o1.first.compareTo(o2.first);
        }
    }

}
