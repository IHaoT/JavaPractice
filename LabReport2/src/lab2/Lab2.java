/**
 * 
 */
package lab2;

import java.util.Scanner;

/**
 * @author zhanghao
 *
 */
public class Lab2 {

	/**
	 * @param args
	 */
	public static void funcEx1() {
		double f,c;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a temperature in Celsius:");
		c=in.nextDouble();
		f=(9.0/5)*c+32;
//		System.out.print(c);
		System.out.print(c+" Celsius is "+f+" Fahrenheit");
	}
	public static void funcEx2() {
		double s,r;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter subtotal and gratuity rate:");
		s = in.nextDouble();
		r = in.nextDouble();
		double g=s*r/100;
		double t=s*(1+r/100.0);
		System.out.print("The gratuity is "+g+" total is "+t);
	}
	public static void funcEx3() {
		int i;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer between 0 and 1000:");
		i = in.nextInt();
		int sum=0;
		while(i!=0) {
			sum+=i%10;
			i/=10;
		}
		System.out.print("The sum of all digits is "+sum);
	
	}
	public static void funcEx4() {
		int i;
		System.out.print("Enter the number of minutes: ");
		Scanner in = new Scanner(System.in);
		i=in.nextInt();
		//jisuan
		int y,d;
		d=(i/60)/24;
		y=((i/60)/24)/365;
		d=(i-y*365*24*60)/60/24;
		
		System.out.print(i+" minutes is approximately "+y+" years and "+d+" days");
	
	}
	public static void funcEx5() {
		double v0,v1,t;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter v0, v1, and t: ");
		v0 = in.nextDouble();
		v1 = in.nextDouble();
		t = in.nextDouble();
		double a;
		a=(v1-v0)/t;
		System.out.print("The average acceleration is "+a);
	
	}
	public static void funcEx6() {
		double f,i,m,q;
		System.out.print("Enter the amount of water in kilograms: ");
		Scanner in = new Scanner(System.in);
		m = in.nextDouble();
		System.out.print("Enter the initial temperature: ");
		i = in.nextDouble();
		System.out.print("Enter the final temperature: ");		
		f = in.nextDouble();
		q=(f-i)*m*4184;
		System.out.print("The energy needed is "+q);
		
	}
	public static void funcEx7() {
		double value=0;
		int i;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter monthly saving amount: ");
		double s;
		s = in.nextDouble();
		for(i = 0;i<6;i++) {
			value=(s+value)*(1+0.00417);
		}
		System.out.print("After the sixth month,the account value is "+value);
		
	}
	public static void funcEx8() {
		double w,h,index;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		w = in.nextDouble();
		w = w*0.45359237;
		System.out.print("Enter height in meters: ");
		h = in.nextDouble();
		h = h*0.0254;
		index = w/(h*h);
		System.out.print("BMI is: "+index);
		
	}
	public static void funcEx9() {
		double twc,ta,v;
		System.out.print("Enter the temperature in Fahrenheit between -58 F and 41 F: ");
		Scanner in = new Scanner(System.in);
		ta = in.nextDouble();
		if(ta<-58 || ta>41) {
			System.out.print("the temperture is not between -58 and 41!");
			System.exit(0);
		}
		System.out.print("Enter the wind speed miles per hour(>=2): ");
		v = in.nextDouble();
		if(v<2) {
			System.out.print("the speed is not below 2mph!");
			System.exit(0);
		}
		twc = 35.74+0.6215*ta-35.75*Math.pow(v,0.16)+0.4275*ta*Math.pow(v,0.16);
		System.out.print("The wind chill index is "+twc);
	}
	public static void funcEx10() {
		double value,amount,rate,year;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		amount = in.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		rate = in.nextDouble();
		System.out.print("Enter number of years: ");
		year = in.nextDouble();
		value = amount*Math.pow(1+((rate/12)/100),year*12);
		System.out.print("Accumulated value is: "+value);
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



	}

}
