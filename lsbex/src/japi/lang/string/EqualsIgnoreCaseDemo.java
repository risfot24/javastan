package japi.lang.string;

public class EqualsIgnoreCaseDemo {

	public static void main(String[] args) {
		//�� ����� ��ҹ��� ���������� ���Ѵ�.
		
		System.out.println(
				"Hello".equals("hello") ? "true" : "false"
				
				);
		// �� ����� ��ҹ��� ���̸� ���� �ʴ´�.
		// ��ҹ��� ������ ����.
		System.out.println(
				"Hello".equalsIgnoreCase("hello") ? "�����ϴ�. " : "�ٸ��ϴ�."
				
				);
		
		

	}

}
