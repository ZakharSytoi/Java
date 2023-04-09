package basicExamples;

import java.util.Collection;

public class Generics1 {
    public static <T extends Iterable> int countInCollection(T obj){
        int counter = 0;
        for (Object iterator:
             obj) {
            boolean flag = true;
            for (int i = 0; i < iterator.toString().length(); i++) {
                if(Character.compare(iterator.toString().charAt(i), iterator.toString().charAt(iterator.toString().length() - i - 1)) == 0){
                    continue;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                counter++;
            }
        }
        return counter;
    }

    public static <T> void swapInCollection(Collection<T> coll, int position1, int position2){
        int counter = 0;
        T outerTmp1 = null;
        T outerTmp2 = null;
        for (T tmp:
             coll) {
            if(counter == position1){
                outerTmp1 = tmp;
                break;
            }
            counter++;
        }
        counter = 0;
        for (T tmp:
                coll) {
            if(counter == position2){
                outerTmp2 = tmp;
                break;
            }
            counter++;

        }
        counter = 0;
        for (T tmp:
                coll) {
            if(counter == position1){
                tmp = outerTmp2;
                break;
            }
            counter++;

        }
        counter = 0;
        for (T tmp:
                coll) {
            if(counter == position2){
                tmp = outerTmp1;
                break;
            }
            counter++;

        }
    }
}
