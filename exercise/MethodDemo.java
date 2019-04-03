public class MethodDemo{
	public static void main(String[] args){
		int x = 3;
		int y = f(x);
		System.out.print(y);
	}
	public static int f(int x){
		int y = 3 * x + 6;
		return y;
	}
}