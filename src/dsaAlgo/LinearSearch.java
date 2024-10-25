package dsaAlgo;

public class LinearSearch {
     public static int linearSearch(int[] arr , int target) {
         for(int i = 0; i< arr.length; i++ ) {
        	 if(arr[i] == target) {
        		 return i;
        	 }
         }
         return -1;
     }
     public static void main (String[] args) {
    	 int[] arr = {10,20,30,50,70,64};
    	 int target = 21;
    	 int result = linearSearch(arr,target);
    	 
    	 if(result != -1) {
    		 System.out.print("element found at index : " + result);
    	 }else {
    		 System.out.print("element not found");
    	 }
     }
}
