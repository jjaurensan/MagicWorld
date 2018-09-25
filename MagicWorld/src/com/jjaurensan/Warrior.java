package com.jjaurensan;

public class Warrior extends GameCharacter{

	

	public Warrior(Integer level, Integer force, Integer agility, Integer intelligence) {
		super(level, force, agility, intelligence);
		// TODO Auto-generated constructor stub
		this.setTypeCharacter("Guerrier");
		this.setWarCry("Woarg");
		this.setNameBasicAttack("Coup d’Épée");
		this.setNameSpecialAttack("Coup de Rage");
	}

	@Override
	public void basicAttack(Player player) {
		// Coup d’Épée : Effectue des dommages égaux à la force du joueur sur l’adversaire.
		player.getEnemy().getPlayerCharacter().setLife(player.getEnemy().getPlayerCharacter().getLife()-this.getForce());
		System.out.println(player.getPlayerName()+" utilise "+this.getNameBasicAttack()+"et inflige "+ this.getForce()+" dommages");
		System.out.println(player.getEnemy().getPlayerName()+" perd "+this.getForce()+" points de vie");
		
	}

	@Override
	public void specialAttack(Player player) {
		// Coup de Rage : Effectue des dommages égaux à la force du joueur fois deux sur l’adversaire. 
		//Le joueur lançant l'attaque perd de la vitalité : la valeur de sa force divisée par 2
		
		player.getEnemy().getPlayerCharacter().setLife(player.getEnemy().getPlayerCharacter().getLife()-(this.getForce()*2));
		this.setLife(this.getLife()-(this.getForce()/2));
		System.out.println(player.getPlayerName()+" utilise "+this.getNameBasicAttack()+"et inflige "+ this.getForce()*2+" dommages");
		System.out.println(player.getEnemy().getPlayerName()+" perd "+this.getForce()+" points de vie");
		System.out.println(player.getPlayerName()+" perd "+this.getForce()/2+" points de vie");
	}

	
}
