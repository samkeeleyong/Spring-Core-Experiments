package com.experiments.cipher;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShiftCipherTest {

	ShiftCipher sc;
	
	@Before
	public void setup(){
		sc = new ShiftCipher();
		sc.setShift(3);
	}
	
	@Test
	public void shiftCipherTest() {
		assertEquals("Khoor Zruog", sc.encrypt("Hello World"));
		
		//with special characters
		assertEquals("#!@#!@$%^Vdpxho", sc.encrypt("#!@#!@$%^Samuel"));
	}
	
	@Test
	public void rot13Test(){
		sc.setShift(13);
		String ciphertext = sc.encrypt("Hello World");
		assertEquals("Hello World", sc.encrypt(ciphertext));
	}

	@After
	public void tearDown(){
		sc = null;
	}
}
