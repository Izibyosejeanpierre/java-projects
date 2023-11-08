class A{  
    void per()
    {
System.out.println("am person"); 
    } }
class B extends A{  
    void doc()
{System.out.println("and i am doctor");}  
}  
class doctor{  
public static void main(String args[]){  
B obj=new B();  
obj.per();  
obj.doc();  
}}  