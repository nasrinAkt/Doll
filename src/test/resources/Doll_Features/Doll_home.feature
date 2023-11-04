Feature: This is feature for verify all the page

@tag
Scenario: verify user in event page after clicking free registration

Given Open <"URL"> do
Then verify about us page in header
Then click on about us link
Then Verify about us page display
Then scroll down and up
Then scroll down and welcome to nexteticket is visible
Then free registration are clickable
Then verify user in event page after clicking free registration