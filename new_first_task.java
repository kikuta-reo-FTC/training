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
        *��O���������������ꍇ�ēx�v���O���������s
         */
        while(true)
        {
            System.out.println("������2���͂��Ă�������");
            //�����̏����Ɋւ��Ă͂܂��m���s���ł��B
            BufferedReader kl =new BufferedReader(new InputStreamReader(System.in));
            int NUMBER_OF_INPUTS = 2;

            try
            {
                String str1 = kl.readLine();
                String str2 = kl.readLine();
                //String�^�Ȃ̂�long�^�ɕϊ�
                /**                 
                *@param string�^�̈�������ϊ�
                *�܂��A�o�C�g���̖���long�^���̗p
                 */

                long num1 = Integer.parseInt(str1);
                long num2 = Integer.parseInt(str2);

                BigInteger big1 = BigInteger.valueOf(num1);
                BigInteger big2 = BigInteger.valueOf(num2);

                System.out.println(Calculate.add(big1, big2));
                
                break;
            }
            //@param NumberFormatException �͐��l��format�ւ����O
            catch(NumberFormatException e){
                System.out.println("��������͂��Ă�������");
            }
            catch(IOException n){
                n.printStackTrace();
            }
            catch(IllegalArgumentException c){
                System.out.println("0�ȊO����͂��Ă�������");
            }
        }
    }
}