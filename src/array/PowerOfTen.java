package array;

public class PowerOfTen {
    public  static boolean isPowerOfTen(int n) {
        return (n > 0 && 1000000000 % n == 0);
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTen(10100));;
    }
}
