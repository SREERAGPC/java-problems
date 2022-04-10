import java.util.Scanner;


public class string {
	public static void main(String[] args) {
		Options obj=new Options();
		System.out.println("choose an option"
				+ "\n1:STRING LENGTH"
				+ "\n2:STRING CONCATENATION"
				+ "\n3:STRING REVERSE"
				+ "\n4:EXIT");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		switch(option){case 1:
			
			obj.stringlength();
			break;
		case 2:
			
			obj.stringconcatenation();
			
			break;
		case 3:
			
			obj.stringreverse();
			break;
		case 4:
			
			obj.exit();

			break;
		}
		
		
	}

}
