package japi.util.vector;

public class GradeVO {
	//���� ����� ������ Ÿ���� ������ 
	//�ϳ��� Ÿ�Դ� �������� ������ �����ص� �ȴ�.
	
	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int math;

   
	public GradeVO(){
		this("" , "", 0, 0, 0);
	}
	
	
	public GradeVO(String hak, String name, int kor, int eng, int math) {
		//super();
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	/*
	 * ���� �հ踦 ���ϴ� �޼ҵ�
	 * ���� + ���� + ����
	 * 
	 */
	public int getTotal(){
		return 0;
	}
	@Override
	public String toString() {
		return "����ǥ [�й� : " + hak + ", �̸� : " + name + ", ���� :" + kor
				+ ", ���� : " + eng + ", ���� : " + math + "]";
	}
	
}
