package siucs008_ass1;

import java.util.Scanner;
public class Calculator{		
	public static void add(double a, double b) {		
    	System.out.print(a+b+"\n");
	}	
	public static void sub(double a, double b) {
		System.out.print(a-b+"\n");
	}	
	public static void pow(double a, double b){
		System.out.print(Math.pow(a,b)+"\n");
		
	}
	public static void mul(double a, double b) {
		System.out.print(a*b+"\n");
	}	
	public static void div(double a, double b) {
		System.out.print(a/b+"\n");
	}	
	public static void sqrrt(double a) {
		System.out.print(Math.sqrt(a)+"\n");
	}	
	public static void factorial(double a) {
        int fact=1;
        for (int i=2;i<=a; i++){
            fact=fact*i;
        	}
        System.out.print(fact+"\n");
        }
    public static void main(String[] args)
    {
    	char operator;
    	do {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Choose operation (+, -, *, /, r (square root), ^, !, 0 to exit): \n");
        operator = scanner.next().charAt(0);
        switch (operator) {
        case '+':
        	System.out.print("Enter first number to add: ");
        	double add1 = scanner.nextDouble();  
        	System.out.print("Enter second number to add: ");
        	double add2 = scanner.nextDouble();
        	add(add1,add2);
        break;        	
        case '-':
        	System.out.print("Enter first number to subtract from: ");
        	double sub1 = scanner.nextDouble();  
        	System.out.print("Enter second number to subtract: ");
        	double sub2 = scanner.nextDouble();
        	sub(sub1,sub2);      	
        break;        	
        case '*':
        	System.out.print("Enter first number to multiply: ");
        	double mul1 = scanner.nextDouble();  
        	System.out.print("Enter second number to multiply: ");
        	double mul2 = scanner.nextDouble(); 
        	mul(mul1,mul2);
        break;        	
        case '/':
        	System.out.print("Enter first number to divide from: ");
        	double div1 = scanner.nextDouble();  
        	System.out.print("Enter second number to divide: ");
        	double div2 = scanner.nextDouble();
        	div(div1,div2);
        break;        
        case 'r':
        	System.out.print("What number do you want to take the square root of?: ");
        	double sqrrt = scanner.nextDouble();             
        	sqrrt(sqrrt);
        break;        
        case '^':
        	double num;
        	System.out.println("Enter a number: ");
        	num = scanner.nextDouble();
        	factorial(num);
        break;    
        case '!':
        	System.out.print("Enter Base Number: ");
        	double base = scanner.nextDouble();  
            System.out.print("Enter Exponent: ");
        	double exp = scanner.nextDouble();
        	pow(base,exp);
        break; 
        case '0':	
        	scanner.close();
        	System.out.print("Process has Ended.\n");
        	System.exit(0);
        break;
        	}
        }
    	while(operator != '0');
    	
    	}
    	
    }
