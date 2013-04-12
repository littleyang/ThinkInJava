package concurrence.join.and.fork;

import java.util.ArrayList;
import java.util.List;

/**
 * this class is used to create a list of production
 * @author jenny
 *
 */
public class ProductListGenerator {
	
	// to create a list of Product method
	public List<Product> productListGenerator(int size){
		
		// declare a list for the creation
		List<Product> ret = new ArrayList<Product>();
		//loop for create list and add the product into the ret list
		for(int i=0;i<size;i++){
			Product product = new Product();
			product.setName("product: "+i);
			product.setPrivce(10);
			ret.add(product);
		}
		// return the ret list
		return ret;
	}

}
