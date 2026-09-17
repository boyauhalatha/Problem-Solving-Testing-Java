/*
 * INPUT:
 * 5
 * -5 1 5 0 -7
 *
 * OUTPUT:
 * Highest Altitude: 1
 *
 * The gain array represents the net gain in altitude between points.
 * Return the highest altitude.
 */
package Week2;
import java.util.*;
class Task6HighestAltitude{
    public int largestAltitude(int[] gain){
        int altitude=0;
        int highest=0;
        for(int i=0;i<gain.length;i++){
            altitude=altitude+gain[i];
            if(altitude>highest){
                highest=altitude;
            }
        }
        return highest;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of gain values: ");
        int n=sc.nextInt();
        int[] gain=new int[n];
        System.out.println("Enter gain values:");
        for(int i=0;i<n;i++){
            gain[i]=sc.nextInt();
        }
        Task6HighestAltitude obj=new Task6HighestAltitude();
        int result=obj.largestAltitude(gain);
        System.out.println("Highest Altitude: "+result);
        sc.close();
    }
}