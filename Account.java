class Account{
void deposit(double Amount){
//code to deposit the specified Amount
System.out.println("Deposited:" +Amount);
}
public static void main(String[]args){
Account myAccount=new Account();
myAccount.deposit(100.0);
}
}
