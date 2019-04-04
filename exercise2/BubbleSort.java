import java.util.*;
public class BubbleSort 
{
	public static void main(String[] args) 
	{
		//ц╟ещеепР
		int[] nums = {-1,0,-2,5,-3,4,-4,-5,1,2,3};
		int[] newArr = bubblesort(nums);
		System.out.print(Arrays.toString(newArr));
	}

	public static int[] bubblesort(int[] array){
		for(int i = 0;i<array.length-1;i++){
			for(int j = 0;j<array.length-1-i;j++){
				if(array[j]>array[j+1]){
					int temp = 0;
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
}
