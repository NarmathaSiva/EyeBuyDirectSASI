Feature: To buy product using search box
Scenario: To add the product to cart using search box and complete payment
Given User has to SighIn the application with "ashoksasi001@gmail.com" and "moov0505"
When User has to search the product 
Then User has to select the product in the below and add to cart
And User has to pay and buy the product and close the browser