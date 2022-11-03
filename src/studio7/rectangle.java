package studio7;

public class rectangle {
	private int L;
	private int W;
	public rectangle(int length,int width)
	{
		 
		L=length;
		W=width;
	}
 
	public int getLength() {
		return this.L;
	}
	public int getArea() {
		return L*W;
	}
		
public static void main(String[]args) {
	rectangle r= new rectangle(1,2);
	rectangle r2= new rectangle(2,4);
	System.out.println(r.getLength());
	System.out.println(r2.getLength());
	System.out.println(r.getArea());
	System.out.println(r2.getArea());
}
	}


