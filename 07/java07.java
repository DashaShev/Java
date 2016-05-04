
public class java07 {

	 public static void main(String[] args) {
		
		 char a = 'a'; //0x000a;
		 MyMethod(Character.getNumericValue(a)); 
		 MyMethod((double)Character.getNumericValue(a)); 
		 
		 char b = 'b';
		 MyMethod((int)b); 
		 MyMethod((double)b); 
	 }
	 
	 
	 public static void MyMethod(int x){
		 x += 5;
		 System.out.format("int: %d\n", x);
	 }
	 
	 public static void MyMethod(double x){
		 x -= 5;
		 System.out.format("double: %.2g\n", x);
	 }
}
	
