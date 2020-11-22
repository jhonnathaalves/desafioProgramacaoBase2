package br.com.desafiobase2.tests;

import br.com.desafiobase2.core.BaseTest;
import br.com.desafiobase2.pages.HomePage;
import br.com.desafiobase2.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class HomeTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test
    public void homeRealizarLogout(){
        loginPage.logar();
        homePage.clicarLogout();
        Assert.assertEquals("Login", loginPage.getFormTitle());
    }


    @Test
    public void homeValidaClickMyAccount(){
        loginPage.logar();
        homePage.clicarMyAccount();
        Assert.assertEquals("Edit Account", homePage.getFormTitle());

    }

    @Test
    public void homeValidaClickReportIssue(){
        loginPage.logar();
        homePage.clicarReportIssues();
        Assert.assertEquals("Select Project", homePage.getFormTitle());
    }

}
