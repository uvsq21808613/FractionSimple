
public static String class  fraction(int numerateur , int denomirateur)
{

    int div = gcd(Math.abs(numerator),denominator);
    numerator /= div;
    denominator /= div;
    int intPart = (numerator/denominator);
    int remPart = numerator-intPart*denominator;
    return String.format("%d_%d/%d",intPart,remPart,denominator);
}
  
	public static void main (String[] args)
	{
		System.out.println ("%d_%d/%d",intPart,remPart,denominator");
		
	}
}
