Feature: This is a feature for contact page functionality

@tag3
Scenario: Verify user can not send massage from contact page
Given Open <"URL"> do
Then verify contact display in header
Then click on contact link
Then verify contact page display
Then scroll down and enter name invalid email and massage
Then click on send button
