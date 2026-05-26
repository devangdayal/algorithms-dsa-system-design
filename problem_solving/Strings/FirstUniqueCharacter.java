package Strings;
public class FirstUniqueCharacter {
    public void firstUniqChar(String s) {
        int[] charCount = new int[26];
        s = s.toLowerCase(); 

        for(char c : s.toCharArray()){
            charCount[c-'a']++;
        }

        for(int i=0;i<s.length();i++){
            if(charCount[s.charAt(i)-'a']==1){
                System.out.println(s.charAt(i) + " is the first unique character with index" + i + " in the string.");
                return;
            }
        
        }

        System.out.println("No unique character found.");
    }

    public static void main(String[] args) {
        FirstUniqueCharacter solution = new FirstUniqueCharacter();
        String input = "GeeksforGeeks";
        solution.firstUniqChar(input);
    }


}
