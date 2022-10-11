package GenericeQuestions;

import java.util.Scanner;

public class maximumNumber2Position {
	public static <T extends Number> T Maxnumber (T one, T two,T three) {
		T max=null;
		T min=null;
		T mid=null;
		
		int res1=String.valueOf(one).compareTo(String.valueOf(two));
		int res2=String.valueOf(one).compareTo(String.valueOf(three));
		int res3=String.valueOf(two).compareTo(String.valueOf(three));
		
		if(res1 > 0 ) {
	         if(res2>0) {
	        	 max=one;
	        	 if(res3> 0 ) {
		        	 min=three;
		        	 mid=two;
		        	
		         }else {
		        	 min=two;
		        	 mid=three;
		        	 
		         }
	         }
	         
	         
	      } else if(res3 > 0) {
	    	  if(res1 < 0) {
		        	 max=two;
		        	 if(res2> 0 ) {
			        	 min=three;
			        	 mid=one;
			        	 
			         }else {
			        	 min=one;
			        	 mid=three;
			        	 
			         }
		         }
	         
	      } else {
	         max=three;
	         if(res1 > 0) {
	        	 min=two;
	        	 mid=one;
	        	 
	         }else {
	        	 min=one;
	        	 mid=two;
	        	 
	         }
	         
	      }
		return mid;
	   
			
		    
		}
		
		
		public static <T> void main(String[] args) {
			
			System.out.println("Enter Value 1: ");
	        Scanner sc= new Scanner(System.in); 
	        int N1= sc.nextInt();
	        System.out.println("Enter Value 2: ");
	        Scanner sc1= new Scanner(System.in); 
	        int N2=  sc1.nextInt();
	        System.out.println("Enter Value 2: ");
	        Scanner sc2= new Scanner(System.in); 
	        int N3=  sc1.nextInt();
			T max2Position1=(T) Maxnumber(N1 ,N2,N3);
			 System.out.println("--------------Compare Three Numbers-----------------");
				
				System.out.println("Maximum Number at second Position "+max2Position1);
				
			
		}

}


