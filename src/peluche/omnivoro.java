package peluche;


public class omnivoro implements carnivoro,herbivoro{
    private int id;
    private String nombre;

    @Override
    public void darDecomer() {
        carnivoro.super.darDecomer(); 
        herbivoro.super.darDecomer();
    }

    public omnivoro(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public int getid(){
        return id;
    
    }
     public void setid(int id){
         this.id=id;
     }  
     public String getNombre(){
        return nombre;
     }
     public void setnombre(String nombre){
         this.nombre=nombre;
    
    }
}