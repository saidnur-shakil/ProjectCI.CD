Feature: ADD Customer

  Scenario Outline: customer addition
    Given Manager lands on the XYZ bank home page
    When manager clicks on bank  manager login option
    And click on the add customer tab
    And sends customer '<FirstName>' and '<lastName>' and '<postCode>'
    And clicks on the customer button
    Then go to the next page

    Examples:
      |FirstName|lastName|postCode|
      |  kanon  |ahmed   | 1206   |
