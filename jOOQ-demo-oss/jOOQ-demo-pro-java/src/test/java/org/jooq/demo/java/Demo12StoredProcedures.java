package org.jooq.demo.java;

import org.jooq.demo.AbstractDemo;
import org.jooq.demo.java.db.Routines;
import org.junit.Test;

import static org.jooq.demo.java.db.Routines.inventoryInStock;
import static org.jooq.demo.java.db.Tables.*;
import static org.jooq.impl.DSL.lateral;

public class Demo12StoredProcedures extends AbstractDemo {

    @Test
    public void procedures() {
        title("Standalone procedure calls require a configuration argument");
        println("Inventory 1 in stock: " + Routines.inventoryInStock(configuration, 1L));

        title("But stored functions can also be embedded in queries");
        ctx.select(INVENTORY.INVENTORY_ID, inventoryInStock(INVENTORY.INVENTORY_ID))
            .from(INVENTORY)
            .limit(5)
            .fetch();

        title("Table valued functions are particularly powerful with jOOQ");
        ctx.select(
               FILM.TITLE,
               STORE.STORE_ID,
               STORE.address().city().CITY_,
               FILM_IN_STOCK.P_FILM_COUNT)
           .from(FILM, STORE, lateral(FILM_IN_STOCK(FILM.FILM_ID, STORE.STORE_ID)).as(FILM_IN_STOCK))
           .orderBy(FILM.FILM_ID, STORE.STORE_ID)
           .limit(10)
           .fetch();
    }
}
