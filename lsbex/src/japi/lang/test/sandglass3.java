package japi.lang.test;

public class sandglass3 {
	//또다른 응용의 모래시계 배열
	
	
	public static void main(String[] args) {
		int arr[][] = new int[7][7];
		int begin = 0 , end = 0;
		int center = 7/2;
		int inc = 0;
		
		for(int row=0 ; row<arr.length; row++){
			if(row <= center){
				begin = row;
				end = (arr.length-1) -row;
			}
			else{
				begin = (arr.length -1) - row;
				end = row;
			}
			for(int cal= begin ; cal<=end; cal++){
				inc = cal +1 ;
				arr[row][cal] = inc;
				
			}
			
		}
		
		// 출력문
		for(int i=0 ; i<arr.length ; i++){
			for(int j=0 ; j<arr.length; j++){
				
				if(arr[i][j] == 0 ){
				System.out.print("\t");	
				}else{
					System.out.print(arr[i][j]+"\t");	
				}
				
				
			}
		   System.out.println();
		}
		
		
		
	}

}
