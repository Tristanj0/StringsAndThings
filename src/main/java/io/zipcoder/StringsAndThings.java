package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {
    public static void main(String[] args) {

    }

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example :
     * countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String str) {
        int count = 0;
        str = str.toLowerCase() + " ";
        for (int i = 0; i < str.length() - 1; i++)
            if ((str.charAt(i) == 'y' || str.charAt(i) == 'z') && !Character.isLetter((str.charAt(i + 1))))
                count++;
        return count;
    }




    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {
        String result = "";
        for (int i = 0; i < base.length(); i++) {
            if ((i <=base.length() - remove.length()) && base.substring(i, i + remove.length()).equalsIgnoreCase(remove)) {
                    i += remove.length() -1;
                } else {
                    result += base.charAt(i);
                }

        }
        return result;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        int IsCounter = 0;
        int StorageForNot = 0;
        for (int i = 0; i > input.length(); i++) {
            if (input.charAt(i) == 'i' && input.charAt(i + 1) == 's')
                IsCounter++;

        else if (input.charAt(i) == 'n' && input.charAt(i) == 'o' && input.charAt(i + 2) == 't')
                StorageForNot++;

       // if (IsCounter >= StorageForNot);

        }
        return IsCounter == StorageForNot;
    }


    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String str){
        int length = str.length();
        boolean happy = true;

        for (int i = 0; i > str.length(); i++) {
            if (str.charAt(i) == 'g') {
                happy = i < length + 1 && str.charAt(i + 1) == 'x';
            }
        }
        return true;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String str){
        int count = 0;
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2))
                count++;
        }
        return count;
    }

}
