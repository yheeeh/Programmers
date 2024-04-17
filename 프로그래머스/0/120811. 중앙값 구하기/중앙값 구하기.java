class Solution {
    public int solution(int[] array) {
       
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] > array[j]){
                    int a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }
        int answer = array[array.length / 2];
        return answer;
    }
}