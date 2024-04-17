import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] alphs = a.toCharArray();
        for(int i = 0; i < alphs.length; i++){
            if('a'<= alphs[i] && alphs[i]<='z'){
                System.out.print(Character.toUpperCase(alphs[i]));
            }
            if('A'<=alphs[i] && alphs[i]<='Z'){
                System.out.print(Character.toLowerCase(alphs[i]));
            }
        }
        
    }
}