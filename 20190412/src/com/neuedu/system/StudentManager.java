package com.neuedu.system;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {
	
	StudentClient sc;
	
	public StudentManager() {
		
	}
	
	public StudentManager(StudentClient sc) {
		this.sc = sc;
	}

	// ����һ��ѧ������
	static Student[] stus = new Student[0];

	// ����һ��ɾ���������
	static Student[] newStus;
	
	// ���ѧ��
	public void addStudent(Student student) {
		stus = Arrays.copyOf(stus, stus.length + 1);
		stus[stus.length - 1] = student;
	}
	
	//���ѧ���ļ���
	public void addStuPage(Scanner scanner) {
		
		System.out.println("������ѧ��id");
		int id = scanner.nextInt();
		System.out.println("������ѧ������");
		String name = scanner.next();
		
		System.out.println("������ѧ���Ա�");
		char sex = scanner.next().charAt(0);
		System.out.println("������ѧ������");
		Short age = scanner.nextShort();
		
		System.out.println("������ѧ���꼶");
		String grade = scanner.next();
		System.out.println("������ѧ����ַ");
		String address = scanner.next();
		
		System.out.println("������ѧ����ϵ��ʽ");
		int tel = scanner.nextInt();
		System.out.println("������ѧ����������");
		String email = scanner.next();
		
		StudentManager studentManager = new StudentManager();
		Student student = new Student(id, name, sex, age, grade, address, tel, email);
		studentManager.addStudent(student);
		System.out.println("���ݱ���ɹ��������ϼ�Ŀ¼~");
		sc.stuManagerIndex();
		
	}
	
	
	

	// ����IDɾ��ѧ�� ����
	public Student[] delOneStudentByStuId(int stuId) {

		// ��ɾ��������鸳ֵ ��ֵ���̶�Ϊ����֮ǰ��Դ����ĳ���-1
		newStus = new Student[stus.length];
		// ���������е�Ԫ��
		int j = 0;
		for (int i = 0; i < stus.length; i++) {

			// �ж������е�ѧ���Ƿ���idΪstuid��ѧ��
			if (stuId != stus[i].id) {

				// �Ѳ���ȵ�ѧ���ŵ�������
				newStus[j] = stus[i];
				j++;
			}
		}
		return newStus;
	}
	
	//����id�޸�ѧ��ȫ����Ϣ
	public void updateStudentInfo(Student student) {
		//�ҵ�Ҫ�޸ĵ�ѧ��
		for(int i=0;i<stus.length;i++) {
			if(stus[i].id == student.id) {
				stus[i] = student;
			}
		}
	}
	
	//����id�޸Ĳ�����Ϣ
	
	
	

	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		Student student = new Student(1, "����", '��', (short) 15, "����", "���", 123456789, "456@qq.com");
		studentManager.addStudent(student);
		Student students = new Student(2, "����", '��', (short) 15, "����", "���", 123456789, "456@qq.com");
		studentManager.addStudent(students);

		Student student1 = new Student(3, "����", '��', (short) 15, "����", "���", 123456789, "456@qq.com");
		studentManager.addStudent(student1);
		Student students2 = new Student(4, "����", '��', (short) 15, "����", "���", 123456789, "456@qq.com");
		studentManager.addStudent(students2);

		studentManager.delOneStudentByStuId(1);
	}

}
