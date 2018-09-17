package com.jjaurensan;

import java.util.Scanner;

public class Player {
	Scanner sc = new Scanner(System.in);
	
	private int indexPlayer;
	
	public Player() {
		//this.indexPlayer = indexPlayer;
		
	}

	public void createPlayerCharacter() {
		System.out.println("Veuillez choisir la classe de votre personnage(1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
		int creaType = sc.nextInt();
		System.out.println("Niveau du perso %n");
		int level = sc.nextInt();
		System.out.println("Force du perso %n");
		int force = sc.nextInt();
		System.out.println("Agilité du perso");
		int agility = sc.nextInt();
		System.out.println("Intelligence du perso");
		int intelligence = sc.nextInt();
		
		GameCharacter gameCharacter = new Warrior(level, force, agility, intelligence) ;
		gameCharacter.attack();
		
    }
	
}
