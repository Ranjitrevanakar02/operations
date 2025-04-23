public class test {
    public static void main(String[] args) {
        int a = 34;
        int b = 4;

        System.out.println(a + " " + b + " " + (a * b));
        if (b == 0) {
            System.out.println("invalid");
        } else {
            System.out.println(a + " " + b + " " + (a / b));
        }
    }
}