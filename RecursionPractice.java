public class RecursionPractice {

    public void printNum(int i, int num) {
        if (num < i) {
            return;
        }

        printNum(i+1, num);
        System.out.println(i);
    }

    public static void main(String[] args) {
        RecursionPractice t1 = new RecursionPractice();
        t1.printNum(1, 5);

    }

    public static void printName(int count) {
        if (count == 0) {
            return;
        }

        count--;
        printName(count);
        System.out.println((count + 1) + ". rabin");
    }
}
