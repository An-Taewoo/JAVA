import java.util.*;

class ElevatorTest{
	public static void main(String [] args) throws Exception{
		Scanner x = new Scanner(System.in);
		Elevator w = new Elevator();
		
		int a;

		while(true){
			System.out.print("몇층으로 갈까요? ");
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
		System.out.println("문이 열립니다.");
	}
	public void close(){
		door = false;
		System.out.println("문이 닫힙니다.");
	}
	public void report(){
		if(floor>0) System.out.printf("%d층입니다.\n", floor);
		else if(floor==0) System.out.print("L층입니다.\n");
		else System.out.printf("지하%d층입니다.\n", -floor);
	}
	public void move(int a) throws Exception{
		Thread.sleep(1000);
		close();//문닫기
		Thread.sleep(1000);
		
		if(a>0) System.out.printf("%d층으로 이동합니다.\n", a);
		else if(a==0) System.out.print("L층으로 이동합니다.\n");
		else System.out.printf("지하%d층으로 이동합니다.\n", -a);
		
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
		report(); // 현재 층
		Thread.sleep(1000);
		open(); // 문열기
		Thread.sleep(1000);
	}
}