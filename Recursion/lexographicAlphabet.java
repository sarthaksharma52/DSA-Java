import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.*;


public class lexographicAlphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        char c = sc.next().charAt(0);

        String inp = "" + a + b + c;
        
        List<String> ls = new ArrayList<>();

        rec("",inp,ls);

        Collections.sort(ls);

        for(String str:ls){
            System.out.println(str);
        }


    }

    public static void rec(String prefix,String inp,List<String> ls){
        if(inp.length()==0){
            ls.add(prefix);
            return;
        }

        for(int i=0;i<inp.length();i++){
            rec(prefix+inp.charAt(i),inp.substring(0,i)+inp.substring(i+1),ls);
        }
    }
}