abstract class Instruments{
	int i;
	public abstract void play();
	public String What(){
		return "instruments";
	}
	public abstract void adjust();
}

class Wind extends Instruments{
	public void play(){
		System.out.println(" Wind.play()!");
	}
	public String What(){
		return "Wind";
	}
	public void adjust(){
	}
}

class Percussion extends Instruments{
	public void play(){
		System.out.println("Percussion.play()");
	}
	public String What(){
		return "Percussion";
	}
	
	public void adjust(){
		
	}
}

class Stringed extends Instruments{
	public void play(){
		System.out.println("Stringed.play()");
	}
	public String What(){
		return "Stringed";
	}
	public void adjust(){
		
	}
}

class Brass extends Instruments{
	public void play(){
		System.out.println("Brass.play()");
	}
	public String What(){
		return "Brass";
	}
	public void adjust(){
		
	}
}


class WoodWind extends Instruments{
	public void play(){
		System.out.println("WoodWind.play()");
	}
	public String What(){
		return "WoodWind";
	}
	public void adjust(){
		
	}
}


public class AbsstractClass {

	static void tune(Instruments i){
		i.play();
	}
	static void tuneAll(Instruments[] e){
		for(int i=0;i<e.length;i++){
			tune(e[i]);
		}
	}
	
	public static void main(String[] args){
		Instruments[] testIns = new Instruments[5];
		int i = 0;
		testIns[i++] = new Wind();
		testIns[i++] = new Percussion();
		testIns[i++] = new Brass();
		testIns[i++] = new Stringed();
		testIns[i++] = new WoodWind();
		
		tuneAll(testIns);
	}
}
