package test;

abstract class SuperClass {

    public abstract void doSomething();
}

class ClassA extends SuperClass{

    @Override
    public void doSomething(){
        System.out.println("doSomething implementation of A");
    }

    //ClassA own method
    public void methodA(){

    }
}

class ClassB extends SuperClass{

    @Override
    public void doSomething(){
        System.out.println("doSomething implementation of B");
    }

    //ClassB specific method
    public void methodB(){

    }
}

class ClassC{

    ClassA objA = new ClassA();
    ClassB objB = new ClassB();

    public void test(){
        objA.doSomething();
    }

    public void methodA(){
        objA.methodA();
    }

    public void methodB(){
        objB.methodB();
    }
}



public class Parent {

}