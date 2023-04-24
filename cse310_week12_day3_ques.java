import java.io.;
import java.util.*;

interface in1 {
void med(String[] s);
}

public class Solution {

public static void main(String[] args) {
/ 
* Enter your code here. Read input from STDIN. Print output to STDOUT. Your
* class should be named Solution.
*/
Scanner sc = new Scanner(System.in);
String s1[] = new String[3];
for (int i = 0; i < 3; i++) {
s1[i] = sc.next();
}

in1 t = (s) -> {
Arrays.sort(s);
for (int i = 0; i < 3; i++) {
System.out.println(s[i]);
}
};
t.med(s1);
}
}