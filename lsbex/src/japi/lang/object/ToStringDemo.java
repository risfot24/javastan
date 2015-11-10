package japi.lang.object;

/*import java.lang.Object ; �������� �ʾƵ� ����Ʈ��  import �� �Ǿ�����*/
public class ToStringDemo {
	public static void main(String[] args) {
		Card card1 = new Card("spade", 7);
		Card card2 = new Card("heart", 2);
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		
		/*
		 * java.lang.Object�� toString �� �ؽ��ڵ�(��ü �ּҰ�)��
		 * �����ϹǷ� , toString()�� �������̵��ؼ�
		 * ���ϴ� ����� ���������Ѵ�..
		 * 
		 */
		
	}

}


//�� java���Ͽ� �ΰ� �̻��� Ŭ������ �־ �ǳ�....
//�ݵ��  public �� �ϳ����� �Ѵ�.
class Card{
	String kind;
	int number;
	
	
	public Card(){
		//this.kind = "������";
		  this("",0); //�̷��� ���ǵ� ������ �����ε� �� �ҷ���
	}

    /*������ �����ε��� ���� �ϴ¹��  
     * ������ �����ڸ� CTRL + SPACE ���� ��Ų��
     * ������ ȣ�� ������� this(�Ķ���� ������ Ÿ���� �ڵ�)
     * �Ͻø� �ڵ� ���� �ȴ�.
     * ���� ����Ʈ �����ڸ� ȣ���ϴ���
     * �Ķ���Ͱ� �ִ� �����ڱ��� ȣ��ǹǷ�,
     * ������ �Ķ���� ������� �� �ʿ���� �ڵ� ����������.
     * */
	public Card(String string, int i) {
		this.kind = string;
		this.number = i;
		
	}
	//getter, setter �� �ʿ�ø� ����� �˴ϴ�.
	//ctrl + space ���� toString�� �Ѵ�..

	
	
	@Override
	public String toString() { //hashcode �ּҰ�
		//String ims = "";
		
		return "�ش� �ؽ��ڵ� : "+this.hashCode()+"ī�� : "+this.kind +"�ѹ� : "+this.number ;
	}
	
	
	
	
}
