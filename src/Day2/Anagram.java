package Day2;

//Time Complexity : O(n) traverse 3 times str1,str2 && lowercase conversion && for loop counter. second charCount loop will be O(1) due to it has fixed array size and it is 256 and considered as O(1)
//Space Complexity: Total will be O(n)
//In Java, charAt(i) returns a char. When used as an array index it is automatically cast to its ASCII integer:
//charCount['A'.charAt(0)]++;
// 'A' has ASCII value 65
// so this means: charCount[65]++
public class Anagram {
    public static void anagramCheck(String s1, String s2) {
        int[] charCount = new int[256];

        String str1 = s1.replaceAll("\\s", "");
        String str2 = s2.replaceAll("\\s", "");

        String string1 = str1.toLowerCase();
        String string2 = str2.toLowerCase();

        if (string1.length() != string2.length()) {
            System.out.println("not");
            return;
        }

        for(int i = 0; i<string1.length();i++){
            charCount[string1.charAt(i)]++;
            charCount[string2.charAt(i)]--;
        }
        for(int c :  charCount){
            if(c!=0){
                System.out.println("not");
                return;
            }
        }
        System.out.println("anagram");
    }
}