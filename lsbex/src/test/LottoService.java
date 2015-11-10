//package oop06.lotto;
package test;
public interface LottoService {
	/*
	 * 금액만큼 로또 용지를 출력하는 메소드
	 * 1000원단위로 출력.
	 * 만약 1000월 이하 금액이 있다면
	 * 거스름돈 같이 출력
	 * 거스름돈은 절삭...
	 * 
	 */
    public void extractLottos(int money);
    /*
     * 로또 번호를 출력하는 메소드 
     * 로또번호는 1 ~ 45까지 이고
     * 출력되는 결과는 내림차순 정렬이
     * 되어 있어야 한다.
     * 각 숫자들은 6개 묶음으로 한줄이고
     * 1000원 단위 돈만큼 행이 출력된다.
     * 7줄의 6개  숫자가 내림차순으로 
     * 찍힐것이다.
     * 단, 주의할 점은 숫자는 중복되지 않아야 한다.
     * */    
    public void pritLotto();
    /*
     * 돈을 입금한 후 필드에 저장하는 메소드
     
    */
    public void inputMoney(int money);
    
    
    /*
     * 랜덤번호를 생성하는 로직
     * 
     */
    public int getRandomNum();
    
    //중복되는거 검사를 좀 봐꿧다..
    /*
     * 로또는 중복괸 숫자가 있어서는 
     * 안되므로 중복여부를 판단하는 로직
     */
    public boolean isDuplication(int count);
    /*
     * 로또 번호를 출력할 때 오름차순으로 나타내야 할때 사용되는 로직
     */
    
    public void sort(int[] array);
    
    /*
     * 금액이 결정된뒤 몇번 extractLottos()
     * 을 돌릴것인가?
     * 잔돈 뺀 예를 들면 7000원이면 7회 회전
     * 하게끔 카운트 숫자를 결정하는 로직
     */
    public int getCount(int money);
}
