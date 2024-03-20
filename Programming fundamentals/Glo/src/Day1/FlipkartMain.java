package Day1;

public class FlipkartMain {
	public static void main(String[] args) {
		Flipkart f = new Flipkart("lays",20,5);
		System.out.println(f.OrderDetails());
		System.out.println("Search status: "+f.SearchProduct("cheetos"));
	}
}
