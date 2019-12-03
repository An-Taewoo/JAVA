import java.util.*;
import java.io.*;

class Person1{
	public static void main(String [] args)throws Exception{
		Scanner x = new Scanner(System.in);
			
		
		String age;
		String name;
		String grade;
		int k,m,e;
		
		Person a = new Person(); // ������ ��� ����
		System.out.println(a.toString()); // ������ ��� ���
		
		System.out.print("�̸�: "); // ������ �Է¹޾� ��� ����
		name = x.next();
		System.out.print("�������: ");
		age = x.next();
		
		Person p = new Person(name, age);

		System.out.println("��ġ���� : "+ p.equals(a));
		
		p.give(new Money());
		p.give(new Cake());
		p.give(new Watch());
		p.give(new Earphone());
		
	}
}
class Person{
	String age;
	String name;
	
	Person(){
		this("ȫ�浿", "20190620");
	}
	Person(String name , String age){
		this.name = name ;
		this.age = age;
	}
	
	public boolean equals(Person p){
		return (this.name.equals(p.name) && this.age.equals(p.age));
	}
	
	public String toString(){
		return age+"�� �¾ "+ name;
	}
	public void give(Object o){
		if(o instanceof Gift) System.out.printf("������ %d�� ���� \"%s\"�� �޾ҽ��ϴ�. �����մϴ�.\n", ((Gift)o).love, o.getClass().getName());
		else System.out.printf("\"%s\"�� ������ �ƴ϶� ���� �ʾҽ��ϴ�.\n", o.getClass().getName());
	}
	
	
}
	
class Gift{
	int love;
}
class Cake extends Gift{
	Cake(){
		this.love = (int)(Math.random()*10+1);
	}
}
class Watch extends Gift{
	Watch(){
		this.love = (int)(Math.random()*10+1);
	}
}
class Earphone extends Gift{
	Earphone(){
		this.love = (int)(Math.random()*10+1);
	}
}
class Money{}