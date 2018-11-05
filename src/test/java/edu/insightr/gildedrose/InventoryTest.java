package edu.insightr.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    @Test
    void updateQuality() {


        Item itemTest = new Item("+5 Dexterity Vest", 9, 19);
        Item[] itemsTest = new Item[1];
        itemsTest[0] = itemTest;
        Inventory inventTest = new Inventory(itemsTest);


        inventTest.updateQuality();

        assertEquals(18, inventTest.getItems()[0].getQuality());

    }

    @Test
    void sellInLessThanZero() {


        Item[] items = new Item[1];
        Item vest = new Item("+5 Dexterity Vest", 1, 6);
        items[0] = vest;
        Inventory inventTest = new Inventory(items);

        vest.setSellIn(0);
        inventTest.updateQuality();

        assertEquals(4, vest.getQuality());


    }

    @Test
    void update_Conjured_Mana_Cake() {

        Item itemTest = new Item("Conjured Mana Cake", 5, 10);
        Item[] itemsTest = new Item[1];
        itemsTest[0] = itemTest;
        Inventory inventTest = new Inventory(itemsTest);


        inventTest.updateQuality();

        assertEquals(8, inventTest.getItems()[0].getQuality());


    }

    @Test
    void update_Backstage_passes_4_days() {

        Item itemTest = new Item("Backstage passes to a TAFKAL80ETC concert", 4, 30);
        Item[] itemsTest = new Item[1];
        itemsTest[0] = itemTest;
        Inventory inventTest = new Inventory(itemsTest);


        inventTest.updateQuality();

        assertEquals(33, inventTest.getItems()[0].getQuality());


    }

    @Test
    void update_Backstage_passes_8_days() {

        Item itemTest = new Item("Backstage passes to a TAFKAL80ETC concert", 8, 30);
        Item[] itemsTest = new Item[1];
        itemsTest[0] = itemTest;
        Inventory inventTest = new Inventory(itemsTest);


        inventTest.updateQuality();

        assertEquals(32, inventTest.getItems()[0].getQuality());


    }

    @Test
    void update_Backstage_passes_12_days() {

        Item itemTest = new Item("Backstage passes to a TAFKAL80ETC concert", 12, 30);
        Item[] itemsTest = new Item[1];
        itemsTest[0] = itemTest;
        Inventory inventTest = new Inventory(itemsTest);


        inventTest.updateQuality();

        assertEquals(31, inventTest.getItems()[0].getQuality());


    }

    @Test
    void update_Aged_Brie() {

        Item itemTest = new Item("Aged Brie", 10, 30);
        Item[] itemsTest = new Item[1];
        itemsTest[0] = itemTest;
        Inventory inventTest = new Inventory(itemsTest);


        inventTest.updateQuality();

        assertEquals(31, inventTest.getItems()[0].getQuality());


    }




}