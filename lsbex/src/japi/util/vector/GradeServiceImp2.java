package japi.util.vector;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector; 

public class GradeServiceImp implements GradeService{

	private Vector<GradeVO> grade = new Vector<GradeVO>();
	
	@Override
	public void input(GradeVO vo) {
		grade.add(vo);
		
		
	}

	/*
	 * ����ǥ�� ����ϴ� �޼ҵ�
	 * vo.toString() ���� ó�� �����ϰ� ����.
	 * (non-Javadoc)
	 * @see japi.util.vector.GradeService#print()
	 */
	@Override
	public void print() {
		int Snum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ����Ͻñ���ϼ���?");
		Snum = scan.nextInt();
		
		for(int i=0 ; i<Snum ; i++){
		 System.out.println("���ȭ�� "+grade.get(i)); 	
		 	
		}
		
		
	}/*
	
	   �й����� �˻��ϴ� ����� ���� �޼ҵ�
	*/

	@Override
	public String searchGradeByHak(String hak) {
		GradeVO VO = new GradeVO();
		Iterator<GradeVO> it = grade.iterator();
		//System.out.println(grade.equals(hak));
		//System.out.println(VO.getHak().equals(hak));
		
	
		while (it.hasNext()) {
			
		 
			if(VO.getHak().equals(hak)){
			   
			   System.out.println(VO.getName().equals(hak)+"���ֽ��ϴ�.");
			   System.out.println("ddd"+it.next());
			   
		   }
			else{
				System.out.println("ã�����ϰų� ���ų��Դϴ�.");
				break;
			}
		
		}
		
		
		
		return null;
	}
	/*
	 * �̸����� ������ �˻��ؼ� ����ϴ� �޼ҵ�
	 * 
	 * (non-Javadoc)
	 * @see japi.util.vector.GradeService#searchGradeByName(java.lang.String)
	 */

	@Override
	public Vector<String> searchGradeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	    ���� ���� �������� ������������ ���Ľ�Ű�� �޼ҵ�
	*
	*/

	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}
	/*
	 * 
	 * 
	 * (non-Javadoc)
	 * @see japi.util.vector.GradeService#ascGradeTotal()
	 */

	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}
	

}
