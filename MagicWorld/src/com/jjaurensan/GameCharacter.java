package com.jjaurensan;

abstract class GameCharacter {
	
	private int level; //Niveau : choisi par le joueur (min 1, max 100)
	private int life; //Vie : égale au niveau du joueur * 5
	private int force; //Force : choisie par le joueur (min 0, max 100)
	private int agility; //Agilité : choisie par le joueur (min 0, max 100)
	private int intelligence; //Intelligence : choisie par le joueur (min 0, max 100)
	
//Attention le total force + agilité + intelligence doit être égal au niveau du joueur.
	
	
	public GameCharacter(Integer level,Integer force, Integer agility, Integer intelligence) {
		this.level=level;
		this.force=force;
		this.agility=agility;
		this.intelligence=intelligence;
		this.life=level*5;
		
	}
		
	
// Methodes d'attaques
	
	public abstract void basicAttack();
	
	public abstract void specialAttack();
	

}
