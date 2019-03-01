
@Regresion
Feature: El usuario gestiona su reporte diario de maxtime,
				 llenando cada uno de los campos del formulario
				 necesarios para cerrar el dia de manera satisfactoria,
				 aunque se busca validar los posibles errores que se 
				 presenten en el proceso de reporte diario.
				 


  @ReporteDiario
  Scenario: Gestión de reporte diario de actividades en el Maxtime.
    Given Autenticación exitosa en el login maxtime con usuario "******" y clave "*****"
    And Ir a la pantalla de reporte detallado
    And Ingresar al formulario de detalle reporte dia
    When Gestionar formulario de reporte diario
    | IngresaIniServicio |  NumHoras   | Comentario    | 
    |                    |             |               |
    Then Verificar el cierre del reporte diario del dia exitoso/fallido


 @Cerrar_Fin_de_Semana
  Scenario: Gestión de reporte diario de actividades en el Maxtime.
    Given Autenticación exitosa en el login maxtime con usuario "*****" y clave "*****"
    And Ir a la pantalla de reporte detallado y cerrar dia
    #When Gestionar formulario de reporte diario
    Then Verificar el cierre del reporte fin de semana exitoso/fallido