package jose.test.maxtime.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;



import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://operacion.choucairtesting.com/MaxtimeChc/Login.aspx?ReturnUrl=%2fMaxtimeChc%2fdefault.aspx")
public class MaxtimeLoginPage extends PageObject{
	
	
		//Campo Usuario
		@FindBy(xpath="//input[@id='Logon_v0_MainLayoutEdit_xaf_l30_xaf_dviUserName_Edit_I']")
		public WebElementFacade txtUsername;
		
		//Campo Password
		@FindBy(xpath="//input[@id='Logon_v0_MainLayoutEdit_xaf_l35_xaf_dviPassword_Edit_I']")
		public WebElementFacade txtPassword;
		
		//Boton
		@FindBy(xpath="//a[@title='Conectarse']")
		public WebElementFacade btnSignIn;
		
		//Label a verificar de la pagina de inicio
		@FindBy(xpath="//a[@title='Crear paneles']")
		public WebElementFacade lblHomePpal;
		
		public void IngresarDatos(String strUsuario, String strClave) {
			txtUsername.sendKeys(strUsuario);
			txtPassword.sendKeys(strClave);
			btnSignIn.click();
		}
		
		public void VerificaHome() {
			String labelv = "Crear paneles";
			String strMensaje = lblHomePpal.getText();
			assertThat(strMensaje, containsString(labelv));
		}
	

}
