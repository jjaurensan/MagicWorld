package com.jjaurensan;

import java.util.Scanner;

public class Player {
	private String playerName;
	private Player enemy;
	
	
	public void displayAvailableCharacterChoice() {
		
	}
	public void askCharacteristicsCharacter() {
		
		/*
		private int level; //Niveau : choisi par le joueur (min 1, max 100)
		private int force; //Force : choisie par le joueur (min 0, max 100)
		private int agility; //Agilité : choisie par le joueur (min 0, max 100)
		private int intelligence; //Intelligence : choisie par le joueur (min 0, max 100)
		*/
		
		//Attention le total force + agilité + intelligence doit être égal au niveau du joueur.
	}

	public void displayCharacterCreationConfirmation() {
		//"CRI DE GUERRE" je suis le "TYPE PERSO" "JOUEUR" niveau XX je possede XX de vitalité, XX de force, XX d'agilité et XX d'intelligence !
	}
	
	public void displayChooseAttack(Player enemy) {
		this.enemy = enemy;
		//"JOUEUR" ("LIFE") veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale)
	}
	
	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	};
	
// ---------- AVANT REMISE A ZERO ------------	
	/*
	Scanner sc = new Scanner(System.in);
			
	
	public void displayAvailableCharacter()
	{
		System.out.println("Veuillez choisir la classe de votre personnage(1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
		int creaType = sc.nextInt();
	}
	
	
	
	public void createPlayerCharacterSelected(int creaType) {		
			
		switch (creaType) {
			case 1:
				this.createPlayerCharacterFeature();
				GameCharacter warrior = new Warrior(level, force, agility, intelligence)
				System.out.println("Vous avez choisi Guerrier");
				break;
			case 2:
				this.createPlayerCharacterFeature();
				System.out.println("Vous avez choisi Rôdeur");
				break;
			case 3:
				this.createPlayerCharacterFeature();
				System.out.println("Vous avez choisi Mage");
				break;
			default:
				System.out.println("Vous n'avez pas choisi de personnage parmi les choix proposés");
				break;
		
		}
    }
	public void createPlayerCharacterFeature() {
		System.out.println("Niveau du perso %n");
		int level = sc.nextInt();
		System.out.println("Force du perso %n");
		int force = sc.nextInt();
		System.out.println("Agilité du perso");
		int agility = sc.nextInt();
		System.out.println("Intelligence du perso");
		int intelligence = sc.nextInt();
}	
*/	
	// ---------- AVANT REMISE A ZERO ------------		
	
	
	/*Le jeu commence par proposer au joueur 1 de choisir entre Guerrier, Rôdeur ou Mage.
	Il doit ensuite choisir le niveau, la force, l’agilité et enfin l’intelligence de son personnage.*/
	
}
