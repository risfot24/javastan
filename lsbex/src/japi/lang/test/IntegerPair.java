package japi.lang.test;

import java.util.Scanner;

// ���� ���� : N���� ������ �־����� �� �� ���� K�� ���� ���� ���� ���Ͻÿ� 
// �� ���� �� �ٽɾ˰����� 31 ��° �ٿ��� N���� �������� ���� ���ϴ� �޼ҵ� ��
// 34 ��°���� �� ���� �� �޼ҵ忡 ���ؼ� ���Ѱ� �� ������ ���� �޼ҵ忡���ؼ� ���ؿ°�
// ���� ���ϴ°��� �ٽ� �˰��� �Դϴ�.

public class IntegerPair {
	
     public static void main(String args[]){
    	 int  exp, i, result = 0;
    	 long num;
    	 
    	 
    	 
    	 Scanner scan = new Scanner(System.in);	 
    	 System.out.println("�����Է� #1");
    	 num = scan.nextInt();
    	 exp = scan.nextInt();
    	
    	 num = num%exp;
    	 System.out.println(num);
    	
    	 /*numcompare com = new numcompare();
    	 
    	 long [] numarray = new long[(int) num];
    	 
    	
    	 for(i = 0; i <numarray.length ; i++){
    		 numarray[i] = scan.nextLong();
    	           
    	 }
    	 com.setExp(exp);
    	 System.out.println("�������#1");
    	 for(i = 0; i <=numarray.length ; i++){
    		 
    		 com.setCom(numarray[i], numarray[i+1]);
        	 result = com.getCom(); 
        	 
    	 }
    	  System.out.println(result);
       
    	
    	
    	*/ 
     }
	
	

}

class numcompare{
	int com;
	int exp;
	
	
	public int getCom() {
		return com;
	}


	public void setCom(long num1,long num2) {
	/*	//this.com = (int)(num1 - num2);
	   if(num1 > num2){
		   this.com
	   }*/
	
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp+1;
	}
	
	
	
}


