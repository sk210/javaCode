package Geekster.PracticeSession;

public class AnaGram {
	
    public static boolean isAnagram(String s, String t) {
    	
    	boolean bool = true;
    	char[] ch = s.toCharArray();
    	char[] ch1 = t.toCharArray();
    	
        if(s.length() == t.length()) {
        	for(int i = 0;i<s.length();i++){
                for(int j = 0;j<t.length();j++){
                    if(ch[i] == ch1[j]){
                    	ch1[j] = '$';
                    	bool = true;
                        break;
                    }
                    else{
                    	bool = false;
                    }
                }
                if(bool == false) {
                	break;
                }
            }
        }
        
        return bool;
        
    }

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
	
		System.out.println(isAnagram(s,t));

	}

}
