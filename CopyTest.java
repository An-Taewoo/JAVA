//���� ���� ���α׷�
/*
	1. Ŀ�ǵ���ο��� ��������, ���纻���� �Է¹ޱ� : java CopyTest ��������	���纻����
	2. Ŀ�ǵ���ο� �Է� 2���� ���ٸ� ���� �˸��� ����
	3. ���������� �������� �ʴ´ٸ� �̸� �˸��� ����
	4. ���纻 ������ �̹� �����Ѵٸ� �̸� �˸��� ����
	5. ������ ���纻�� �����ϰ� �ܼ�â�� ���� �Ϸ��� ��� ��
*/
import java.util.*;
import java.io.*;

class CopyTest{
	public static void main(String [] args) throws Exception{
		if(args.length < 2 ){
			System.out.println("[����] java CopyTest �������� ���纻����");
			return;
		}
						
		File o = new File(args[0]);
		File c = new File(args[1]);
		
		if(o.exists() == false){
			System.out.println(o.getName() + " ������ �������� �ʽ��ϴ�.");
			return;
		}
		if(c.exists() == true){
			System.out.println(c.getName() + " ������ �̹� �����մϴ�.");
			return;
		}

		Scanner x = new Scanner(o);
		PrintWriter pw = new PrintWriter(c);
		
		while(x.hasNext()){
			pw.printf("%s\r\n", x.nextLine());
		}
		pw.close();
		x.close();
		
		System.out.println("���Ͽ� ���� �Ϸ� ������ Ȯ���غ�����."); 
	}
}