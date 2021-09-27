/**
 * 
 */
package lab4;

import java.util.Scanner;

/**
 * @author zhanghao
 *
 */
public class Lab4 {

	private static Scanner in;



	/**
	 * @param args
	 */
	/**
	 * funcEx1:sum the digits in an integer
	 */
	public static int sumDigits(int n) {
		int sum = 0;
		while(n!=0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}

	public static void funcEx1() {
		System.out.print("Enter a number: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int num1 = Math.abs(num);
		System.out.print("The multiplication of the number for "+num+" is "+sumDigits(num1));
		in.close();
		
	}
	/**
	 * funcEx2:Palindrome integer
	 */
	public static int reverse(int n) {
		int rev=0;
		while(n!=0) {//12321
			rev*=10;
			rev+=n%10;
			n/=10;
		}
		return rev;
	}
	public static boolean isPalindrome(int n) {
		if(reverse(n)==n) {
			return true;
		}
		return false;
	}
	public static void funcEx2() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a integer: ");
		int num = in.nextInt();
		if(isPalindrome(num)) {
			System.out.print(num+" is a palindrome");
		}
		else {
			System.out.print(num+" is not a palindrome");
		}
		in.close();
	}
	/**
	 * funcEx3:Financial application: compute the future investment value
	 * 
	 */
	public static double futureInvestmentValue(double investmentValue,double monthlyInterestRate,int years) {
		double futureInvestmentValue = investmentValue*Math.pow(1+monthlyInterestRate/100,years*12);
		return futureInvestmentValue;
	}
	public static void funcEx3() {
		Scanner in = new Scanner(System.in);
		double investmentValue,monthlyInterestRate;
		int years;
		System.out.print("Enter the investmentValue: ");
		investmentValue = in.nextDouble();
		System.out.print("Enter yearly interest rate: ");
		monthlyInterestRate = in.nextDouble()/12;
		for(years = 1;years<=30;years++) {
			System.out.printf("%-15d%15.2f\n", years,futureInvestmentValue(investmentValue, monthlyInterestRate, years));//format output,15 block
		}
		in.close();
	}
	/**
	 * 
	 * @param funcEx4:Sum series
	 */
	public static double process(int n) {
		double m = 0;
		for(int i=1;i<=n;i++) {
			m+=i*1.0/(i+1);
		}
		return m;
	}
	public static void funcEX4() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter i: ");
		int i = in.nextInt();
		String a = "i";
		String b = "m(i)";
		System.out.printf("%-10s%10s\n", a,b);
		for(int ii=1;ii<=i;ii++) {
			System.out.printf("%-10d%10.4f\n", ii,process(ii));//format output,save 4 dot
		}
		in.close();
	}
	/*
	 * funcEx5:Estimate PI
	 */
	public static double pi(int n) {
		double m = 0;
		for(int i=1;i<=n;i++) {
			m+=Math.pow(-1,i+1)/(2*i-1);
		}
		m*=4;
		return m;
	}
	public static void funcEX5() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter i: ");
		int i = in.nextInt();
		String a = "i";
		String b = "m(i)";
		System.out.printf("%-10s%10s\n", a,b);
		for(int ii=1;ii<=i;ii+=100) {
			System.out.printf("%-10d%10.4f\n", ii,pi(ii));//format output,save 4 dot
		}
		in.close();
	}
	/*
	 * funcEx7:Check password
	 */
	public static boolean checkLength(String s) {
		if(s.length()>=8) {
			return true;
		}
		return false;
	}
	public static boolean checkConsist(String s) {
		for(int i=0;i<s.length();i++) {
			if(!Character.isLetterOrDigit(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	public static boolean checkCountDigit(String s) {
		int cnt=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))){
				cnt++;
				if(cnt>=2) {
					return true;
				}
			}
		}
		return false;
	}
	public static void funcEx6() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string for password: ");
		String s = in.next();
		if(checkConsist(s) && checkCountDigit(s) && checkLength(s)) {
			System.out.print("Valid password");
		}
		else {
			System.out.print("Invalid password");
		}
	}
	/*
	 * funcEx7:Analyze scores
	 */
	
	public static void funcEx7() {
		Scanner in = new Scanner(System.in);
		double score;
		double[] scoreList = new double[100];
		int i = 0;
		do {
			System.out.print("Enter a new score: ");
			score = in.nextDouble();
			scoreList[i] = score;
			i++;
		}while(score>=0);
		i--;
		System.out.println("count is "+i);
		double sum = 0,avg;
		for(int j=0;j<i;j++) {
			sum+=scoreList[j];
		}
		avg=sum/i;
//		System.out.print("Average is ");
		System.out.printf("Average is %.1f\n",avg);
		int above = 0,below = 0;
		for(int j=0;j<i;j++) {
			if(scoreList[j]>=avg) {
				above++;
			}
			else {
				below++;
			}
		}
		System.out.println("Number score above or equal avg is "+above);
		System.out.print("Number score below avg is "+below);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		funcEx1();
//		funcEx2();
//		funcEx3();
//		funcEx4();
//		funcEx5();
//		funcEx6();
		funcEx7();
	}

}
