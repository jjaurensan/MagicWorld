package com.jjaurensan;

public class Wizard extends GameCharacter{

	public Wizard(Integer level, Integer force, Integer agility, Integer intelligence) {
		super(level, force, agility, intelligence);
		// TODO Auto-generated constructor stub
		this.setTypeCharacter("Mage");
		this.setWarCry("Avada Kedavra");
		this.setNameBasicAttack("Boule de Feu");
		this.setNameSpecialAttack("Soin");
	}

	@Override
	public void basicAttack() {
		//Boule de Feu : Effectue des dommages égaux à l’intelligence du joueur sur l’adversaire.
		
	}

	@Override
	public void specialAttack() {
		/* Soin : Le joueur soigne sa vie et regagne sa quantité d’intelligence fois 2 en points de vie. 
		Attention, il ne peut pas avoir plus de vie qu’il n’en avait au départ.
		*/
		
	}


}
