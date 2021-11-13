package javaPrograms;

public class PeakElement {

	public static  void main(String[] args) {
		int arr[]= {2,3,8,4,5,9,6};
		peakElement(arr);
		{
			System.out.println("instace");
			
		}
		
	
		}
	public static  int peakElement(int arr[]) {
		  int min = 0;
		  for(int i = 1; i <arr.length-1;i++){
		      if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
		    	  return arr[i];
		          
		      }
	}if(arr[0]>arr[1]) {
  	 int a= arr[0];
  	 return a;
    }else if (arr[arr.length-1]>arr[arr.length-2]){
    	return arr[arr.length-1];
    }
	return 0;
		  
}
	
}
