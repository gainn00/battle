package Spell;
public class Spell {
    private int 데미지;
    private int 마나소모;
    private String 마법주문;
    
    public Spell() {
    	
    }
    
    public Spell(String 마법주문, int 데미지, int 마나소모) {
    	this.마법주문=마법주문;
    	this.데미지=데미지;
    	this.마나소모=마나소모;
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
	public String get마법주문() {
		return 마법주문;
	}
	public void set마법주문(String 마법주문) {
		this.마법주문 = 마법주문;
	}
    
    

}
