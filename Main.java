import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String delivery = sc.next();
		Factory factory = deliverGoodsByFactory(delivery);
        Transport logistics = factory.factorytransport();

        logistics.delivery();
    }

    static Factory deliverGoodsByFactory(String way){
        if (way.equalsIgnoreCase("sea")) {
            return new SeaFactoryTransport();
        } else if (way.equalsIgnoreCase("truck")) {
            return new RoadFactoryTransport();
        } else {
            throw new RuntimeException("Goods are not delivered in this factory by - " + way);
        }
	}

}
