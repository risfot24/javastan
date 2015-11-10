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
	 * 성적표를 출력하는 메소드
	 * vo.toString() 으로 처리 예상하고 있음.
	 * (non-Javadoc)
	 * @see japi.util.vector.GradeService#print()
	 */
	@Override
	public void print() {
		int Snum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("몇번까지 출력하시길원하세요?");
		Snum = scan.nextInt();
		
		for(int i=0 ; i<Snum ; i++){
		 System.out.println("출력화면 "+grade.get(i)); 	
		 	
		}
		
		
	}/*
	
	   학번으로 검색하는 기능을 가진 메소드
	*/

	@Override
	public String searchGradeByHak(String hak) {
		GradeVO VO = new GradeVO();
		Iterator<GradeVO> it = grade.iterator();
		//System.out.println(grade.equals(hak));
		//System.out.println(VO.getHak().equals(hak));
		
	
		while (it.hasNext()) {
			
		 
			if(VO.getHak().equals(hak)){
			   
			   System.out.println(VO.getName().equals(hak)+"가있습니다.");
			   System.out.println("ddd"+it.next());
			   
		   }
			else{
				System.out.println("찾질못하거나 없거나입니다.");
				break;
			}
		
		}
		
		
		
		return null;
	}
	/*
	 * 이름으로 성적을 검색해서 출력하는 메소드
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
	    종합 점수 기준으로 내림차순으로 정렬시키는 메소드
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
