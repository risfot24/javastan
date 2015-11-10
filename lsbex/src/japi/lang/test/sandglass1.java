package japi.lang.test;

public class sandglass1 {
	//자바 모래시계 배열 생성자 와 메소드를 이용하여 분업화
	//메인 클래스에서는 이동하기위한 배열만 선언!!!!!
	//추가되는 sghelp 라는 클래스를이용 생성자를 생성하여 
	// 로직 및 프린트 되는 메소드를 나눠서 이용함
	  
	   
   public static void main(String[] args) {
	   int arr[][];
	   
	   sghelp sg = new sghelp();
	   arr = sg.sglogic(5, 5);
	   sg.print(arr);   
	  
	   
	  
		   
		   
		   
		   
	   }
	   
	
}


