package singleton;

// class Abc{
//     public static Abc obj;
//     private Abc(){
//         System.out.println("Hello new instance created");
//     }
//     public static Abc getInstance(){
//         if(obj==null){
//             synchronized(Abc.class){
//                 if(obj==null){
//                     obj = new Abc();
//                 }
//             }
//         }
        
        
//         return obj;
//     }

   
// }

enum Abc{
    INSTANCE;
    private Abc() {
        System.out.println("Hello Enum Singleton Created!");
    }
    int i;
    public void show(){
        System.out.println("Value of I : "+i);
    }

}

public class Singleton {
    public static void main(String[] args) {
    //     Thread t1 = new Thread(new Runnable() {
    //         public void run(){
    //             Abc obj1 = Abc.getInstance();
    //         }
    //     });
    //     Thread t2 = new Thread(new Runnable() {
    //         public void run(){
    //             Abc obj = Abc.getInstance();
    //         }
    //     });

    //     t1.start();
    //     t2.start();
    Abc obj = Abc.INSTANCE;
    obj.i = 5;
    obj.show();

    Abc obj1 = Abc.INSTANCE;
    obj1.i = 6;
    obj.show();

        
    }
}


