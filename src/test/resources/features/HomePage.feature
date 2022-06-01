Feature: Home Page Test

  Scenario: Test Home Page URL
    Given User is on the home page
    When get home page url
    Then verify if url is expected

  Scenario: Test Home Page Title
    Given User is on the home page
    When get home page title
    Then verify if title is expected


    # Bolcom UI Test Checking Lijst
#1. Open de site https://bol.com/
#2. Controleer als de knop "Zakelijk button" aanwezig is
#3. Controleer als de knop "Cadeaukaart button" aanwezig is
#4. Open de pagina Klantenservice
#5. Controleer als de 3 button en hun links aanwezig zijn Bestellen, Retourneren, Garantie&reparatie
#6. Zie dat het contactformulier aanwezig is
#7. Druk dan op Chat met Billie
#8. zie dat het veld chat aanwezig is