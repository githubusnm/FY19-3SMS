import java.util.*;
public class Test7 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("ÊäÈëÄãµÄ³É¼¨£º");
		int score = scanner.nextInt();
		switch(score / 10){
			case 10:
				System.out.println("super man");
			break;
			case 9:
				System.out.println("good");
			break;
			case 8:
				System.out.println("just so so");
			break;
			default:
				System.out.println("you are fired£¡");

		}
	}
}
