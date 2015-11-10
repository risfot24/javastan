package japi.lang.system;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * java.lang.System �� ����
 * currentTimeMillis() ��
 * ROM �� ����� �ð��� �����Ѵ�.
 */
//�츮�� pc �� ��¥�� 1970 ������ ������ ���κ��� �������� �ٲٸ�ȴ�.



public class CurrentTimeDemo {
	
	public static void main(String[] args) {
		long curTime = System.currentTimeMillis();
		System.out.println("curTime : "+curTime);
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		/*
		 * new Date() �ÿ� import wpdks
		 * 
		 */
		/*String nowTime = import ������ �ΰ��� �ε�
		 * ���� java.util.Date �� �����Ѵ�.
		 */
		String nowTime = sdf.format(new Date(curTime));
		System.out.println("����ð� : "+ nowTime);
		
			
		
	}

}
