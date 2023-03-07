# Mystore Test plan #


## Introduction ##

The goal of the test plan is to practice and gain experience in writing test plans, constructing test cases, and reporting bugs. Tester Marta Hejmej is executing this test plan to add it to her portfolio and stand out in the job market as a junior tester.

## Tested object ##

The myStore online store (https://mystore-testlab.coderslab.pl/index.php) will be tested, which has features such as user login and an interactive homepage. The objective of this test plan is to verify the display of the homepage, the functioning of its links, and to test the email and password fields in the login form of the myStore online shop.

## Scope of testing ##

**Home Page**

* loading of Home Page
* display of elements 
    * header (“Contact us” tab, “Sign in” tab,  “Clother” tab, “Accesories” tab, “Art” tab)
    * scrollable '’Sample’' section
    * popular products
    * “All products” tab
    * “20% OFF” banner
    
Out of scope: 

* Search field
* Subscribe field
* Footer section 

**Login form**

* Email field
* Password field

Out of scope: 

* Password reminder option
* Link "No account? Create one"

## Test pass criteria ##

**Home Page**

* Loading below 3 seconds
* display of elements 
    * the "Contact Us" tab is visible and clickable, and it redirects to a contact form.
    * the "Sign In" tab is visible and clickable, and it redirects to a login form.
    * the "Clothes" tab is visible and clickable, and it redirects to a page with clothes.
    * the "Accessories" tab is visible and clickable, and it redirects to a page with accessories.
    * the “Art” tab tab is visible and clickable, and it redirects to a page with decorative items such as picture frames and wall stickers.
    * the "Sample" section with sliding elements is visible, displayed correctly, and the arrow allowing users to navigate between slides is working. The slides are changing accordingly as the user clicks on the arrow.
    * the products in the "Popular Products" section are displaying correctly.
    * clicking on the "All Products" tab leads to the "Home" page with the available product categories.
    * The "20% Off" banner is displaying correctly, and clicking on it redirects the user to the section with clothes.

**Login form**

* The Email and Password fields are active, allowing users to enter their information.
* Successful user login with correct credentials

## Test fail criteria ##

**Home Page**

* Incorrect or missing display of tested elements
* Slow page loading time
* Inability to access active website elements
* Incorrect redirect of the user after clicking on a clickable element.

**Login form**

* Login failure even after providing the correct login credentials.
* Successful login despite entering incorrect login credentials.
* Successful login after entering incomplete login information.

## Test cases ##

[Login form](https://docs.google.com/spreadsheets/d/1vvubcpjH1CiT6OlnX5spgvGdlOpAvIqg/edit?usp=share_link&ouid=113544491954800210650&rtpof=true&sd=true)

## Bug raports ##

[Login form](https://docs.google.com/spreadsheets/d/1mKYzLjqNgIXlfuLtrdpML1oML176PoANYb0aZdFahBM/edit?usp=share_link)

## Entry criteria ##

* Internet access
* A functioning website 
* Working hardware

## Exit criteria ##

* Lack of internet access
* Non-functioning hardware
* Inability to access the tested website

## Testing enviroment ##

macOS Ventura 13.0.1 
Browser: Chrome version 108.0.5359.94 (Official Build) (arm64)
Access to the internet - WiFi

## Error management ##

Errors will be logged and reported in the Bug Report.

## Roles and Responsibilities ##

Marta Hejmej is responsible for planning and conducting the tests.

## Risk management ##

The risks that may occur in the project are:

* Lack or poor internet connection
* Inability to access the online store
* Hardware failures

*Risk management involves minimizing the potential for system failures and lack of internet connectivity by using a stable internet connection and new hardware.*













