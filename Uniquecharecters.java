package assgn4;
import java.util.*;
public class Uniquecharecters {
	static boolean is_Unique_str(String str) {
		     char[] ch = str.toCharArray();
		     Arrays.sort(ch);
		        for (int i = 1; i < ch.length; i++) {
		            if (ch[i] == ch[i-1]) {
		                return false;
		            }
		        }
		        return true;
		    }
	public static void main(String[] args) {
			String str = "vidhya";
			System.out.println("Original String : "+str);
			System.out.println("String has all unique characters: "+is_Unique_str(str));
			}		
	}

