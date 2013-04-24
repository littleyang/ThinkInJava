import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Test {
	public static void main(String[] args){
		
		List<Integer> ints = new ArrayList<Integer>();
		List<Double> int2 = Arrays.asList(2.12,3.14);
		ints.add(1);
		ints.add(2);
		List<Number> nums = new ArrayList<Number>();
		nums.addAll(ints);
		nums.addAll(int2);
		
		List<? super Number> su = new ArrayList<>();
		su.add(3);
		su.add(4.12);
		su.add(3.14);
	
		//nums.add(3.14);
		nums.get(0);
	}
}
