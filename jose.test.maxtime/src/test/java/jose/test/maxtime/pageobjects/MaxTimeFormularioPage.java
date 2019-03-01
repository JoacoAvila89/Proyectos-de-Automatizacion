package jose.test.maxtime.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class MaxTimeFormularioPage extends PageObject{	
	
// 1. Boton Listado de Proyecto	
	@FindBy(xpath=".//*[contains(@id,'dviProyecto_Edit_Find')]")
	public WebElementFacade btnProyecto;
	
// 2. Boton de CheckProyecto se captura en el metodo del mismo 
		
	
// 3. Boton Aceptar Proyecto
		@FindBy(xpath="//a[@title='Aceptar']")
		public WebElementFacade btnAceptar;
		
// 4. Boton Lista Tipo de Hora		
		//img[@id='Vertical_v10_MainLayoutEdit_xaf_l148_xaf_dviTipoHora_Edit_DD_B-1Img']
		@FindBy(xpath=".//*[contains(@id,'dviTipoHora_Edit_DD_B-1Img')]")
		public WebElementFacade btnListHora;
			
// 5. Boton Selecciona Tipo de Hora
		@FindBy(xpath=".//*[contains(@id,'dviTipoHora_Edit_DD_DDD_L_LBI3T0')]")
		public WebElementFacade btnTipoHora;
		//td[@id='Vertical_v10_MainLayoutEdit_xaf_l148_xaf_dviTipoHora_Edit_DD_DDD_L_LBI3T0']

// 6. Boton Listado de Servicio
		@FindBy(xpath=".//*[contains(@id,'dviServicio_Edit_Find_BImg')]")
		public WebElementFacade btnListServicio;
		//img[@id='Vertical_v10_MainLayoutEdit_xaf_l153_xaf_dviServicio_Edit_Find_BImg']
		
// 7. Boton Selecciona Servicio
		@FindBy(xpath="//input[@id='Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_Ed_I']")
		public WebElementFacade txtIngresaIniServicio;
		//input[@id='Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_Ed_I']
	
// 8. Boton Buscar Servicio
		@FindBy(xpath="//div[@id='Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_B_CD']")
		public WebElementFacade btnBuscar;
		
// 9. Boton CheckBox de Servicio
		@FindBy(xpath=".//*[contains(@id,'DXSelBtn3_D')]")
		public WebElementFacade btnCheckServicio;	
		//span[@id='Dialog_v18_LE_v19_DXSelBtn3_D']
// 10. Boton Aceptar Servicio
		@FindBy(xpath="//a[@title='Aceptar']")
		public WebElementFacade btnAceptar2;
		
// 11. Boton Listar Actividad
		@FindBy(xpath=".//*[contains(@id,'dviActividad')]")
		public WebElementFacade btnListadoActividad;
		//img[@id='Vertical_v10_MainLayoutEdit_xaf_l158_xaf_dviActividad_Edit_DD_B-1Img']
		//table[@id='Vertical_v10_MainLayoutEdit_xaf_l158_xaf_dviActividad_Edit_DD']//td[@class='dxic']
		//td[@id='Vertical_v10_MainLayoutEdit_xaf_l158_xaf_dviActividad_Edit_DD_B-1']//table[@class='dxbebt']
		//img[@id='Vertical_v12_MainLayoutEdit_xaf_l158_xaf_dviActividad_Edit_DD_B-1Img']
// 12. Boton Selecciona Actividad "Pendiente Asignacion Choucair"		
		@FindBy(xpath=".//*[contains(@id,'LBI78T0')]")
		public WebElementFacade btnActividad;			
		
// 13. Boton Ingresa Hora Laboradas
		@FindBy(xpath=".//*[contains(@id,'dviHoras_Edit_I')]")
		public WebElementFacade txtNumHoras;		
		//input[@id='Vertical_v10_MainLayoutEdit_xaf_l182_xaf_dviHoras_Edit_I']
		
// 14. Boton Ingresa Comentario
		@FindBy(xpath=".//*[contains(@id,'dviComentario_Edit_I')]")
		public WebElementFacade txtComentario;
		
// 15. Boton Guardar y cerrar
		@FindBy(xpath="//div[@id='Vertical_EMA_Menu_DXI1_T']//a[contains(@title,'Guardar y cerrar')][contains(text(),'Guardar y cerrar')]")
		public WebElementFacade btnGuardar_Cerrar;

// 16. Boton Cerrar Dia
		@FindBy(xpath="//a[contains(@title,'Cerrar Día')]")
		public WebElementFacade btnCerrar_Dia;

// 16. Boton Cerrar Dia
		@FindBy(xpath="//a[contains(@title,'Aceptar')]")
		public WebElementFacade btnAceptar_Fin;
		
		

		
// --------------------------     ---------------------------------------------------------------------------------------
// 1.		
		public void btnProyecto() {
			btnProyecto.click();
			try {
				   Thread.sleep(5000);
			   }catch(InterruptedException e){}
		}
		
// 2.
		public void btnCheckProyecto() {
			WebElement iFrame= getDriver().findElement(By.className("dxpc-iFrame"));
			getDriver().switchTo().frame(iFrame);
			getDriver().findElement(By.xpath("//span[contains(@id,'DXSelBtn6_D')]")).click();
			
		} 
// 3. 
		public void btnAceptar() {
			btnAceptar.click();
		}
		
// 4. 
		public void btnListHora() {
			btnListHora.click();
		}
		
// 5. 
		public void btnTipoHora() {
			btnTipoHora.click();
			getDriver().switchTo().defaultContent();
		}

// 6. 
		public void btnListServicio() {
			try {
				   Thread.sleep(3000);
			   }catch(InterruptedException e){}
			btnListServicio.click();
		}
		
// 7.

		public void txtIngresaIniServicio(String datoPrueba) {
			WebElement iFrame= getDriver().findElement(By.className("dxpc-iFrame"));
			getDriver().switchTo().frame(iFrame);
			txtIngresaIniServicio.click();
			txtIngresaIniServicio.clear();
			txtIngresaIniServicio.sendKeys(datoPrueba);
		}
		
// 8. 
		public void btnBuscar() {
			btnBuscar.click();
		}
		
// 9. 		
		public void btnCheckServicio() {
			btnCheckServicio.click();
		}

// 10. 
		public void btnAceptar2() {
			btnAceptar2.click();
			getDriver().switchTo().defaultContent();
		}
// 11. 
		public void btnListadoActividad() {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			btnListadoActividad.click();
		} 
// 12.
		public void btnActividad() {
			btnActividad.click();
		} 
// 13. 
		public void txtNumHoras(String datoPrueba) {
			txtNumHoras.click();
			txtNumHoras.clear();
			txtNumHoras.sendKeys(datoPrueba);
		}
// 14. 
		public void txtComentario(String datoPrueba) {
			txtComentario.click();
			txtComentario.clear();
			txtComentario.sendKeys(datoPrueba);
		}	
// 15. 
		public void btnGuardar_Cerrar() {
			btnGuardar_Cerrar.click();
		}
// 16. 
		public void btnCerrar_Dia() {
			btnCerrar_Dia.click();
		}
// 17. 
		public void btnAceptar_Fin() {
			WebElement iFrame= getDriver().findElement(By.className("dxpc-iFrame"));
			getDriver().switchTo().frame(iFrame);
			btnAceptar_Fin.click();
		} 

}
