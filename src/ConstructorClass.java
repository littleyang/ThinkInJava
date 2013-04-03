class Meal{
	Meal(){
		System.out.println("meal.meal()");
	}
}

class Bread{
	Bread(){
		System.out.println("Bread.Bread()");
	}
}

class Cheese{
	Cheese(){
		System.out.println("Cheese.Cheese()");
	}
}

class Letture{
	Letture(){
		System.out.println("Letture.Letture()");
	}
}

class Lunch extends Meal{
	Lunch(){
		System.out.println("Lunch.Lunch()");
	}
}

class PotableLunch extends Lunch{
	public PotableLunch() {
	
		// TODO Auto-generated constructor stub
		System.out.println("PotableLunch.PotableLunch()");
	}
}

class Sandwich extends PotableLunch {
	Bread b = new Bread();
	Cheese c = new Cheese();
	Letture l = new Letture();
	public Sandwich() {
		// TODO Auto-generated constructor stub
	
		System.out.println("Sandwich.SandWich()");
		
	}
	
	public static void main(String[] args){
		new Sandwich();
	}
}
