class Solution {
    public String solution(int age) {
       
        char[] ageNum = Integer.toString(age).toCharArray();
        
        char[] numbers = new char[10];
        char[] as = new char[10];
        char n = '0';
        char a = 'a';
        for(int i = 0; i < 10; i++){
            numbers[i] = n++;
            as[i] = a++;
        }
        
        for(int i = 0; i < ageNum.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(ageNum[i] == numbers[j]){
                    ageNum[i] = as[j];
                }
            }
        }
        
        String answer = new String(ageNum);
        
        return answer;
    }
}