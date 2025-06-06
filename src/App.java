import Controllers.Cola;
import Controllers.ColaG;
import Controllers.Stack;
import Controllers.StackG;
import Models.Persona;
import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;

public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
        System.out.println("Tam = " + stack.size);
        stack.printStack();
        stack.pop();
        System.out.println("Tam = " + stack.size);
        stack.printStack();

        System.out.println("\n");

        // Stack Generica
        StackG<Integer> stackGInt = new StackG<Integer>();
        stackGInt.push(1);
        stackGInt.push(4);
        stackGInt.printStack();

        StackG<String> stackGString = new StackG<String>();
        stackGString.push("Uno");
        stackGString.push("Cuatro");
        stackGString.printStack();

        System.out.println("\n");

        Cola cola = new Cola();
        cola.add(5);
        cola.add(7);
        cola.add(10);
        System.out.println("Tam = " + cola.size);
        cola.printCola();
        cola.remove();
        System.out.println("Tam = " + cola.size);
        cola.printCola();

        System.out.println("\n");

        Persona p1 = new Persona("Pablo");
        Persona p2 = new Persona("Juan");
        Persona p3 = new Persona("Maria");

        ColaG<Persona> colaPersonas = new ColaG<Persona>();
        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);
        System.out.println(colaPersonas.size());
        colaPersonas.printCola();
        System.out.println("Atiene a la persona => " + colaPersonas.remove());
        System.out.println(colaPersonas.size());
        colaPersonas.printCola();

        colaPersonas.findByName("David");
        Persona pEliminada = colaPersonas.removeByName("David");
        if (pEliminada != null){
            System.out.println("Se elimino a la persona: " + pEliminada.getNombre());
        }else{
            System.out.println("No se encontro una persona con ese nombre");
        }

        System.out.println("\n");
        SignValidator signValidator = new SignValidator();
        System.out.println(signValidator.esValido("([]){}"));  
        System.out.println(signValidator.esValido("([)]"));    
        System.out.println(signValidator.esValido("(())"));    
        System.out.println(signValidator.esValido("{[]}"));    
        System.out.println(signValidator.esValido("{[]})"));

        System.out.println("\n");
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(1);
        pila.push(4);
        pila.push(2);
        
        System.out.println("Stack original:");
        StackSorter.printStack(pila);
        
        StackSorter.orderarStack(pila);
        
        System.out.println("\nStack ordenado:");
        StackSorter.printStack(pila);
    }
}
