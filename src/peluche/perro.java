
package peluche;


public class perro extends omnivoro implements batman{

    public perro(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public void vigilar() {
        System.out.println("soy vigilante de la obscuridad un perro fiel");
    }
    
    
}
