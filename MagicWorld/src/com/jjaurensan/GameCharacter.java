package com.jjaurensan;

public class GameCharacter {
	private int level;
	private int life;
	private int force;
	private int agility;
	private int intelligence;
	
	public GameCharacter(Integer level,Integer force, Integer agility, Integer intelligence) {
		this.level=level;
		this.force=force;
		this.agility=agility;
		this.intelligence=intelligence;
		this.life=level*5;
		
	}
	
	public void attack() {
		//Basic attack
		//Special attack
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	};
}
