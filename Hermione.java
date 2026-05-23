package Players;

public class Hermione extends 마법사 {

	public Hermione() {

	}

	public Hermione(String 이름, int 체력, int 마나, 주문 주문) {
		super(이름, 체력, 마나, 주문);
	}

	public void 기본공격(마법사 target) {
		super.기본공격(target);
		System.out.println("헤르미온느의 기본공격:" + target.get이름() + " 체력 " + this.get주문().get데미지() + " 감소!");
	}

	public void 강한공격(마법사 target) {
		super.강한공격(target);
		System.out.printf("헤르미온느의 Stupefy 공격 (마나 소모%2d / 공격력%2d)", target.get주문().get마나소모(), target.get주문().get데미지());
		// 공격력=데미지

	}

	public void 회복(마법사 player) {
		super.회복(player);
		player.set체력(player.get체력() + 35);
	}

}