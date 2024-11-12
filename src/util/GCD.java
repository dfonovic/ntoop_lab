package util;

public class GCD {
    public static int gcd(int x, int y) {
        while(y != 0){
        	int t = y;
        	y = x % y;
        	x = t;
        }
        return x;
    }
}