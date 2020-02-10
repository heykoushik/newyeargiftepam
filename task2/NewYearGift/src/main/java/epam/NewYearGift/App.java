package epam.NewYearGift;
import java.util.*;
import sweets.*;
public class App 
{
	static void sort(int[] Array,String[] Array2)
	{
		for(int i=0;i<4;i++)
    	{
    		int Max = i;
    		for(int j=i+1;j<5;j++)
    		{
    			if(Array[Max]<Array[j])
    			{
    				Max = j;
    			}
    		}
    		int temp1 = Array[Max];
    		String temp2 = Array2[Max];
    		Array[Max] = Array[i];
    		Array2[Max] = Array2[i];
    		Array[i] = temp1;
    		Array2[i] = temp2;
    	}
	}
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	Scanner sc = new Scanner(System.in);
    	int waffer_weight=0,wafferId=0,cookie_weight=0,cookieId=0,chocolate_weight=0,chocolateId=0,dairymilk_weight=0,dairymilkId=0,marshmallow_weight=0,marshmallowId=0;
    	System.out.println("The different kinds of sweets presented for New Year are 'Wafer','Chocolate','Cookie','Dairymilk','Marshmallow'");
    	for(int i=0;i<5;i++)
    	{
    		if(i==0)
    		{
    			System.out.print("Enter the Weight of waffer and waffer id");
    			waffer_weight = sc.nextInt();
    			wafferId = sc.nextInt();
    			
    		}
    		else if(i==1)
    		{
    			System.out.print("Enter the Weight of cookie and cookie id");
    			cookie_weight = sc.nextInt();
    			cookieId = sc.nextInt();
    			
    		}
    		else if(i==2)
    		{
    			System.out.print("Enter the Weight of chocolate and chocolate id");
    			chocolate_weight = sc.nextInt();
    			chocolateId = sc.nextInt();
    		}
    		else if(i==3)
    		{
    			System.out.print("Enter the Weight of dairymilk and dairymilk id");
    			dairymilk_weight = sc.nextInt();
    			dairymilkId = sc.nextInt();
    		}
    		else if(i==4)
    		{
    			System.out.print("Enter the Weight of marshmallow and marshmallow id");
    			marshmallow_weight = sc.nextInt();
    			marshmallowId = sc.nextInt();
    		}
    	}
    	sc.close();
    	Waffer waffer = new Waffer(waffer_weight,"WAFFER",wafferId);
    	Cookie cookie = new Cookie(cookie_weight,"COOKIE",cookieId);
    	Chocolate chocolate = new Chocolate(chocolate_weight,"CHOCOLATE",chocolateId);
    	Dairymilk dairymilk = new Dairymilk(dairymilk_weight,"DAIRYMILK",dairymilkId);
    	Marshmallow marshmallow = new Marshmallow(marshmallow_weight,"MARSHMALLOW",marshmallowId);
    	Sweets[] gift = {waffer, cookie, dairymilk, marshmallow, chocolate};
    	int[] Array = new int[5];
    	String[] Array2 = new String[5];
    	System.out.println("The Different Sweets with their ids and weights are");
    	for (Sweets Parameter : gift)
    	{
    		System.out.println(Parameter.toString());
    	}
    	for(int i=0;i<5;i++)
    	{
    		Array[i] = gift[i].getWeight();
    		Array2[i] = gift[i].toString();
    	}
    	sort(Array,Array2);
    	System.out.println("the Different Sweets after Getting Sorted W.R.T Weights are");
    	for(int i=0;i<5;i++)
    	{
    		System.out.println(Array2[i]);
    	}
    }
}