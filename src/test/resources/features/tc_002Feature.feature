Feature: Validate file upload with valid format and preview

  Scenario: Upload a valid PDF/DOCX file and view preview
    Given the user is on the file upload page
    When the user selects a PDF/DOCX file within 50 MB
    Then the file is uploaded successfully
    And the preview displays the file name, size, and type