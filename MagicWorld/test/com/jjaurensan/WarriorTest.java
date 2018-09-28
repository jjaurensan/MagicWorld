package com.jjaurensan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WarriorTest {
	
	Player playerOne = new Player();
	Player playerTwo = new Player();
	
	@BeforeEach
	public void setUPTest() {
		
		playerOne.setPlayerName("attaque");
		playerTwo.setPlayerName("defense");
		
		GameCharacter characterTest = new Warrior(100, 100, 0, 0);			
		GameCharacter ennemyTest=new Warrior(100, 100, 0, 0);
		
		playerOne.setPlayerCharacter(characterTest);
		
		playerTwo.setPlayerCharacter(ennemyTest);
		playerOne.setEnemy(playerTwo);
		
	}
		
	@Test
	void testBasicAttack() {
		setUPTest();
		playerOne.getPlayerCharacter().basicAttack(playerOne);		
		assertTrue(playerTwo.getPlayerCharacter().getLife() == 400);
		
	}

	@Test
	void testSpecialAttack() {
		setUPTest();		
		
		playerOne.getPlayerCharacter().specialAttack(playerOne);		
		
		assertTrue(playerTwo.getPlayerCharacter().getLife() == 300);
		assertTrue(playerOne.getPlayerCharacter().getLife() == 450);
	}
	
}
