import java.util.Arrays;

public class RemoveChar {

    static String removeCharacter(String string1, String string2){
        int arr[] = new int[26];
        int index;
        Arrays.fill(arr,0);
        int str1 = string1.length();
        int str2 = string2.length();

        for (int i = 0; i < str2; i++){
            char ch = string2.charAt(i);
            if(ch != '\0'){
                index = (int) ch -97;
                arr[index]++;

            }
        }
        StringBuilder copy = new StringBuilder();
        for (int i = 0; i < str1; i++ ){
            char chars = string1.charAt(i);

            index = (int) chars - 97;
            if (index >= 0 && index < 26 && arr[index] == 0) {
                copy.append(chars);
            }
        }
        return copy.toString();
    }
    public static void main(String args[]){
        String string1 = "computer";
        String string2 = "cat";
        String charachter =  removeCharacter(string1,string2);
        System.out.println(charachter);
    }

}

//import java.util.Arrays;
//
//public class RemoveChar {
//
//    static String removeCharacter(String string1, String string2) {
//        int arr[] = new int[26];
//        int index;
//        Arrays.fill(arr, 0);
//        int str1 = string1.length();
//        int str2 = string2.length();
//
//        for (int i = 0; i < str2; i++) {
//            char ch = string2.charAt(i);
//            if (ch != '\0') {
//                index = (int) ch - 97;
//                arr[index]++;
//            }
//        }
//
//        StringBuilder copy = new StringBuilder();
//        for (int i = 0; i < str1; i++) {
//            char chars = string1.charAt(i);
//            index = (int) chars - 97;
//            if (index >= 0 && index < 26 && arr[index] == 0) {
//                copy.append(chars);
//            }
//        }
//        return copy.toString();
//    }
//
//    public static void main(String args[]) {
//        String string1 = "computer";
//        String string2 = "cat";
//        String character = removeCharacter(string1, string2);
//        System.out.println(character); // Output: "ompuer"
//    }
//}

