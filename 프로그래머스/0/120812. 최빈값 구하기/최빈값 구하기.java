class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int[] counts = new int[1000];
        
        for(int i = 0; i < counts.length; i++){
            for(int j = 0; j < array.length; j++){
                if(i == array[j]){
                    counts[i]++;
                }
            }
        }
        
        int maxCnt = 0;
        
        for(int i = 0; i < counts.length; i++){
            if(maxCnt < counts[i]){
                maxCnt = counts[i];
                answer = i;
            }else if(maxCnt == counts[i]){
                answer = -1;
            }
        }
        
        
        return answer;
    }
}