public class 마법사 {
	private String 이름;
	private int 체력;
	private int 마나;
	private 주문 주문;

	public 마법사() {

	}

	public 마법사(String 이름, int 체력, int 마나, 주문 주문) {
		this.이름 = 이름;
		this.체력 = 체력;
		this.마나 = 마나;
		this.주문 = 주문;
	}

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public int get체력() {
		return 체력;
	}

	public void set체력(int 체력) {
		this.체력 = 체력;
	}

	public int get마나() {
		return 마나;
	}

	public void set마나(int 마나) {
		this.마나 = 마나;
	}

	public 주문 get주문() {
		return 주문;
	}

	public void set주문(주문 주문) {
		this.주문 = 주문;
	}

	public void 기본공격(마법사 target) {
		target.체력 -= this.주문.get데미지();
		this.마나 -= this.주문.get마나소모();
	}

	public void 강한공격(마법사 target) {
		target.체력 -= this.주문.get데미지() + 10;
		this.마나 -= this.주문.get마나소모() + 10;
	}

	public void 회복(마법사 player) {
		player.체력 += 20;
	}

	public void 상태보기() {
		System.out.printf("%6s: 체력-%2d 마나-%2d", 이름, 체력, 마나);
		System.out.println();
	}

}
