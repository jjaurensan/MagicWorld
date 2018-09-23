package com.jjaurensan;

import java.util.Scanner;

public class Player {
	Scanner sc = new Scanner(System.in);
			
	/**
     * Display all available character in the game.
     */
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
	
	
}
