package br.com.desafiobase2.pages;

import br.com.desafiobase2.core.BasePage;
import org.openqa.selenium.By;

import static br.com.desafiobase2.core.DriverFactory.getDriver;

public class HomePage extends BasePage {
    public String confirmaLoginUsuario() {
        return getDriver().findElement(By.xpath("//td[@class='login-info-left']/span[@class='italic']")).getText();
    }
    public void clicarMyView(){
        clicarView("my_view_page.php");
    }
    public void clicarViewIssues(){
        clicarView("view_all_bug_page.php");
    }
    public void clicarReportIssues(){
        clicarView("bug_report_page.php");
    }


    public void clicarMyAccount(){

        clicarView("account_page.php");

    }
    public void clicarLogout(){

        clicarView("logout_page.php");

    }

    public void selecionarProjetoComboBox(String name){
        selecionarItemComboBox("project_id", name);
    }
}
