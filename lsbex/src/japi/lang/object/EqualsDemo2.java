package japi.lang.object;

public class EqualsDemo2 {
  public static void main(String[] args) {
	  Person p1 = new Person("800101-1555555");
	  
	  Person p2 = new Person("800101-1555555");
	  String result = "";
	  //String result; //����ƽ �޼ҵ� ���ζ� ���������� ����ƽȭ  �Ǿ���.
	  result = (p1 == p2) ?  "p1�� p2�� ���� ���" : "p1�� p2�� �ٸ� ���" ;
	  System.out.println("(p1 ==p2) �� ���� ��� �� : " + result);
	  
	  result = (p1.equals(p2)) ? "p1�� p2�� ���� ���" : "p1�� p2�� �ٸ� ���" ;
	  System.out.println("(p1.equals(p2)) �� ���� ��� �� : " + result);
	  
	
   }
}

class Person{
	 private String ssn; //�ֹ� ��ȣ
	 public Person(String ssn){
		 this.ssn = ssn;
		 
		 
	 }
	 //Alt + shift + s
	 
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	//ALT + SHIFT + S
		//generate hashcode() and equals()


	@Override
	public boolean equals(Object obj) {
		/*  
		   Object �� ��� ������ Ÿ���� �ǹ��ϱ� ������
		   �ݵ�� �ֹι�ȣ�� ���� �ִ� Person ������
		   Ȯ���ؾ� �ֹι�ȣ ��ġ���θ� ���� �� �ֱ� ������
		   ��üĳ���� ������ instanceof �� ����Ѵ�.
		  �̷� ����� Validation ��ȿ��üũ��� �Ѵ�.
		  * */
		if(obj != null && obj instanceof Person ){
			return ssn == ((Person)obj).ssn;  //�� ��
		
			//�ڵ����� ĳ������ �ȵȴ�..
			//�׷��� object ���·� �񱳰� ���� ������ �ʳ�??
			//
			
			// java.lang.Object �� ��ü ĳ������
			// ((��üŸ��)obj)... �� ���·� �̷�����.
		}else{
			return false;
			
		}
		
	}
	
	
	
}
