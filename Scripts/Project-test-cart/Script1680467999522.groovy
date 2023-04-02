import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://44.214.221.150:3000/')

WebUI.click(findTestObject('Object Repository/cart/Page_Home Page/a_Login'))

WebUI.setText(findTestObject('Object Repository/cart/Page_Login/input_Sign up for free_usersname'), 'test2')

WebUI.setEncryptedText(findTestObject('Object Repository/cart/Page_Login/input_Username_password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/cart/Page_Login/button_Sign up'))

WebUI.click(findTestObject('Object Repository/cart/Page_Home Page/h2_Welcome  test2'))

WebUI.click(findTestObject('Object Repository/cart/Page_Home Page/a_Cart'))

WebUI.click(findTestObject('Object Repository/cart/Page_Home Page/button_Your Cart_btn-close'))

WebUI.click(findTestObject('Object Repository/cart/Page_Home Page/a_Get Started'))

WebUI.click(findTestObject('Object Repository/cart/Page_Document/a_Order now'))

WebUI.click(findTestObject('Object Repository/cart/Page_Menu/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/cart/Page_Menu/p_Kaw Mun Kai-Tod  45 THB'))

WebUI.click(findTestObject('Object Repository/cart/Page_Menu/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/cart/Page_Menu/p_Kaw Mun Kai-Tod  45 THB'))

WebUI.click(findTestObject('Object Repository/cart/Page_Menu/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/cart/Page_Menu/a_Cart'))

WebUI.click(findTestObject('Object Repository/cart/Page_Menu/button_Place Order'))

WebUI.click(findTestObject('Object Repository/cart/Page_Total Order/button_-'))

WebUI.click(findTestObject('Object Repository/cart/Page_Total Order/button_'))

WebUI.click(findTestObject('Object Repository/cart/Page_Total Order/li_Total (THB)                      135'))

WebUI.setText(findTestObject('Object Repository/cart/Page_Total Order/input_Address_address'), '234 home test')

WebUI.selectOptionByValue(findTestObject('Object Repository/cart/Page_Total Order/select_Choose.                            Thailand'), 
    'Thailand', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/cart/Page_Total Order/select_Choose.                            C_aa5067'), 
    'Chiang mai', true)

WebUI.setText(findTestObject('Object Repository/cart/Page_Total Order/input_Zip_zip'), '50200')

WebUI.click(findTestObject('Object Repository/cart/Page_Total Order/button_Checkout'))

WebUI.click(findTestObject('Object Repository/cart/Page_On Delivery/button_Sign out'))

WebUI.closeBrowser()

