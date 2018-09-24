package com.jjaurensan;

public class Main {
	
	 public static void main(String[] args) {
		 
	Player playerOne = new Player();
	Player playerTwo = new Player();
	playerOne.setPlayerName("Joueur 1");
	playerTwo.setPlayerName("Joueur 2");
	playerOne.createNewCharacter();
	playerTwo.createNewCharacter();
	playerOne.displayChooseAttack(playerTwo);
	playerTwo.displayChooseAttack(playerOne);
	
	 }
}