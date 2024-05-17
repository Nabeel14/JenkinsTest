package testCases;




public class TechnicalQuestion {
	
	

public static boolean vowelOrNot(String word){
	
	
		String testword= word.toLowerCase();
	
		if (testword.contains("a") || (testword.contains("e")) || (testword.contains("i")) || (testword.contains("o")) || (testword.contains("u")))  {
			return true;
			}else {
			return false;	
			}
		
		}
	
	
	
}