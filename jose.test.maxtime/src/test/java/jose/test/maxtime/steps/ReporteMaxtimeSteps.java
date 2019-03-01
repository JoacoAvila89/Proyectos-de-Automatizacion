package jose.test.maxtime.steps;

import jose.test.maxtime.pageobjects.MaxtimeLoginPage;
import jose.test.maxtime.pageobjects.MaxtimeReporteDetalladoPage;
import jose.test.maxtime.pageobjects.MaxtimeReporteDiaPage;
import net.thucydides.core.annotations.Step;

public class ReporteMaxtimeSteps {

	MaxtimeLoginPage maxtimeLoginPage;
	MaxtimeReporteDetalladoPage maxtimeReporteDetalladoPage; 
	MaxtimeReporteDiaPage maxtimeReporteDiaPage;



	@Step
	public void login_maxtime(String strUsuario, String strClave) {
//   1. Abrir el navegador
		maxtimeLoginPage.open();
// 	 2. Ingresar Usuario
//   3. Ingresar Contaseña
//   4. Clic en boton Ingresar
		maxtimeLoginPage.IngresarDatos(strUsuario, strClave);
//   5. Verificar la autenticación (label Home)
		maxtimeLoginPage.VerificaHome();
	}

	
	@Step
	public void ir_reporte_detallado() {
		maxtimeReporteDetalladoPage.clicBoton();
		maxtimeReporteDetalladoPage.VerificaClic();
		
	}

	@Step
	public void ir_reporte_dia() {
		maxtimeReporteDiaPage.clicBoton2();
		maxtimeReporteDiaPage.VerificaClic2();
		
	}

}
