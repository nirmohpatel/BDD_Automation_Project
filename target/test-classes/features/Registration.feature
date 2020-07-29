Feature: Registration Feature
  @test
  Scenario: To Verify that User should be able to Register successfully
    so that user can use all functionality on website

  Given user is on HomePage
  When User click on register
  And User enter all required registration details
  And User click on registerButton
  Then User should able to register successfully

