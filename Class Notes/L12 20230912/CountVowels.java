/*

program to count number of vowels and consonants in a string

*/

class CountVowels {
	
	
	public static void main(String[] args) {
		
		String s="big brown fox jumped over the lazy dog!";
		int a=0,b=0,i,n;
		
		n=s.length();
		
		/*
		for(i=0;i<n;i++) {
			
			System.out.println(s.charAt(i));
			char c='j';
			//c=c.toLowerCase();
			
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				a++;
				System.out.println(c);
			} else {
				b++;
				System.out.println(c);
			}
			
		}	
		*/
		
		for(i=0;i<n;i++) {
			
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				a++;
				//System.out.println(a);
			} else if(s.charAt(i) > 'a' && s.charAt(i) < 'z') {
				b++;
				//System.out.println(b);
			}
			
		}	
		
	}
	
}