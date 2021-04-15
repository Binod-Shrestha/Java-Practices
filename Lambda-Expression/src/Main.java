public class Main {

    public static void main(String[] args) {
        // no params

//addNumbers(5,4);
Speak speak = () -> System.out.println("Hello");
speak.talk();

// Functional-2
        addNumbers(4,5);


    }
    public static void addNumbers(int a, int b){
        System.out.println(a+b);
    }

    interface Speak{
        public void talk();
    }

    interface AddNumber{
        public  void add(int a, int b);
    }

}
