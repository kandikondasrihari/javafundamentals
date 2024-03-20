package Day1;

public class Flipkart {
	String productname = "cheetos";
	int price = 2;
	int noofitems = 5;
	public Flipkart(String productname, int price, int noofitems){
		// TODO Auto-generated constructor stub
		this.noofitems = noofitems;
		this.productname = productname;
		this.price = price;
	}
	
	String OrderDetails(){
		return noofitems+" "+productname+" "+price;
	}
	
	boolean SearchProduct(String x) {
		if(x.equals(productname)) return true;
		else return false;
	}
	
	
}
