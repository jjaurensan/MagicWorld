package com.jjaurensan;

public class Wizard extends GameCharacter{

	



	private int creaLife;


	public Wizard(Integer level, Integer force, Integer agility, Integer intelligence) {
		super(level, force, agility, intelligence);
		// TODO Auto-generated constructor stub
		this.creaLife=this.getLife();
		this.setTypeCharacter("Mage");
		this.setWarCry("Avada Kedavra");
		this.setNameBasicAttack("Boule de Feu");
		this.setNameSpecialAttack("Soin");
		
	}

	
	@Override
	public void basicAttack(Player player) {
		//Boule de Feu : Effectue des dommages égaux à l’intelligence du joueur sur l’adversaire.		
		player.getEnemy().getPlayerCharacter().setLife(player.getEnemy().getPlayerCharacter().getLife()-this.getIntelligence());
		System.out.println(player.getPlayerName()+" utilise "+this.getNameBasicAttack()+"et inflige "+ this.getIntelligence()+" dommages");
		System.out.println(player.getEnemy().getPlayerName()+" perd "+this.getIntelligence()+" points de vie");		
	}

	
	@Override
	public void specialAttack(Player player) {
		/* Soin : Le joueur soigne sa vie et regagne sa quantité d’intelligence fois 2 en points de vie. 
		Attention, il ne peut pas avoir plus de vie qu’il n’en avait au départ.
		*/
		int soin =this.getIntelligence()*2;
		if(this.getLife()+soin > this.creaLife) {
			this.setLife(this.creaLife);			
		} else {
			this.setLife(this.getLife()+soin);			
		}
		System.out.println(player.getPlayerName()+" utilise "+this.getNameSpecialAttack()+"et gagne "+ soin +" en vitalité.");
	}


}
