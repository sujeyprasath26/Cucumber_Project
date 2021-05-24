 Feature: Test Process Automation smoke scenario

      Scenario: Test login with valid credentials
      Given Open Firefox and start application
      When I enter valid "sakthi.b@tauedu.org" and valid "Welcome@123"
      Then user should be able to login successfully
      
      