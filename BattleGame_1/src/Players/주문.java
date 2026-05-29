package Players;

public class 주문 {
	private String 주문이름;
	private int 데미지;
	private int 마나소모;

	public 주문() {
	}

	public 주문(String 주문이름, int 데미지, int 마나소모) {
		this.주문이름 = 주문이름;
		this.데미지 = 데미지;
		this.마나소모 = 마나소모;
	}

	public String get주문이름() {
		return 주문이름;
	}

	public void set주문이름(String 주문이름) {
		this.주문이름 = 주문이름;
	}

	public int get데미지() {
		return 데미지;
	}

	public void set데미지(int 데미지) {
		this.데미지 = 데미지;
	}

	public int get마나소모() {
		return 마나소모;
	}

	public void set마나소모(int 마나소모) {
		this.마나소모 = 마나소모;
	}
	
	

}
