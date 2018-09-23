package com.jjaurensan;

public class Prowler extends GameCharacter {

	public Prowler(Integer level, Integer force, Integer agility, Integer intelligence) {
		super(level, force, agility, intelligence);
	}

	@Override
	public void basicAttack() {
		// Tir à l’Arc : Effectue des dommages égaux à l’agilité du joueur sur l’adversaire.
		
	}

	@Override
	public void specialAttack() {
		// Concentration : Le joueur gagne son niveau divisé par 2 en agilité.
		
	}

}
