Feature: Google image search
Scenario: user can search images by keyword

Given an open browser with google.com
When  click "Imágenes" link
And   enter a keyword "selenide" in input field
Then  at least top 10 matching images should be shown
