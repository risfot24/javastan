//package oop06.lotto;
package test;

public class LottoServiceImp1 implements LottoService{
	private int money ; 
	
	int [][] lottos;
	int [][] arr;
 
	@Override
	public void extractLottos(int money) {
		
		inputMoney(money);
		int count = this.getCount(money);
		
		
		//System.out.println(lottos[lottos.length-1].length);
		
			for (count = 0; count < lottos.length; count++) {
				while (true) {
				if (isDuplication(count) == true) {  //false 를 ture 로 바꿧더니 됐다?
					for (int j = 0; j < lottos[count].length; j++) {
						// while (true) { }
						// 내부는 구현해주세요
						// isDuplication() 메소드 사용해야 합니다.
						// 중복되지 않은 숫자이면
						// lottos[count][i] = num 의
						// 형태로 들어가게 됩니다. //while(true)는 왜써준거지?

						this.lottos[count][j] = getRandomNum();

						/*
						 * if (isDuplication() == false) { lottos[count][j] =
						 * getRandomNum(); } else { lottos[count][j] =
						 * getRandomNum()+1;
						 * 
						 * }
						 */
					
					}
					// pritLotto();
				
				}
				break;
			}
			
		}
	}

	@Override 
	public void pritLotto() {
		
		//lottos.length , lottos[lottos.length].length
		 
		for (int count = 0; count < lottos.length; count++) {
			sort(this.lottos[count]);
			for (int j = 0; j < lottos[count].length; j++) {
		            //여기 다시넣으면 계속 돈다.
				System.out.print(this.lottos[count][j]+" ");
	         
		    
			}
			System.out.println(" ");
		}
		
	} 

	@Override
	public void inputMoney(int money) {
		this.money = money;
		this.lottos = new int[money/1000][6];
		
		
	}

	@Override
	public int getRandomNum() {
		
		return (int) ((Math.random()*45)+1);
	}

	@Override
	public boolean isDuplication(int count) {
	  
		for(int j=0 ; j < this.lottos[count].length ; j++){
		   if(lottos[count][j] == lottos[count][j+1]){
			   this.lottos[count][j] =(int) ((Math.random()*45)+1);   
		   return true;
		   }else{
			   //if(lottos[count][j] != lottos[count][j+1]){
			   return false;    
		   }
			
		  
	  }
	 
		return false;
		 
	}

	@Override
	public void sort(int[] array) {
		for(int i =0 ; i < array.length ; i++){
			for(int j =0 ; j< array.length-i-1 ; j++){
				 if(array[j]>array[j+1]){
					 int temp = 0;
					 // 완성해 주세요
					 // 스왑 알고리즘 검색하면 나옵니다.
					 // 
					 temp = array[j];
					 array[j] = array[j+1];
					 array[j+1] = temp;
					 
				 }
				
				
			}
		} 
		
	}

	@Override
	public int getCount(int money) {
		if(money < 1000){
		return 0;
		}
	    return (int) Math.ceil(money/1000);	
		
	}

}
