package japi.util.vector;

import java.util.Scanner;
import java.util.Vector;

public class GradeControl2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//GradeService2 service = new GradeServiceImp2();
		//Vector<GradeVO> vc = new Vector<GradeVO>();
		//GradeVO vo1 ;
		int Snum = 0;
		
		//ga.input("200215","홍길동",100,80,85);
		/*
		vo1.setHak("2005315");
		vo1.setName("홍철순");
		vo1.setKor(100);
		vo1.setEng(80);
		vo1.setMath(85);
		*/
		
		
		while(true){
			
		
			System.out.println("학생관리프로그램 메뉴 :"+
		  "┃0.종료 ┃ 1.학번 정보 삽입 ┃ 2. 학번 정보 출력┃3. 학번 검색┃4.이름 검색 ┃5.성적총합 내림차순정렬┃6.성적총합 오름차순 정렬    ");
			Snum = scan.nextInt();
			switch(Snum){
			
			case 1 : 
			/*	
			String hak, name = "";
			int kor, eng, math = 0;
			*/
			/*
			System.out.printf("학번 , 이름, 국어, 영어, 수학 성적입력하세요"
					,hak = scan.next(),name = scan.next(), kor = scan.nextInt(),eng = scan.nextInt()
					,math = scan.nextInt() );	 
			*/
			/*
			System.out.printf("%s ,%s , %d , %d ,%d",hak = scan.next(), 
					 name =scan.next(),kor = scan.nextInt(), eng = scan.nextInt(),math = scan.nextInt() );
			*/
			/*
			System.out.println("학번 , 이름, 국어, 영어, 수학 성적입력하세요" );
			
			hak = scan.next(); name =scan.next(); 
			kor = scan.nextInt() ;eng = scan.nextInt(); math = scan.nextInt();
			
			
			vo1 = new GradeVO(hak,name,kor,eng,math);
			*/
			//GradeVO vo1 = new GradeVO();
			/*vo1.setEng(80);
			vo1.setHak("1501");
			vo1.setKor(95);
			vo1.setMath(80);
			vo1.setName("홍길동");
			
			//GradeVO vo2 = new GradeVO();
			vo2.setEng(80);
			vo2.setHak("1502");
			vo2.setKor(95);
			vo2.setMath(80);
			vo2.setName("김길동");
			
			GradeVO vo3 = new GradeVO();
			vo3.setEng(95);
			vo3.setHak("1503");
			vo3.setKor(95);
			vo3.setMath(80);
			vo3.setName("김길동");
			
			service.input(vo1);   
			service.input(vo2);
			service.input(vo3);
				  
				  
				  
				   벡터에 자료 넣는거 따로 GradeVO에 자료넣는거 지금따로다.
				   * 
				 continue;
			
			case 2 : service.print(); continue; 
		    case 3 : service.searchGradeByHak("1503"); continue;
			case 4 : service.searchGradeByName("두길동");continue;
			case 5 : service.descGradeTotal();
			case 6 : service.ascGradeTotal();
			
			
			case 0 : System.out.println("프로그램을 종료합니다."); break;
			
			*/
		
			
			}
			 
			
			
			
			
			
			
        break;			
		}
	
	}

}
