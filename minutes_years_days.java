public class minutes_years_days{
	public static void main(String[] args)
	{
		int min=3456789,years,days;
			years=min/(365*24*60);
			days=(min%(365*24*60))/(24*60);
			System.out.print("no of years = "+years+"\nno of days = "+days);
	}
}
		