package com.automation.exercise.steps;

import com.automation.exercise.pages.ProductDetailsPage;
import com.automation.exercise.pages.ProductPage;
import com.automation.exercise.pages.ShoppingCartPage;
import com.automation.exercise.pages.SignupPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ProductSteps {
    @Then("I click on {string} brand in Brands tab")
    public void iClickOnBrandInBrandsTab(String brand) {
        new ProductPage().clickOnBrandOnBrandsTab(brand);
    }

    @Then("I verify the product {string} in shopping cart")
    public void iVerifyTheProductInShoppingCart(String productName) {
        Assert.assertEquals(new ShoppingCartPage().getProductNameFromCart(productName), productName);
    }

    @And("I increase the quantity {string}")
    public void iIncreaseTheQuantity(String quantity) {
        new ProductDetailsPage().sendQuantity(quantity);
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new ProductDetailsPage().clickOnAddToCartButton();
    }

    @And("I click on view cart link in success message")
    public void iClickOnViewCartLinkInSuccessMessage() {
        new ProductDetailsPage().clickOnViewCartLinkInSuccessMessage();
    }

    @Then("I should see quantity {string}")
    public void iShouldSeeQuantity(String quantity) {
        Assert.assertEquals(new ShoppingCartPage().getQuantity(), quantity);
    }

    @Then("I click on {string} category")
    public void iClickOnCategory(String category) {
        new ProductPage().clickOnCategory(category);
    }

    @And("I click on {string} in women category")
    public void iClickOnInWomenCategory(String subCategory) {
        new ProductPage().clickOnSubCategoryOfWomen(subCategory);
    }

    @And("I should see {string} page title")
    public void iShouldSeePageTitle(String expectedTitle) {
        Assert.assertEquals(new ProductPage().getSubMenuPageTitle(), expectedTitle);
    }

    @And("I click on {string} in men category")
    public void iClickOnInMenCategory(String subCategory) {
        new ProductPage().clickOnSubCategoryOfMen(subCategory);
    }

    @And("I enter {string} name at your name field")
    public void iEnterNameAtYourNameField(String name) {
        new ProductDetailsPage().sendNameToYourNameField(name);
    }

    @And("I enter {string} email at email address field")
    public void iEnterEmailAtEmailAddressField(String email) {
        new ProductDetailsPage().sendEmailToEmailAddressField(email);
    }

    @And("I enter {string} message to review here field")
    public void iEnterMessageToReviewHereField(String message) {
        Assert.assertEquals(new ProductDetailsPage().getThankYouForReviewMessage(), message);
    }

    @And("I click on review submit button")
    public void iClickOnReviewSubmitButton() {
        new ProductDetailsPage().clickOnReviewSubmitButton();

    }

    @Then("I should see text {string}")
    public void iShouldSeeText(String expectedText) {
        Assert.assertEquals(new SignupPage().getTextFromAlert(), expectedText);
    }

}