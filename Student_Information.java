import java.util.*;

class Example2{
	public static void main(String [] args){
		Scanner x = new Scanner(System.in);
		St h = new St();
		String name;
		int age;
		double score;
		
		System.out.print("이름: ");
		name = x.next();
		System.out.print("나이: ");
		age = x.nextInt();
		System.out.print("학점: ");
		score = x.nextDouble();
		
		St a = new St(name, age, score);
		System.out.println("학점을 4.3으로 변경합니다.");
		a.setScore(4.3);
		System.out.println("학생정보");
		System.out.println(a);
		System.out.println(h);
		
		
	}
}

class St{
	
	private String name;
	private int age;
	private double score;
	
	St(){
		this("홍길동", 20, 3.0);
	}
	St(String name , int age , double score){
		setName(name);
		setAge(age);
		setScore(score);
	}

	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public double getScore(){
		return score;
	}
	public String setName(String s){
		this.name = s;
		return name;
	}
	public int setAge(int a){
		if(age>=0 && age<200) this.age = a;
		else this.age = age;
		return age;
	}
	public double setScore(double b){
		if(score>=0.0 && score<=4.3) this.score = b;
		else this.score = score;
		return score;
	}
	public String toString(){
		return String.format("이름: %s, 나이: %d, 학점: %.1f ", name,age,score);
	}
}