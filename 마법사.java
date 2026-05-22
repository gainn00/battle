package Wizard;

import Spell.Spell;

public class 마법사 implements I공격 {
    private int 체력;
    private int 마나;
    private Spell spell;
    private String 이름;
    
    public 마법사() {
    	
    }
    
    public 마법사(String 이름, int 체력, int 마나) {
    	this.이름=이름;
    	this.체력=체력;
    	this.마나=마나;
    }
    
    public 마법사(String 이름, int 체력, int 마나, Spell spell ) {
    	this(이름,체력,마나);
    	this.spell = spell;
    	
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

	public Spell getSpell() {
		return spell;
	}

	public void setSpell(Spell spell) {
		this.spell = spell;
	}

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	
	public void 기본공격(마법사 target, Spell spell) {
		target.체력 -= spell.get데미지();
		this.마나 -= spell.get마나소모();
	}

    public void 강한공격(마법사 target, Spell spell){
    	target.체력 -= spell.get데미지()+10;
    	this.마나 -= spell.get마나소모()+10;
    }

    public void 회복(String 이름){
    	this.체력 += 5;
    }

	
	

}
