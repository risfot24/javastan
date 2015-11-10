package japi.lang.test;

public class ArrayManagement {
     int a ;

	public ArrayManagement(int amc[]) {
    
	  calc(amc);
		
	}
	public Object calc(int[] amc) {
		int ai1 = 0 ,ai2=0;
		for(int i=0 ; i<=amc.length; i++){
			
			
			if(amc[i] == amc[0]){
				continue;
			}
              for( int j=0; j< amc.length/2; j++){
            	  ai1 += amc[i] + amc[(amc.length/2)-1];
              }
			   for(int z=amc.length ;amc.length/2< z;z--){
				   ai2 += amc[z-1] + amc[z];
			   }
			if(ai1 == ai2){
			   
				return ai1;
			}
		   
		
		}
		return null;
		
		
		
	}
	

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
     
      
	
}
