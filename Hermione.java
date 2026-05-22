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
		System.out.println("헤르미온느의 강한공격: " + target.get이름() + " 체력 " + (this.get주문().get데미지() + 10) + " 감소!");
	}

}
