class Solution {
    public String solution(String my_string) {
        
        char[] reverse = my_string.toCharArray();
        
        int j = reverse.length - 1;
        
        for(int i = 0; i < reverse.length / 2; i++){
            char a = reverse[i];
            reverse[i] = reverse[i + j];
            reverse[i + j] = a;
            j -= 2;
        }
        
        String answer = new String(reverse);
    
        return answer;
    }
}