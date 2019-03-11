package SingletonClass;

public class CallTheSingleton {

    public static void main(String[] args) {
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        SingletonClass singletonClass2 = SingletonClass.getInstance();
        SingletonClass singletonClass3 = SingletonClass.getInstance();

        singletonClass1.speech = singletonClass1.speech.concat(" Sack is what this is!!!");

        System.out.println("singletonClass1 is "+singletonClass1.speech);
        System.out.println("singletonClass2 is "+singletonClass2.speech);
        System.out.println("singletonClass3 is "+singletonClass3.speech);
    }
}
