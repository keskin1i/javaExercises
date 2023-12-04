package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        try {
            int[] arr = new int[]{1, 2, 3, 4, 5};
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally block");
        }
    }
}
