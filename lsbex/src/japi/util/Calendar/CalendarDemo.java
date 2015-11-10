package japi.util.Calendar;

import java.util.Calendar;

/*��Ű���̸��� �ҹ��ڷ� �޾ Ŭ�����̸��� �����ڿ� �빮�ڸ� ����Ѵ�.
 * java.util.Calendar
 * 
 */

public class CalendarDemo {
	
	public static void main(String[] args) {
		 String[] month = {"1��","2��","3��","4��",
				 "5��","6��","7��","8��",
				 "9��","10��","11��","12��",};
		 
		 //Calendar.getInstance() �� ����������
		 // ����ƽ�� �̱��� �������� ��ü�� �����ϴ� ����̴�.
		 // �������� �ν��Ͻ��� �������� �ʵ��� �����Ϸ���
		 // �������� �ڵ��Ǿ���.
		 
		 Calendar date = Calendar.getInstance();
		 
		 System.out.print("ù��° ��¥ : ");
		 System.out.println(date.get(Calendar.YEAR)+"��");
		 
		 //�Ʒ��� 3�� ���� �ǹ��ϱ��??
		 
		 System.out.println((Calendar.MONTH+3)+"��");
		 System.out.println(date.get(Calendar.DATE)+"��");
		 System.out.println();
		 
		 System.out.print("�ι�° ��¥ : ");
		 System.out.println(date.get(Calendar.YEAR)+"��");
		 // API ���� calendars is JANUARY which is 0 �Ǿ� �����Ƿ�
		 // �Ʒ� ��ó�� ���� ���� ���� 1�� ���ؾ� �Ѵ�.
		 System.out.print(date.get(Calendar.MONTH + 1 )+"��");
		 System.out.print(date.get(Calendar.DATE)+ "��");
		 
		 System.out.println();
		
		 
		 //-------------------------------------------------------
		 System.out.println("��¥ : ");
		 System.out.println(date.get(Calendar.YEAR)+"��");
		 System.out.println(date.get(Calendar.MONTH)+"��");
		 System.out.println(date.get(Calendar.DATE)+ "��");
		 
		 System.out.println("�ð�: ");
		 System.out.println(date.get(Calendar.HOUR)+"��");
		 System.out.println(date.get(Calendar.MINUTE)+"��");
		 System.out.println(date.get(Calendar.SECOND)+ "��");
		 
		 System.out.println("=== 1�� �� ===");
		 date.add(Calendar.DATE, +1);
		 date.add(Calendar.MONTH,+1);
		 
		 //System.out.println("������ �� ");
		 /*
		  * ��µ� ����� : java.util.GregorianCalenar �� ��µǹǷ�
		  * �������̵��� �ʿ��ϴ�.
		  * 
		  */
		 
		 System.out.print(date.get(Calendar.YEAR)+"��");
		 System.out.print(date.get(Calendar.MONTH)+"��"+" ");
		 System.out.print(date.get(Calendar.DATE)+ "��"+"\n");
		  
		 System.out.print("�ð�: "+" ");
		 System.out.print(date.get(Calendar.HOUR)+"��"+" ");
		 System.out.print(date.get(Calendar.MINUTE)+"��"+" ");
		 System.out.print(date.get(Calendar.SECOND)+ "��"+"\n");
		 
		// System.out.println(date);
		 String a = toString(date);
		 System.out.println(a);
		 
		 System.out.println("=== 7�� �� ===");
		 date.add(Calendar.DATE, -7);
		 //System.out.println(date);
		a = toString(date);
		 System.out.println(a);
		 
		 System.out.println("Ư���ð����� ����");
		 
		 date.set(Calendar.HOUR,22);
		 date.set(Calendar.MINUTE,30);
		 date.set(Calendar.SECOND,20);
		 
		 System.out.println("������ �ð� ���");
		 System.out.println(Calendar.HOUR + "��");
		 System.out.println(Calendar.MINUTE + "��");
	     
		 
		 
	}

	public static String toString(Calendar date) {
		 
		
		return date.get(Calendar.MONTH)+"��" + date.get(Calendar.DATE)+"��"+ date.get(Calendar.YEAR)+"��";
	     //���⼭ +3 �� �ٸ���.
	}

	

}

//Į������ �ս����� +1�� �ؾ��Ѵ�,,