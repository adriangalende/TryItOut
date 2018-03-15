package org.mvpigs.tryItOut;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mvpigs.Circulo;
import org.mvpigs.tryItOut.Interfaz.*;

public class PersonTest {
    @Test
    public void testCalcularEdad() {
        Person adri = new Person("Adri", 31, 8, 1989);
        assertEquals(28, adri.calculateAge());
    }

    @Test
    public void testCalcularAnoEntreFechas() {
        Person pepeLuis = new Person("Pepe Luis");
        assertEquals(115, pepeLuis.calculateAge(1, 2, 2015));    
    }

    @Test
    public void testInterfaces() {
        List<Drawable> listaDrawables = new ArrayList();

        Person pepeLuis = new Person("Pepe Luis");
        Circulo circulo = new Circulo("Circulo", 5);

        listaDrawables.add(pepeLuis);
        listaDrawables.add(circulo);

        for (Drawable drawables:listaDrawables) {
            drawables.draw();
            if(drawables instanceof Organico){
                Person persona = (Person) drawables;
                System.out.println("Y encima " + persona.getNombre() +  " es organico");
            } 

        }
        
    }

}