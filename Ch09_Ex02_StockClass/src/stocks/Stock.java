/**
 * 
 */
package stocks;

/**Ch09 Ex 02: The Stock Class
 * design a class named Stock that contains:
    A string data field named symbol for the stock’s symbol.
    A string data field named name for the stock’s name.
    A double data field named previousClosingPrice that stores the stock price for the previous day.
    A double data field named currentPrice that stores the stock price for the current time.
    A constructor that creates a stock with the specified symbol and name.
    A method named getChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice.
 * 
 * @author Muchi this September 13th of 2021
 *
 */
class Stock {
	//Data-fields / Variables / Attributes / Properties - State of the object
	String symbol = "OCR";
	String name = "Oracle Corporation";
	double previousClosingPrice = 35.5;
	double currentPrice = 35.35;
	
	//Object Constructor
	Stock(){
		
	}
	
	Stock(String newSymbol, String  newName, double newPreviousClosingPrice, double newCurrentPrice){
		symbol = newSymbol;
		name = newName;
		previousClosingPrice = newPreviousClosingPrice;
		currentPrice = newCurrentPrice;
	}
	
	
	//Methods
	double getChangePercent() {
		double percentageChange = ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
		return percentageChange;
	}
	
	
	void setSymbol(String newSymbol) {
		symbol = newSymbol;
	}
	void setName(String newName) {
		name = newName;
	}
	void setPreviousClosingPrice(double newPreviousClosingPrice) {
		previousClosingPrice = newPreviousClosingPrice;
	}
	void currentPrice(double newCurrentPrice) {
		currentPrice = newCurrentPrice;
	}
	

}
