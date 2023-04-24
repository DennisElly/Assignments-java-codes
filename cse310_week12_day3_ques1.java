import java.io.;
import java.util.*;

public class Solution {

public static void main(String[] args) {
/ 
* Enter your code here. Read input from STDIN. Print output to STDOUT. Your
* class should be named Solution.
*/
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
if (num > 1) {
while (num > 0) {
String s = sc.next();
if (s.charAt(s.length() - 1) == 'g') {
System.out.println(s);
}

num--;
}
} else {
System.out.println("Invalid");
}

}
}