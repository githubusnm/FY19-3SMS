import java.util.*;
public class Test
{
	public static void main(String[] args) 
	{
		String username = "我是用户名";
		String password = "我是密码";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("请输入用户名：");
		String inportusername = scanner.next();

		System.out.print("请输入密码：");
		String inportpassword = scanner.next();

		if(username.equals(inportusername) && password.equals(inportpassword)){
			System.out.println("登陆成功!");
		}else{
			System.out.println("登陆失败！");
		}
		
	}
}
