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

public class AgedBrieStepDefs {
    private Inventory inventory;
    private Item[] items;
    private Item agedbried;

    @Given("^I have a new inventory Aged Brie$")
    public void iHaveANewInventory() throws Throwable {
        inventory = new Inventory();
        items = inventory.getItems();
        agedbried = items[1];
    }

    @Then("^the quality of the agedBrie item is (\\d+)$")
    public void theQualityOfTheAgedBriedIs(int agedbriedQuality) throws Throwable {
        assertThat(agedbried.getQuality(), is(agedbriedQuality));
    }

    @When("^I update the inventory Aged Brie$")
    public void iUpdateTheInventory() throws Throwable {
        inventory.updateQuality();
    }

}