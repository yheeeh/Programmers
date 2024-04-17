class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        String[] input = rsp.split("");
        
        for(int i = 0; i < input.length; i++){
            switch(input[i]){
                case "2":
                    input[i] = "0";
                    break;
                case "0":
                    input[i] = "5";
                    break;
                default :
                    input[i] = "2";
            }
        }
        for(String x : input){
            answer += x;
        }
        return answer;
    }
}