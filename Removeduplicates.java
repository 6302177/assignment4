package assgn4;

import java.util.Arrays;

class Removeduplicates {     
    static void Removeduplicate(char s1[], int length)   
    {   
        int count = 0;          
        for (int i = 0; i < length; i++)   
        {
            int j;
            for (j = 0; j < i; j++)    
            {   
                if (s1[i] == s1[j])   
                {   
                    break;   
                }   
            }     
            if (j == i)    
            {   
                s1[count++] = s1[i];   
            }   
        }   
        System.out.println(String.valueOf(Arrays.copyOf(s1, count)));   
    }
    public static void main(String[] args)   
    {   
        String s = "pasupuletisrividhya";  
        char s1[] = s.toCharArray();  
        int len =s1.length;   
        Removeduplicate(s1, len);   
    }   
}  

