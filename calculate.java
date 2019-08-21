import java.math.BigInteger;

/**
* �v�Z�����݂̂Ɋ֐S���������N���X
*/
public class Calculate{

    public static final BigInteger second = BigInteger.valueOf(2);

    /**
    * ��������
    * @param BigInteger ���͒l
    * @return true:���� false:�
    */
    public static boolean isEvenValue(BigInteger figure){
        BigInteger Answer = figure.remainder(second);
        return Answer.equals(BigInteger.ZERO);
    }

    /**
    * ���Z����
    * @param BigInteger x �R�}���h���C����1�ڂ̓��͒l
    * @param BigInteger y �R�}���h���C����2�ڂ̓��͒l
    * @return ���͒l�̑��a
    */
    public static BigInteger add(BigInteger x, BigInteger y)
    {
        if(x.equals(BigInteger.ZERO) && y.equals(BigInteger.ZERO)){
            throw new IllegalArgumentException();      
        }
        return x.add(y);
    }
}   