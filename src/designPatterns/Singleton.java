package designPatterns;

public class Singleton {
    public static Singleton obj = new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){
        return  obj;
    }
}
