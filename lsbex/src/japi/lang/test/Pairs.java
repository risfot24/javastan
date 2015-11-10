package japi.lang.test;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {
	 public static void main(String args[]) {
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("두 개의 정수를 스페이스로 구분하여 입력해주세요.");

	      int firstNum = scanner.nextInt(); // 첫번째 수 입력
	      int secondNum = scanner.nextInt(); // 두번째 수 입력
           
	      int[] arrayNum = array(scanner, firstNum);
	      int count = array(firstNum, secondNum, arrayNum);
	      
	      System.out.println(count);
	   }
       
	   /* 첫번째(firstNum) 입력한 수의 갯수만큼 배열 생성 및 저장 */
	   static int[] array(Scanner scanner, int firstNum) {
	      int arrayNum[] = new int[firstNum];
	      for (int i = 0; i < firstNum; i++) {
	         arrayNum[i] = scanner.nextInt();
	      }
	      return arrayNum;
	   }
	   
	   static int array(int firstNum, int secondNum, int[] arrayNum) {
	      Arrays.sort(arrayNum); 
	      // 큰수로 정렬 후 순차적으로 마이너스 계산하기 위해 정렬
	      /* 배열값 내림차순 정렬 후 쌍의 수 계산 
	        ex) 
	        firstNum = 5, secondNum = 2 
	          배열 정렬 후, 
	        arrayNum[1] = 5
	        arrayNum[3] = 4
	        arrayNum[2] = 3
	        arrayNum[4] = 2
	        arrayNum[0] = 1
	       */
	      int count = 0;
	      for (int i = firstNum-1; i > 0; i--) {
	         for (int j = i; j >= 0; j--) {
	            if ((arrayNum[i] - arrayNum[j]) == secondNum) {
	               count++;
	            }
	         }
	      }
	      return count;
	   }
	

}
