package com.greatlearning.service;

public class NotesCount {

	public void notesCountImplementation(int[] notes, int amount) {
		int[] noteCount = new int[notes.length];

		try {
			for (int i = 0; i < notes.length; i++) {

				//noteCount[i] = 0;
				noteCount[i] = (amount / notes[i]);
				amount = amount - (notes[i] * noteCount[i]);
				if (amount <= 0)
					break;
			}

			if (amount > 0) {
				System.out.println("Required amount cannot be paid with the given demonination");
			} else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for (int i = 0; i < notes.length; i++) {
					if (noteCount[i] != 0)
						System.out.println(notes[i] + ":" + noteCount[i]);
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e + " Exception occurred");

		}
	}
}
