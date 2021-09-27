import java.math.BigDecimal;

/**
 * @author zhanghao
 *
 */
public class Lab1 {
	public static void funcEx1() {
		System.out.print("Welcome to Java\nWelcome to Computer Science\nProgramming is fun");
	}
	public static void funcEx2() {
		for(int i=0;i<5;i++) {
		       System.out.println("Welcome to Java");
			}
		}
	public static void funcEx3() {
			// TODO Auto-generated method stub
			System.out.println("    J    A    V     V    A   ");
			System.out.println("    J   A A    V   V    A A  ");
			System.out.println("J   J  AAAAA    V V    AAAAA  ");
			System.out.println(" J J  A     A    V    A     A");
		
	}
	public static void funcEx4() {
		System.out.println("a  a^2  a^3");
		System.out.println("1"+"  "+1*1+"    "+1*1*1);
		System.out.println("2"+"  "+2*2+"    "+2*2*2);
		System.out.println("3"+"  "+3*3+"    "+3*3*3);
		System.out.println("4"+"  "+4*4+"   "+4*4*4);
	}
	public static void funcEx5() {
		System.out.print((9.5*4.5-2.5*3)/(45.5-3.5));
	}
	public static void funcEx6() {
		System.out.print("PI="+4*(1-1.0/3+1.0/5-1.0/7+1.0/9-1.0/11+1.0/13));
	}
	public static void funcEx7() {
		double r=5.5;
		System.out.println("perimeter="+2*Math.PI*r);
		System.out.print("area="+Math.PI*r*r);
	}
	public static void funcEx8() {
		double width=4.5;
		double height=7.9;
		System.out.println("perimeter="+2*(width+height));
		System.out.print("area="+width*height);
	}
	public static void funcEx9() {
		double kilometers=14;
		double time = 45.5/60;
		System.out.print("Average speed in miles= "+(kilometers/1.6)/time+" miles per hour");
	}
	public static void funcEx10() {
		double s=365*24*60*60;
		double r=312032486;
		for(int i=0;i<5;i++) {
			r=r+(s/7)-(s/13)+(s/45);
			String str = new BigDecimal(r+"").toString();
			System.out.println("The "+(i+1)+" year:"+str);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		funcEx1();
//		funcEx2();
//		funcEx3();
//		funcEx4();
//		funcEx5();
//		funcEx6();
//		funcEx7();
//		funcEx8();
//		funcEx9();
//		funcEx10();
	}
}
