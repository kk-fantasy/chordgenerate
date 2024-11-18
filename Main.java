package chordgenerate;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Chord chord = new Chord();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("キーを入力してください:");
		String key = scanner.nextLine().trim();
		
		System.out.print("小節数を入力してください:");
		int bars = scanner.nextInt();
		
		try {
			List<String> chords = chord.getRandomChords(key, bars);
			System.out.println("選ばれたコード:" + chords);
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		scanner.close();
	}

}
