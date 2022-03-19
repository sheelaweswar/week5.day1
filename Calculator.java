package week5.day1;

public class Calculator {
	public void add(int x,int y) {
		
		System.out.println("The X value is "+x+" The Y value is "+y);
	}
	public void add(float x,float y) {
		
		System.out.println("The X value is "+x+" The Y value is "+y);
	}
	public void add(long a,long b) {
		
		System.out.println("The A value is "+a+" The B value is "+b);
	}
	public void add(short c,int d) {
		
		System.out.println("The C value is "+c+" The D value is "+d);
	}
	public static void main(String[] args) {
		Calculator objcalc = new Calculator();
		objcalc.add(5,4);
		objcalc.add(5.5f, 2.1f);
		objcalc.add(1500000112l, 2000000001145l);
		objcalc.add(15, 63);
		
	}
}
