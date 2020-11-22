package br.com.desafiobase2.pages;

import br.com.desafiobase2.core.BasePage;


public class ReportIssuePage extends BasePage {

    public void selecionarProjetoComboBox(String valor){
        selecionarItemComboBox("project_id",valor);
    }

    public void clicarBotaoSelectProject(){
        clicarBotaoPorTexto("Select Project");
    }

    public void selecionarCategoria(String valor){
        selecionarItemComboBox("category_id",valor);
    }

    public void selecionarReproducibility(String valor){
        selecionarItemComboBox("reproducibility",valor);
    }

    public void  selecionarSeverity(String valor){
        selecionarItemComboBox("severity",valor);
    }

    public void  selecionarPriority(String valor){
        selecionarItemComboBox("priority",valor);
    }

    public void selecionarSelectProfile(String valor){
        selecionarItemComboBox("profile_id",valor);
    }

    public void escreverSummary(String valor){
        escrever("//td/input[@name='summary']",valor);
    }
    public void escreverDescription(String valor){
        escrever("//td/textarea[@name='description']",valor);
    }

    public String mensagemErroIssue(){
        return recuperaMensagem("//td/p[@style=\"color:red\"]");
    }

    public void selecionarProjeto(String valor){
        selecionarProjetoComboBox(valor);
        clicarBotaoSelectProject();
    }

    public void cadastrarIssue(String categoria, String reproducibility,
                               String severity, String priority, String profile,
                               String summary, String description){
        selecionarCategoria(categoria);
        selecionarReproducibility(reproducibility);
        selecionarSeverity(severity);
        selecionarPriority(priority);
        selecionarSelectProfile(profile);
        escreverSummary(summary);
        escreverDescription(description);
        clicarBotaoPorTexto("Submit Report");

    }






}
