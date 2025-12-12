Feature: sample karate test script
  for help, see: https://github.com/karatelabs/karate/wiki/IDE-Support

  Background:
    * url 'https://api.demoblaze.com/'

  Scenario: create a new user
    * def user =
      """
      {
        "username": "TestUserBid",
        "password": "testuser"
      }
      """

    Given path 'signup'
    And request user
    When method post
    Then status 200


  Scenario: Validar usuario duplicado
    * def user =
      """
      {
        "username": "TestUser",
        "password": "testuser"
      }
      """

    Given path 'signup'
    And request user
    When method post
    Then status 200
    And match response == { errorMessage: 'This user already exist.' }

  Scenario: Validar login usuario registrado

    * def user =
      """
      {
        "username": "TestUserBid",
        "password": "testuser"
      }
      """
    Given path 'login'
    And request user
    When method post
    Then status 200
    And match response contains 'Auth_token:'


  Scenario: Validar login usuario incorrecto
    * def user =
      """
      {
        "username": "TestUser",
        "password": "testuser"
      }
      """

    Given path 'login'
    And request user
    When method post
    Then status 200
    And match response == { errorMessage: 'Wrong password.' }