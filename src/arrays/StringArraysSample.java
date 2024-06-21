package arrays;

public class StringArraysSample {

    public static void main(String[] args) {
        String s = "NO26 Sound";
        String rm = "";

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)){
                rm = rm + Character.isLowerCase(ch);
            }
        }
        System.out.print(rm);

    }
}
