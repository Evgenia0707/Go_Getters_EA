package hw_7;

public class nonRepVowel {
    public static void main(String[] args) {


        String str = "bbddaaffgee";
                //    012345678910



        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == 'a' || current == 'e'|| current == 'i' || current == 'o' || current == 'u') {
                int count = 0;//create counter
                for (int j = 0; j < str.length(); j++) {//find vowels
                    if (current == str.charAt(j)) {//when found counting
                        count++;//how many of the char we have on the String
                    }
                }
              if (count==1){// if count equals one - char not repeated/ we have only char
                  System.out.println(i);// looking for index of non repeat char
                  return;//for breaking main method
              }//if condition not match - false- ->
            }
        }
        System.out.println("-1");
    }
}
