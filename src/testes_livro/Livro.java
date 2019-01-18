package testes_de_sistema;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Livro {
	 
	private WebDriver driver;
  	
    @Before
	public void abrePag(){
	driver = new ChromeDriver();
	driver.get ("http://www.submarino.com.br");
	
	WebElement campoDeTexto = driver.findElement(By.name("conteudo"));
        campoDeTexto.sendKeys("Livro");
		campoDeTexto.submit();
		 
	}
    
    
    @Test
	public void primeiroLivro (){
		driver.switchTo().defaultContent();
		driver.findElement(By.partialLinkText("Livro - Dois a Dois")).click();
		driver.close(); 
		driver.quit();
	}
	
	@Test
	public void Loja1() {
		driver.get ("http://www.americanas.com.br");
		WebElement campoDeTexto = driver.findElement(By.name("conteudo"));
    	campoDeTexto.sendKeys("9788580417012");
		campoDeTexto.submit();
		assertTrue (driver.getPageSource().contains("Livro - Dois a Dois"));
	}

	@After 
	public void encerra() { 
		driver.close(); 
		driver.quit();
	} 
			
		
}
	

	
	
 
