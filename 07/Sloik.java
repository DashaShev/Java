public class Sloik {
	Dzem dzem;
	boolean czyOtwarty;
	
	public Sloik(Dzem dzem){
		this.dzem = dzem;
	}
	
	public Sloik() {
		
	}

	public void otworz(){
        if (czyOtwarty == true) {
            System.err.println("Sloik with dzem " + dzem + " is already opened");
        }
		czyOtwarty = true;
	}
	
	public void zamknij(){
        if (czyOtwarty == false) {
            System.err.println("Sloik with dzem " + dzem + " is already closed");
        }
		czyOtwarty = false;
	}
	
	public boolean czyOtwarty(){
		return czyOtwarty;
		
	}
	
	
	
	
	public static void main(String[] args) {
		Sloik sloik1 = new Sloik();
		if(sloik1.czyOtwarty() == false){
            System.out.println("czyOtwarty is false");
			sloik1.otworz();
			sloik1 = new Sloik(new Dzem("truskawkowy"));
			sloik1.zamknij();
			
		} else {
            System.out.println("czyOtwarty is true");
			sloik1.zamknij();
		}
		
		Sloik sloik2 = new Sloik();
		if(sloik2.czyOtwarty() == false){
			sloik2.otworz();
			sloik2 = new Sloik(new Dzem("bananowy", 230.0));
			sloik2.zamknij();
			
		}else {
			sloik1.zamknij();
		}
		
		Sloik sloik3 = new Sloik();
		if(sloik3.czyOtwarty() == false){
			sloik3.otworz();
			sloik3 = new Sloik(new Dzem(200.0));
			sloik3.zamknij();
			
		}else {
			sloik1.zamknij();
		}

	}

}
