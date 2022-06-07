Feature: Home Page Test

  Scenario: Test Home Page URL
    Given User is on the home page
    When get home page url
    And verify if url is expected
    And get home page title
    And verify if title is expected
    And User click Cookies button
    And User click Doorgaan button
    Then User click bolcomLogo button
    And Test Zakelijk page button
    Then User sees Zakelijk page
    And Test Cadeaukaart page button
    Then User sees Cadeaukaart page

    # Bolcom UI Test Checking Lijst
    # HOMEPAGE TEST -- FIRST
#1. Open de site https://bol.com/ test home page url, home page title, click cookies button, doorgaan button and bolcomLogo
#2. Controleer als de knop "Zakelijk button" aanwezig is en click het
#3. Controleer als de knop "Cadeaukaart button" aanwezig is en click het
# KLANTSERVICE PAGE TEST -- SECOND
#4. Open de pagina Klantenservice
#5. Controleer als de 3 button en hun links aanwezig zijn Bestellen, Retourneren, Garantie&reparatie
#6. Zie dat het contactformulier aanwezig is
#7. Druk dan op Chat met Billie
#8. zie dat het veld chat aanwezig is