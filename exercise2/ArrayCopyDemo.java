import java.util.*;
public class ArrayCopyDemo 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		int[] car = arr;
		//car[0] = 2;
		System.out.println("ԭʼ������ "+arr[0]);
		System.out.println("��һ�θ��� "+car[0]);

		int[] carr = new int[arr.length];
		for(int i = 0;i<arr.length;i++){
			carr[i] = arr[i];
		}
		//carr[0] = 2;
		System.out.println("�ڶ��θ��� "+carr[0]);
		for(int i = 0;i<carr.length;i++){
			System.out.print(carr[i]+" ");
		}
		System.out.println(Arrays.toString(carr));

		int[] carry = new int[10];
		//System.out.print(Դ���飬Դ���鿪ʼ���±꣬�������飬����������±꣬���Ƶĳ���);
		System.arraycopy(arr,3,carry,4,2);
		System.out.print(Arrays.toString(carry));

									//Դ���飬Ҫ���Ƶĳ̶�
		int[] carrying = Arrays.copyOf(arr,arr.length);
		System.out.print(Arrays.toString(carrying));
	}
}