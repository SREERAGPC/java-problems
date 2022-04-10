import java.util.Scanner;

public class Options {

	int length=0,a,b,c;
	Scanner sc=new Scanner(System.in);
	void stringlength() {
		System.out.println("enter a string ");
		String str=sc.next();
		for(int i=0;i<str.length();i++) {
			length++;
			
		}
		System.out.println("length of string entered="+length);
	}
	void stringconcatenation() {
		System.out.println("enter a string1 ");
		String str1=sc.next();
		System.out.println("enter a string2 ");
		String str2=sc.next();
		System.out.println("new string ");
		String merge;
		merge=str1+str2;
		System.out.println("string after concatenation="+merge);
	}
		
	void stringreverse() {
		System.out.println("enter a string ");
		String str=sc.next();
		
		for(int i=str.length();i>=0;i--) {
			System.out.println(str.charAt(i));
			
		}
	}
	void exit(){
		System.out.println("exited");
		System.exit(0);
		
	}
	
}
