package peluche;

public interface carnivoro extends animal{
    public default void darDecomer(){
        System.out.println("yo soy un carnivoro");    
    } 
    
}

