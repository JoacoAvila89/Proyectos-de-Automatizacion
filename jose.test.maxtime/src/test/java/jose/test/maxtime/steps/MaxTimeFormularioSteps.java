package jose.test.maxtime.steps;

import java.util.List;

import jose.test.maxtime.pageobjects.MaxTimeFormularioPage;
import net.thucydides.core.annotations.Step;


public class MaxTimeFormularioSteps {
	
	MaxTimeFormularioPage maxTimeFormularioPage;
	
	@Step
	public void diligenciar_campos_formulario_tabla(List<List<String>> data, int id) {
	
		maxTimeFormularioPage.btnProyecto();
		maxTimeFormularioPage.btnCheckProyecto();
		maxTimeFormularioPage.btnAceptar();
		maxTimeFormularioPage.btnListHora();
		maxTimeFormularioPage.btnTipoHora();
		maxTimeFormularioPage.btnListServicio();
		maxTimeFormularioPage.txtIngresaIniServicio(data.get(id).get(0).trim());
		maxTimeFormularioPage.btnBuscar();
		maxTimeFormularioPage.btnCheckServicio();
		maxTimeFormularioPage.btnAceptar2();
	    maxTimeFormularioPage.btnListadoActividad();
		maxTimeFormularioPage.btnActividad();
		maxTimeFormularioPage.txtNumHoras(data.get(id).get(1).trim());
		maxTimeFormularioPage.txtComentario(data.get(id).get(2).trim());
		maxTimeFormularioPage.btnGuardar_Cerrar();
		maxTimeFormularioPage.btnCerrar_Dia();
		maxTimeFormularioPage.btnAceptar_Fin();
		
	}

	
}