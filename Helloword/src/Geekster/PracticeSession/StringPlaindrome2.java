package Geekster.PracticeSession;

public class StringPlaindrome2 {
	
	public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]","");
        String str = s.toLowerCase();
        System.out.println(str);
        int start = 0;
        int end = str.length() - 1;
        while(start<end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

	public static void main(String[] args) {
		String s = "Hiu@%jfghfgh$Ih";
		System.out.println(isPalindrome(s));

	}

}
