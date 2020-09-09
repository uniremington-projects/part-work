package co.edu.miremington.programming;

import co.edu.miremington.programming.parcial.Lavadora;
import co.edu.miremington.programming.parcial.Televisor;
import org.apache.log4j.Logger;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


/**
 * App part work!
 *
 * @author devnix
 * @version 1.0.0
 *
 */
public class App {
    static final Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {

        logger.info("welcome!");
        try {
            List<Lavadora> lavadoraList = new ArrayList<>();
            List<Televisor> televisorList = new ArrayList<>();

            Lavadora lavadora1 = new Lavadora(500000, 50);
            Lavadora lavadora2 = new Lavadora();
            Televisor televisor1 = new Televisor(500000,"Red", 50, "B1",50,true);
            Televisor televisor2 = new Televisor(350000,"Yellow", 50, "F1",39,false);
            Televisor televisor3 = new Televisor(400000,"Yellow", 50, "C1",40,false);

            lavadoraList.add(lavadora1);
            lavadoraList.add(lavadora2);
            televisorList.add(televisor1);
            televisorList.add(televisor2);
            televisorList.add(televisor3);

            loadInfo(lavadoraList,televisorList);

        } catch (Exception e) {
            logger.error(e.getMessage());
        }

    }

    /**
     *  Se imprime el detalle de todos los objetos ingresados en las listas
     * @param lavadoraList List<Lavadora>
     * @param televisorList List<Televisor>
     */
    private static void loadInfo(List<Lavadora> lavadoraList, List<Televisor> televisorList) {
        double valorLavadoras = 0;
        double valorTelevisores = 0;
        for (Lavadora item: lavadoraList) {
            valorLavadoras += item.precioFinal();
            logger.info(item.toString());
        }

        for (Televisor item : televisorList) {
            valorTelevisores += item.precioFinal();
            logger.info(item.toString());
        }
        double total = valorLavadoras + valorTelevisores;
        logger.info("Precio total: " + total);
    }

}
