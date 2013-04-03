import java.util.Vector;

class Cat{
	private int catNumber;
	Cat(int i){
		catNumber = i;
	}
	void Print(){
		System.out.println("cat Num #"+catNumber);
	}
}

class Dog{
	private int dogNumber;
	Dog(int i){
		dogNumber = i;
	}
	
	void Print(){
		System.out.println("dog Num#"+dogNumber);
	}
}
public class VectorTest {
	
	public static void main(String[] args){
		Vector<Cat> cats = new Vector<Cat>();
		for(int i =0 ;i<7;i++){
			cats.addElement(new Cat(i));
		}
		for(int j = 0;j<cats.size();j++){
			((Cat)cats.elementAt(j)).Print();
		}
		
		Vector<Dog> dogs = new Vector<Dog>();
		for(int dogI=0 ;dogI<7;dogI++){
			dogs.addElement(new Dog(dogI));
		}
		for(int dogJ=0;dogJ<dogs.size();dogJ++){
			((Dog)dogs.elementAt(dogJ)).Print();
		}
	}

}
