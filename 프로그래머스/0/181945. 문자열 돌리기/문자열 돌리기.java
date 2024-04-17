import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(String temp : a.split("")){
            System.out.println(temp);
        }
    }
}