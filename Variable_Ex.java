
public class Variable_Ex {
	boolean accessable = false;
	static int Mycc = 91;
	
	public static void main(String[] args) {
		byte age = 41;
		int score = 45000;
		float cost = 100.1234567890f;
		double phVal = 100.1234567890123456;
		System.out.println(age+" "+score+" "+cost+" "+phVal+" ");
		System.out.println("My CC = "+ Variable_Ex.Mycc);
		Variable_Ex varObj = new Variable_Ex();
		System.out.println(""+ Variable_Ex.Mycc);
		System.out.println("accessable= "+ varObj.accessable);
	}
 	
}
	