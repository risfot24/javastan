package japi.util.vector;

import java.util.Vector;

/*

java.util.Vector �� �޼ҵ���
add() �� ���Ϳ� ���� �Ҵ��ϴ� ����� �Ѵ�.

*/
public class AddDemo {
	
   public static void main(String[] args) {
	  String[] chatt = new String[3];
	  String id = "admin";
	  int age = 27;
	  Boolean male = true;
	  //<String> �� ����� object�� �ִ� �ٰ� �����ϸ�ȴ�..
	  Vector vec = new Vector<>();
	  String tom = new String("admin");
	  Boolean gender = new Boolean(false);
	  
	  vec.add(new String("admin"));
	  vec.add(String.valueOf(23)); 
	  vec.add(String.valueOf(gender));
	  //���� !!!
	  // ���ʹ� length()�� ������� �ʰ�
	  // size() �� ����� ���ڸ� ǥ���ϴµ� ����մϴ�.
	  
	  for(int i= 0 ; i < vec.size(); i++ ){
		  System.out.println("������ "+ i+"��° ��Ҵ�" +vec.elementAt(i));
	  }
	  
	   
}

}
