class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        String[] strs = my_string.split("");
        
        String[] change = overwrite_string.split("");
        
        for(int i = s; i < s + overwrite_string.length(); i++){
            strs[i] = change[i - s] ;
        }
        
        for(String result : strs){
            answer += result;
        }
        return answer;
    }
}