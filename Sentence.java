import java.util.*;

class Example1{
	public static void main(String [] args){
		Scanner x = new Scanner(System.in);
		
		String s1,s2;
		System.out.print("����1: ");
		s1 = x.next();
		System.out.print("����2: ");
		s2 = x.next();
		
		StringManipulate w = new StringManipulate();
		
		System.out.println("����1�� ����2 ����: " + w.concat(s1,s2) );
		System.out.println("����1 �빮�� ��ȯ ���: " + w.toUpper(s1) );
		System.out.println("����2 �빮�� ��ȯ ���: " + w.toUpper(s2) );
		System.out.println("����1�� ����2�� ��ġ ����: " + w.equals(s1,s2) );
		
	}
}
class StringManipulate{
	
	String concat(String s1, String s2){
		return s1+s2;
	}
	
	String toUpper(String s){
		String ns = "";
		for(int i = 0 ; i<s.length() ; i++){
			if(s.charAt(i)>='a' && s.charAt(i)<='z'){
				ns += (char)(s.charAt(i)-32);
			}
			else ns+= s.charAt(i);
		}
		return ns;
	}
	
	boolean equals(String s1, String s2){
		if(s1.length()!= s2.length()){
			return false;
		}
		else{
			for(int i = 0 ; i< s1.length() ; i++){
				if(s1.charAt(i) != s2.charAt(i))
					return false;
			}
		}
		return true;
	}
}