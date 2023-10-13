Feature: Hr system test
  Scenario Outline:Create New Person
    Given navigate a Website
    And enter  username "<username>"
    And enter  password "<password>"
    When click  button
    And choose category
    And Select customer
    And Select position
    And Select Hr
    And Select Date
    And Enter phone number "<number>"
    And Enter a name "<name>"
    And Enter a surname "<surname>"
    And Select Cv source
    And Select status
    And enter a not "<note>"
    And Select language
    And Enter a email "<email>"

    When click save button
    Then Driver And
    Examples:
      | username | password | number          | email               | name            | surname         | note   |
      | admin    | ******  | 090(555)5555555 | oguzhan@vitelco.com | denemeKullanıcı | denemeKullanıcı | deneme |





