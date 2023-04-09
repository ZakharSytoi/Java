public class Main {
    public static void main(String[] args) {
        calculateSum(12345);
    }

    public static void calculateSum(int number) {
        int tmp, result = 0, counter = 0;
        while(number > 0){
            tmp = number % 10;
            number = number / 10;
            result = result + tmp * (int)Math.pow(10, counter);
            counter--;
        }
        System.out.println(result);
    }
}