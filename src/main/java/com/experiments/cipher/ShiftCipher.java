package com.experiments.cipher;

import com.experiments.model.Cipher;

//@author Sam Ong
//@desc A Shift Cipher implementation

public class ShiftCipher implements Cipher {

	private String alphabet = "abcdefghijklmnopqrstuvwxyz";
	private int shift;

	@Override
	public String encrypt(String message) {
		
		shift = shift % 26 + 26;
		StringBuilder encoded = new StringBuilder();
		for (char i : message.toCharArray()) {
			if (Character.isLetter(i)) {
				if (Character.isUpperCase(i)) {
					encoded.append((char) ('A' + (i - 'A' + shift) % 26));
				} else {
					encoded.append((char) ('a' + (i - 'a' + shift) % 26));
				}
			} else {
				encoded.append(i);
			}
		}
		return encoded.toString();
	}

	@Override
	public String decrypt(String message) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}
}
