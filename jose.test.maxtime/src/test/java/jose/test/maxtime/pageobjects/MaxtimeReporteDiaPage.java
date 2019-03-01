package jose.test.maxtime.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MaxtimeReporteDiaPage extends PageObject {
		
	//Boton
			
	        @FindBy(xpath="//a[@title='Nuevo Detalle Reporte Dia']")
	        public WebElementFacade btnNuevo;
			
	//Label a verificar de la paginade formulario
			
	        @FindBy(xpath="//td[contains(text(),'Detalle Reporte Dia')]")
	        public WebElementFacade lblDetalleReporteDia;
	     
			 
	public void clicBoton2() {
		btnNuevo.click();
		
	}

	public void VerificaClic2() {
		String labelv = "Reporte Dia";
		String strMensaje = lblDetalleReporteDia.getText();
		assertThat(strMensaje, containsString(labelv));
	}
	
}


