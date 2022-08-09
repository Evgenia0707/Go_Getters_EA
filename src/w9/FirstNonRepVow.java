package w9;

import java.util.*;

public class FirstNonRepVow {
    public static void main(String[] args) {

        String inputText = "google";

        System.out.println(firstNonRepeatVowel(inputText));


    }
    public static int firstNonRepeatVowel(String inputText) {

        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'i', 'e', 'o', 'u')); //make list with vowels
        List<String> charList = new ArrayList<>(Arrays.asList(inputText.split(""))); //make list with new string characters
        Map<Character, Integer> map = new LinkedHashMap<>(); //empty map
        int result = -1;

        for (int i = 0; i < inputText.length(); i++) { //put characters in the map
            map.put(inputText.charAt(i), Collections.frequency(charList, charList.get(i)));
        }

        for (Character key : map.keySet()) { //go over keys
            for (Character eachVowel : vowels) { //go over vowels
                if (key.equals(eachVowel) && map.get(key) < 2) { //compare vowel with map key and if is repeat one time < 2  return it
                    return inputText.indexOf(key);
                }
            }
        }
        return result;
    }

    public static int getFirstNonRepeatingVowel(String input) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character ch : input.toCharArray()){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { // check if current char is vowel
                // “put” operation below will add the current vowel for it’s first occurrence
                // for the next occurrences; “put” operation will update the VALUE of the vowel
                map.put(ch, map.getOrDefault(ch, 0)+1 );
            }
        }

        for (Map.Entry<Character, Integer> each : map.entrySet()) {
            // iterate over map entries to find whose value is 1 (total occurrence)
            if (each.getValue() == 1){
                return input.indexOf(each.getKey()); // key of the map is holding the vowel, just return it
            }
        }
        return -1; // if above operation not returns an index, then we can assume all vowels are repeated or there is no vowel, just return -1
    }


    }

