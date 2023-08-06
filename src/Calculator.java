public class Calculator {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        switch (args[0]) {
            case "sum" -> sum(x, y);
            case "minus" -> minus(x, y);
            case "multiply" -> multiply(x, y);
            case "divide" -> divide(x, y);
            default -> System.out.println("Any operation has passed");
        }
    }

    static void sum(int x, int y) {
        System.out.println(x + y);
    }

    static void minus(int x, int y) {
        System.out.println(x - y);
    }

    static void multiply(int x, int y) {
        System.out.println(x * y);
    }

    static void divide(int x, int y) {
        System.out.println(x / y);
    }

}
