import java.util.Scanner;
public class RideSharingPlatformSimulator {
    static int calculateFare(String rideType, int distance) {
        switch (rideType) {
            case "Bike":
                return distance * 5;
            case "Auto":
                return distance * 12;
            case "Cab":
                return distance * 12;
            default:
                throw new IllegalArgumentException("Invalid ride type");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String rideType = sc.next();
            int distance = sc.nextInt();
            try {
                int fare = calculateFare(rideType, distance);
                System.out.println(fare);
            }
            catch (IllegalArgumentException e) {
                System.out.println("Invalid booking");
            }
        }
        sc.close();
    }
}
