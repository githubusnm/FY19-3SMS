import java.util.*;
public class DemoArray 
{
	public static void main(String[] args) 
	{
		char[] arr = {'我','是'};
		char[] carr = Arrays.copyOf(arr,5);
		carr[2] = '大';
		carr[3] = '帅';
		carr[4] = '哥';
		System.out.println(Arrays.toString(carr));

		String str = "统计一个字符在字符串中所有的位置";
		int[] ary ={};
		char ch = '字';
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
