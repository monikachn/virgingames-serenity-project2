Feature:
  Scenario: Check if the user can access virgin games application with GBP currency
    When User send the GET request for currency GBP endpoint
    Then User must get back status code 200


  Scenario: Check if the user can access virgin games application with EUR currency
    When User send the GET request for currency EUR endpoint
    Then User must get back status code 200

  Scenario: Check if the user can access virgin games application with SEK currency
    When User send the GET request for currency SEK endpoint
    Then User must get back status code 200
