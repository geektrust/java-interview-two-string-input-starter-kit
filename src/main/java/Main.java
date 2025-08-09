

public class Main{

    public static void main(String[] args){
        String s = args[0];
        String[] parts = s.split(" ");
        
        String first = parts[0];
        String second = parts[1];
        
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
}
