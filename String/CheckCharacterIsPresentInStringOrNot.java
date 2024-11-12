package String;

import java.util.Scanner;

public class CheckCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");

        String str = sc.nextLine();
        String c = "@?$";

        System.out.println(check(str,c));
    }

    private static boolean check(String str , String c){
        for (int i = 0; i < c.length(); i++) {
            char ch = c.charAt(i);
            if(str.indexOf(ch)>=0){
                return true;
            }
        }
        return false;
    }
}
