import java.util.Scanner;
public class PalindromeCheck{
public static void main(String[] args){
Scanner Sc=new Scanner(System.in);
System.out.print("Enter a String:");
String a = Sc.nextLine();
String b = a;
String c = "";
for(int i=b.length()-1;i>=0;i--){
c+=b.charAt(i);
}
if(b.equals(c)){
System.out.println("The String is a Palindrome");
}
else{
System.out.println("The String is not a Palindrome");
}
}
}
