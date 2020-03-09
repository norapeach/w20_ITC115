// An instance of the Product class that represents a generic product

package product_example;

import java.text.NumberFormat;

public class Product {
	
	/////// static class field - total count of how many Product objects are created
	//		only one count shared for whole class
	private static int objectCount = 0;
	
	// static method for client program to call to get # of Products created
	public static int getNumProducts() {
		return objectCount;
	}
	
	
	/////// Product Fields
	private int id;
	private String name;
	private String description;
	private double price; 
	private int totalStock; // inventory of this instance
	
	
	///////// Constructor: initializes a new Product with 'default zero' values
	// pre: name != null
	public Product(String productName) {
		if (productName == null) {
			throw new NullPointerException();
		}
		this.name = productName;
		this.description = "";
		this.price = 0.0;
		this.totalStock = 0;
		// auto-increment objectCount and use as unique productID
		objectCount++;
		this.id = objectCount;	
	}
	
	///////// Instance Methods:
	
	///////// Accessor 'getter' methods:
	public int getID() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescr() {
		return this.description;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getTotalStock() {
		return this.totalStock;
	}
	
	///////// Mutator 'setter' methods:
	
	// updates product description String
	public void setDescr(String newDescr) {
		this.description = newDescr;
	}
	
	// pre: price >= 0
	public void setPrice(double newPrice) {
		if (newPrice < 0) {
			throw new IllegalArgumentException();
		}
		this.price = newPrice;
	}
	// should this be addStock that can accept negative values?
	// but not go below 0?
	// pre: totalStock >= 0
	public void setStock(int newStock) {
		if (newStock < 0) {
			throw new IllegalArgumentException();
		}
		this.totalStock = newStock;
	}
	
	///////// Output toString: return a String for the Product instance, that 
	//						   formats the price
	// format price output to use in toString()
	public String getPriceFormatted() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
		return formattedPrice;
	}
	// Sample format
	public String toString() {
		return "Product ID: " + this.id + "\nName: " + this.name
				+ "\nDescription: " + this.description + "\nUnit Price: " +
				getPriceFormatted() + "\nTotal inventory of this product: "
				+ this.totalStock;
	}
	
}
