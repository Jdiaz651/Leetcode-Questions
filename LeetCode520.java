class Solution {
    public boolean detectCapitalUse(String word) {
        int counter = 0;
        for(int i = 0; i < word.length(); i++){
            char currentChar = word.charAt(i);
            if (Character.isUpperCase(currentChar)){
                counter++;
            }
        }
        if(counter == 0 || counter == word.length()){
            return true;
        }else{
            if(counter == 1){
                char firstChar = word.charAt(0);
                return Character.isUpperCase(firstChar);
            }
        }
        return false;
    }
}