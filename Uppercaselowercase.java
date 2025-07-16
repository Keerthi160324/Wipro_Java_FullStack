import java.util.Scanner;
class Uppercaselowercase{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("Enter the number:");
//char var=scan.next().charAt(0);
char var='A';
if (var>='a'&&var<='z'){
System.out.println("Lowercase");
}
else{
System.out.println("Uppercase");
}
}
}
