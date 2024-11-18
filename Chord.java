package chordgenerate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Chord {
	Map<String, List<String>> diatonicChords = new HashMap<>();
	{diatonicChords.put("C", Arrays.asList("C", "Dm", "Em", "F", "G7", "Am", "Bm7-5"));
	 diatonicChords.put("C#", Arrays.asList("C#", "D#m", "Fm", "F#", "G7#", "A#m", "Cm7-5"));
	 diatonicChords.put("D", Arrays.asList("D", "Em", "F#m", "G", "A7", "Bm", "C#m7-5"));
	 diatonicChords.put("D#", Arrays.asList("D#", "Fm", "Gm", "G#", "A#7", "Cm", "Dm7-5"));
	 diatonicChords.put("E", Arrays.asList("E", "F#m", "G#m", "A", "B7", "C#m", "D#m7-5"));
	 diatonicChords.put("F", Arrays.asList("F", "Gm", "Am", "A#", "C7", "Dm", "Em7-5"));
	 diatonicChords.put("F#", Arrays.asList("F#", "G#m", "A#m", "B", "C#7", "D#m", "Fm7-5"));
	 diatonicChords.put("G", Arrays.asList("G", "Am", "Bm", "C", "D7", "Em", "F#m7-5"));
	 diatonicChords.put("G#", Arrays.asList("G#", "A#m", "Cm", "C#", "D#7", "Fm", "Gm7-5"));
	 diatonicChords.put("A", Arrays.asList("A", "Bm", "C#m", "D", "E7", "F#m", "G#m7-5"));
	 diatonicChords.put("A#", Arrays.asList("A#", "Cm", "Dm", "D#", "F7", "Gm", "Am7-5"));
	 diatonicChords.put("B", Arrays.asList("B", "C#m", "D#m", "E", "F#7", "G#m", "A#m7-5"));
	}
	
	public List<String> getRandomChords(String key, int bars){
		if(!diatonicChords.containsKey(key)) {
			throw new IllegalArgumentException("指定されたkeyが存在しません:" + key);
		}
		List<String> chordList = diatonicChords.get(key);
		Random random = new Random();
		List<String> result = new ArrayList<>();
		
		for (int i = 0; i < bars; i++) {
			result.add(chordList.get(random.nextInt(chordList.size())));
		}
		return result;
	}

}
