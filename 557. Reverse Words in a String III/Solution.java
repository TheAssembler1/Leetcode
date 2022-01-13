//LINK::557. Reverse Words in a String III

class Solution {
    public String reverseWords(String s) {
        String[] splitString = s.split(" ");
        String newString = "";
        
        for(int i = 0; i < splitString.length - 1; i++){
            String currentString = splitString[i];
            
            for(int j = currentString.length() - 1; j >= 0; j--)
                newString += currentString.charAt(j);
            newString += " ";
        }
        
        String currentString = splitString[splitString.length - 1];
        for(int j = currentString.length() - 1; j >= 0; j--)
                newString += currentString.charAt(j);
        
        return newString;
    }
}
