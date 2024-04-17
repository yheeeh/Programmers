class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = a+""+b;
        int ab2 = 2 * a * b;
        int abNum = Integer.parseInt(ab);
        
        if(abNum >= ab2){
            answer = abNum;
        }else{
            answer = ab2;
        }
        return answer;
    }
}