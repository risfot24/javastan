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
				if (isDuplication(count) == true) {  //false �� ture �� �مf���� �ƴ�?
					for (int j = 0; j < lottos[count].length; j++) {
						// while (true) { }
						// ���δ� �������ּ���
						// isDuplication() �޼ҵ� ����ؾ� �մϴ�.
						// �ߺ����� ���� �����̸�
						// lottos[count][i] = num ��
						// ���·� ���� �˴ϴ�. //while(true)�� �ֽ��ذ���?

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
		            //���� �ٽó����� ��� ����.
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
					 // �ϼ��� �ּ���
					 // ���� �˰��� �˻��ϸ� ���ɴϴ�.
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
