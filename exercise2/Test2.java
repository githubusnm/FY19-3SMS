public class Test2 
{
	public static void main(String[] args) 
	{
		for(int i = 1;i<=5;i++){
			for(int k = 5;k>i;k--){
				System.out.print("/");
			}
			for(int j = 1;j<=5;j++){
				System.out.print("*");
			}
			for(int a = 1;a<2*i-1;a++){
				System.out.print("-");
			}
			for(int b = 1;b<=1;b++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int c = 1;c<=14;c++){
			System.out.print("*");
		}
		System.out.println();
		
		for(int e = 1;e<5;e++){
			System.out.print("*");
			for(int d = 1;d<=12;d++){
				System.out.print("+");
			}
			System.out.print("*");
			System.out.println();
		}

		for(int c = 1;c<=14;c++){
			System.out.print("*");
		}
	}
}
