
public class arrayproblem3 {
	 
	    public static void main(String[] args) {  
	  
	      
	        int [] arr = new int [] {35, 43, 9, 96, 67};  
	        //Initialize max  
	        int max = arr[0];  
	        
	        for (int i = 0; i < arr.length; i++) {  
	            //Compare elements 
	           if(arr[i] > max)  
	               max = arr[i];  
	        }  
	        System.out.println("Largest element present in given array: " + max);  
	    }  
	}  


