package com.jjaurensan;

abstract class GameCharacter {
	
	private int level; //Niveau : choisi par le joueur (min 1, max 100)
	private int life; //Vie : égale au niveau du joueur * 5
	private int force; //Force : choisie par le joueur (min 0, max 100)
	private int agility; //Agilité : choisie par le joueur (min 0, max 100)
	private int intelligence; //Intelligence : choisie par le joueur (min 0, max 100)
	
	private String typeCharacter; // Type du personnage
	private String warCry; // Cri de guerre du perso
	
	private String nameBasicAttack; // nom de l'attaque basique
	private String nameSpecialAttack;// nom de l'attaque Spéciale

	
	public GameCharacter(Integer level,Integer force, Integer agility, Integer intelligence) {
		this.level=level;
		this.force=force;
		this.agility=agility;
		this.intelligence=intelligence;
		this.life=level*5;
		
	}
// Methodes d'attaques		
	
	

	public abstract void basicAttack(Player player);
	public abstract void specialAttack(Player player);
	

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}



	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}



	/**
	 * @return the life
	 */
	public int getLife() {
		return life;
	}



	/**
	 * @param life the life to set
	 */
	public void setLife(int life) {
		this.life = life;
	}



	/**
	 * @return the force
	 */
	public int getForce() {
		return force;
	}



	/**
	 * @param force the force to set
	 */
	public void setForce(int force) {
		this.force = force;
	}



	/**
	 * @return the agility
	 */
	public int getAgility() {
		return agility;
	}



	/**
	 * @param agility the agility to set
	 */
	public void setAgility(int agility) {
		this.agility = agility;
	}



	/**
	 * @return the intelligence
	 */
	public int getIntelligence() {
		return intelligence;
	}



	/**
	 * @param intelligence the intelligence to set
	 */
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}



	/**
	 * @return the typeCharacter
	 */
	public String getTypeCharacter() {
		return typeCharacter;
	}



	/**
	 * @param typeCharacter the typeCharacter to set
	 */
	public void setTypeCharacter(String typeCharacter) {
		this.typeCharacter = typeCharacter;
	}



	/**
	 * @return the warCry
	 */
	public String getWarCry() {
		return warCry;
	}



	/**
	 * @param warCry the warCry to set
	 */
	public void setWarCry(String warCry) {
		this.warCry = warCry;
	}



	/**
	 * @return the nameBasicAttack
	 */
	public String getNameBasicAttack() {
		return nameBasicAttack;
	}



	/**
	 * @param nameBasicAttack the nameBasicAttack to set
	 */
	public void setNameBasicAttack(String nameBasicAttack) {
		this.nameBasicAttack = nameBasicAttack;
	}



	/**
	 * @return the nameSpecialAttack
	 */
	public String getNameSpecialAttack() {
		return nameSpecialAttack;
	}



	/**
	 * @param nameSpecialAttack the nameSpecialAttack to set
	 */
	public void setNameSpecialAttack(String nameSpecialAttack) {
		this.nameSpecialAttack = nameSpecialAttack;
	}



}
