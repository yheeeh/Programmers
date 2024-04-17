class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        if(denom1 == denom2){
            answer[0] = numer1 + numer2;
            answer[1] = denom1;
        }else if(denom1 % denom2 == 0){
            answer[0] = numer1 + denom1 / denom2 * numer2;
            answer[1] = denom1;
        }else if(denom2 % denom1 == 0){
            answer[0] = denom2 / denom1 * numer1 + numer2;
            answer[1] = denom2;
        }else{
            answer[0] = numer1 * denom2 + numer2 * denom1;
            answer[1] = denom1 * denom2;
        }
        
        int min = answer[0] > answer[1] ? answer[1] : answer[0];
        
        int gcd = 0;

		for (int i = 1; i <= min; i++) {
			if (answer[0] % i == 0 && answer[1] % i == 0) {
				gcd = i;
			}
		}
		
		answer[0] /= gcd;
		answer[1] /= gcd;
        
        return answer;
    }
}