package br.com.desafiobase2.tests;

import br.com.desafiobase2.core.BaseTest;
import br.com.desafiobase2.pages.HomePage;
import br.com.desafiobase2.pages.LoginPage;
import br.com.desafiobase2.pages.MyViewPage;
import org.junit.Assert;
import org.junit.Test;

public class MyViewTest extends BaseTest {
    String project = "Jhonnatha Alves´s project";
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    MyViewPage myViewPage = new MyViewPage();


    @Test
    public void clicarMyViewUnassigned(){
        loginPage.logar();
        homePage.selecionarProjetoComboBox(project);
        homePage.clicarMyView();
        myViewPage.clicarUnassigned();
        Assert.assertEquals("none",myViewPage.getTextXpath("//*[@id='handler_id_filter_target']"));

    }

    @Test
    public void clicarMyViewReportedByMe(){
        loginPage.logar();
        homePage.selecionarProjetoComboBox(project);
        homePage.clicarMyView();
        myViewPage.clicarReportedByMe();
        Assert.assertEquals("jhonnatha.alves",myViewPage.getTextXpath("//*[@id='reporter_id_filter_target']"));
    }

    @Test
    public void clicarMyViewRecentlyModified(){
        loginPage.logar();
        homePage.selecionarProjetoComboBox(project);
        homePage.clicarMyView();
        myViewPage.clicarRecentlyModified();
        Assert.assertEquals("none",myViewPage.getTextXpath("//*[@id='hide_status_filter_target']"));
    }

    @Test
    public void clicarMyViewMonitoredByMe(){
        loginPage.logar();
        homePage.selecionarProjetoComboBox(project);
        homePage.clicarMyView();
        myViewPage.clicarMonitoredByMe();
        Assert.assertEquals("jhonnatha.alves",myViewPage.getTextXpath("//*[@id='user_monitor_filter_target']"));
    }

    @Test
    public void clicarMyViewResolved(){
        loginPage.logar();
        homePage.selecionarProjetoComboBox(project);
        homePage.clicarMyView();
        myViewPage.clicarResolved();
        Assert.assertEquals("resolved", myViewPage.getTextXpath("//*[@id='show_status_filter_target']"));
    }




}
