import java.util.*;
public class ArrayCopyDemo 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		int[] car = arr;
		//car[0] = 2;
		System.out.println("原始的数组 "+arr[0]);
		System.out.println("第一次复制 "+car[0]);

		int[] carr = new int[arr.length];
		for(int i = 0;i<arr.length;i++){
			carr[i] = arr[i];
		}
		//carr[0] = 2;
		System.out.println("第二次复制 "+carr[0]);
		for(int i = 0;i<carr.length;i++){
			System.out.print(carr[i]+" ");
		}
		System.out.println(Arrays.toString(carr));

		int[] carry = new int[10];
		//System.out.print(源数组，源数组开始的下标，对象数组，对象数组的下标，复制的长度);
		System.arraycopy(arr,3,carry,4,2);
		System.out.print(Arrays.toString(carry));

									//源数组，要复制的程度
		int[] carrying = Arrays.copyOf(arr,arr.length);
		System.out.print(Arrays.toString(carrying));
	}
}
