package caja;


public class Caja {
    //Atributos de clase
    int ancho;
    int alto;
    int profundo; 
    
    //Contructor vacio
    public Caja(){
        
    } 
    
    //Contructor con argumentos
    public Caja(int an, int al, int pro){
        this.alto = al;
        this.ancho = an;
        this.profundo = pro;
        int resultado = ancho * alto * profundo;
        System.out.println("volumen = " + resultado);
        
               
    }
    
    //Metodos
    public int calcularVolumen(){
        return ancho * alto * profundo;
    }
    
}
