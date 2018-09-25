package com.jjaurensan;

public class Prowler extends GameCharacter {

	public Prowler(Integer level, Integer force, Integer agility, Integer intelligence) {
		super(level, force, agility, intelligence);
		this.setTypeCharacter("Rôdeur");
		this.setWarCry("Ben qui veux-tu que ce soit ? Un ours en deltaplane ?!");
		this.setNameBasicAttack("Tir à l’Arc");
		this.setNameSpecialAttack("Concentration");
	}
		

	@Override
	public void basicAttack(Player player) {
		// Tir à l’Arc : Effectue des dommages égaux à l’agilité du joueur sur l’adversaire.
		player.getEnemy().getPlayerCharacter().setLife(player.getEnemy().getPlayerCharacter().getLife()-this.getAgility());
		System.out.println(player.getPlayerName()+" utilise "+this.getNameBasicAttack()+"et inflige "+ this.getAgility()+" dommages");
		System.out.println(player.getEnemy().getPlayerName()+" perd "+this.getAgility()+" points de vie");
	}

	@Override
	public void specialAttack(Player player) {
		// Concentration : Le joueur gagne son niveau divisé par 2 en agilité.
		int concentration=this.getAgility()/2;
		this.setAgility(this.getAgility()+concentration);		
		System.out.println(player.getPlayerName()+" utilise "+this.getNameSpecialAttack()+"et gagne "+ concentration +" en agilité.");
		
	}
	
}
