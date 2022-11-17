public class DuplicateCharacters {
          
          public static void main(String[] args) {
                   
                  String str = new String("Sakkett");
		 char letter='a';        
                  char[] chars = str.toCharArray();                 
                  for (int i=0; i<str.length();i++) {                          
                                         if (chars[i] == letter) {
                                                 chars[i]=' ';
                                          }
				System.out.print(chars[i]+"\t");
                               }
                   }
           }
 
