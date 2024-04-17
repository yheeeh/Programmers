class Solution {
    public String solution(String my_string, int n) {
        
        char[] arr = my_string.toCharArray();
        char[] arr2 = new char[arr.length * n];
        
        int k = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < n; j++) {
				arr2[j + k] = arr[i];
			}
			k += n;
		}
        
        String answer = new String(arr2);
        return answer;
    }
}