import java.util.*;
public class Test
{
	public static void main(String[] args) 
	{
		String username = "�����û���";
		String password = "��������";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�������û�����");
		String inportusername = scanner.next();

		System.out.print("���������룺");
		String inportpassword = scanner.next();

		if(username.equals(inportusername) && password.equals(inportpassword)){
			System.out.println("��½�ɹ�!");
		}else{
			System.out.println("��½ʧ�ܣ�");
		}
		
	}
}
