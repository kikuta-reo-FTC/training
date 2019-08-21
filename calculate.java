import java.math.BigInteger;

/**
* 計算処理のみに関心を持ったクラス
*/
public class Calculate{

    public static final BigInteger second = BigInteger.valueOf(2);

    /**
    * 偶数判定
    * @param BigInteger 入力値
    * @return true:偶数 false:奇数
    */
    public static boolean isEvenValue(BigInteger figure){
        BigInteger Answer = figure.remainder(second);
        return Answer.equals(BigInteger.ZERO);
    }

    /**
    * 加算処理
    * @param BigInteger x コマンドラインの1つ目の入力値
    * @param BigInteger y コマンドラインの2つ目の入力値
    * @return 入力値の総和
    */
    public static BigInteger add(BigInteger x, BigInteger y)
    {
        if(x.equals(BigInteger.ZERO) && y.equals(BigInteger.ZERO)){
            throw new IllegalArgumentException();      
        }
        return x.add(y);
    }
}   