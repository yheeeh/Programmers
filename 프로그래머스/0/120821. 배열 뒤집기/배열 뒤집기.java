class Solution {
    public int[] solution(int[] num_list) {
        int j = num_list.length - 1;

		for (int i = 0; i < (num_list.length - 1) / 2; i++) {

			int a = num_list[i];
			num_list[i] = num_list[i + j];
			num_list[i + j] = a;

			j -= 2;

		}
        return num_list;
    }
}