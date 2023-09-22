$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/EyeGlasses.feature");
formatter.feature({
  "name": "To Validate the Eye Glasses Product Page in eyebuydirect application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the Eye Glasses Product Page with Filters",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the \"asasikumar0505@gmail.com\" and \"moov0505\" and click signin to access eye glasses page",
  "keyword": "Given "
});
formatter.match({
  "location": "EyeGlasses.user_has_to_enter_the_and_and_click_signin_to_access_eye_glasses_page(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select all filters in EyeGlasses page",
  "keyword": "When "
});
formatter.match({
  "location": "EyeGlasses.user_has_to_select_all_filters_in_EyeGlasses_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to validate the number of items displayed after selecting filters in EyeGlasses page",
  "keyword": "Then "
});
formatter.match({
  "location": "EyeGlasses.user_has_to_validate_the_number_of_items_displayed_after_selecting_filters_in_EyeGlasses_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/ProductSearch.feature");
formatter.feature({
  "name": "To buy product using search box",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To add the product to cart using search box and complete payment",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has to SighIn the application with \"ashoksasi001@gmail.com\" and \"moov0505\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchAndBuy.user_has_to_SighIn_the_application_with_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to search the product",
  "keyword": "When "
});
formatter.match({
  "location": "SearchAndBuy.user_has_to_search_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select the product in the below and add to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchAndBuy.user_has_to_select_the_product_in_the_below_and_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pay and buy the product and close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "SearchAndBuy.user_has_to_pay_and_buy_the_product_and_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});