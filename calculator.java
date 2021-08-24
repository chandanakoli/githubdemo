

import java.util.Scanner;

 class calculator {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
                 String op=scan.next();
	switch(op){
		case "*": System.out.println(a*b);break;
		case "/": System.out.println(a/b);break;
		default:System.out.println("enter crt symbol");
	}

}
}
