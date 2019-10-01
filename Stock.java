
class Stock
{
	String stockName;
	String stockSymbol;
	double previousClosingPrice;
	double currentClosingPrice;
	public static void main(String[] args)
	{
		 Stock s = new Stock("sai","s",14.0,25.0);
		 double  percentageChange = s.getChangePercentage();
		 System.out.println(" the percentage change is " +  percentageChange);
		
	}
	
	public Stock( String stockName,String stockSymbol,double previousClosingPrice, double currentClosingPrice)
	{
		 this.stockName = stockName;
		 this.stockSymbol = stockSymbol;
		 this.previousClosingPrice = previousClosingPrice;
		 this.currentClosingPrice = currentClosingPrice;	
	}
	
	public double getChangePercentage()
	{
		double percentageChange = (((currentClosingPrice-previousClosingPrice)*(100.0))/(previousClosingPrice));
		return percentageChange ;
	}
}
		
