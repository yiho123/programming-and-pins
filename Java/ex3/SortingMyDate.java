import java.util.ArrayList;

public class SortingMyDate {

	public static void ascendSort(MyDate[] arr, ArrayList<MyDate> list) {
		int x = arr.length;
		if (x == 0)
		{}
		else {
			
		
	list.add(arr[0]);
	for(int i = 1; i < x; i++) {
		
		
		for(int j = 0; j < list.size(); j++) {
			
		
			if(arr[i].compareTo(list.get(j)) < 0 ) {
				list.add(j, arr[i]);   
				break; }
			
			
			else if(arr[i].compareTo(list.get(j)) == 0 ) {
			list.add(j+1 , arr[i]);
			break;}
			
			
			
			
			if (j == list.size() - 1)  {
			list.add(arr[i]);
			break; }
			
			
			
			
			
		}
			
		
	}
	
	
		}
		
	}
	
	public static void descendSort(MyDate[] arr, ArrayList<MyDate> list) {
		
		
		
		int x = arr.length;
		if ( x == 0)
		{}
		else {
		
		list.add(arr[0]);
		
		for(int i = 1; i < x; i++) {
			
			for(int j = 0; j < list.size(); j++) {
				if(arr[i].equals(list.get(j)) == true) {
					list.add(j+1, arr[i]);
					break;   }
				
				else if(arr[i].compareTo(list.get(j)) > 0 ) {
					list.add( j, arr[i]);   
					break; }
				
				else if (j == list.size() - 1) {
						list.add(arr[i]);
						break;}
				
				
				
		 	}
		 		
			
		 }
		
       }
		
	}
	
	
	
	
	
	
}
