/*
Ŭ����
- ��: ���� ��ü�� ���� �� ����.
- �ܹ���
- ���̽�ũ��
- ����
- ���
*/

class EatTest{
	public static void main(String [] args){
		//���� ���� �Ա�
		I i = new I();
		Hamburger h = new Hamburger();
		
		i.eat(h);
		i.eat(new IceCream());
		i.eat(new Stone());
	}
}

class Food{
	String name;
}
class Hamburger extends Food{
	Hamburger(){
		super.name = "�ܹ���";
	}
}
class Bing extends Food{
	Bing(){
		super.name = "����";
	}
}
class IceCream extends Food{
	IceCream(){
		super.name = "���̽�ũ��";
	}
}
class Kim extends Food{
	Kim(){
		super.name = "���";
	}
}
class Stone{}

class I{

	void eat(Object o){
		if(o instanceof Food) System.out.println(((Food)o).name + "(��)�� �Ծ����ϴ�.");
		else System.out.println("���ĸ� �Դ´٤Ѥ�");
			
	}
}