package logicalquestion;

import java.util.Arrays;

public class SecondSmalles {
	
	
	
	public static void main(String[] args) {
		 int[] arr ={1,2,1,3,4,1,5,4,5,6,8,7,6,5};
	       int n =1;
	       System.out.println( getHighestNumber(arr,n));
	}
	
	 public static int getHighestNumber(int[] arr,int n){
	        
	       Arrays.sort(arr);
	       int j=0;
	       int[] a = new int[arr.length]; 
	       for(int i =0;i<arr.length-1;i++){
	           
	           if(arr[i] == arr[i+1]){
	               continue; 
	           }else{
	               a[j] =arr[i];
	               j++;
	           }
	       }
	       
	      a=Arrays.copyOf(a, j);
	      
	      System.out.println(Arrays.toString(a));
	       
	     return a[a.length-4];
	        
	       
	       
	       
	       
	       
	       
	    }

}
