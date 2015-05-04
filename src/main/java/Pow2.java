import java.math.BigInteger;

public class Pow2 {
    public static void main(String[] args) {
        //a = 2 ^ 75
        BigInteger a = new BigInteger("2");
        a = a.pow(75);

        //b = 8 ^ 4 - 3
        BigInteger b = new BigInteger("8");
        b = b.pow(4);
        b = b.subtract(new BigInteger("3"));

        //a = a mod b
        a = a.mod(b);

        System.out.println(a.toString());
    }
}
