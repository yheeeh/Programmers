class Solution {
    public int[] solution(int[] emergency) {
		int[] orders = new int[emergency.length];
		
		int order = 1;
		
		for(int j = 0; j < emergency.length; j++) {
			
			int max = 0;
			for(int i = 0; i < emergency.length; i++) {
				if(max < emergency[i]) {
					max = emergency[i];
				}
			}
			
			for(int i = 0; i < emergency.length; i++) {
				if(emergency[i] == max) {
					orders[i] = order;
					order++;
					emergency[i] = 0;
				}
			}
		}
        return orders;
    }
}