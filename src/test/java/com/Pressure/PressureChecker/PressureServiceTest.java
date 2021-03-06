package com.Pressure.PressureChecker;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.Pressure.service.PressureServiceImpl;

/**
 * Classe di testing basata sul lancio di una eccezione
 * @author Giansimone&Walter
 *
 */
class PressureServiceTest {

	private PressureServiceImpl pService;
	
	@BeforeEach
	void setUp() throws Exception {
		pService = new PressureServiceImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Test PressureService com.Pressure.exceptions")
	void test() {
		assertThrows(FileNotFoundException.class, ()->pService.readAll("fileNonEsistente.txt"));
	}

}
