class Member{
	private String name;
	private int age;
	static int count=0;
	
	Member(){
		this.name = "";
		this.age = 0;
		System.out.println("����Ʈ ������ ���� ��ȣȸ ��� ����");
		count++;
	}
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("�̸��� ���̰� �����ϴ� ��ȣȸ ��� ����");
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
		Member d = new Member("ȫ�浿", 24);
		System.out.println("�� ��ȣȸ�� ��� ���� "+ a.getCount() +"�� �Դϴ�.");
	}
}