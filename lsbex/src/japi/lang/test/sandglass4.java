package japi.lang.test;

public class sandglass4 {
	
	public static void main(String[] args) {
		int arr1[] = new int[]{22,6,5,3,1,20,50,45,25,17,32,30,12,11,10,7 };
	    int[][] parr = new int[5][5];
		
		//System.out.println("입력할 17개의 숫자를 입력하세요.");
	     
		//일차적으로 정렬을 실행한다.
		for(int i = 0; i<arr1.length; i++){
			 for(int j=0;i<arr1.length; j++){
				if(arr1[i]<arr1[i+1]){
				int temp =	arr1[i];
				arr1[i] = arr1[i+1];
				arr1[i] = temp;
				}	
			}	
		}
		for(int row = 0 ; row<parr.length; row++){
			
			
		}
		
		
	     
	
	
	
	
	
	}

}
