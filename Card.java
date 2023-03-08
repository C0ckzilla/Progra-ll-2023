public class Card {

    String number;
    String expire;
    String name;
    int type; //Tarea
    int id;
    
    public Card (String number, String expire, String name, enum type, int id) { 
        //      Los enum en Java, llamados también enumeraciones o listado 
        //              específico, se refieren a la herramienta que 
        //              permite representar conjuntos de constantes 
        //              con un nombre en el lenguaje de programación.
        this.number = number;
        this.expire = expire;
        this.name = name;
        this.id = id;
    }
    
}
