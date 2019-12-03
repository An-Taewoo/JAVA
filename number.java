import java.util.Scanner;

class Test5{
	public static void main(String [] args){
		Scanner x = new Scanner(System.in);
		
		int a,b,tmp,cnt=0,sum=0;
		
		System.out.print("양의 정수 1: ");
		a = x.nextInt();
		System.out.print("양의 정수 2: ");
		b = x.nextInt();
		
		System.out.println();
		
		if (a>b){
			tmp = b;
			b = a;
			a = tmp;
		}
		
		for(int i = a+1 ; i<b ; i++){
			for(int j = 2; j<i ; j++){
				if(i%j == 0) sum++;
			}
			if(sum == 0) cnt++;
			sum=0;
		}
		
		System.out.printf("%d AND %d : %d\n" , a,b,a&b);
		System.out.printf("%d OR  %d : %d\n" , a,b,a|b);
		System.out.printf("%d XOR %d : %d\n" , a,b,a^b);
		System.out.printf("~max(%d,%d) : %#x\n" , a,b,~b);
		System.out.printf("소수 개수 : %d\n", cnt);

	}
}