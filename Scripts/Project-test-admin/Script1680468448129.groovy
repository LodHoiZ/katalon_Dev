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

WebUI.click(findTestObject('Object Repository/admin/Page_Home Page (1)/a_Login'))

WebUI.click(findTestObject('Object Repository/admin/Page_Login/a_Stuff only'))

WebUI.setText(findTestObject('Object Repository/admin/Page_Login Admin/input_Master Login_adminusersname'), 'ad1')

WebUI.setEncryptedText(findTestObject('Object Repository/admin/Page_Login Admin/input_Username_adminpassword'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/admin/Page_Login Admin/button_Log In'))

WebUI.click(findTestObject('Object Repository/admin/Page_Admin Dashboard/button_Status'))

WebUI.click(findTestObject('Object Repository/admin/Page_Admin Dashboard/a_On Cooking'))

WebUI.click(findTestObject('Object Repository/admin/Page_Admin Dashboard/button_On Cooking'))

WebUI.click(findTestObject('Object Repository/admin/Page_Admin Dashboard/a_Rider Take your order'))

WebUI.click(findTestObject('Object Repository/admin/Page_Admin Dashboard/button_Rider Take your order'))

WebUI.click(findTestObject('Object Repository/admin/Page_Admin Dashboard/a_Order Arrived'))

WebUI.click(findTestObject('Object Repository/admin/Page_Admin Dashboard/button_Order Arrived'))

WebUI.click(findTestObject('Object Repository/admin/Page_Admin Dashboard/a_On Cooking'))

WebUI.click(findTestObject('Object Repository/admin/Page_Admin Dashboard/button_Hello, John Doe'))

WebUI.click(findTestObject('Object Repository/admin/Page_Admin Dashboard/button_Sign out'))

WebUI.closeBrowser()

