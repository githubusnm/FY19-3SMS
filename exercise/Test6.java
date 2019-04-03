import java.util.*;
public class Test6
{
	public static void main(String[] args) 
	{
		int i = 48;
		System.out.println((char)i);
		char c = 'жа';
		System.out.println((int)c);

		int x = 0;
		//System.out.println(f(x));
		//System.out.println(y(x));
		//System.out.println(z(x));

	}
	public static int f(int x){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = a * a - 2 * a + 4;
		return b;
	}
	public static double y(double x){
		Scanner scanner = new Scanner(System.in);
		double d = scanner.nextDouble();
		double dd = d % 3;
		return dd;
	}
	public static int z(int x){
		Scanner scanner = new Scanner(System.in);
		int d = scanner.nextInt();
		int dd = d++;
		return dd;
	}
}
