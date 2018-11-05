package edu.insightr.gildedrose.steps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.insightr.gildedrose.Inventory;
import edu.insightr.gildedrose.Item;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SulfurasStepDefs {
    private Inventory inventory;
    private Item[] items;
    private Item sulfuras;

    @Given("^I have a new inventory sulfuras$")
    public void iHaveANewInventory() throws Throwable {
        inventory = new Inventory();
        items = inventory.getItems();
        sulfuras = items[3];
    }

    @Then("^the quality of the sulfuras item is (\\d+)$")
    public void theQualityOfTheSulfurasIs(int sulfurasQuality) throws Throwable {
        assertThat(sulfuras.getQuality(), is(sulfurasQuality));
    }

    @When("^I update the inventory sulfuras$")
    public void iUpdateTheInventory() throws Throwable {
        inventory.updateQuality();
    }

}