package com.jjaurensan;

public class Warrior extends GameCharacter{

	public Warrior(Integer level, Integer force, Integer agility, Integer intelligence) {
		super(level, force, agility, intelligence);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void basicAttack() {
		// Coup d’Épée : Effectue des dommages égaux à la force du joueur sur l’adversaire.
		
	}

	@Override
	public void specialAttack() {
		// Coup de Rage : Effectue des dommages égaux à la force du joueur fois deux sur l’adversaire. 
		//Le joueur lançant l'attaque perd de la vitalité : la valeur de sa force divisée par 2
		
	}

	
}
