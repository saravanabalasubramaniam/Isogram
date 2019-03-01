import java.util.*;
import java.io.*;
class Isogram 
{
  public static void main(String args[])
  {
 	Scanner input = new Scanner(System.in);
        String a=input.nextLine();
	int flag=0;
	char[] ch=a.toCharArray();
	for(int i=0;i<a.length();i++)
	{
		for(int j=i+1;j<a.length();j++)
		{
			if(ch[i]==ch[j])
			{
				flag=1;
				break;
			}
			else
			{
				continue;
			}
		}
	}
	if(flag==1)
	{	
		System.out.println("no");
	}
	else
	{
		System.out.println("yes");
	}
  }
}
