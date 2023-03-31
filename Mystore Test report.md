# Mystore Test report #

## Description ##

This document aims to summarize the testing process of the [My Store](https://mystore-testlab.coderslab.pl/index.php) online shop. The functionalities tested included the homepage and login form.

During the testing process, the following steps were taken:

* measuring the homepage loading time
* displaying elements
* redirection after clicking an element
* verifying the login form functionality

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

## Status of executed test cases ##

### [Home Page](https://docs.google.com/spreadsheets/d/1nZ-CHZ4sz6valX4jpRVIxZrFKTFwKDEd/edit?usp=share_link&ouid=113544491954800210650&rtpof=true&sd=true) ###

|Test Case ID | Title | Status |
|-------------|-------|--------|
| TCHP_01 | Checking page loading time. | PASSED |
| TCHP_02 | Checking whether the "Contact us" tab is displayed correctly. | PASSED |
| TCHP_03 | Verification of the "Contact us" tab functionality. | PASSED |
| TCHP_04 | Checking whether the "Sign in" tab is displayed correctly. | PASSED |
| TCHP_05 | Verification of the "Sign in" tab functionality. | PASSED |
| TCHP_06 | Checking whether the"Clothes" tab is displayed correctly. | PASSED |
| TCHP_07 | Verification of the "Clothes" tab functionality.  | PASSED |
| TCHP_08 | Checking whether the "Accessories" tab is displayed correctly. | PASSED |
| TCHP_09 | Verification of the "Accessories" tab functionality. | PASSED |
| TCHP_10 | Checking whether the "Art" tab is displayed correctly. | PASSED |
| TCHP_11 | Verification of the "Art" tab functionality. | PASSED |
| TCHP_12 | Checking whether the scrollable "Sample" section is displayed correctly. | PASSED |
| TCHP_13 | Verification of transitions between slides in the ''Sample'' section. | PASSED | 
| TCHP_14 | Checking whether thescrollable "Popular products" section is displayed correctly. | PASSED |
| TCHP_15 | Verification of the functionality of the ''Popular products'' section. | PASSED |
| TCHP_16 | Checking whether the "All products" tab is displayed correctly. | PASSED |
| TCHP_17 | Verification of the functionality of the ''All products'' tab. | PASSED |
| TCHP_18 | Checking whether the "20% OFF" banner is displayed correctly. | PASSED |
| TCHP_19 | Verification of the functionality of the "20% OFF" banner. | *FAILED* |
| TCHP_20 | Checking whether the banner below "20% OFF" banner is displayed correctly. | *FAILED* |

### [Login form](https://docs.google.com/spreadsheets/d/1vvubcpjH1CiT6OlnX5spgvGdlOpAvIqg/edit?usp=share_link&ouid=113544491954800210650&rtpof=true&sd=true) ###

|Test Case ID | Title | Status |
|-------------|-------|--------|
| TC_01 | Logging into the system with correct data. | PASSED |
| TC_02 | Logging in with uppercased email adress | *FAILED* |
| TC_03 | Logging in without enetring the password | PASSED | 
| TC_04 | Logging in without enetring email | PASSED | 


## Found defects ##

### [Home Page](https://docs.google.com/spreadsheets/d/1dxX7R4ipY9mIE5z-q26IMNZGVHAXWT6Gm2XQ4ECN4bw/edit?usp=share_link) ###

| Bug ID | Title | Test Case ID | 
|--------|-------|--------------|
| BHP_01 | Invalid redirection occurs after clicking on the ''20% OFF'' banner. | TCHP_19 |
| BHP_02 | Invalid display of the banner. | TCHP_20 | 

### [Login form](https://docs.google.com/spreadsheets/d/1mKYzLjqNgIXlfuLtrdpML1oML176PoANYb0aZdFahBM/edit?usp=share_link) ###

| Bug ID | Title | Test Case ID | 
|--------|-------|--------------|
| BG_01 | The user can log in with an uppercased email address. | TC_02 |






 



















