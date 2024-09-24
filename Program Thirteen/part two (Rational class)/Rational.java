public class Rational extends Number implements Comparable<Rational> {
    
    private long[] r = new long[2]; //holds the r data which is set to a size of 2
    
    //no args constructor
    public Rational() {
        this(0, 1);
    }
    
    //constructor that takes in a numerator and denominator
    public Rational(long num, long den) {
        
        long gcd = gcd(num, den);
        r[0] = (den > 0 ? 1 : -1) * num / gcd;
        r[1] =  Math.abs(den) / gcd;
    }
    
    //finds the greatest common denominator of a function
    private static long gcd(long n, long d)
    {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) 
        {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }
        
        return gcd;
    }
    
    //returns the data stored in the numerator
    public long getNumerator()
    {
        return r[0];
    }
    
    //returns the data stored in the denominator
    public long getDenominator()
    {
        return r[1];
    }
    
    //adds two fractions and returns the value
    public Rational add(Rational r2)
    {
        long n = r[0] * r2.getDenominator() + r[1] * r2.getNumerator();
        long d = r[1] * r2.getDenominator();
        return new Rational(n, d);
    }
    
    //subtracts two fractions and returns the value
    public Rational subtract(Rational r2)
    {
        long n = r[0] * r2.getDenominator() - r[1] * r2.getNumerator();
        long d = r[1] * r2.getDenominator();
        return new Rational(n, d);
    }
    
    //multiplies two fractions and returns the value
    public Rational multiply(Rational r2)
    {
        long n = r[0] * r2.getNumerator();
        long d = r[1] * r2.getDenominator();
        return new Rational(n, d);
    }
    
    //divides two fractions and returns the value
    public Rational divide(Rational r2)
    {
        long n = r[0] * r2.getDenominator();
        long d = r[1] * r2.getNumerator();
        return new Rational(n, d);
    }
    
    //makes a toString method for a fraction. overrides the Number class
    @Override
    public String toString() 
    {
        if (r[1] == 1)
            return r[0] + "";
        else
            return r[0] + "/" + r[1];
    }
    
    //finds if two fractions are equal to eachother. overrides the Number class
    @Override 
    public boolean equals(Object other) 
    {
        if ((this.subtract((Rational)(other))).getNumerator() == 0)
            return true;
        else
            return false;
    }
    
    //returns an int value. overrides the Number class
    @Override
    public int intValue() 
    {
        return (int)doubleValue();
    }
    
    //returns an float value. overrides the Number class
    @Override
    public float floatValue() 
    {
        return (float)doubleValue();
    }
    
    //returns a double value. overrides the Number class
    @Override
    public double doubleValue() 
    {
        return r[0] / r[1];
    }
    
    //returns a long value. overrides the Number class
    @Override
    public long longValue() 
    {
        return (long)doubleValue();
    }
    
    //compares two fractions to each other and returns a value based on which is greater.  overrides the Number class
    @Override
    public int compareTo(Rational o) 
    {
        if (this.subtract(o).getNumerator() > 0)
            return 1;
        else if (this.subtract(o).getNumerator() < 0)
            return -1;
        else
            return 0;
    }
}