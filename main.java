package mathoperations;

public class Main {

    // Addition class inside same file
    static class Addition {
        int add(int a, int b) {
            return a + b;
        }
    }

    public static void main(String[] args) {

        Addition obj = new Addition();
        int result = obj.add(10, 20);

        System.out.println("Sum: " + result);
    }
}