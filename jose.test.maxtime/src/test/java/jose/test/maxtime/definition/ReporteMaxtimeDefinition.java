package jose.test.maxtime.definition;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jose.test.maxtime.steps.MaxTimeCerrarFinDeSemana;
import jose.test.maxtime.steps.MaxTimeFormularioSteps;
import jose.test.maxtime.steps.ReporteMaxtimeSteps;
import net.thucydides.core.annotations.Steps;

public class ReporteMaxtimeDefinition {
	
	@Steps
	ReporteMaxtimeSteps reporteMaxtimeSteps;
	
	@Steps
	MaxTimeFormularioSteps maxTimeFormularioSteps;
	
	@Steps
	MaxTimeCerrarFinDeSemana maxTimeCerrarFinDeSemana;
	
	@Given("^Autenticación exitosa en el login maxtime con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void autenticación_exitosa_en_el_login_maxtime_con_usuario_y_clave(String Usuario, String Clave)  {
		reporteMaxtimeSteps.login_maxtime(Usuario, Clave);
	}

	@Given("^Ir a la pantalla de reporte detallado$")
	public void ir_a_la_pantalla_de_reporte_detallado()  {
		reporteMaxtimeSteps.ir_reporte_detallado();
	   
	}

	@Given("^Ingresar al formulario de detalle reporte dia$")
	public void ingresar_al_formulario_de_detalle_reporte_dia()  {
		reporteMaxtimeSteps.ir_reporte_dia();
	}

	@When("^Gestionar formulario de reporte diario$")
	public void gestionar_formulario_de_reporte_diario(DataTable dtDatosForm)  {
		 List<List<String>> data  = dtDatosForm.raw();
		   
		   for(int i=1;i<data.size(); i++) {
			   maxTimeFormularioSteps.diligenciar_campos_formulario_tabla(data, i);
			   try {
				   Thread.sleep(5000);
			   }catch(InterruptedException e){}
		   }
	    
	}

	@Then("^Verificar el cierre del reporte diario del dia exitoso/fallido$")
	public void verificar_el_cierre_del_reporte_diario_del_dia_exitoso_fallido()  {
	   
	}
	
	
// --------------------- Metodos Para  @Cerrar_Fin_de_Semana ----------------------------
	@Given("^Ir a la pantalla de reporte detallado y cerrar dia$")
	public void ir_a_la_pantalla_de_reporte_detallado_y_cerrar_dia() {
		reporteMaxtimeSteps.ir_reporte_detallado();
		maxTimeCerrarFinDeSemana.cerrar_fin_de_semana();
		
	}

	@Then("^Verificar el cierre del reporte fin de semana exitoso/fallido$")
	public void verificar_el_cierre_del_reporte_fin_de_semana_exitoso_fallido() {
	    
	}
         

}
