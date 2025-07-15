abstract class Animal{
abstract void makeSound();
void sleep(){
System.out.println("Sleeping...");
}
}
class Dog extends Animal{
void makeSound(){
System.out.println("Dog barks");
}
}
public class AbstractionExample1{
public static void main(String[]args){
Animal dog=new Dog();
dog.makeSound();
dog.sleep();
}
}
