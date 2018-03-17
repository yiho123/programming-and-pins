
public class FindLargest{


public static Comparable findLargest(Comparable[] arr) {
	
	if(arr.length == 0)
		return null;
	else {
	
	Comparable y = arr[0];
	for(int i = 0; i < arr.length; i++) {
		
		if(y.compareTo(arr[i]) == -1) {
			y = arr[i];
	}
	
		
	}
			
			
			return y;
	
	
	}
}

}