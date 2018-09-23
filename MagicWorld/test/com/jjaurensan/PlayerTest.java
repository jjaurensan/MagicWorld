package com.jjaurensan;

import static org.junit.jupiter.api.Assertions.*;

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
/*
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
    }
	
	Player player = new Player();
	
	@Test
	void testCreatePlayerCharacter() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void Given_Warrior_When_CreatePlayerCharacter_Then_DisplayWarriorSentence() {
		player.createPlayerCharacterSelected(1);
		assertEquals("Vous avez choisi Guerrier", outContent.toString().replace("\r\n", "\n"));
		
	}
	@Test
	public void Given_Prowler_When_CreatePlayerCharacter_Then_DisplayProwlerSentence() {
		player.createPlayerCharacterSelected(2);
		assertEquals("Vous avez choisi Rôdeur", outContent.toString().replace("\r\n", "\n"));
		
	}
	@Test
	public void Given_Wizardr_When_CreatePlayerCharacter_Then_DisplayWizardSentence() {
		player.createPlayerCharacterSelected(3);
		assertEquals("Vous avez choisi Mage", outContent.toString().replace("\r\n", "\n"));
		
	}
*/
	Player player = new Player();
	
	@Test
	public void Given_NampePlayer_When_DisplayAvailableCharacterChoice_Then_DisplayFirstLine() {
		player.setPlayerName("Joueur 1");
		player.displayAvailableCharacterChoice();
		assertEquals("Création du personnage du Joueur 1 /nVeuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)\n", outContent.toString().replace("\r\n", "\n"));		
	}
}
