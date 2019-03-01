package jose.test.maxtime.steps;

import jose.test.maxtime.pageobjects.MaxTimeFormularioPage;
import net.thucydides.core.annotations.Step;

public class MaxTimeCerrarFinDeSemana {
	MaxTimeFormularioPage maxTimeFormularioPage;
	
	@Step
	public void cerrar_fin_de_semana() {
		maxTimeFormularioPage.btnCerrar_Dia();
		maxTimeFormularioPage.btnAceptar_Fin();
		
	}

}
