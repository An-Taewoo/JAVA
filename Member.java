class Member{
	private String name;
	private int age;
	static int count=0;
	
	Member(){
		this.name = "";
		this.age = 0;
		System.out.println("디폴트 생성자 통해 동호회 멤버 생성");
		count++;
	}
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("이름과 나이가 존재하는 동호회 멤버 생성");
		count++;
	}
	
	public int getCount(){
		return count;
	}
}

class Example3{
	public static void main(String [] args){
		Member a = new Member();
		Member b = new Member();
		Member c = new Member();
		Member d = new Member("홍길동", 24);
		System.out.println("이 동호회의 멤버 수는 "+ a.getCount() +"명 입니다.");
	}
}