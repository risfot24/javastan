package japi.lang.object;

import java.util.Arrays;

/*
 * java.lang.Object�� �޼ҵ�
 * clone() �� ��ü�� �����Ѵ�.

* */
public class CloneDemo {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		// �迭�� �ѹ� ������ ������Ű�� �߰� �Ҵ��� ���� �ʴ´�.
	    // �������� �Ҵ��ϰ��� �� ���� ArrayList �� ����Ѵ�.
		
		int[] arr2 = arr.clone();
		/*arr �迭�� ������ ���� arr2�� �״�� �Ҵ��Ѵ�.*/
		
		for(int i= 0 ;i < arr2.length; i++){
			System.out.print(arr2[i] +" " );
		}
	    System.out.println("=============");
	    
	    System.out.println("Arrays �� ���");
	    System.out.println("Arr �� ��� ���"+Arrays.toString(arr2));
	    //for���� �ʿ���� �ô뵵 �Խ��ϴ�..
	    
	    
	    
	
	
	}

	
}
