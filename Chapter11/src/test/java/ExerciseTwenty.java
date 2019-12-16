import net.mindview.util.TextFile;

import java.util.*;

import static net.mindview.util.Print.print;

/**
 * @Author ZhangGJ
 * @Date 2019/05/28
 */
public class ExerciseTwenty {
		private final static Set<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'o', 'u', 'i', 'A', 'E', 'O', 'U', 'I'));
		static void updateStat(Map<Character,Integer> stat, char letter) {
				Character ch = Character.toLowerCase(letter);
				Integer freq = stat.get(ch);
				stat.put(ch, freq == null ? 1 : freq + 1);
		}
		public static void main(String[] args) {
				HashMap<Character,Integer> fileStat = new HashMap<Character,Integer>();
				HashSet<String> processedWords = new HashSet<String>();
				HashMap<Character,Integer> wordStat = new HashMap<Character,Integer>();
				for(String word : new TextFile("ExerciseTwenty.java", "\\W+")) {
						wordStat.clear();
						for(char letter : word.toCharArray())
								if(vowels.contains(letter)) {
										updateStat(wordStat, letter);
										updateStat(fileStat, letter);
								}
						if(!processedWords.contains(word)) {
								processedWords.add(word);
								print("Vowels in " + word + ": " + wordStat);
						}
				}
				print("*************************");
				print("Vowels in the whole file: " + fileStat);
		}
}
