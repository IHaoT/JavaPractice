/**
 * 
 */
package lab3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author zhanghao
 *
 */
public class Lab3 {

	/**
	 * @param args
	 */
	public static void funcEx1() {
		double a,b,c,discriminant,r1,r2;
		System.out.print("Enter a,b,c: ");
		Scanner in = new Scanner(System.in);
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		discriminant = b*b-4*a*c;
		if(discriminant > 0) {
			r1 = ((-b+Math.pow(discriminant, 0.5))/(2*a));
			r2 = ((-b-Math.pow(discriminant, 0.5))/(2*a));
			System.out.print("The equation has two root: "+r1+" and "+r2);
		}
		else if(discriminant == 0) {
			r1 = (-b/(2*a));
			System.out.print("The equation has one root: "+r1);
		}
		else {
			System.out.print("The equation has no roots");
		}
	}
	public static void funcEx2() {
		int i = 1+(int) (Math.random()*12);
		switch(i) {
		case 1: System.out.print("1 Month is January");break;
		case 2: System.out.print("2 Month is February");break;
		case 3: System.out.print("3 Month is March");break;
		case 4: System.out.print("4 Month is April");break;
		case 5: System.out.print("5 Month is May");break;
		case 6: System.out.print("6 Month is June");break;
		case 7: System.out.print("7 Month is July");break;
		case 8: System.out.print("8 Month is August");break;
		case 9: System.out.print("9 Month is September");break;
		case 10: System.out.print("10 Month is October");break;
		case 11: System.out.print("11 Month is November");break;
		case 12: System.out.print("12 Month is December");break;
		}
		}
	public static void funcEx3() {
		int i;
		i = (int) (Math.random()*3);
		//0:scissor 1:rock 2:paper
		System.out.print("Scissor(0),rock(1),paper(2): ");
		Scanner in = new Scanner(System.in);
		int j = in.nextInt();
		if(i == 0 && j == 0) {
			System.out.print("The computer is scissor. You are scissor. It is a draw");
		}
		else if(i == 1 && j == 1) {
			System.out.print("The computer is rock. You are rock. It is a draw");
		}
		else if(i == 2 && j == 2) {
			System.out.print("The computer is paper. You are paper. It is a draw");
		}
		else if(i == 0 && j == 1) {
			System.out.print("The computer is scissor. You are rock. You win");
		}
		else if(i == 0 && j == 2) {
			System.out.print("The computer is scissor. You are paper. You lost");
		}
		else if(i == 1 && j == 0) {
			System.out.print("The computer is rock. You are scissor. You lost");
		}
		else if(i == 1 && j == 2) {
			System.out.print("The computer is rock. You are paper. You win");
		}
		else if(i == 2 && j == 0) {
			System.out.print("The computer is paper. You are scissor. You win");
		}
		else if(i == 2 && j == 1) {
			System.out.print("The computer is paper. You are rock. You lost");
		}
	}
	public static void funcEx4() {
		System.out.print("Enter package weight: ");
		Scanner in = new Scanner(System.in);
		double w = in.nextDouble();
		if(w > 20) {
			System.out.print("The package cannot be shopped");
			System.exit(0);
		}
		double cost;
		//½×ÌÝÊ½
		if(w>0 && w<=1) {
			System.out.print("The shipping cost is $"+(w*3.5));
		}
		else if(w>1 && w<=3) {
			System.out.print("The shipping cost is $"+(1*3.5+(w-1)*5.5));
		}
		else if(w>3 && w<=10) {
			System.out.print("The shipping cost is $"+(3.5*1+5.5*(3-1)+8.5*(w-3)));
		}
		else if(w>10 && w<=20){
			System.out.print("The shipping cost is $"+(3.5*1+5.5*(3-1)+8.5*(10-3)+10.5*(w-10)));
		}
	}
	public static void funcEx5() {
		double r;
		System.out.print("Enter the length from the center to a vertex: ");
		Scanner in = new Scanner(System.in);
		r = in.nextDouble();
		double s = 2*r*Math.sin(Math.PI/5);
		double area = (5*s*s)/(4*Math.tan(Math.PI/5));
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.print("The area of the pentagon is: "+df.format(area));
	}
	public static void funcEx6() {
		System.out.print("Enter a int: ");
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		char c = (char) i;
		System.out.print("The character for ASCII code "+i+" is "+c);
	}
	public static void funcEx7() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter two character: ");
		String s = in.nextLine();
		char m = s.charAt(0);
		char i = s.charAt(1);
		switch(m) {
		case 'M':System.out.print("Mathematics ");break;
		case 'C':System.out.print("Computer Science ");break;
		case 'I':System.out.print("Information Technology ");break;
		}
		switch(i) {
		case '1':System.out.print("Freshman");break;
		case '2':System.out.print("Sophomore");break;
		case '3':System.out.print("Junior");break;
		case '4':System.out.print("Senior");break;
		}
	}
	public static void funcEx8() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = in.nextLine();
		System.out.println("The length of the string is "+s.length());
		System.out.print("The last character in the string is "+s.charAt(s.length()-1));
	}
	public static void funcEx9() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter string s1: ");
		String s1 = in.nextLine();
		System.out.print("Enter string s2: ");
		String s2 = in.nextLine();
		if(s1.indexOf(s2)!=-1) {
			System.out.println(s2+" is a substring of "+s1);
		}
		else {
			System.out.println(s2+" is not a substring of "+s1);
		}
	}public static void funcEx10() {
		String name,tempName="";
		double score,max=-1;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = in.nextInt();
		if(n>0) {
			for(int i=0;i<n;i++) {
			System.out.print("Enter a student name: ");
			name = in.next();
			System.out.print("Enter a student score: ");
			score = in.nextDouble();
			if(score>max) {
				max = score;
				tempName = name;
			}
		 }
			System.out.print("The student who has the heightest score is: "+tempName+" ,the socre is "+max);
		}
		else {
			System.out.print("Invalid input");
			System.exit(0);
		}
		in.close();
	}public static void funcEx11() {
		int cnt = 0;
		for(int i=100;i<1000;i++) {
			if(i%5 == 0 && i%6 == 0) {
				cnt++;
				if(cnt%10 == 1) {
					System.out.print(i);
				}
				else if(cnt%10 == 0) {
					System.out.println(" "+i);
				}
				else {
					System.out.print(" "+i);
				}
			}
		}
	}public static void funcEx12() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a posotive integer: ");
		int num = in.nextInt();
		System.out.println("The factors for "+num+" is");
		int flag = 0;
		for(int i = 2;i <= num;i++) {
			if(num%i==0) {
				if(flag==0) {
					System.out.print(i);
				}
				else {
					System.out.print(" "+i);
				}
				flag=1;
				num = num/i;//120-60-30-15-5
				i--;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		funcEx1();
//		funcEx2();
		funcEx3();
//		funcEx4();
//		funcEx5();
//		funcEx6();
//		funcEx7();
//		funcEx8();
//		funcEx9();
//		funcEx10();
//		funcEx11();
//		funcEx12();
	}

}
