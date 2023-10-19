package pages;

import elements.TelefoneElements;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import static configuration.DriverFactory.getDriver;

public class TelefonePage extends TelefoneElements {

    public TelefonePage(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

    public String validaTelefoneApp(){
        return getText(txtTelefoneApp);
    }
    public String validaNomeContato(){
        return getText(txtHeaderContato);
    }
    public String validaTelefoneContato(){
        return getText(txtTelefoneContato);
    }
    public String validaEmailContato(){
        return getText(txtEmailContato);
    }

    /*                  Ações                                       */
    public void acessaAbaRecentes(){
        btAbaRecentes.click();
    }
    public void acessaAbaContatos(){
        btAbaContatos.click();
    }
    public void acessaAdicionarContato(){
        btAdicionarContato.click();
    }
    public void expandeNome(){
        expandeCampoNome.click();
    }
    public void preencherCampoNome(String Nome){
        campoEditarPrimeiroNome.sendKeys(Nome);
    }
    public void preencherCampoSobrenome(String Sobrenome){
        campoEditarSobrenome.sendKeys(Sobrenome);
    }
    public void selecionaCampoTelefone(){
        campoTelefone.click();
    }
    public void preencheCampoTelefone(String Telefone){
        editCampoTelefone.sendKeys(Telefone);
    }
    public void selecionaCampoEmail(){
        campoEmail.click();
    }
    public void preencheCampoEmail(String Email){
        editCampoEmail.sendKeys(Email);
    }
    public void salvarContato(){
        btSalvarContato.click();
    }

}
