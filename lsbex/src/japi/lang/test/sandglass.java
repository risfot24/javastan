package japi.lang.test;

public class sandglass {
	
	public static void main(String[] args) {
		//모래 시계 배열 일반 로직
		
		
      int array [][] = new int[5][5];
      int i = 0;
      int c = 0;
      int begin = 0;
      int end = 0;
     
      int center = 2;
      for(int r=0; r< array.length;r++){
    	 
    	  if(r>center){
    	   begin =  (array.length)-(r+1);  
    	   end = r;	 
    			   
    	 }else if(r<=center){
    		 begin = r;
    		 end = array.length - (r+1);
    	 }
    	 
    	 for(c=begin; c<=end;c++){
    		 i = i +1; 
    		 array[r][c] =i ;	 
    	 } 
      }
      
      for(int j=0;j<array.length;j++){
 		 for(int k=0 ;k< array[j].length;k++){
 			 if(array[j][k] == 0){
 				 System.out.print("\t");
 			 }else{
 				 System.out.print(array[j][k]+"\t");	 
 			 }
 		  
 		 }
 		System.out.println();
 		 
 	 }
      
      
		
	}

}
