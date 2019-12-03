import java.util.*;

class TheaterTest{
	public static void main(String [] args){
		int [][] a = new int [11][11];
		Theater cgv = new Theater();
		
		cgv.reset(a);
		while(true){
			cgv.display(a);
			if(cgv.check(a)!=0) return;
			if(cgv.select(a)==1) return;
			cgv.reservation(a);
		}
	}
}

class Theater{
	Scanner x = new Scanner(System.in);
	int rsv;
	String ok;
	String h;
	int y;
	int ck;
	
	public void reset(int a[][]){
		for(int i=0 ; i<11 ; i++){
			for(int j=0 ; j<11 ; j++){
				if(i!=0 && j!=0){
					rsv = (int)(Math.random()*2);
					a[i][j] = rsv;
				}
				else if(i == 0 && j!=0){
					a[i][j] = j;
				}
				else if(i!=0 && j==0){
					a[i][j] = i;
				}
			}
		}
	}
	public void display(int a[][]){
		for(int i=0 ; i<11 ; i++){
			for(int j=0 ; j<11 ; j++){
				if(i!=0 && j!=0){
					if(a[i][j] == 0) System.out.print("  ");
					else System.out.print("X ");
				}
				else if(i == 0 && j!=0) System.out.print(j+" ");
				else if(i!=0 && j==0) System.out.print((char)('a'-1+a[i][j])+" ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
	public void reservation(int a[][]){
		while(true){
			System.out.print("몇 행? ");
			h = x.next();
			System.out.print("몇 열? ");
			y = x.nextInt();
			if(a[(int)(h.charAt(0)-'a')+1][y] == 1) System.out.print("이미 예약된 좌석입니다. 다른좌석을 선택하세요.\n");
			else{
				System.out.printf("%s행 %d열 예약에 성공하였습니다.\n", h,y);
				a[(int)(h.charAt(0)-'a')+1][y] = 1;
				break;
			}
		}
	}
	public int check(int a[][]){
		for(int i =1 ; i<a.length ; i++){
			for(int j =1 ; j<a[i].length ; j++){
				if(a[i][j] == 1) ck++;
			}
		}
		if(ck == 100){
			System.out.println("매진되었습니다.\n예약시스템을 종료합니다.");
		}
		else ck=0;
		return ck;
	}
	public int select(int a[][]){
		while(true){
			System.out.print("예약하시겠습니까?(Y,y/N,n)? ");
			ok = x.next();
			if(ok.charAt(0) == 'Y' || ok.charAt(0) == 'y') rsv=0;
			else if(ok.charAt(0) == 'n' || ok.charAt(0) == 'N'){
				System.out.print("예약시스템을 종료합니다.\n");
				rsv=1;
			}
			return rsv;
		}
	}	
}	
				
				