class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n <= 6){
            if(6 % n == 0){
                answer = 1;
            }else if(n == 5){
                answer = n;
            }else{
                answer = 2;
            }
        }else{
            if(n % 6 == 0){
                answer = n / 6;
            }else{
                int cnt = 0;
                for(int i = 1; i <= n; i++){
                    if(n % i == 0){
                        cnt++;
                    }
                }
                if(cnt == 2){
                    answer = n;
                }else{
                    for(int i = 1; i <= n / 2; i++){
                        if(n % i == 0){
                            answer = i;
                        }
                    }
                }
            }
        }
        return answer;
    }
}