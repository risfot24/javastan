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
		
		//ga.input("200215","ȫ�浿",100,80,85);
		/*
		vo1.setHak("2005315");
		vo1.setName("ȫö��");
		vo1.setKor(100);
		vo1.setEng(80);
		vo1.setMath(85);
		*/
		
		
		while(true){
			
		
			System.out.println("�л��������α׷� �޴� :"+
		  "��0.���� �� 1.�й� ���� ���� �� 2. �й� ���� ��¦�3. �й� �˻���4.�̸� �˻� ��5.�������� �����������Ħ�6.�������� �������� ����    ");
			Snum = scan.nextInt();
			switch(Snum){
			
			case 1 : 
			/*	
			String hak, name = "";
			int kor, eng, math = 0;
			*/
			/*
			System.out.printf("�й� , �̸�, ����, ����, ���� �����Է��ϼ���"
					,hak = scan.next(),name = scan.next(), kor = scan.nextInt(),eng = scan.nextInt()
					,math = scan.nextInt() );	 
			*/
			/*
			System.out.printf("%s ,%s , %d , %d ,%d",hak = scan.next(), 
					 name =scan.next(),kor = scan.nextInt(), eng = scan.nextInt(),math = scan.nextInt() );
			*/
			/*
			System.out.println("�й� , �̸�, ����, ����, ���� �����Է��ϼ���" );
			
			hak = scan.next(); name =scan.next(); 
			kor = scan.nextInt() ;eng = scan.nextInt(); math = scan.nextInt();
			
			
			vo1 = new GradeVO(hak,name,kor,eng,math);
			*/
			//GradeVO vo1 = new GradeVO();
			/*vo1.setEng(80);
			vo1.setHak("1501");
			vo1.setKor(95);
			vo1.setMath(80);
			vo1.setName("ȫ�浿");
			
			//GradeVO vo2 = new GradeVO();
			vo2.setEng(80);
			vo2.setHak("1502");
			vo2.setKor(95);
			vo2.setMath(80);
			vo2.setName("��浿");
			
			GradeVO vo3 = new GradeVO();
			vo3.setEng(95);
			vo3.setHak("1503");
			vo3.setKor(95);
			vo3.setMath(80);
			vo3.setName("��浿");
			
			service.input(vo1);   
			service.input(vo2);
			service.input(vo3);
				  
				  
				  
				   ���Ϳ� �ڷ� �ִ°� ���� GradeVO�� �ڷ�ִ°� ���ݵ��δ�.
				   * 
				 continue;
			
			case 2 : service.print(); continue; 
		    case 3 : service.searchGradeByHak("1503"); continue;
			case 4 : service.searchGradeByName("�α浿");continue;
			case 5 : service.descGradeTotal();
			case 6 : service.ascGradeTotal();
			
			
			case 0 : System.out.println("���α׷��� �����մϴ�."); break;
			
			*/
		
			
			}
			 
			
			
			
			
			
			
        break;			
		}
	
	}

}
