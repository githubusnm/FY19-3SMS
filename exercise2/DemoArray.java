import java.util.*;
public class DemoArray 
{
	public static void main(String[] args) 
	{
		char[] arr = {'��','��'};
		char[] carr = Arrays.copyOf(arr,5);
		carr[2] = '��';
		carr[3] = '˧';
		carr[4] = '��';
		System.out.println(Arrays.toString(carr));

		String str = "ͳ��һ���ַ����ַ��������е�λ��";
		int[] ary ={};
		char ch = '��';
		for(int i = 0;i<str.length();i++){
			char c = str.charAt(i);
			if(ch == c){
				ary = Arrays.copyOf(ary,ary.length+1);
				ary[ary.length-1] = i;
			}
		}
		System.out.print(Arrays.toString(ary));
	}
}
