Class Interval {
	Int buy_time, sell_time;
}

Class StockTrading
{
	// n is the length of priceList
	Void stockPurchasing(int price[], int n)
	{
Int len = len(stockPrices)
if(len<=1) return;

Interval interv = new Interval()
ArrayList<Interval> solution = new ArrayList<[interval]>();

Int i = 0;
Int count = 0;
//through all given price array
while (i<n-1)
{
	//find the local min
	while( (i<n-1) && (price[i+1] <= price[i]) )
	{
i++;
}
if(i == n-1) break;
Interv.buy_time = i;


//find the local max
while( (i < n) && (price[i-1] <= price[i]) )
{
	i++;
}
Interv.sell_time = i-1
solution.add(interv)

if(n==0) print(“no data in the list”)

//incremental number
Count++;
}


//print out the solution
If (count ==0)
{
system.out.println(“no data, so no good opportunity to get profit”)
}
else
{
	for (int j=0; j< count; j++)
		system.out.println(“buy time: ” + solution.get(j).buy_time
+”       ”
+”sell time: ” + solution.get(j).sell_time
)
}
return;
	}
}
