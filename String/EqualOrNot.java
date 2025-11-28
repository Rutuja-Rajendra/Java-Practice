package String;

public class EqualOrNot 
{
    public static void main(String[] args) {
        
        String str1 = "hello";
        String str2 = "hello";

        //without using .equals() method

        boolean flag = true;

        if(str1.length() != str2.length())
        {
            flag = false;
        }
        else
        {
            for(int i = 0; i < str1.length(); i++)
            {
                if(str1.charAt(i) != str2.charAt(i))
                    {
                        flag = false;
                        break;
                    }       
            }
        }

        if(flag)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not equal");
        }
    }    
}
