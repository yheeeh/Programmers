class Solution {
    public int[] solution(int[] numbers, String direction) {
        if(direction.equals("right")){
            int first = numbers[numbers.length - 1];
            for(int i = numbers.length - 1; i > 0; i--){
                numbers[i] = numbers[i - 1];
            }
            numbers[0] = first;
        }else{
            int last = numbers[0];
            for(int i = 0; i < numbers.length - 1; i++){
                numbers[i] = numbers[i + 1];
            }
            numbers[numbers.length - 1] = last;
        }
        return numbers;
    }
}