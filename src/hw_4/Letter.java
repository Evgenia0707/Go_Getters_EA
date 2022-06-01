package hw_4;

public class Letter {
    public static void main(String[] args) {

        String str = "aaabbbeeeoouu";
//        String str = "bbddeeaffgi";
        str = str.toLowerCase();
        String unique = "";

        for (int j = 0; j < str.length(); j++) {//check every character in the string (iterate over string)
            char ch = str.charAt(j);//temp container for currant char at index J of the string
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {//check how many times the char has appeared in the string
                if ((str.charAt(i) == ch) && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {//count how many times char repeat and if char in the list
                    frequency++;// add if true (vowel and repeat)
                }
            }
            if (frequency == 1) {//if frequency equals 1 -> unique
                unique += ch;// add unique char to string unique
            }

        }

        if (unique.length() > 0) {//if unique contains listed vowels -> print
            System.out.println("unique = " + str.indexOf(unique.charAt(0)));//first unique vowels in string
        } else {
            System.out.println(-1);
        }
    }
}


/*
Question 1:
Given a string, write a method to find the first non-repeating vowel(a,e, i,o,u) in it and return its index.
If it doesn't exist, return -1.
 Assume that all the characters of the String are lowercase.
(Do not use String class functions other than charAt())

Ex1: bbddeeaffgi
output: 6

Ex2: aaabbbeeeoouu
output: -1
 */