package Day1;

public class ShipmentOrder {
	String origin, Destination;
	float weight = (float) 200.2;
	public void shipmentOrder() {
		System.out.println("Order shipment initiated:");
	}
	public String getShipment() {
		origin = "Banglore";
		Destination = "Hyderabad";
		System.out.print("Shipping from "+origin);
		return Destination;
	}

}
