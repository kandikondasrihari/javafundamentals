package Day1;

public class ShipmentMain {
	public static void main(String[] args) {
		ShipmentOrder so = new ShipmentOrder();
		so.shipmentOrder();
		System.out.print(" to "+so.getShipment());
	}
}
