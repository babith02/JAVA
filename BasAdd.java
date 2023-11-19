class BasAdd{
public static void main(String args[]){
Addition object= new Addition();
System.out.println("The Addition of two numbers= ");
object.Add();
}
}
class Addition{
void Add(){
int a=10,b=20;
int res=a+b;
System.out.println(res);
}
}