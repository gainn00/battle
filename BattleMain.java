package Players;

public class BattleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Harry h = new Harry("해리", 100, 90, new Expelliarmus("Expelliarmus", 50, 40));// 이름, 체력, 마나, 주문(주문이름, 데미지, 마나소모)
		Hermione hm = new Hermione("헤르미온느", 90, 120, new Stupefy("Stupefy", 35, 25));
		Ron r = new Ron("론", 110, 80, new Protego("Protego", 45, 35));
		Draco d = new Draco("드레이코", 95, 100, new ExpectoPatronum("ExpectoPatronum", 20, 10));

		// 수업때 작성한 거: 우리 파일에 맞게 수정해야함
//		토르 t = new 토르("토르", 100, 10, "thor.png"); // 이름, hp, power, img
//		헐크 h = new 헐크("헐크크", 100, 20, "hulk.png");
//		
//		System.out.println(h.getFilename());
//		// GameView에 t와 h를 전달한다!
//		View view = new View(h, hm, r, d);
//		view.setVisible(true);

	}

}
