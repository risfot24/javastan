package japi.lang.string;

/*
 * java.lang.String
 *  == �� ��ü�� ���۷��� ����(hash code table)�� ���Ѱ�.
 *  ���ڿ��� ���� �񱳴� �ݵ�� equals() �޼ҵ带 �̿�.
 *  new �� �̿��ϸ� heap ������ ���ο� �޸𸮸� �Ҵ��ϰ�
 *  hashcode �� �����Ѵ�.
 * 
 */

/*
 * String �� �ִ°��� �����ͼ� 
 * 
 */
public class EqualsDemo {

	public static void main(String[] args) {
		
		//String ���� ���ͷ� ������ ���
		String str1 = "abc";
		String str2 = "abc";
		
		String result1 = (str1 == str2)? "1-2���� ���� " :"1-2���� �ٸ� ";
		String result2 = (str1.equals(str2))? "1-2���� ���� " :"1-2���� �ٸ� ";
		
		//�Ʊ� ������Ʈ ���۷��� equals ------------------------
		//����
		
		System.out.println("str1 == str2 �� ��� : "+result1 );
		System.out.println("str1.equals(str2)"+result2 );
		
		
		//-----------------------------------------
		System.out.println("----------------------------------");
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		String result3 = (str3 == str4)? "3-4���� ���� " :"3-4���� �ٸ� ";
		String result4 = (str3.equals(str4))? "3-4���� ���� " :"3-4���� �ٸ� ";
		
		System.out.println("str3 == str4 �� ��� : "+result3 );
		System.out.println("str3.equals(str4)"+result4 );
		/*
		 * result3 �� ����� �ٸ����� ���� ����
		 * - String Ŭ���� �̿��Ͽ� String �ν��Ͻ��� ������ ��쿡��
		 * - new �����ڿ� ���� �޸� �Ҵ��� �̷����� ������
		 * - �׻� ���ο� String �ν��Ͻ��� �����ȴ�.
		 * 
		 * 
		 * - �׷���, String Ÿ���� �����ڷ� ��ü�� ���������ʰ�,
		 * ���ͷ��� �����Ѵ�, ���� ������ �ȵȴ�.. , new�� ���� ����������?~
		 */
		
		
		/*
		 * ��� Ŭ��������(*.class)���� constant pool �̶��
		 * ���Ǯ�� �־, Ŭ�������� ���Ǵ� ��� ���ͷ���
		 * ������� ����Ǿ� �ִ�.
		 * ����ϰ��� �ϴ� ���ڿ��� ���Ǯ�� �̹� �����ϴ°�쿡��
		 * �� ���ڿ��� �ּҰ��� ��ȯ�Ѵ�.
		 */
		//���Ǯ static,  new string ���������� ������ ������
		System.out.println(str3.hashCode());  //�ؽ��ڵ� ���� ��������
		System.out.println(str4.hashCode());
		//System.out.println(str4.);
		
		
		//��Ȯ�� ������ ������..
		
		
		System.out.println("----------------------------------");
		String str5 = new String("abc");
		String str6 = "abc";
		
		String result5 = (str5 == str6)? "5-6���� ���� " :"5-6���� �ٸ� ";
		String result6 = (str5.equals(str6))? "5-6���� ���� " :"5-6���� �ٸ� ";
		
		System.out.println("str5 == str6 �� ��� : "+result5 );
		System.out.println("str5.equals(str6)"+result6 );
	}
	
	
	
	
	/* new �� �Ұ�� ��� ���� �Ҵ��ϱ� ������... �޸� ȿ������ ����...
	 * 
	 * 
	 */
}
