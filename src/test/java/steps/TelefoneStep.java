package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.E;
import pages.TelefonePage;
import pages.BasePage;

import static org.junit.Assert.assertEquals;

public class TelefoneStep {

    TelefonePage telefonePage = new TelefonePage();
    BasePage basePage = new BasePage();

    @Dado("que estou no app Telefone")
    public void que_estou_no_app_telefone(){
        telefonePage.acessaAbaRecentes();
        assertEquals("Telefone", telefonePage.validaTelefoneApp());
        System.out.println("Estou no app Telefone");
    }
    @E("acesso a aba Contatos")
    public void acesso_a_aba_contatos(){
        telefonePage.acessaAbaContatos();
    }
    @Quando("acesso a tela Salvar contatos")
    public void acesso_a_tela_salvar_contatos(){
        telefonePage.acessaAdicionarContato();

    }
    @E("seleciono a opcao Telefone")
    public void seleciono_a_opcao_telefone(){
        basePage.fecharTeclado();
    }
    @E("insiro o Nome")
    public void insiro_o_nome(){
        telefonePage.expandeNome();
        telefonePage.preencherCampoNome("TestNome");
    }
    @E("insiro o Sobrenome")
    public void insiro_o_sobrenome(){
        telefonePage.preencherCampoSobrenome("TestSobrenome");
        telefonePage.expandeNome();
    }
    @E("insiro o Telefone")
    public void insiro_o_telefone(){
        telefonePage.selecionaCampoTelefone();
        basePage.fecharTeclado();
        telefonePage.preencheCampoTelefone("11999112222");
    }
    @E("insiro o E-mail")
    public void insiro_o_email(){
        telefonePage.selecionaCampoEmail();
        basePage.fecharTeclado();
        telefonePage.preencheCampoEmail("telefone@test.com.br");

    }
    @E("salvo o contato com as informacoes inseridas")
    public void salvo_o_contato_com_as_informacoes_inseridas(){
        telefonePage.salvarContato();

    }
    @Entao("valido que o contato foi criado com sucesso")
    public void valido_que_o_contato_foi_criado_com_sucesso(){
        assertEquals("TestNome TestSobrenome", telefonePage.validaNomeContato());
        assertEquals("11 99911-2222", telefonePage.validaTelefoneContato());
        assertEquals("telefone@test.com.br", telefonePage.validaEmailContato());
    }
}
