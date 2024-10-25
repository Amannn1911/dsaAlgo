package dsaAlgo;

public class BinarySearch {
    public static int binarySearch(int[] arr , int tar) {
    	int left = 0;
    	int right = arr.length - 1;
    	
    	while(left <= right) {
    		int mid = left + (right -left) /2;
    		
    		if(arr[mid] == tar) {
    			return mid;
    		}else if( arr[mid] < tar) {
    			 left = mid + 1;
    		}else {
    			right = mid - 1;
    		}
    	}
    	return -1;
    }
    public static void main(String[]args) {
    	int[]arr = {2,4,6,-1,8,3,9};
    	int tar = 3;
    	int result = binarySearch(arr,tar);
    	
    	if(result != -1) {
    		System.out.print("Element found at index : " + result);
    	}else {
    		System.out.print("Element ki maa chud gyi");
    	}
    }
}
