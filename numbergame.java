import java.util.*;

class numbergame{
  public static void main(String args[]){          
    Random rdm = new Random();
    Scanner scr = new Scanner(System.in);
    
    int r,i,attempt,resulta=0,test=50,win=0,a,s,n=0,count=0,round=1;
    a = 4;
    attempt=1;
    s=1;
 //  System.out.println("no : "+r);
     System.out.println("            NUMBER GAME ");
    while(round==1)
    {
      r = rdm.nextInt(101);//rdmno
    //  System.out.println("number "+r);
       count++;
      System.out.println("              round "+count);
    while(s==1)
    {
      if(a!=0)
      {
        a--;
         System.out.println("      (Guess the no from 1 to 100)");
        System.out.println("attempt "+attempt);
        attempt++;
        resulta++;
    n = scr.nextInt();
   // System.out.println("your guess : "+n);
  //  System.out.println("");
   if(n==r)//win
   {
     win++;
     System.out.println(" you win");
     a=0;
   }
    else//lost
    {
      //low
      if(n<r)
      {
               i=(r-n)/10;
        System.out.print("low ");

    while(i>0)
        {
          System.out.print("+");
          i--;
        }

      }
      //high
      if(n>r)
      {
               i=(n-r)/10;
        System.out.print("high ");

    while(i>0)
        {
          System.out.print("+");
          i--;
        }

      }
      }
        System.out.println("\n");
      }//a
      
        else
      { 
        s=0;
      //  System.out.println("    better luck next time");
      }
      
      }//s
      System.out.println("the number is : "+r);
      System.out.println("\n");
    System.out.println("play again press 1,Exit = 0");
        round = scr.nextInt();
      s=1;
      a=4;
      attempt=1;
    }//rounds
    //results
    System.out.println("Results : \nrounds won : "+win+"\nattempts taken : "+resulta);
    
    System.out.println("executed");
  }
}

