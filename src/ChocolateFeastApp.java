// My solution to the HackerRank.com problem "Chocolate Feast."
// https://www.hackerrank.com/challenges/chocolate-feast/problem

import java.util.Scanner;

public class ChocolateFeastApp {

    static int chocolateFeast(int n, int c, int m) {

    	int totBars = n/c;   	
    	int newM = totBars;
    	
    	if(newM >= m) {
    		while((newM-m) >= 0) {
    			totBars++;
    			newM += (1 - m);
    		}
    	}	    	
    	return totBars;
    }
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number trips to the store, t (integer 1-1000): "); 
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            System.out.print("Enter the number, n, of dollars Bobby has for trip #"+(a0 +1)+", (integer 2-100000): "); 
            int n = in.nextInt();
            System.out.print("Enter the cost, c , per chocolate bar (dollars) for trip #"+(a0 +1)+", (integer 1-"+n+"): "); 
            int c = in.nextInt();
            System.out.print("Enter the wrappers, m, per free chocolate bar (dollars) for trip #"+(a0 +1)+", (integer 2 -"+n+"): "); 
            int m = in.nextInt();
            int result = chocolateFeast(n, c, m);
            System.out.println(result);
        }
        in.close();
    }
}
