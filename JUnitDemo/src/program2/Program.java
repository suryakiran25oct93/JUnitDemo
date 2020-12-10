package program2;

public class Program 
{
   public static int CheckPrime(int n)
   {
	   int i = 2;
	   int flag = 0;
	   while (i <= n / 2) 
	   {
	      if (n % i == 0)
	      {
	        flag = 1;
	        break;
	      }
	      i++;
	    }
	   return flag;

	 }
	
}

