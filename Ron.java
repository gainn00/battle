package Wizard;

import Spell.Spell;

public class Ron extends 마법사 {
	public Ron() {
		
	}
	public Ron(String 이름, int 체력, int 마나) {
		super(이름,체력,마나);
	}
	
	public Ron(String 이름, int 체력, int 마나, Spell spell) {
		super(이름,체력,마나,spell);
	}


}
