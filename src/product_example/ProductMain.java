/* ProductMain.java 
 * 
 * ITC 115  
 * 03.9.20
 * Nora P.
 * 
 * Assignment 9: Generic Product.java class
 * Description: This program runs tests on the Product.java class
 * 				outputting the generic Product instance information 
 * 				and total number of Product instances. The quantity is updated on
 *				one instance (setStock) and that change is output (getTotalStock)
 */
 
package product_example;

// import java.util.*; // Was going to use scanner to gather user input for products
					// but ran out of time

public class ProductMain {

	public static void main(String[] args) {
		Product p1 = new Product("Kaffee Tasse");
		p1.setDescr("Eine Tasse fuer den Kaffee.");
		p1.setPrice(3.50);
		p1.setStock(10);
		
		Product p2 = new Product("Tischlampe");
		p2.setDescr("Eine Lampe fuer den Tisch.");
		p2.setPrice(27.80);
		p2.setStock(7);
		
		Product p3 = new Product("Trinkglas");
		p3.setDescr("Ein Glas fuer Getraenke.");
		p3.setPrice(2.57);
		p3.setStock(139);
		
		System.out.println(p1);
		System.out.println("\n" + p2);
		System.out.println("\n" + p3);
		
		System.out.println("\nYour store contains " + Product.getNumProducts() + " types of products.");
		p2.setStock(20);
		System.out.println("Product: " + p2.getName() + " -> Updated stock quantity: " + p2.getTotalStock());
	}

}
