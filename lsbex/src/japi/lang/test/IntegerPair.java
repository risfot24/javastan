package japi.lang.test;

import java.util.Scanner;

// 문제 제목 : N개의 정수가 주어졌을 때 그 차가 K인 정수 쌍의 수를 구하시오 
// 이 문제 의 핵심알고리즘은 31 번째 줄에서 N개의 정수들의 차를 구하는 메소드 와
// 34 번째줄의 그 차이 를 메소드에 의해서 구한값 과 정수의 쌍을 메소드에의해서 구해온값
// 과의 비교하는것이 핵심 알고리즘 입니다.

public class IntegerPair {
	
     public static void main(String args[]){
    	 int  exp, i, result = 0;
    	 long num;
    	 
    	 
    	 
    	 Scanner scan = new Scanner(System.in);	 
    	 System.out.println("예제입력 #1");
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
    	 System.out.println("예제출력#1");
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


