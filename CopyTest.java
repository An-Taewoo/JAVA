//파일 복사 프로그램
/*
	1. 커맨드라인에서 원본파일, 본사본파일 입력받기 : java CopyTest 원본파일	본사본파일
	2. 커맨드라인에 입력 2개가 없다면 사용법 알리고 종료
	3. 원본파일이 존재하지 않는다면 이를 알리고 종료
	4. 복사본 파일이 이미 존재한다면 이를 알리고 종료
	5. 원본을 복사본에 복사하고 콘솔창에 복사 완료라고 띄울 것
*/
import java.util.*;
import java.io.*;

class CopyTest{
	public static void main(String [] args) throws Exception{
		if(args.length < 2 ){
			System.out.println("[사용법] java CopyTest 원본파일 본사본파일");
			return;
		}
						
		File o = new File(args[0]);
		File c = new File(args[1]);
		
		if(o.exists() == false){
			System.out.println(o.getName() + " 파일이 존재하지 않습니다.");
			return;
		}
		if(c.exists() == true){
			System.out.println(c.getName() + " 파일이 이미 존재합니다.");
			return;
		}

		Scanner x = new Scanner(o);
		PrintWriter pw = new PrintWriter(c);
		
		while(x.hasNext()){
			pw.printf("%s\r\n", x.nextLine());
		}
		pw.close();
		x.close();
		
		System.out.println("파일에 복사 완료 폴더를 확인해보세요."); 
	}
}