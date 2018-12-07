import java.util.ArrayList;
import java.util.List;

public class Word{
    /** Scrambles a given word.
     *  @param word the word to be scrambled
     *  @return the scrambled word (possibly equal to word)
     *  Precondition: word is either an empty string or contains only uppercase letters
     *  Postcondition: the string returned was created from word as follows:
     *  - the word was scrambled, beginning at the first letter and continuing from left to right
     *  - two consecutive letters consisting of "A" followed by a letter that was not "A" was swapped
     *  - letters were swapped at most one
     */
    public static String scrambleWord(String word)
    {
        1. create a string str as same as the word;
        2. while the indexOf "A" is not -1
        3. find the index of "A", if the next word is not "A", swap them.
        4. change str into the string str.substring(str.indexOf("A")+2);
_____________________________________________________________________________________
        real code:
        
        String temp = "";
        for (int i = 0; i < word.length()-1 ; i++){
            String a = word.substring(i,i+1);
            String b = word.substring(i+1,i+2);
            if (a.equals("A")&&b.equals("A")){
                temp += b+a;
                i++;
            }
            else{
                temp += a;
            
        if(!word.substring(word.length()-2).equals("A")){
            temp += word.substring(word.length()-1);
        }
        return temp;
    }
    /** Modifies wordList by replacing each word with its scrambled
     *  version, removing any words that are unchanged as a result of scrambling.
     *  @param wordList the list of words
     *  Precondition: wordList contains only non-null objects
     *  Postcondition:
     *  - all words unchanged by scrambling have been removed from wordList
     *  - each of the remaining words has been replaced by its scrambled version
     *  - the relative ordering of the entries in wordList is the same as it was 
     *    before the method was called
     */
    public static void scrambleOrRemove(List<String> wordList){
        1. for (int i = 0 ; i < wordList.length(); i++)
        1. if the wordList.get(i).equals(crambledWord.(wordList.get(i))){
         WordList.remove(i);}
        3. return wordList;
________________________________________________________________________________      
        real code:
        
        for (int i = 0 ; i < wordList.size(); i ++){
        if(wordList.get(i).equals(scrambledWord.(wordList.get(i)))){
            wordList.remove(i);
            i--;
        }
        }
    }

    public static void main(String[] args)
    {
        
    }
}
