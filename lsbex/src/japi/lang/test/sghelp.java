package japi.lang.test;

public class sghelp {
	   
	   int  arr[][] ; 
	  
	   int begin = 0;
	   int end = 0;
	   int center = 2;
	   
	   public sghelp() {
		   //sglogic(5,5);
		      		   
	   }

	public int[][] sglogic(int a,int b) {
		arr = new int[a][b];
		int i = 0;
		
		for(int row=0;row<arr.length;row++){
			   if(row<=center){
				   begin = row;
				   end = (arr.length -1) - row;
			   }else{
				   begin = (arr.length -1) - row;
				   end = row;
			   }
	       for(int cal=begin;cal<=end;cal++){
	    	   i = i +1;
	    	   arr[row][cal] = i;
	       }
		
		}
	return arr;
	}
	public void print(int[][] parr){
		for(int i = 0; i<arr.length;i++){
			for(int j=0; j<arr[i].length;j++){
				
				if(arr[i][j] == 0){
					System.out.print("\t");
				}else{
					System.out.print(arr[i][j]+"\t");	
				}
				
				
			
			
			}
			System.out.println();
		   	
		}
			
		
	}
	   



}
