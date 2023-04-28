
public class Methods_ex {
	int a = 20, b = 10;
	public static int add(int pA , int pB)
	{
		return (pA+pB);
	}
	public void sub()
	{
		System.out.println("result="+ (a-b));
	}
	public static void main(String[] args) {
		Methods_ex obj = new Methods_ex();
		obj.sub();
		Methods_ex.add(obj.a, obj.b);
	}
	
	
}
