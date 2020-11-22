package br.com.desafiobase2.tests;

import br.com.desafiobase2.core.BaseTest;
import br.com.desafiobase2.pages.HomePage;
import br.com.desafiobase2.pages.LoginPage;
import br.com.desafiobase2.pages.ReportIssuePage;
import org.junit.Assert;
import org.junit.Test;

public class ReportIssueTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ReportIssuePage reportIssuePage = new ReportIssuePage();
    String project = "Jhonnatha Alves´s project";

    @Test
    public void ReportIssueEscolherProjeto(){
        loginPage.logar();
        homePage.clicarReportIssues();
        reportIssuePage.selecionarProjetoComboBox(project);
        reportIssuePage.clicarBotaoSelectProject();
        Assert.assertEquals("Enter Report Details", homePage.getFormTitle());

    }

    @Test
    public void reportarIssue(){
         loginPage.logar();
         homePage.clicarReportIssues();
         reportIssuePage.selecionarProjeto(project);
         reportIssuePage.cadastrarIssue(
                 "[All Projects] Teste",
                 "always",
                 "trivial",
                 "urgent",
                 "PC Windows XP",
                 "Teste Jhonnatha",
                 "Teste Jhonnatha para validar a tela Report Issue");
        //Assert.assertEquals("A necessary field \"Category\" was empty. Please recheck your inputs.",reportIssuePage.mensagemErroIssue());


    }

    @Test
    public void reportIssueSemCategoria(){
        loginPage.logar();
        homePage.clicarReportIssues();
        reportIssuePage.selecionarProjeto(project);
        reportIssuePage.cadastrarIssue(
                "(select)",
                "random",
                "trivial",
                "urgent",
                "",
                "Teste Jhonnatha",
                "Teste Jhonnatha para validar a tela Report Issue sem o parametro Categoria");
        Assert.assertEquals("A necessary field \"Category\" was empty. Please recheck your inputs.",reportIssuePage.mensagemErroIssue());

    }

    @Test
    public void ReportIssueSemSummary(){
        loginPage.logar();
        homePage.clicarReportIssues();
        reportIssuePage.selecionarProjeto(project);
        reportIssuePage.cadastrarIssue(
                "[All Projects] Teste",
                "random",
                "trivial",
                "urgent",
                "",
                "",
                "Teste Jhonnatha para validar a tela Report Issue sem o parametro Categoria");
        Assert.assertEquals("A necessary field \"Summary\" was empty. Please recheck your inputs.",reportIssuePage.mensagemErroIssue());

    }

    @Test
    public void ReportIssueSemDescription(){
        loginPage.logar();
        homePage.clicarReportIssues();
        reportIssuePage.selecionarProjeto(project);
        reportIssuePage.cadastrarIssue(
                "[All Projects] Teste",
                "random",
                "trivial",
                "urgent",
                "",
                "Teste Jhonnatha",
                "");
        Assert.assertEquals("A necessary field \"Description\" was empty. Please recheck your inputs.",reportIssuePage.mensagemErroIssue());

    }


}
