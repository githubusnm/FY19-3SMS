import java.util.*;
public class Tongji 
{
	public static void main(String[] args) 
	{
		//�õ�����λ��
		char[] chs = {'ͳ','��','һ','��','��','��','��','��','��','��','��'};
		char c = '��';
		for(int i = 0;i < chs.length;i++){
			if(c == chs[i]){
				System.out.print(" "+i);
			}
		}
		System.out.println();

		//��ż����
		String str = "123456789012";
		int oddsum = 0;
		int evensum = 0;
		int sum = 0;
		for(int i = 1;i < str.length(); i+=2){
			int q = str.charAt(i) - 48;
			evensum += q ;
			System.out.print(q+" ");
		}
		System.out.println();
		for(int i = 0;i < str.length(); i+=2){
			int e = str.charAt(i) - 48;
			oddsum += e ;
			System.out.print(e+" ");
		}

		int z = 54321;
		
	}
}