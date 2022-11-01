package tutorial;

public class OperatorLogika {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c;
        
        // Konjungsi (AND)
        c = a && b;
        System.out.println("true && false ="+c);
        
        // Disjungsi (OR)
        c = a || b;
        System.out.println("true || false ="+c);
        
        // Negasi (NOT)
        System.out.println("Negasi, !true ="+!a);
        System.out.println("Negasi, !false="+!b);
    }
    
}
