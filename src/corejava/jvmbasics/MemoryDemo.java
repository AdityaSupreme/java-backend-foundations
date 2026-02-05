package corejava.jvmbasics;

public class MemoryDemo {
    int instanceVar = 10;
    public static void main(String[] args){
        int localVar = 20;

        MemoryDemo obj1 = new MemoryDemo();
        MemoryDemo obj2 = new MemoryDemo();
        obj1.instanceVar = 99;
        System.out.println(obj2.instanceVar);
    }

    void printValue(int param){
        int methodVar = 30;
        System.out.println(instanceVar + methodVar + param);
    }

    static void staticMethod(){
//        System.out.println(instanceVar);
    }
}
