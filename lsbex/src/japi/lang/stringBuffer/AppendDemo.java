package japi.lang.stringBuffer;
/*
 * 
 * StringBuffer Ŭ����
 *   -String Ŭ���� �� �������� �ν��Ͻ� ������
 *      ���ڿ��� �ٲ� �� �ְ� ���� �ִ�.
 */
/*
 * java.lang.StringBuffer �� �޼ҵ���
 * append() �� �Ķ���ͷ� ���� String ������
 * ���� ���ڿ��� �߿� ���δ�.
 * 
 */




public class AppendDemo {
	
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		StringBuffer buf1 = new StringBuffer("A B C");
		//StringBuffer buf2 = new StringBuffer("D E F");
		StringBuffer buf2 = buf1.append("D E F");
		String msg;
		//concat �� �ٸ��� concat�� ���δٸ��� ������ �ΰ��� ���̴°Ͱ�
		// buffer�� �ִ°��� �������߰��Ѱ��̴�...
	
	
	    if(buf ==buf2){
	    	msg = "buf1 == buf2 ";
	    }else {
	    	msg = "buf1 != buf2"; // !=�� ���� �ʴٴ� ������.
	    }
	    
	    System.out.println(msg);
	    System.out.println(buf1.toString());
	    System.out.println(buf2.toString());
	    /*
	     * buf2 �� ���Ӱ� �����Ǿ� ���޵� ��ü�� �ƴϸ�
	     * buf1 �� ���������� �����Ǿ� ���� �������ν�
	     * ������ �ּҰ��� �����Ѵ�.
	     * 
	     * StringBuffer Ŭ������ String Ŭ������  �ٸ��� 
	     * ���к��ϰ� ��ü ������ ���� �ʴ´�.
	     * �׸��� , ���� ������ �� �ִ� �������� Ư¡�� �ִ�,
	     * �׷��Ƿ� ����� ���ڿ� ���� �۾��� �ʿ��� ���
	     * String Ŭ���� ���� StringBuffer Ŭ������ �� �����ϴ�
	     * 
	     * ���� : ī�忡�� ���ڸ� ���� �� ������� ���ٰ�
	     * �ٽ� ����� ���ۼ��ؼ� ������ ��찡 ��ǥ���̴�.
	     * �� buffer �� ������ִٰ� ����ڰ� �������� ���͸�
	     * ������ �۾��� buffer ���� ��ü�� �������Ѽ�
	     * ������ �ó������� ����ȴ�..
	     */
	     buf2.append("ddsd");
	     System.out.println(buf2.toString());
		
	     //�ڹٿ����� ���ο��� ������ ��Ʈ�������� �ڷ����� ������ String�ۿ� �����
	     // �׷��� StringBuffer�ȿ� ������ �����͵��� ������ �ִٰ�.
	     
	
	}

}
