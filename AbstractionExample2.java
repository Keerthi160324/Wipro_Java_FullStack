interface Vehicle{
void start();
}
class Car implements Vehicle{
public void start(){
System.out.println("Car is starting...");
}
}
public class AbstractionExample2{
public static void main(String[]args){
Vehicle car=new Car();
car.start();
}
}
