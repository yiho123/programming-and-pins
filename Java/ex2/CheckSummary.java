import java.util.ArrayList;

public class CheckSummary {

	public static void printSummary(ArrayList<Check> checks) {
		
		int x = checks.size();
		
		int c = 1001;
		int n = 0;
		
		
		ArrayList<Integer> sumofMonth = new ArrayList<Integer>();
		ArrayList<MyDate> time = new ArrayList<MyDate>();
		
		
		if(x != 0 ) {
		
		n =  checks.get(0).getAmount();  }
		
		for(int  i = 0; i < x; i++) {
			
			
			System.out.println("Check No: " + c + ", Payee: " + checks.get(i).getPayee() + ", Amount: " 
			+ checks.get(i).getAmount() + ", Date:" + checks.get(i).getDate()  );
			c++;
			
			if( i < x - 1) {
			
			if (checks.get(i).getDate().getMonth() != checks.get(i+1).getDate().getMonth()  ) {
				
				sumofMonth.add(n);
				time.add(checks.get(i).getDate());
				n = checks.get(i+1).getAmount();
				
			}
			
			else if (checks.get(i).getDate().getMonth() == checks.get(i+1).getDate().getMonth()  )
				n = n + checks.get(i+1).getAmount();
			
			}
			
			
		}
		
		System.out.println("The next check number is " + c);
		
		
		
		if(checks.get(x-2).getDate().getMonth() != checks.get(x-1).getDate().getMonth()) {
			sumofMonth.add(n);
		    time.add(checks.get(x-1).getDate());
		    
		}
		
		int s = sumofMonth.size();
		
		int sum = 0;
		for (int i = 0; i < s; i++) {
			
			
			System.out.println("The total amount of the check issued in  " + time.get(i).getYear() + "/" + time.get(i).getMonth() 
					+ " is " + sumofMonth.get(i) );
			sum = sum + sumofMonth.get(i);
			
		}
		System.out.println("The total amount is " + sum);
		
		
		
		
		
	}
	
	
	
	
}
