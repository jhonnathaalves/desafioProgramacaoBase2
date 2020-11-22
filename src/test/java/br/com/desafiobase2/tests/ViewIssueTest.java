package br.com.desafiobase2.tests;

import br.com.desafiobase2.core.BaseTest;
import br.com.desafiobase2.pages.HomePage;
import br.com.desafiobase2.pages.LoginPage;
import br.com.desafiobase2.pages.ViewIssuesPage;
import org.junit.Assert;
import org.junit.Test;

public class ViewIssueTest extends BaseTest {
    String diretorio = "C:\\Users\\Latitude\\Downloads\\";
    String allProject = "jhonnatha.alves";
    String project = "Jhonnatha Alves´s project";
    String fileProject = "Jhonnatha_Alves´s_project";
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ViewIssuesPage viewIssue = new ViewIssuesPage();

    @Test
    public void viewIssueValidarSearch(){
        loginPage.logar();
        homePage.clicarViewIssues();
        viewIssue.pesquisarSearch("0005378");
        Assert.assertEquals("0005378",viewIssue.pegarValorId("//td/a[@href='/view.php?id=5378']"));

    }

    @Test
    public void viewIssueDetalhes(){
        loginPage.logar();
        homePage.clicarViewIssues();
        viewIssue.pesquisarSearch("0005378");
        viewIssue.clicarIssue("0005378");
        Assert.assertEquals("View Issue Details [ Jump to Notes ]",viewIssue.getFormTitle());

    }

    @Test
    public void viewIssueValidarPrintReportsDocAllBugs() throws InterruptedException {
        loginPage.logar();
        homePage.clicarViewIssues();
        viewIssue.printReports();
        viewIssue.printInWord();
        Thread.sleep(5000);
        Assert.assertTrue(viewIssue.verficarArquivoDiretorio(diretorio + allProject + ".doc"));
    }

    @Test
    public void viewIssueValidarPrintReportsDocMyBugs() throws InterruptedException {
        loginPage.logar();
        homePage.clicarViewIssues();
        homePage.selecionarProjetoComboBox(project);
        viewIssue.printReports();
        viewIssue.printInWord();
        Thread.sleep(5000);
        Assert.assertTrue(viewIssue.verficarArquivoDiretorio(diretorio + project + ".doc"));
    }

    @Test
    public void viewIssueValidarPrintReportHtmlAllBugs(){
        loginPage.logar();
        homePage.clicarViewIssues();
        viewIssue.printReports();
        viewIssue.printInHtml();
        viewIssue.altenarPagina();
        Assert.assertEquals("View Issue Details", viewIssue.getTextXpath("/html/body/table[1]/tbody/tr[1]/td"));

    }

    @Test
    public void viewIssueValidarPrintReportHtmlMyBugs(){
        loginPage.logar();
        homePage.clicarViewIssues();
        homePage.selecionarProjetoComboBox(project);
        viewIssue.printReports();
        viewIssue.printInHtml();
        viewIssue.altenarPagina();
        Assert.assertEquals("View Issue Details", viewIssue.getTextXpath("/html/body/table[1]/tbody/tr[1]/td"));

    }
    @Test
    public void viewIssueValidarExportCSVAllBugs() throws InterruptedException {
        loginPage.logar();
        homePage.clicarViewIssues();
        viewIssue.csvExport();
        Thread.sleep(5000);
        Assert.assertTrue(viewIssue.verficarArquivoDiretorio(diretorio + allProject + ".csv"));

    }

    @Test
    public void viewIssueValidarExportCSVMyBugs() throws InterruptedException {
        loginPage.logar();
        homePage.clicarViewIssues();
        homePage.selecionarProjetoComboBox(project);
        viewIssue.csvExport();
        Thread.sleep(5000);
        Assert.assertTrue(viewIssue.verficarArquivoDiretorio(diretorio + fileProject + ".csv"));

    }

    @Test
    public void viewIssueValidarExportExcelAllBugs() throws InterruptedException {
        loginPage.logar();
        homePage.clicarViewIssues();
        viewIssue.excelExport();
        Thread.sleep(5000);
        Assert.assertTrue(viewIssue.verficarArquivoDiretorio(diretorio + allProject + ".xml"));

    }

    @Test
    public void viewIssueValidarExportExcelMyBugs() throws InterruptedException {
        loginPage.logar();
        homePage.clicarViewIssues();
        homePage.selecionarProjetoComboBox(project);
        viewIssue.excelExport();
        Thread.sleep(5000);
        Assert.assertTrue(viewIssue.verficarArquivoDiretorio(diretorio + fileProject + ".xml"));

    }



}
