package linearSearch;

import java.util.Arrays;

public class MainString {

    public static void main(String[] args) {
        String name = "Dein Agiobu";
        char target = 'A';
        System.out.println(linearSearch1(name, target));

    }

    static  boolean linearSearch1(String str, char target){
        if (str.length() == 0){
            return false;
        }

        for (char ch: str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
    static boolean linearSearch(String str, char target){
        if (str.length() == 0){
            return false;
        }

        for (int i=0; i<str.length(); i++){

            if (str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
