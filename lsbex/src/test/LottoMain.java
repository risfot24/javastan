//package oop06.lotto;
package test;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
	
		System.out.println("������    �ζ� ����  ������");
		LottoService lotto = new LottoServiceImp1();
		
		System.out.print("��ġ�� �����մϱ�?"+" ");
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		lotto.extractLottos(money);
		System.out.println("�ζǹ�ȣ ���");
		lotto.pritLotto();
	
	}

}
