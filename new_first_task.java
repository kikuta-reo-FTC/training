import java.io.*;
import java.math.BigInteger;
/**
*@author Leo Kikuta
*@version java 1.8
*/
class New_First_Task
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            String str1 = args[0];
            String str2 = args[1];
            
            BigInteger big1 = new BigInteger(str1);
            BigInteger big2 = new BigInteger(str2);

            BigInteger sum = Calculate.add(big1, big2);
            String message = (Calculate.isEvenValue(sum))? "偶数": "奇数";
            System.out.println(message);
            
        }
        //in order to treat this as exception if the type is difference.
        catch(NumberFormatException e){
            System.out.println("数字を入力してください");
        }
        // in this case, this treat "0" as a exception.
        catch(IllegalArgumentException e){
            System.out.println("0以外を入力してください");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("足りない");
        }
    }
}