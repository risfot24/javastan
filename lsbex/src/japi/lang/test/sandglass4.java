package japi.lang.test;

public class sandglass4 {
	
	public static void main(String[] args) {
		int arr1[] = new int[]{22,6,5,3,1,20,50,45,25,17,32,30,12,11,10,7 };
	    int[][] parr = new int[5][5];
		
		//System.out.println("�Է��� 17���� ���ڸ� �Է��ϼ���.");
	     
		//���������� ������ �����Ѵ�.
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
