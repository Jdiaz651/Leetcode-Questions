class Solution {
    public String mergeAlternately(String word1, String word2) {
        string answer = "";
        int i = 0;
        for (i < word1.length() || i < word2.length()){
            if i < word1.length(){
                answer = answer + word1.charAt(i);
            }
            if i < word2.length(){
                answer = answer + word2.charAt(i);
            }
            i++
        }
        return answer
    }
}