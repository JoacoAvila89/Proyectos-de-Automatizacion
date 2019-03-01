package jose.test.maxtime.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MaxtimeReporteDetalladoPage extends PageObject {
		
	//Boton
		@FindBy(xpath="//span[@id='Vertical_v1_LE_v2_DXSelBtn0_D']")
		public WebElementFacade btnFechaHoy;
		
		@FindBy(xpath="//span[@id='Vertical_v1_LE_v2_cell0_0_xaf_Fecha_View']")
		public WebElementFacade btnFechaHoy2;
		
		//Label a verificar de la pagina de inicio
		@FindBy(xpath="//td[contains(text(),'Reporte Dia')]")
		public WebElementFacade lblReportediario;
		

		public void clicBoton() {
			btnFechaHoy.click();
		    btnFechaHoy2.click();
			
		}
		
		public void VerificaClic() {
			String labelv = "Reporte Dia";
			String strMensaje = lblReportediario.getText();
			assertThat(strMensaje, containsString(labelv));
		}
	
}
