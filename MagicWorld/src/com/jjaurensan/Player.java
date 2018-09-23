package com.jjaurensan;

import java.util.Scanner;

public class Player {
	Scanner sc = new Scanner(System.in);
	private String playerName;
	private Player enemy;
	private GameCharacter playerCharacter;
	private int playerLevel;
	private int playerForce;
	private int playerAgility;
	private int playerIntelligence;
	/**
	 * display Character choice
	 */
	public void displayAvailableCharacterChoice() {
		System.out.println("Création du personnage du "+ this.playerName 
				+" /nVeuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
		}
	/**
	 * create a new player character
	 */
	public void createNewCharacter() {
		this.displayAvailableCharacterChoice();
		int playerChoice;		
		do {
			playerChoice= sc.nextInt();	
		}					
		while (playerChoice<1||playerChoice>3);
		this.askCharacteristicsCharacter();			
			
		switch (playerChoice) {
			case 1:
				this.playerCharacter = new Warrior(this.playerLevel, this.playerForce, this.playerAgility, this.playerIntelligence);
				this.displayCharacterCreationConfirmation();
				break;
			case 2:
				this.playerCharacter = new Prowler(this.playerLevel, this.playerForce, this.playerAgility, this.playerIntelligence);
				this.displayCharacterCreationConfirmation();
				break;	
			case 3:
				this.playerCharacter = new Wizard(this.playerLevel, this.playerForce, this.playerAgility, this.playerIntelligence);
				this.displayCharacterCreationConfirmation();
				break;
						
		}		
		
		
	}
	
	
	public void askCharacteristicsCharacter() {		
		this.askLevel();
		this.askForce();
		this.askAgility();
		this.askIntelligence();		
	}
	
	//Attention le total force + agilité + intelligence doit être égal au niveau du joueur.	
	
	/**
	 * Display and Ask the level for futur character
	 * Affiche et demande le niveau du personnage
	 * Niveau : choisi par le joueur (min 1, max 100)
	 */	
	public void askLevel() {
		System.out.println("Niveau du personnage ?");
		do {
			this.playerLevel = sc.nextInt();
		} while (this.playerLevel < 1 || this.playerLevel > 100 );	
	}
	/**
	 * Display and Ask the force for futur character
	 * Affiche et demande la force du personnage
	 * Force : choisie par le joueur (min 0, max 100)
	 */	
	public void askForce() {
		System.out.println("Force du personnage ? (Reste "+this.playerLevel+" points à placer)");
		do {
			this.playerForce = sc.nextInt();
		} while (this.playerForce < 0 || this.playerForce > this.playerLevel );	
	}
	/**
	 * Display and Ask the agility for futur character
	 * Affiche et demande la agilité du personnage
	 * Agilité : choisie par le joueur (min 0, max 100)
	 */	
	public void askAgility() {
		System.out.println("Agilité du personnage ? (Reste "+(this.playerLevel-this.playerForce)+" points à placer)");
		do {
			this.playerAgility = sc.nextInt();
		} while (this.playerAgility < 0 || this.playerAgility > (this.playerLevel-this.playerForce) );
	}
	/**
	 * Display and Ask the intelligence for futur character
	 * Affiche et demande l'intelligence du personnage
	 * Intelligence : choisie par le joueur (min 0, max 100)
	 */	
	public void askIntelligence() {
		System.out.println("Intelligence du personnage ? (Reste "+(this.playerLevel-this.playerForce - this.playerAgility)+" points à placer)");
		do {
			this.playerIntelligence = sc.nextInt();
		} while (this.playerIntelligence < 0 || this.playerIntelligence > (this.playerLevel-this.playerForce - this.playerAgility) );
	}
	
	
	
	
	/**
	 * display Character feature
	 * Affiche une phrase recapitulative des caracteristiques du personnage et sert aussi de confirmation de creation
	 * 
	 * Template to use /Modele à utiliser : "CRI DE GUERRE" je suis le "TYPE PERSO" "JOUEUR" niveau XX je possede XX de vitalité, XX de force, XX d'agilité et XX d'intelligence !
	 * 
	 */
	public void displayCharacterCreationConfirmation() {
		String creationConfirmation = this.playerCharacter.getWarCry()
				+" je suis le "+this.playerCharacter.getTypeCharacter()+" "+this.playerName
				+" niveau "+this.playerCharacter.getLevel()
				+" je possede "+this.playerCharacter.getLife() +" de vitalité, "
				+this.playerCharacter.getForce()+" de force, "
				+this.playerCharacter.getAgility()+" d'agilité et "
				+this.playerCharacter.getIntelligence()+" d'intelligence !";
		System.out.println(creationConfirmation);
	}
	
	public void displayChooseAttack(Player enemy) {
		this.enemy = enemy;
		//"JOUEUR" ("LIFE") veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale)
	}
	/**
	 * Name of the player / Nom du joueur
	 * @return the player name
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * Name of the player / Nom du joueur
	 * @param playerName the player name
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	};
	
	/*Le jeu commence par proposer au joueur 1 de choisir entre Guerrier, Rôdeur ou Mage.
	Il doit ensuite choisir le niveau, la force, l’agilité et enfin l’intelligence de son personnage.*/
	
}
