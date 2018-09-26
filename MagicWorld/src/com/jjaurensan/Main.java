package com.jjaurensan;

public class Main {
	
	 public static void main(String[] args) {
		 
	Player playerOne = new Player();
	Player playerTwo = new Player();
	playerOne.setPlayerName("Joueur 1");
	playerTwo.setPlayerName("Joueur 2");
	playerOne.createNewCharacter();
	playerTwo.createNewCharacter();
	
	do {
		playerOne.displayChooseAttack(playerTwo);
		if (playerTwo.getPlayerCharacter().getLife()==0) {
			System.out.println(playerTwo.getPlayerName()+" est mort");
		}else
		{
			playerTwo.displayChooseAttack(playerOne);
			if (playerOne.getPlayerCharacter().getLife()==0) {
				System.out.println(playerOne.getPlayerName()+" est mort");
			}
		}	
		
	} while (playerOne.getPlayerCharacter().getLife()>0 && playerTwo.getPlayerCharacter().getLife()>0 );
	
	 }
}