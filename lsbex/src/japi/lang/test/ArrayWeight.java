package japi.lang.test;


import java.util.Scanner;

public class ArrayWeight {
	
	
	public static void main(String args[]){
      int t1, t2,num ;
      int name; 
      
      Scanner scan = new Scanner(System.in);
      ArrayManagement am ;
      
      
      System.out.println("테스트 숫자");
     
      t1 = scan.nextInt();
      int arr1[] = new int[t1];
      String [] result = new String[t1];
      // int arr2[] ;
      for(int i=0 ; i<t1 ; i++){
    	  System.out.println("배열의 크기를 지정하세요");
    	arr1[i] = scan.nextInt();  
    	  
    	System.out.println("배열의에 넣을 수 지정");
    	int arr2[] = new int[arr1[i]];
    	for(int j=0 ; j<arr2.length; j++){
    		arr2[j] = scan.nextInt();
    	}
        am = new ArrayManagement(arr2);
    	if(am == null){
    	result[i] = "NO";
    	}
    	else{
    		result[i] = "YES";
    	}
    	
      }
      System.out.println("------------------");
      for(int i = 0 ; i<t1 ; i++){
    	  System.out.println(result[i]);
      }
      /*for(int i=0 ; i<t1 ; i++){
    	  arr1[i]
         
      }*/
     
  

    
     
        
	
	
	}
      
      
      
      
      
      
      
		
	}
	


