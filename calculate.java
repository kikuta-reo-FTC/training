/**
*@author leokikuta
*@version int -> BigInteger 
 */


import java.math.BigInteger;
//�o�C�g���̖���BigInteger���̗p

public class Calculate{

    public static BigInteger zero = BigInteger.valueOf(0);
    public static BigInteger second = BigInteger.valueOf(2);
    //���������{
    public static boolean isEvenValue(BigInteger figure){
    BigInteger Answer = figure.remainder(second);
        if(Answer == zero){
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
            return "����";
        } else {
            return "�";
        }
    }
}   