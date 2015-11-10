package japi.lang.object;

public class InstanceOfDemo {
	public static void main(String[] args) {
		FireCar fireCar = new FireCar();
		Ambulance amblulance = new Ambulance();
		
		InstanceOfDemo test = new InstanceOfDemo();
		test.doWork(fireCar);
		test.doWork(amblulance);
		
	}
	
	
	//�ڵ����� ����ȯ
	public void doWork(Car c){//���� �ν��Ͻ��� ������ ���� ����!!
		/*
		 c�� FireCar Ÿ������ Ȯ����
		 �´ٸ� (FireCar) �� ��ü ĳ�����϶�
		
		
		* */
		if(c instanceof FireCar){   //ĳ�����Ҷ� ������ �߻������ʰ�?
			
			FireCar f = (FireCar) c; //���� �ڵ�
			f.driver();               //���������� Ÿ���� ��ȯ���Ѽ� fireCar��� ���� �ν� �����ִ°��̴�.
			f.stop();
			f.shootWater();
			/*
			 �Ķ���ͷ� �Ѿ�� C�� Ambulance Ÿ������ Ȯ����
			 �´ٸ� (Ambulance) �� ��ü ĳ�����϶�
			
			
			* */
			
			
		}else if(c instanceof Ambulance){
			Ambulance a = (Ambulance) c;
			a.driver();
			a.siren();
			a.stop();
			
		}
		
	}

}

class Car{
	String color;
	int door;
	void driver(){System.out.println("������..");}
	void stop(){System.out.println("���� !!");}
	
}

class FireCar extends Car{
	void shootWater(){
		System.out.println("���ѷ� �Ҳ�����...");
	}
}
class Ambulance extends Car{
	void siren(){
		System.out.println("���̷��� �︮�� ������....");
	}
}