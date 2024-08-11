
package peluche;


public interface herbivoro extends animal{
    @Override
    public default void darDecomer(){
        System.out.println("yo soy un herbivoro");
    }  
}
