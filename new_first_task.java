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
        /**
        *例外処理が発生した場合再度プログラムを実行
         */
        while(true)
        {
            System.out.println("数字を2つ入力してください");
            //ここの処理に関してはまだ知識不足です。
            BufferedReader kl =new BufferedReader(new InputStreamReader(System.in));
            int NUMBER_OF_INPUTS = 2;

            try
            {
                String str1 = kl.readLine();
                String str2 = kl.readLine();
                //String型なのでlong型に変換
                /**                 
                *@param string型の引数から変換
                *また、バイト数の問題上long型を採用
                 */

                long num1 = Integer.parseInt(str1);
                long num2 = Integer.parseInt(str2);

                BigInteger big1 = BigInteger.valueOf(num1);
                BigInteger big2 = BigInteger.valueOf(num2);

                System.out.println(Calculate.add(big1, big2));
                
                break;
            }
            //@param NumberFormatException は数値のformat関する例外
            catch(NumberFormatException e){
                System.out.println("数字を入力してください");
            }
            catch(IOException n){
                n.printStackTrace();
            }
            catch(IllegalArgumentException c){
                System.out.println("0以外を入力してください");
            }
        }
    }
}