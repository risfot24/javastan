package japi.lang.string;
/*
 * 
 * java.lang.String �޼ҵ�
 * replace("OLD", "NEW") : String ���ڿ����� "OLD" ���ڸ�
 * "NEW" ���ڷ� ��ü�Ѵ�.
 * ���� ��ü�ϴ� ���ڰ� �����̸� replaceAll() �� ����Ѵ�.
 * 
 * 
 */


public class ReplaceDemo {
   public static void main(String[] args) {
	  System.out.println("Hello Tom".replace("Tom", "Alex"));
	  
	  System.out.println("A B C D : A B C D".replaceAll(" C ,o D", "E F"));
	  
	  
	  /*
	   * �� ������ �ڹ� ���� 5(jdk 1.5) ������ �����Դϴ�.
	   * ���� 5 ���� replace() ����� Ȯ��Ǿ� replaceAll() ó��
	   * ������ ���ڿ��� �����ϰ� �Ǿ����ϴ�.
	   * �׷��ٸ� �������� ���� ? �ƴմϴ�.
	   * ���ԽĿ� ���� ����� �ִ��� ������ ���θ� ���� �������� �ֽ��ϴ�.
	   * 
	   */
	  
	  System.out.println("[1] A B C D : A B C D !!".replace("C D ", "E F"));
	  System.out.println("[2] A B C D : A B C D ".replaceAll(" C D", " E F"));
	  
	  System.out.println("[3] Hello Java !!".replace("!", ""));
	  System.out.println("[4] Hello Java !!".replaceAll(".!", "d"));
	  
	  //.�� ��Ȱ�� ���ԽĿ��� ���̴µ� �Ǿ� �� ���ڸ� �����մϴ�.
	  // �׷��ϱ� ����ǥ�� �ΰ� �ִµ� �տ� �ѳ༮�� ����ڴٴ� �ǹ��̰�
	  // �� ����� replaceAll() ���Ը� �ֽ��ϴ�.
	  // ���� replace() ���ٴ� ���Խı��� ó�������� replaceAll() �� �����
	  // �����մϴ�.
	  
	  
	  
	  
	   
}
	
}
