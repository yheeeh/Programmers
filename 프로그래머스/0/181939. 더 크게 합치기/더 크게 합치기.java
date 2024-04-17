class Solution {
    public int solution(int a, int b) {
        int answer = 0;
       
        String ab = a+""+b;
        String ba = b+""+a;
        
        int abNum = Integer.parseInt(ab);
        int baNum = Integer.parseInt(ba);
        
        if(abNum >= baNum){
            answer = abNum;
        }else{
            answer = baNum;
        }
        return answer;
    }
}