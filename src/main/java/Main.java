public class Main {
    public static void greeting(String name){
        if( name == "Alice" || name == "Bob"){
            System.out.println("Hello " + name);
        }else{
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        greeting("Miguel");
        greeting("Tay");
        greeting("Alice");
        greeting("Bob");
    }
}
