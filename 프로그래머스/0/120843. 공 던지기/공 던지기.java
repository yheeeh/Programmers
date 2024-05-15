class Solution {
    public int solution(int[] numbers, int k) {
        if((2 * k - 1) % numbers.length == 0)
            return numbers.length;
        else
            return (2 * k - 1) % numbers.length;
                   
    }
}