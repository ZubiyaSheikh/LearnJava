import java.util.Stack;

public class Method_overloading {
    static void Foo(){
        System.out.println("Good morning bro");
    }
    static void Foo(int a)
    {
        System.out.println("Good morning bro "+a+" bro");
    }
    static void Foo(int a, int b,int c){
        System.out.println("Good morning bro "+ a + b + c +" bro");
    }
}
