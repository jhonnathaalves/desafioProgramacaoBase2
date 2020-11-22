package br.com.desafiobase2.pages;

import br.com.desafiobase2.core.BasePage;

public class LoginPage extends BasePage {

    public void setUsuario(String usuario) {
        escrever("//input[@name='username']", usuario);
    }

    public void setSenha(String senha) {
        escrever("//input[@name='password']", senha);
    }

    public void entrar(){
        clicarBotaoPorTexto("Login");
    }

    public void logarComSenha(String usuario, String senha) {
        setUsuario(usuario);
        setSenha(senha);
        entrar();
    }

    public void logar() {
        logarComSenha("jhonnatha.alves", "jhonnatha251217");
    }

    public String mensagemErroLogin(){
        return recuperaMensagem("/html/body/div[2]/font");
    }
}
