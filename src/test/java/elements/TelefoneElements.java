package elements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pages.BasePage;

public class TelefoneElements extends BasePage {

    @AndroidFindBy(id = "calllog_tab_button")
    protected MobileElement btAbaRecentes;

    @AndroidFindBy(id = "collapsing_appbar_extended_title")
    protected MobileElement txtTelefoneApp;

    @AndroidFindBy(id = "contactlist_tab_button")
    protected MobileElement btAbaContatos;

    @AndroidFindBy(id = "menu_create_contact")
    protected MobileElement btAdicionarContato;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.samsung.android.app.contacts:id/arrowButton']")
    protected MobileElement expandeCampoNome;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.samsung.android.app.contacts:id/firstEdit']")
    protected MobileElement campoEditarPrimeiroNome;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.samsung.android.app.contacts:id/lastEdit']")
    protected MobileElement campoEditarSobrenome;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.samsung.android.app.contacts:id/titleText']")
    protected MobileElement campoTelefone;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Telefone']")
    protected MobileElement editCampoTelefone;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='E-mail']")
    protected MobileElement campoEmail;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='E-mail']")
    protected MobileElement editCampoEmail;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.samsung.android.app.contacts:id/menu_done']")
    protected MobileElement btSalvarContato;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.samsung.android.app.contacts:id/header']")
    protected MobileElement txtHeaderContato;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.samsung.android.app.contacts:id/display_number']")
    protected MobileElement txtTelefoneContato;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.samsung.android.app.contacts:id/text']")
    protected MobileElement txtEmailContato;
}
