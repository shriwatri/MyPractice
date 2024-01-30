
public class AnagramChecker1 {

	public static void main(String[] args) {
		// Example usage
        String str1 = "listen";
        String str2 = "silent";
        
        int result = areAnagrams(str1, str2);
        
        if (result == 1) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
	
	 public static int areAnagrams(String A, String B) {
	        int[] freq1 = new int[26];
	        int[] freq2 = new int[26];
	        for(int i = 0 ; i < A.length() ; i++){
	            freq1[A.charAt(i) - 'a']++;
	            freq2[B.charAt(i) - 'a']++;
	        }
	        for(int i = 0 ; i < 26 ; i++){
	            if(freq1[i] != freq2[i]){
	                return 0;
	            }
	        }
	        return 1;
	    }


	}


   

