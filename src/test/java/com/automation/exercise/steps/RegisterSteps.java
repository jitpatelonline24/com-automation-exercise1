package com.automation.exercise.steps;

import com.automation.exercise.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
//    @Then("I should see the login page text {string}")
//    public void iShouldSeeTheLoginPageText(String text ) {
//        Assert.assertEquals(new LoginPage().getTextFromLoginPage(text),text);
//    }

    @And("I send name {string} and email {string} to signup")
    public void iSendNameAndEmailToSignup(String name, String eMail) {
        new LoginPage().sendDataToSignupFields(name,eMail);
    }

        @And("I fill all details in signup page {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void iFillAllDetailsInSignupPage(String title, String pass, String day, String month,
                                            String year, String fName, String lName, String add1, String add2,
                                            String country, String state, String city, String zipcode, String pNumber) {
        new SignupPage().sendDataToSignupForm(title, pass, day, month, year, fName, lName, add1, add2, country, state, city, zipcode, pNumber);
    }

    @And("I click on news letter subscription check box")
    public void iClickOnNewsLetterSubscriptionCheckBox() {
        new SignupPage().clickOnSignUpNewLetterCheckBox();
    }

    @And("I click on special offers check box")
    public void iClickOnSpecialOffersCheckBox() {
        new SignupPage().clickOnReceiveSpecialOfferCheckBox();
    }

    @And("I click on Create Account button")
    public void iClickOnCreateAccountButton() {
        new SignupPage().clickOnCreateAccountButton();
    }

    @Then("I see account created message {string}")
    public void iSeeAccountCreatedMessage(String expectedText) {
        Assert.assertEquals(new SignupPage().getAccountCreatedMessage(),expectedText);
    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        new SignupPage().clickOnContinueButtonAfterAccountCreated();
    }

    @Then("I should see the text {string} {string}")
    public void iShouldSeeTheText(String text, String name) {
        Assert.assertEquals(new HomePage().getLoggedInAsUserNameText(),text+name);
    }

    @Then("I should see the account deleted message {string}")
    public void iShouldSeeTheAccountDeletedMessage(String expectedText) {
        Assert.assertEquals(new HomePage().getAccountDeletedMessage(),expectedText);
    }

    @And("I click on continue button after deleting account")
    public void iClickOnContinueButtonAfterDeletingAccount() {
        new HomePage().clickOnContinueButtonAfterAccountDeletedMessage();
    }

    @And("I send name {string} to name field in signup")
    public void iSendNameToNameFieldInSignup(String name) {
        new LoginPage().sendDataToNameFieldInSignUp(name);
    }

    @And("I send email {string} to email field in signup")
    public void iSendEmailToEmailFieldInSignup(String email) {
        new LoginPage().sendDataToEmailFieldInSignup(email);
    }

    @Then("I should see error message {string}")
    public void iShouldSeeErrorMessage(String expectedMessage) {
        Assert.assertEquals(new LoginPage().getEmailAlreadyExistErrorMessage(),expectedMessage);
    }

    @When("I add product {string} to the cart")
    public void iAddProductToTheCart(String product) {
        new HomePage().mouseHoverAndClickAddToCartOnProduct(product);
    }

    @And("I click on view cart in popup")
    public void iClickOnViewCartInPopup() {
        new HomePage().clickOnViewCartLink();
    }

    @And("I should see the welcome text on shopping cart page {string}")
    public void iShouldSeeTheWelcomeTextOnShoppingCartPage(String expectedText) {
        Assert.assertEquals(new ShoppingCartPage().getShoppingCartWelcomeText(),expectedText);
    }

    @And("I click on Proceed to Checkout button")
    public void iClickOnProceedToCheckoutButton() {
        new ShoppingCartPage().clickOnProceedToCheckoutButton();
    }

    @And("I click on register link in the checkout popup")
    public void iClickOnRegisterLinkInTheCheckoutPopup() {
        new ShoppingCartPage().clickOnRegisterLoginLinkOnCheckoutPopup();
    }

    @And("I should see the text on checkout page {string}")
    public void iShouldSeeTheTextOnCheckoutPage(String expectedText) {
        Assert.assertEquals(new CheckoutPage().verifyTextOnCheckoutPage(expectedText),expectedText);
    }

    @And("I enter details into comment area {string}")
    public void iEnterDetailsIntoCommentArea(String comment) {
        new CheckoutPage().sendTextToCommentArea(comment);
    }

    @And("I click on place order button")
    public void iClickOnPlaceOrderButton() {
        new CheckoutPage().clickOnPlaceOrderButton();
    }

    @And("I enter payment details {string} {string} {string} {string} and {string}")
    public void iEnterPaymentDetailsAnd(String name, String cardNo, String CVC, String month, String year) {
        new PaymentPage().sendPaymentDetails(name, cardNo, CVC, month, year);
    }

    @And("I click on Pay and Confirm Order button")
    public void iClickOnPayAndConfirmOrderButton() {
        new PaymentPage().clickOnPayAndConfirmOrderButton();
    }

    @Then("I should see the order confirmation message {string}")
    public void iShouldSeeTheOrderConfirmationMessage(String expectedMessage) {
        Assert.assertEquals(new PaymentPage().getOrderConfirmationMessage(),expectedMessage);
    }

    @Then("I should see the delivery address is same address filled at the time registration of account {string}")
    public void iShouldSeeTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount(String expectedAddress) {
        Assert.assertEquals(new CheckoutPage().getDeliveryAddress(),expectedAddress);
    }

    @And("I should see billing address is same address filled at the time registration of account {string}")
    public void iShouldSeeBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount(String expectedAddress) {
        Assert.assertEquals(new CheckoutPage().getBillingAddress(),expectedAddress);
    }

    @When("I click on products tab")
    public void iClickOnProductsTab() {
        new HomePage().clickOnProductsTab();
    }

    @Then("I should see text {string} on product page")
    public void iShouldSeeTextOnProductPage(String expectedText) {
        Assert.assertEquals(new ProductPage().getAllProductText(),expectedText);
    }

    @And("I click on view product of first product {string}")
    public void iClickOnViewProductOfFirstProduct(String productName) {
        new ProductPage().clickOnViewProductWithProductName(productName);
    }

    @And("I am on product details page and verify the URL")
    public void iAmOnProductDetailsPageAndVerifyTheURL() {
        Assert.assertTrue(new ProductDetailsPage().verifyTheURL().contains("https://automationexercise.com/product_details"));
    }

    @And("I should see product name {string}")
    public void iShouldSeeProductName(String productName) {
        Assert.assertEquals(new ProductDetailsPage().getProductName(),productName);
    }

    @And("I should see category {string}")
    public void iShouldSeeCategory(String category) {
        Assert.assertEquals(new ProductDetailsPage().getProductCategory(),category);
    }

    @And("I should see price {string}")
    public void iShouldSeePrice(String price) {
        Assert.assertEquals(new ProductDetailsPage().getProductPrice(),price);
    }

    @And("I should see availability {string}")
    public void iShouldSeeAvailability(String availability) {
        Assert.assertEquals(new ProductDetailsPage().getProductAvailability(),availability);
    }

    @And("I should see condition {string}")
    public void iShouldSeeCondition(String condition) {
        Assert.assertEquals(new ProductDetailsPage().getProductCondition(),condition);
    }

    @And("I should see brand {string}")
    public void iShouldSeeBrand(String brand) {
        Assert.assertEquals(new ProductDetailsPage().getProductBrand(),brand);
    }

    @And("I enter product name {string} in search bar")
    public void iEnterProductNameInSearchBar(String productName) {
        new ProductPage().sendTextToSearchBar(productName);
    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        new ProductPage().clickOnSearchButton();
    }

    @Then("I should see the text {string} on the page")
    public void iShouldSeeTheTextOnThePage(String expectedText) {
        Assert.assertEquals(new ProductPage().getSearchedProductsText(),expectedText);
    }

    @And("I should see the searched product {string}")
    public void iShouldSeeTheSearchedProduct(String productName) {
        Assert.assertEquals(new ProductPage().getSearchedProductName(),productName);
    }

    @And("I click on continue shopping link")
    public void iClickOnContinueShoppingLink() {
        new ProductPage().clickOnContinueShoppingLink();
    }

    @Then("I should see {string} message")
    public void iShouldSeeMessage(String message) {
        Assert.assertEquals(new ProductDetailsPage().getThankYouForReviewMessage(),message);
    }

    @When("I scroll down up to recommended items text")
    public void iScrollDownUpToRecommendedItemsText() {
        new HomePage().scrollDownToSubscriptionLink();
    }

    @Then("I should see {string} text")
    public void iShouldSeeText(String expectedText) {
        Assert.assertEquals(new HomePage().getRecommendedItemText(),expectedText);
    }

    @And("I add to cart {string} product from recommended items")
    public void iAddToCartProductFromRecommendedItems(String productName) {
        new HomePage().clickAddToCartOnRecommendedItems(productName);
    }
}
