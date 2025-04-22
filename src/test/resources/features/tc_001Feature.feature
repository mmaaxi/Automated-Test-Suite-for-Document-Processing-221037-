Feature: Validate document loading mode selection

  Scenario: Select document loading options
    Given I am on the document upload page
    When I select the 'cargar documentos' option
    Then I should see options for single file upload and multiple file upload
    When I choose 'carga en un solo archivo'
    Then I should see a single box to upload the file
    When I choose 'cargar documentos por separado'
    Then I should see multiple boxes for each required document