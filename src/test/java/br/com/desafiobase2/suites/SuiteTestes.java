package br.com.desafiobase2.suites;

import br.com.desafiobase2.pages.ViewIssuesPage;
import br.com.desafiobase2.tests.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        HomeTest.class,
        LoginTest.class,
        MyViewTest.class,
        ReportIssueTest.class,
        ViewIssueTest.class
})
public class SuiteTestes {
}
