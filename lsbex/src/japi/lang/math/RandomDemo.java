package japi.lang.math;

import java.util.Scanner;

/*
 * 
 * java.lang.Math�� ����
 * random() �޼ҵ� ������ ������Ű�� ����� �Ѵ�.
 * 
 */


public class RandomDemo {

	  public static void main(String[] args) {
		  int com = (int) (Math.random()*5)+1 ;
		  /*
		   * �� �������� 5�� limit ���̰� 1�� begin ���̴�.
		   * ���� �� ������ 1���� 5���� ����(��������)��
		   * �߻���Ű��� �����̴�.
		   */
		  
		  //ȸ�� ���� �Ҷ���... ������ �ٶ� �����ϰ� ������ ���δ�..
		  //1 admin , 2 user?
		  
		  
		  int myVal;
		  Scanner scan = new Scanner(System.in);
		  int i = 0;
		  
		  while(true){
			  i++;
			  System.out.println("1���� 5���� ���� ���߱� �Դϴ�, ");
			  System.out.println("����� "+i+ "��° �õ� �Դϴ�. ");
			  myVal = scan.nextInt();
			  if(myVal == com){
				  System.out.println("��ǻ�Ͱ� �߻��� ���� : "+com);
				  System.out.println("���� �����Դϴ�.");
			      break;
			    
			  }
			  if(i == 3){
				  System.out.println("�����߽��ϴ�.");
			      break;
			  }
		  }
		  
	}
}
