Feature: Validar generación de 'Slip de salida' y almacenamiento en historial

  Scenario: Completar la carga y procesamiento de documentos
    Given el usuario ha cargado y procesado los documentos
    When se completa el procesamiento de documentos
    Then el sistema debe generar el 'Slip de salida'
    And guardar los documentos originales en el historial de la solicitud
    And guardar los datos extraídos en el historial de la solicitud