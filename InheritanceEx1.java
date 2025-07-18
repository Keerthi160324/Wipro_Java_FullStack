class Animal{
void eat(){
System.out.println("Eating..");
}
void sleep(){
System.out.println("Sleeping..");
}
}
class Bird extends Animal{
void fly(){
System.out.println("it is flying..");
}
void eat(){
System.out.println("Eating a food..");
}
void sleep(){
System.out.println("Sleeping today..");
}
}
class InheritanceEx1{
public static void main(String[]args){
Animal animal=new Animal();
Bird bird=new Bird();
bird.eat();
bird.sleep();
bird.fly();
}
}
