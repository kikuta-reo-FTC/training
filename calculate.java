import java.math.BigInteger;

public class calculate{

    public static BigInteger zero = BigInteger.valueOf(0);
    public static BigInteger second = BigInteger.valueOf(2);

    public static boolean isEvenValue(BigInteger figure){
        BigInteger Answer = BigInteger.remainder(figure, second);
        if(Answer == second){
            return true;
        }
        return false;
    }

    public static String add(BigInteger x, BigInteger y)
    {
        BigInteger sum = x.add(y);
        if(x == zero && y == zero){
            throw new IllegalArgumentException();      
        } else if(isEvenValue(sum)){
            return "‹ô”";
        } else {
            return "Šï”";
        }
    }
}   