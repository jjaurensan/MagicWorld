package com.jjaurensan;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	 @BeforeEach
	    public void setUpStreams() {
	        System.setOut(new PrintStream(outContent));
	    }

	Player player = new Player();
	
	@Test
	public void Given_NamePlayer_When_DisplayAvailableCharacterChoice_Then_DisplayFirstLine() {
		
        player.setPlayerName("Joueur 1");
		player.displayAvailableCharacterChoice();
		assertEquals("Création du personnage du Joueur 1 /nVeuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)\n", outContent.toString().replace("\r\n", "\n"));		
	}	
	
}
