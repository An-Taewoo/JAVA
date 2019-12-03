import java.util.*;

class ElevatorTest{
	public static void main(String [] args) throws Exception{
		Scanner x = new Scanner(System.in);
		Elevator w = new Elevator();
		
		int a;

		while(true){
			System.out.print("�������� �����? ");
			a = x.nextInt();
			if(a>=-2 && a<=10 && a != w.floor){
				w.move(a);
				//break;
			}
		}
	}
}
class Elevator{
	
	int floor;
	boolean door;
	
	public void open(){
		door = true;
		System.out.println("���� �����ϴ�.");
	}
	public void close(){
		door = false;
		System.out.println("���� �����ϴ�.");
	}
	public void report(){
		if(floor>0) System.out.printf("%d���Դϴ�.\n", floor);
		else if(floor==0) System.out.print("L���Դϴ�.\n");
		else System.out.printf("����%d���Դϴ�.\n", -floor);
	}
	public void move(int a) throws Exception{
		Thread.sleep(1000);
		close();//���ݱ�
		Thread.sleep(1000);
		
		if(a>0) System.out.printf("%d������ �̵��մϴ�.\n", a);
		else if(a==0) System.out.print("L������ �̵��մϴ�.\n");
		else System.out.printf("����%d������ �̵��մϴ�.\n", -a);
		
		Thread.sleep(1000);
		
		while(true){
			if(floor == 0) System.out.print("L ");
			else if(floor > 0) System.out.printf("%d ", floor);
			else System.out.printf("B%d ", -floor);
			
			Thread.sleep(1000);
			if(floor > a) floor--;
			else if(floor<a) floor++;
			else{
				System.out.println();
				break;
			}
		}
		Thread.sleep(1000);
		report(); // ���� ��
		Thread.sleep(1000);
		open(); // ������
		Thread.sleep(1000);
	}
}