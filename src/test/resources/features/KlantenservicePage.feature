Feature: Klantenservice Page Test

  Scenario: Test Klantenservice Page
    Given User is on the home page
    When User click Klantenservice page button
    Then verify if Klantenservice url is expected

  Scenario: Test Klantenservice Page Buttons
    Given User is on the klantenservice page
    And user test Bestellen Button
    And user test Retourneren Button
    And user test Garantie&Reparatie Button
    Then user sees Contactformulier


Scenario: Test Chat met Billie
  Given User is on the klantenservice page
  And user click Chat met Billie Button
  Then user sees Chat met Billie Popup

    # Bolcom UI Test Checking Lijst
    # HOMEPAGE TEST -- FIRST
#1. Open de site https://bol.com/ test home page url, home page title, click cookies button, doorgaan button and bolcomLogo
#2. Controleer als de knop "Zakelijk button" aanwezig is en click het
#3. Controleer als de knop "Cadeaukaart button" aanwezig is en click het
    # KLANTSERVICE PAGE TEST  -- SECOND
#4. Open de pagina Klantenservice
#5. Controleer als de 3 button en hun links aanwezig zijn Bestellen, Retourneren, Garantie&reparatie
#6. Zie dat het contactformulier aanwezig is
#7. Druk dan op Chat met Billie
#8. zie dat het veld chat aanwezig is