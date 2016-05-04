
public class java07 {

	 public static void main(String[] args) {
		
		 int a1 = 10;
		 double a2 = 17.14; 
		 char a = 'A'; //0x000a;
		 MyMethod(Character.getNumericValue(a)); 
		 
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
	
