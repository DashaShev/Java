public class Dzem {

	private String smak;
	private double waga;
	
	public Dzem(String smak){
		this.smak = smak;
		waga = 100.0;
	}
	
	public Dzem(String smak, double waga){
		this.smak = smak;
		this.waga = waga;
	}
	
	public Dzem(double waga){
		this.waga = waga;
		smak = "No name";
	}
	
	public static void main(String[] args) {
		Dzem dzem1 = new Dzem("truskawkowy");
		Dzem dzem2 = new Dzem("truskawkowy", 200.0);
		Dzem dzem3 = new Dzem(150.0);
 
	}

}
