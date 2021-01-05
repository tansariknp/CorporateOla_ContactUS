Feature: To check Contact Us Form

  Background: To Validate Contact Us form
    Given Go to Corporate Ola Page URL
    Then Click on Contact Us link in Top Header

  ##To Validate name field is mandatory
  @Negative_Scenario_Name
  Scenario: Validate Error message for empty Name text field
    When I Click on Submit button for empty name field
    Then Error message should display for name field

  ##To Validate the limit of text field
  @Max_Character_Name
  Scenario Outline: Validate maximum limit of the Name field
    When Enter "<Value1>" in name field to check maximum allowed character
    Then Name field should not accept more than maximum allowed characters

    Examples: 
      | Value1                                                                                                                       |
      | ValidationofMaximumallowedlimit                                                                                              |
      | NameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameName                         |
      | NameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameNameName |

  ##To Validate Name field should accept only alphabetic character
  @Field_value_Validation_Name
  Scenario Outline: Validate acceptable character for Name field
    When Enter "<Value2>" in name field to check acceptable characters
    Then Name field should not accept any charater other than aplhabet

    Examples: 
      | Value2                                |
      | Alphabet                              |
      | Alphabet Name Last                    |
      | A1l2p3h4a5n6u7m8e9r0i1c               |
      | S!y@m%b$o%l^s                         |
      | A1l2p3h4a5n6u7m8e9r0i1c S!y@m%b$o%l^s |

  ##To Validate EmailAddress field is mandatory
  @Negative_Scenario_EmailAddress
  Scenario: Validate Error message for empty EmailAddress text field
    When I Click on Submit button for empty email address field
    Then Error message should display for email address field

  ##To Validate the limit of email address field
  @Max_Character_EmailAddress
  Scenario Outline: Validate maximum limit of the Email Address field
    When Enter "<Value1>" in email address field to check maximum allowed character
    Then Email Address field should not accept more than maximum allowed characters

    Examples: 
      | Value1                                                                                                                  |
      | ValidationofMaximumallowedlimitinEmailAddressfield                                                                      |
      | EmailAddressEmailAddressEmailAddressEmailAddressEmailAddressEmailAddressEmailAddressEmailAddressEmai                    |
      | EmailAddressEmailAddressEmailAddressEmailAddressEmailAddressEmailAddressEmailAddressEmailAddressEmailAddressEmailAddres |

  ##To Validate Email Address field should accept only valid email
  @Field_value_Validation_EmailAddress
  Scenario Outline: Validate acceptable character for Email Address field
    When Enter "<Value2>" in email Address field to check acceptable value
    Then Email Address field should not accept any value other than proper email Address

    Examples: 
      | Value2                                  |
      | InvalidEmail                            |
      | Invalid Email @ MAIL . com              |
      | Invalid;character&_mail@google@mail.com |
      | 1261872361^^&^)^87623@gmail.com         |
      | 767696@gmail.com                        |
      | validemailaddress@gmail.com             |

  ##To Validate Phone Number field is mandatory
  @Negative_Scenario_PhoneNumber
  Scenario: Validate Error message for empty Phone Number Code and number text field
    When I Click on Submit button for empty Phone Number field
    Then Error message should display for Phone Number Code and number field

  ##To Validate the limit of Phone Number field
  @Max_Character_PhoneNumber
  Scenario Outline: Validate maximum limit of the Phone Number field
    When Enter "<Value1>" in Phone Number field to check maximum allowed numbers
    Then Phone Number field should not accept more than maximum allowed numbers

    Examples: 
      | Value1         |
      |     0123456789 |
      | 00112233445566 |
      |          12345 |

  ##To Validate Phone Number field should accept only valid Phone Number
  @Field_value_Validation_PhoneNumber
  Scenario Outline: Validate acceptable numeric value for Phone Number field
    When Enter "<Value2>" in Phone Number field
    Then Phone Number field should only accept numeric value

    Examples: 
      | Value2                          |
      | 9w9@js@j82S982S239S39           |
      | 9837498537945398w4354           |
      | 982374823d7427984               |
      | 1Q2W3&@^s32hsuh)(0000)E8dh8d372 |

  ##To Validate Country field is mandatory
  @Negative_Scenario_Country
  Scenario: Validate Error message for Country field
    When I Click on Submit button for not selected country field
    Then Error message should display for Country field

  ##To Validate Phone Code field when Country field is selected
  @PhoneCodeValidation_Scenario_Country
  Scenario: Validate Phone Code field when country field is get selected
    When I selected available value from dropdown
    Then Phone Code value should get populated

  ##To Validate Company Name field is mandatory
  @Negative_Scenario_CompanyName
  Scenario: Validate Error message for empty Company Name text field
    When I Click on Submit button for empty Company Name field
    Then Error message should display for Company Name field

  ##To Validate the limit of Company Name field
  @Max_Character_CompanyName
  Scenario Outline: Validate maximum limit of the Company Name field
    When Enter "<Value1>" in Company name field to check maximum allowed character
    Then Comapny Name field should not accept more than maximum allowed characters

    Examples: 
      | Value1                                                                                                                    |
      | ValidationofMaximumallowedlimitforCopmanyNamefield                                                                        |
      | CompanyNameCompanyNameCompanyNameCompanyNameCompanyNameCompanyNameCompanyNameCompanyNameCompanyNameC                      |
      | CompanyNameCompanyNameCompanyNameCompanyNameCompanyNameCompanyNameCompanyNameCompanyNameCompanyNameCompanyNameCompanyName |

  ##To Validate Company Name field should accept only alphabetic character
  @Field_value_Validation_CompanyName
  Scenario Outline: Validate acceptable character for Company Name field
    When Enter "<Value2>" in Company Name field to check acceptable characters
    Then Company Name field should not accept any charater other than aplhabet

    Examples: 
      | Value2                                |
      | CompanyName                           |
      | IBM INDIA PVT. LTD.                   |
      | A1l2p3h4a5n6u7m8e9r0i1c               |
      | S!y@m%b$o%l^s                         |
      | A1l2p3h4a5n6u7m8e9r0i1c S!y@m%b$o%l^s |

  ##To Validate Department field is mandatory
  @Negative_Scenario_Department
  Scenario: Validate Error message for Department field
    When I Click on Submit button for not selected Department field
    Then Error message should display for Department field

  ##To Validate Phone Code field when Country field is selected
  @SelectedValueValidation_Scenario_Department
  Scenario: Validate Department field value once it gets selected
    When I selected available value from Department dropdown
    Then User should beable to see the selected value for Department dropdown field

  ##To Validate Number of Employees field is mandatory
  @Negative_Scenario_NumberOfEmployees
  Scenario: Validate Error message for Number Of Employees field
    When I Click on Submit button for not selected Number of Employees field
    Then Error message should display for Number of Employees field

  ##To Validate Phone Code field when Country field is selected
  @SelectedValueValidation_Scenario_NumberOfEmployees
  Scenario: Validate Number Of Employees field value once it gets selected
    When I selected available value from Number of Fields dropdown
    Then User should be able to see the selected value for Number of Employees dropdown field

  ##To Validate Comment Box field is mandatory or not
  @Negative_Scenario_CommentBOX
  Scenario: Validate Error message for empty Comment Box field
    When I Click on Submit button for Comment Box field
    Then Error message should not display for Comment Box field

  ##To Validate the limit of text field
  @Max_Character_Name
  Scenario Outline: Validate maximum limit of the Comment Box field
    When Enter "<Value1>" in Comment Box field to check maximum allowed character
    Then Comment Box field should not accept more than maximum allowed characters

    Examples: 
      | Value1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
      | CommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBox                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
      | CommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBoxCommentBox |

  ##To Validate Submitting the form with Invalid Values
  @Negative_scneario_Submit
  Scenario Outline: Validate Error message when user clicks on Submit button without providing any values
    When Enter "<Name>" in name field
    And "<Email>" in Email field
    And "<Company Name>" in Comapny field
    And "<Phone Number>" in Phone field
    And Clicks Submit button
    Then Common error message should display and remaning empty mandatory field should be highlighted in red.

    Examples: 
      | Name         | Email                 | Company Name        | Phone Number |
      | Tariq Ansari | randomemail@email.com | IBM INDIA PVT. LTD. |   9876543210 |

  ##To Validate Submitting the form with Valid Values
  @Form_Submission_Scenario_Submit
  Scenario Outline: Validate Submission of Form and user clicks on Submit button after providing valid values for all mandatory field
    When Enter "<Name>" in name field
    And "<Email>" in Email field
    And "<Company Name>" in Comapny field
    And "<Phone Number>" in Phone field
    And Selected Country field
    And Selected Department field
    And Selected Number of Employees field
    And provided "<Comment>" in Comment Box
    And Selected I am not robot check box
    And Clicks Submit button
    Then Verify Success message should display

    Examples: 
      | Name         | Email                 | Company Name        | Phone Number | Comment                |
      | Tariq Ansari | randomemail@email.com | IBM INDIA PVT. LTD. |   9876543210 | Testing final Scenario |
