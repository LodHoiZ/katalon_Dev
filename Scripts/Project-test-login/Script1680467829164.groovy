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

WebUI.click(findTestObject('Object Repository/admin/Page_Home Page/a_Login'))

WebUI.click(findTestObject('Object Repository/login/Page_Login/input_Sign up for free_usersname'))

WebUI.click(findTestObject('Object Repository/login/Page_Login/a_Register'))

WebUI.setText(findTestObject('Object Repository/login/Page_Register/input_Your Name_name'), 'Ratchaporn')

WebUI.setText(findTestObject('Object Repository/login/Page_Register/input_Email address_email'), 'hrk321@gmail.com')

WebUI.setText(findTestObject('Object Repository/login/Page_Register/input_Username_usersname'), 'test2')

WebUI.setEncryptedText(findTestObject('Object Repository/login/Page_Register/input_Password_password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/login/Page_Register/button_Submit'))

WebUI.setText(findTestObject('Object Repository/login/Page_Login/input_Sign up for free_usersname'), 'test2')

WebUI.setEncryptedText(findTestObject('Object Repository/login/Page_Login/input_Username_password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/login/Page_Login/button_Sign up'))

WebUI.click(findTestObject('Object Repository/admin/Page_Home Page/h2_Welcome  test2'))

WebUI.click(findTestObject('Object Repository/admin/Page_Home Page/button_Sign out'))

WebUI.closeBrowser()

