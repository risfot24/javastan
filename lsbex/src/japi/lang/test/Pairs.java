package japi.lang.test;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {
	 public static void main(String args[]) {
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("�� ���� ������ �����̽��� �����Ͽ� �Է����ּ���.");

	      int firstNum = scanner.nextInt(); // ù��° �� �Է�
	      int secondNum = scanner.nextInt(); // �ι�° �� �Է�
           
	      int[] arrayNum = array(scanner, firstNum);
	      int count = array(firstNum, secondNum, arrayNum);
	      
	      System.out.println(count);
	   }
       
	   /* ù��°(firstNum) �Է��� ���� ������ŭ �迭 ���� �� ���� */
	   static int[] array(Scanner scanner, int firstNum) {
	      int arrayNum[] = new int[firstNum];
	      for (int i = 0; i < firstNum; i++) {
	         arrayNum[i] = scanner.nextInt();
	      }
	      return arrayNum;
	   }
	   
	   static int array(int firstNum, int secondNum, int[] arrayNum) {
	      Arrays.sort(arrayNum); 
	      // ū���� ���� �� ���������� ���̳ʽ� ����ϱ� ���� ����
	      /* �迭�� �������� ���� �� ���� �� ��� 
	        ex) 
	        firstNum = 5, secondNum = 2 
	          �迭 ���� ��, 
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
