package br.com.desafiobase2.pages;

import br.com.desafiobase2.core.BasePage;

public class ViewIssuesPage extends BasePage {

    public void printReports(){
        clicarLink("Print Reports");
    }

    public void csvExport(){
        clicarLink("CSV Export");
    }

    public void excelExport(){
        clicarLink("Excel Export");
    }

    public void pesquisarSearch(String valor){
        escrever("//*[@id='filters_form_open']/table/tbody/tr/td[1]/input[@name=\"search\"]",valor);
        clicarBotaoPorTexto("Apply Filter");

    }

    public String pegarValorId(String xpath){
        return recuperaMensagem(xpath);
    }

    public void clicarIssue(String texto){
        clicarLink(texto);
    }

    public void printInWord(){
        clicarLinkImg("//table/tbody/tr/td/a/img[@src='https://mantis-prova.base2.com.br/images/fileicons/doc.gif']");
    }

    public void printInHtml(){
        clicarLinkImg("//table/tbody/tr/td/a/img[@src='https://mantis-prova.base2.com.br/images/ie.gif']");
    }



}
