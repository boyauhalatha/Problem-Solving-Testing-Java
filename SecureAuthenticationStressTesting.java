/* 









TASK10	Secure Authentication Stress Testing
Problem Description
Develop automated test cases for a login system supporting:
•	Boundary value testing
•	Exception testing
•	Timeout testing
•	Parameterized testing
•	Edge case validation
The system should validate thousands of login attempts efficiently.
Input Format
•	First line contains integer N.
•	Next N lines contain username and password.
Output Format
Display SUCCESS or FAILURE for each login.
Constraints
•	1 ≤ N ≤ 10^5
•	Username length: 3–20
•	Password length: 6–20
Sample Input
3
admin admin123
ab 123
user pass
Sample Output
SUCCESS
FAILURE
FAILURE
*/
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;
public class SecureAuthenticationStressTesting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        // Valid credentials
        Map<String, String> users = new HashMap<>();
        users.put("admin", "admin123");
        users.put("user1", "password1");
        users.put("student", "student123");

        Predicate<String> validUsername =
                username -> username.length() >= 3 && username.length() <= 20;

        Predicate<String> validPassword =
                password -> password.length() >= 6 && password.length() <= 20;

        java.util.function.BiFunction<String, String, String> login =
                (username, password) -> {

                    if (!validUsername.test(username) ||
                        !validPassword.test(password)) {
                        return "FAILURE";
                    }

                    return password.equals(users.get(username))
                            ? "SUCCESS"
                            : "FAILURE";
                };

        IntStream.range(0, n)
                .mapToObj(i -> sc.nextLine().trim().split("\\s+"))
                .map(data -> login.apply(data[0], data[1]))
                .forEach(System.out::println);
        sc.close();
    }
}