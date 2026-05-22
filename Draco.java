package Wizard;

import Spell.Spell;

public class Draco extends 마법사 {
	public Draco() {
		
	}
	public Draco(String 이름, int 체력, int 마나) {
		super(이름,체력,마나);
	}
	
	public Draco(String 이름, int 체력, int 마나, Spell spell) {
		super(이름,체력,마나,spell);
		
	}


}
