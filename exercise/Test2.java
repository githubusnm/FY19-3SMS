import java.util.*;
public class Test2 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		buy(scanner.nextInt(),scanner.nextDouble());
	}

	public static double buy(int count,double price)
		{
		if(count < 1){
			System.out.print("²»Âô");
			return 0.0;
		}else{
			price += (count -1) * price / 2;
			System.out.print(price);
			return price;
		}
	}
}
