# Test Plan - InPost 

### INTRODUCTION

As part of the THE FIRST JOB - MANUAL SOFTWARE TESTER project, Marta Hejmej and Jakub Góral plan to test the Inpost mobile application on IOS and Android environments, basic functionality of the Parcel Machines(Paczkomat®), and functionality from the Inpost website such as "Quick shipments" and "EcoReturns". on both MacOS and Windows systems by using different browsers such as Chrome, Siri, Edge and Firefox. 
Marta Hejmej is responsible for preparing the test plan.

### DESCRIPTION OF THE TESTED OBJECTS

This section will provide a detailed description of the Inpost mobile application, the basic functionality of the Parcel Machines (Paczkomat®)  and the website functionality such as Quick Shipments(“Szybkie Nadanie”)  and EcoReturns (“EKOZwroty”) that will be tested. This will include information on their features, capabilities, and expected behavior. The purpose of this section is to ensure that everyone involved in the testing process has a clear understanding of what is being tested and the scope of the tests.

The **InPost mobile application** is a software application designed to run on mobile devices such as smartphones and tablets. It allows users to manage their parcels and shipping needs from the convenience of their mobile devices.

The basic functionalities of the Inpost mobile application include:

* Registration and login form - the InPost mobile application requires users to either register or log in to use Its  features and functionalities, by filling out a form with personal information such as name, surname, e-mail address and password. 
* Managing deliveries: Users can manage their deliveries by scheduling them for pickup or delivery to a Parcel Machine(Paczkomat®).
* Tracking parcels: Users can track the status of their parcels and see when they are expected to arrive.
* Finding Parcel Machines (Paczkomat®): Users can search for nearby Parcel Machines, view their location and opening hours, and get directions to them.
* Quick Shippments (“Szybkie Nadanie”): This feature allows users to quickly send a parcel to a Parcel Machine without having to visit the Inpost website. 
* EcoReturns: This feature allows users to easily send back their purchases that they are not satisfied with, without having to visit a physical post office.

**Paczkomat®**  is a type of parcel machine operated by InPost in Poland. It is a self-service automated machine that allows customers to send and receive parcels 24/7.

The basic functionalities of the Paczkomat® include:

* Sending parcels: Customers can use a Paczkomat® to send parcels by inserting the parcel into the machine and completing the shipping process using the touch screen.
* Receiving parcels: Customers can use a Paczkomat® to receive parcels by scanning QR code or entering a code that is provided by the sender. 
* Printing shipping labels: Customers can use a Paczkomat to print shipping labels for their parcels.
* Payment: Customers can use a Paczkomat to pay for their shipments using cash, credit or debit cards, or online payment methods.
* Package size verification: Paczkomats have a built-in measuring device to verify the size of the package and ensure it meets the requirements for shipment.

[Quick Shipments - "Szybkie Nadania"](https://inpost.pl/SzybkieNadania/) is a feature of the Inpost website and mobile application that allows users to quickly send a parcel to a Parcel Machine without having to visit the Inpost website.

The basic functionalities of the Quick shipments - “Szybkie Nadania” include: 

* Finding nearby Parcel Machines: The user can search for nearby Parcel Machines and choose the one they want to use.
* Package size verification: The user can verify the size of the package to ensure it meets the requirements for shipment.
* Payment: The user can pay for their shipment using their preferred payment method, such as cash, credit or debit cards, or online payment methods.
* Printing shipping label: The user can print a shipping label for their parcel and attach it to the package.
* Sending the parcel: The user can then insert the package into the chosen Parcel Machine and complete the shipping process.

[EcoReturns -"EKOZwroty"](https://szybkiezwroty.pl/pl/EKOzwroty)  is a service offered by InPost in partnership with the Odzyskaj Środowisko Foundation, which allows customers to return unwanted items in an environmentally friendly way. 

The basic functionalities of the service include:

* Scheduling a pickup: Customers can schedule a pickup of their unwanted items by visiting the EKOzwroty website.
* Collection: An InPost courier will collect the items using a zero-emission electric vehicle.

### TYPES AND TECHNIQUES OF TESTING

* Functional Testing: This type of testing is used to verify that each function of the application works as intended. For example, functional testing can be used to verify that the Quick Dispatch and EKOzwroty features are working correctly.
* User Interface Testing: This type of testing is used to check the appearance and functionality of the user interface of the application. For example, user interface testing can be used to check the appearance and functionality of the Paczkomaty feature.
* Compatibility Testing: This type of testing is used to ensure that the application works correctly on different platforms, such as IOS and Android.
* Performance Testing: This type of testing is used to verify that the application can handle heavy load and perform optimally.

_Security testing is also an option to consider when testing Inpost mobile application, EKOzwroty, the quick dispatch and Paczkomat® functionalities. However, it's important to note that due to limited resources, this type of testing may not be feasible to perform._

### TOOLS AND TECHNOLOGIES

**Computer testing: macOS M1 2020**

* Microsoft Word, - creating test plan
* Microsoft Excel - test cases, bug reports
* Built-in screen capture tools
* Built-in screen capture editor
* Quicktime Player - screen recording
* CutCam - editing recordings
* Google Drive - storing screenshots, screen recordings and documentation 

**Mobile testing: iPhone SE 2020**

* CutCam - editing recordings
* Built-in screen capture tools
* Built-in screen capture editor

/* Kuba add here your tools*/

### CRITERIA FOR PASSING AND FAILING TESTS: 

**InPost mobile application** 

* Positive registration
* Positive Sign in/out
* Successful shipment of a package through Paczkomat using the app.
* Successful receipt of a package through Paczkomat using the app.
* Successful return of a package through the Paczkomat using the app.
* Access to the ability to track the actual status of a package.
* Testing the proper functioning of the Paczkomat® locator in the surrounding area
* Correct status of a tracked package.

**Paczkomat®**

* Successful shipment of a package through Paczkomat
* Successful receipt of a package through Paczkomat 
* Successful return of a package through the Paczkomat 
* Correct label printing
* Correct size verification actions by Paczkomat®
* Correct QR code scanning
* Successful payment completed with the chosen method.

**“Quick shipments" (Szybkie Nadania)**

* Successful shipment of a package using the "Quick Shipment" method (filling in the required fields with correct data and marking the required consents)
* Correctly matching the size of the package to its dimensions
* Successful payment completed with the chosen method.

**“Eco Returns”(EKOzwroty)**

* Successful shipment of a package using the "Eco Returns" method (filling in the required fields with correct data and marking the required consents)
* Correctly matching the size of the package to its dimensions
* Successful shipment of the package completed.

### CRITERIA FOR SUSPENDING TESTS: 

* Lack of internet access
* Equipment failure
* Non-functioning InPost application
* Non-functioning InPost website

### GENERAL TASKS THAT ARE TO BE PERFORMED WITHIN THE TESTING PROCESS:

**InPost mobile application**

* Testing of the registration for verification of the correctness of entered data and verification of the correctness of validation fields operation
* Testing of login form for verification of the correctness of entered data and verification of the correctness of validation fields operation
* Testing the correctness of the checkboxes operation.
* Testing the option to add a shipment
* Testing the option to track a shipment
* Testing the option to return a shipment
* Testing the option to search for a shipment.
* Testing the option to manually add a shipment.

**Paczkomat®**

* Testing of visible fields on the Paczkomat screen during shipment
* Testing of visible fields on the Paczkomat screen during return shipment
* Testing of visible fields on the Paczkomat screen during receipt of shipment
* Testing label printing
* Testing size verification functionality with Paczkomat®
* Testing the functionality of a QR code reader.

**“Quick shipments" (Szybkie Nadania)**

* Testing of the shipping forms for verification of the correctness of entered data and verification of the correctness of validation fields operation
* Testing the appropriate selection of the size of packages to its specific dimensions
* Testing the correctness of the calculated prices for shipping the package
* Testing payment methods.

**“Eco Returns”(EKOzwroty)**

* Testing of the return forms for verification of the correctness of entered data and verification of the correctness of validation fields operation
* Testing the appropriate selection of the size of packages to its specific dimensions
* Testing the process of shipping a package.

### TESTING ENVIRONMENTS: 

**Computer testing (“Ecoreturns”, “Quick shipments”)**

* macOS Ventura 13.0.1 

* Browsers: 
-    Chrome version 108.0.5359.94 (Official Build) (arm64), 
-    Safari version 16.1 (18614.2.9.1.12)

* Access to the internet - WiFi

**Mobile testing (inPost application, Paczkomaty)

* iPhone SE 2020, 
* InPost application for IOS
* Access to the internet - WiFi

/* Kuba Add your enviroments*/

PEOPLE PARTICIPATING IN THE TESTS: 

Marta Hejmej

Jakub Góral 

| Action | Description | Date | Done |
|--------|-------------|------|------|
| Scope of testing | Parcel Machines(Paczkomat®), and functionality from the Inpost website such as "Quick shipments" and "EcoReturns". on both MacOs and Windows system| 13/02/2023 | YES |
| Resources required | People: manual tester
Tools: look at Tools and Technologies
Time for testing:  2,5 days | 13/02/2023 | YES |
| Test cases| | /*HERE WILL BE LINK*/ | /*HERE WILL BE TIME PERIOD*/ | In progress |
| Environments | look at *TESTING ENVIROMENTS* | 13/02/2023 | YES |
|Test results | look at *Test cases* | /*HERE WILL BE TIME PERIOD*/ | In progress |
| Entry criteria| working and updated equipment,access to the internet, access to functionality | 13/02/2023 | YES |
| Exit criteria | meeting specific functional requirements,no critical errors, acceptance of test results by the project| *HERE WILL BE TIME PERIOD*/ | TO DO | 
| Timeline | Start: 13/02/2023 End:  | 13/02/2023 | YES |
| Tests review | Mutual checking of work results by testers in the project | CONTINOUSLY | IN PROGRES | 

### INCIDENT AND ERROR MANAGEMENT

The found errors will be reported to InPost for fixing

### ROLES AND RESPONSIBILITIES

The team did not choose a management structure, but operates based on the principles of self-organizing teams. Jakub Góral and Marta Hejmej are directly responsible for the project as testers.

### TEST REPORT 
/* HERE WE CAN ADD LINK TO THE TEST REPORT*/


 

























 
