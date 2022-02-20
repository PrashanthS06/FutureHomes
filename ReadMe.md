FutureHome Assignment:
<pre>
Test Site - OrangeHRM (orangehrmlive.com)

1. Scenario 1
a. Navigate to the test site in a browser
b. Try to login with any random username and password
c. Validate that the Invalid Credentials message is correctly displayed

2. Scenario 2
a. Navigate to the test site
b. Capture the Username and Password mentioned in the test screen
c. Use them and log in
d. Validate that upon successful login, you are able to see the logged in user (displayed
at top right corner)
e. Print the Name of the user in the report


I have completed the assignment with Selenium Cucumber Framework using Page Object Model and Java as Programming language.
The Structure of the Framework is:

The Framework Structure:

Base Class: Contains all the reuasable methods declared and initialized.
Pages: Cotains the elements and method for each pages separately.
Step Definitions: The automation code which connects to the each Feature file.
TestRunner: The Runner file from which script can be executed.

Feature File: Contains Scenarios written with gherkin language.
Config File: Contains driver path and application URL link which is to be called.

Target Folder: Contains the Junit,HTML and JSON report generated after Script execution.
Pom.xml- contains all the dependencies needed for the framework and script.

How to Run the Test Script?

Can Run as Junit from Runnertest.java file, which will execute all the Scenarios in the Feature File.
</pre>
