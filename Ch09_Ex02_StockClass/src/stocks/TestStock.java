package stocks;

public class TestStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating new Objects
		Stock stock1 = new Stock();
		System.out.println("The " + stock1.name + " " + " traded at a previous of " 
				+ stock1.previousClosingPrice + " closed at " + stock1.currentPrice
				+ " signifying a change of " + stock1.getChangePercent());
		System.out.println("-------------------------------------------------");
		
		Stock stock2 = new Stock("MAA", "Matilda Adepeju Alabaga", 123.2, 125.75);
		System.out.println("The " + stock2.name + " " + " traded at a previous of " 
				+ stock2.previousClosingPrice + " closed at " + stock1.currentPrice
				+ " signifying a change of " + stock2.getChangePercent());
		System.out.println("-------------------------------------------------");

	}

}
