package datos;

import entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class PersonaDatos {
    public static List<Persona>  listaPersonas = new ArrayList<Persona>();
    static int id=0;
    
    public PersonaDatos(){                
    }
    
    public void create(Persona d) {
        id = id + 1;
        System.out.println("ID:" + id);
        d.setId(id);
        listaPersonas.add(d);
    }
    
    public void delete(int id) {
        for (Persona d : listaPersonas) {
            if (id == d.getId()) {
                listaPersonas.remove(d);
                System.out.println("Eliminado " + d.getNombre());
            }
        }
    }    
}
