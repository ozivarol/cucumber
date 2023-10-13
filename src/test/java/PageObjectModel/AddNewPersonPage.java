package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddNewPersonPage extends BaseClass{
    WebDriver driver;
    public AddNewPersonPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    public void getUrl(){
        driver.get("https://hrmtest.vitelco.com.tr/Login?ReturnUrl=%2F");
    }
    @FindBy(id="Username")
    private WebElement usernameTextArea;
    public void typeUsername(String username){
        sendKeyFunc(usernameTextArea,username);
    }
    @FindBy(id="Password")
    private WebElement passwordTextArea;
    public void typePassword(String password){
        sendKeyFunc(passwordTextArea,password);
    }
    @FindBy(css = "html > body > div > div > div:nth-of-type(2) > div > div:nth-of-type(2) > form > div:nth-of-type(4) > div > button")
    private WebElement sendButton;
    public void clickOnSendButton(){
        clickFunc(sendButton);
    }
    @FindBy(css = "html > body > div > aside > div > div:nth-of-type(4) > div > div > nav > ul > li:nth-of-type(2) > a > p")
    private WebElement sendHrefButton;
    public void clickOnHrefButton(){
        clickFunc(sendHrefButton);
    }
    @FindBy(css="html > body > div > aside > div > div:nth-of-type(4) > div > div > nav > ul > li:nth-of-type(2) > ul > li > a > p")
    private WebElement sendCandidateButton;
    public void clickCandidate(){
        clickFunc(sendCandidateButton);
    }
    @FindBy(id="CustomerId")
    private WebElement selectCustomerName;
    public void selectCustomer(){
        selectElementFromDropdown(selectCustomerName,"THY");
    }
    @FindBy(id="PositionId")
    private WebElement selectPositionElement;
    public void selectPosition(){
        selectElementFromDropdown(selectPositionElement,"Project Manager (THY Project)");
    }
    @FindBy(id="OwnerId")
    private WebElement selectHrElement;
    public void selectHr(){
        selectElementFromDropdown(selectHrElement,"BİRGÜL ENDAM AÇANGÜL");

    }
    @FindBy(id="DateRange")
    private WebElement clickDateButton;
    public void clickDate(){
        clickFunc(clickDateButton);
    }
    @FindBy(id="DateRange")
    private WebElement selectDate;
    public void selectDateTime(){
        sendKeyFunc(selectDate,"02/04/2022 - 02/10/2022");
        clickDate();
    }
    @FindBy(xpath = "/html/body/div[3]/div[4]/button[2]")
    private WebElement clickApplyButton;
    public void setClickApplyButton(){
        clickFunc(clickApplyButton);
    }
    @FindBy(id="Telephone")
    private WebElement phoneTextArea;
    public void typePhone(String number){
        sendKeyFunc(phoneTextArea,number);
    }
    @FindBy(id = "Email")
    private WebElement emailTextArea;
    public void typeEmail(String email) throws Throwable{
        sendKeyFunc(emailTextArea,email);

    }
    @FindBy(id="Name")
    private WebElement nameTextArea;
    public void typeName(String name){

        sendKeyFunc(nameTextArea,name);

    }
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[3]/form/section/div/div/div/div/div/div[2]/div[1]/div/input")
    private WebElement clickName;
    public void setClickName(){
        clickFunc(clickName);
    }
    @FindBy(id="Family")
    private WebElement surnameTextArea;
    public void typeSurname(String surname){
        sendKeyFunc(surnameTextArea,surname);
    }
    @FindBy(id="Status")
    private WebElement selectStatusElement;
    public void selectStatus(){
        selectElementFromDropdown(selectStatusElement,"Uygun Aday");
    }
    @FindBy(id="CVSource")
    private WebElement selectCvElement;
    public void selectCv(){
        selectElementFromDropdown(selectCvElement,"LinkedIn");
    }
    @FindBy(id="Note")
    private WebElement noteTextArea;
    public void typeNote(String note){
        sendKeyFunc(noteTextArea,note);

    }
    @FindBy(xpath = "//*[@id=\"frmInsert\"]/section/div/div/div/div/div/div[3]/div[2]/div/label[1]")
    private WebElement clickLanguageButton;
    public void clickLanguage(){
        clickFunc(clickLanguageButton);
    }
    @FindBy(id="Email")
    private WebElement clickEmail;
    public void clickEmail(){
        clickFunc(clickEmail);
    }


}
