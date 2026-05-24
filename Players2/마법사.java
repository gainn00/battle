package Players;

public class 마법사 {
	private String 이름;
	private int 체력;
	private int 마나;
	private 주문 주문;
	private String Filename;
	// 마나 차오르는건 20
	// 회복에 마나 쓰는걸 10

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

	// target의 체력-10, attacker의 마나-5
	public void 기본공격(마법사 target) {
		target.체력 -= 10;
		this.마나 -= 5;
	}

	// target의 체력을 attacker의 데미지만큼 차감
	// attacker의 마나를 주문의 마나소모량만큼 차감
	public void 강한공격(마법사 target) {
		target.체력 -= this.주문.get데미지();
		this.마나 -= this.주문.get마나소모();
	}

	// 해당 플레이어의 마나-10
	// 각 캐릭터마다 회복량 다르게 -> 캐릭터 각각의 클래스에서 오버라이딩
	public void 회복(마법사 player) {
		player.마나 -= 10;
	}

	public void 상태보기() {
		System.out.printf("%6s: 체력-%2d 마나-%2d", 이름, 체력, 마나);
		System.out.println();
	}

	public String getFilename() {
		return Filename;
	}

	public void setFilename(String filename) {
		Filename = filename;
	}

	public 마법사(String 이름, int 체력, int 마나, Players.주문 주문, String filename) {
		super();
		this.이름 = 이름;
		this.체력 = 체력;
		this.마나 = 마나;
		this.주문 = 주문;
		Filename = filename;
	}

}
