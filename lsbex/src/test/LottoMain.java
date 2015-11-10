//package oop06.lotto;
package test;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
	
		System.out.println("◀◀◀    로또 시작  ▶▶▶");
		LottoService lotto = new LottoServiceImp1();
		
		System.out.print("얼마치를 구입합니까?"+" ");
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		lotto.extractLottos(money);
		System.out.println("로또번호 출력");
		lotto.pritLotto();
	
	}

}
