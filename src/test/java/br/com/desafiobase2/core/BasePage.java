package br.com.desafiobase2.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.ArrayList;

import static br.com.desafiobase2.core.DriverFactory.getDriver;

public class BasePage {
    public void escrever(String xpath, String texto) {
        getDriver().findElement(By.xpath(xpath)).clear();
        getDriver().findElement(By.xpath(xpath)).sendKeys(texto);
    }

    public void clicarBotaoPorTexto(String texto) {
        getDriver().findElement(By.xpath("//input[@value='"+texto+"']")).click();
    }

    public void clicarView(String view){
        getDriver().findElement(By.xpath("//a[@href='/"+ view + "']")).click();
    }

    public String getFormTitle(){
        return getDriver().findElement(By.className("form-title")).getText();
    }

    public String getTextXpath(String xpath){ return getDriver().findElement(By.xpath(xpath)).getText();}

    public void selecionarItemComboBox(String nameXpath, String valor){
        WebElement element = getDriver().findElement(By.xpath("//select[@name='"+nameXpath+"']"));
        Select combo = new Select(element);
        combo.selectByVisibleText(valor);
    }

    public String recuperaMensagem(String xpath){
        return getDriver().findElement(By.xpath(xpath)).getText();
    }

    public void clicarLink(String texto){
        getDriver().findElement(By.linkText(texto)).click();
    }

    public void clicarLinkImg(String xpath){
        getDriver().findElement(By.xpath(xpath)).click();
    }

    public Boolean verficarArquivoDiretorio(String path){
        return new File(path).isFile();

    }

    public void altenarPagina(){
        ArrayList<String> tabs = new ArrayList<String> (getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));
    }

}
