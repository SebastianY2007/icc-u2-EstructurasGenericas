    package Controllers;

    import java.util.EmptyStackException;

    import Models.Node;
    import Models.NodeGeneric;
    import Models.Persona;

    public class ColaG<T> {
        private NodeGeneric<T> primero;
        private NodeGeneric<T> ultimo;
        private int size;

        public ColaG(){
            this.primero = primero;
            this.ultimo = ultimo;
        }

        public void add(T value){
            NodeGeneric<T> newNode = new NodeGeneric<T>(value);
            if (isEmpty()){
                primero = newNode;
                ultimo = newNode;
            }else{
                ultimo.setNext(newNode);
                ultimo = newNode;
            }
        }

        public T remove(){
            if (isEmpty()){
                throw new EmptyStackException();
            }
            T value = primero.getValue();
            primero = primero.getNext();
            return value;
        }

        public boolean isEmpty(){
            return primero == null;
        }

        public void printCola(){
            NodeGeneric<T> current = primero;
            while (current != null){
                System.out.println(current.getValue() + " ");
                current = current.getNext();
            }
        }

        public int size(){
            NodeGeneric<T> current = primero;
            int cont = 0;
            while (current != null){
                System.out.println(current.getValue() + " ");
                current = current.getNext();
                cont++;
            }
            System.out.println();
            return cont;
        }

        public Persona findByName(String name){
        if (isEmpty()) {
            System.out.println("Nombre no encontrado:" + name + " ");
            return null; 
        }
        NodeGeneric<T> aux=primero;
        while (aux != null){
            Persona persona= (Persona) aux.getValue();
            if (persona.getNombre().equals(name)){
                System.out.println("Buscar por Nombre: " + name + " => " + persona.getNombre() + "(encontrado)");
                return persona;
            }
            aux = aux.getNext(); 
        }
        return null;
    }
    
    public Persona removeByName(String name) {
        if (isEmpty()) {
            System.out.println("Eliminar nombre: " + name + " => null (cola vacía)");
            return null;
        }

        NodeGeneric<T> aux = primero;
        NodeGeneric<T> anterior = null;

        while (aux != null) {
            Persona persona = (Persona) aux.getValue();

            if (persona.getNombre().equals(name)) {
                if (anterior == null) {
                    primero = aux.getNext();
                    if (primero == null) {
                        ultimo = null;
                    }
                } else {
                    anterior.setNext(aux.getNext());
                    if (aux == ultimo) {
                        ultimo = anterior;
                    }
                }
                size--;
                System.out.println("Nombre: " + name + " => " + persona.getNombre()+ "persona eliminada");
                return persona;
            }
            anterior = aux;
            aux = aux.getNext(); 
        }
        System.out.println("Nombre: " + name + ", no encontrado");
        return null;
    }
}