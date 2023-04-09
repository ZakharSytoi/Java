package basicExamples;

public class Statics {
    static private int counter = 0;
    public Statics() {
        counter++;
    }

    public static void ShowCounter() {
        System.out.println("Counter = " + counter);
    }

    public void printStat(){
        System.out.println("Statics");
    }

    static public class buba{
        public void BubaPrint(){
            System.out.println("BubaPrint\n");
        }
    }

}
