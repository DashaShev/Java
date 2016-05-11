
public class Kwadrat {
	int bok;
	
	public Kwadrat(int bok){
		this.bok = bok;
	}

	public static void show(int bok){
		System.out.println("Pole powierzchni kwadratu: " + bok*bok);
		System.out.println("Objętość sześcianu zbudowanego na podstawie kwadratu: " + bok*bok*bok); 
	}
	
	
	public static void main(String[] args) {
		   
		 show(5);
		  
	  }
	
}	
