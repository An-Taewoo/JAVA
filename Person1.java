import java.util.*;
import java.io.*;

class Person1{
	public static void main(String [] args)throws Exception{
		Scanner x = new Scanner(System.in);
			
		
		String age;
		String name;
		String grade;
		int k,m,e;
		
		Person a = new Person(); // 임의의 사람 생성
		System.out.println(a.toString()); // 임의의 사람 출력
		
		System.out.print("이름: "); // 정보를 입력받아 사람 생성
		name = x.next();
		System.out.print("생년월일: ");
		age = x.next();
		
		Person p = new Person(name, age);

		System.out.println("일치여부 : "+ p.equals(a));
		
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
		this("홍길동", "20190620");
	}
	Person(String name , String age){
		this.name = name ;
		this.age = age;
	}
	
	public boolean equals(Person p){
		return (this.name.equals(p.name) && this.age.equals(p.age));
	}
	
	public String toString(){
		return age+"에 태어난 "+ name;
	}
	public void give(Object o){
		if(o instanceof Gift) System.out.printf("정성이 %d인 선물 \"%s\"을 받았습니다. 감사합니다.\n", ((Gift)o).love, o.getClass().getName());
		else System.out.printf("\"%s\"는 선물이 아니라 받지 않았습니다.\n", o.getClass().getName());
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