package br.com.desafiobase2.pages;

import br.com.desafiobase2.core.BasePage;

public class MyViewPage extends BasePage {

    public void clicarUnassigned(){
        clicarLink("Unassigned");
    }

    public void clicarReportedByMe(){
        clicarLink("Reported by Me");
    }

    public void clicarRecentlyModified(){
        clicarLink("Recently Modified");
    }

    public void clicarMonitoredByMe(){
        clicarLink("Monitored by Me");
    }

    public void clicarResolved(){
        clicarLink("Resolved");
    }

}
