package com.jjaurensan;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
    }/*
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	 @BeforeEach
	    public void setUpStreams() {
	        System.setOut(new PrintStream(outContent));
	    }
*/
	Player player = new Player();
	
	@Test
	public void Given_NamePlayer_When_DisplayAvailableCharacterChoice_Then_DisplayFirstLine() {
		
        player.setPlayerName("test");
		player.displayAvailableCharacterChoice();
		assertEquals("Création du personnage du test Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)", outContent.toString().replaceAll("[\r\n]+", ""));		
		
	}	
	
	@Test
	public void Given_StatutCharactereCreation_When_CreateNewCharacter_Then_DisplayConfirmation(){
		GameCharacter playerCharacter = new Wizard(100, 0, 0, 100);
		player.setPlayerName("test");
		player.setPlayerCharacter(playerCharacter);
		
		player.displayCharacterCreationConfirmation();
		assertEquals("Avada Kedavra je suis le Mage test niveau 100 je possede 500 de vitalité, 0 de force, 0 d'agilité et 100 d'intelligence !", outContent.toString().replaceAll("[\r\n]+", ""));
	}
	@Test
	public void Given_PlayerLeveThen_askLevel() {
		System.setIn(new ByteArrayInputStream("55\n55\n0\n0\n".getBytes()));
		player.askCharacteristicsCharacter();
		
		assertTrue(player.getPlayerLevel()==55);
		
	}
}
