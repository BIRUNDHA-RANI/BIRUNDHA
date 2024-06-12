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

WebUI.navigateToUrl('http://www.gacwnlk.org/')

WebUI.click(findTestObject('Object Repository/GACWNLK/Page_Government Arts College For Women Nilakottai/a_Academic'))

WebUI.click(findTestObject('Object Repository/GACWNLK/Page_Government Arts College For Women Nilakottai/div_UG Admission 2024-25       Click here t_5fbe98'))

WebUI.click(findTestObject('Object Repository/GACWNLK/Page_Government Arts College For Women Nilakottai/i_Contact Us_fa fa-times fa-2x'))

WebUI.click(findTestObject('Object Repository/GACWNLK/Page_Government Arts College For Women Nilakottai/a_Computer Science'))

WebUI.click(findTestObject('Object Repository/GACWNLK/Page_Department of Computer Science in GACN/a_Library'))

WebUI.click(findTestObject('Object Repository/GACWNLK/Page_Library in GACN/a_Home'))

WebUI.click(findTestObject('Object Repository/GACWNLK/Page_Government Arts College For Women Nilakottai/a_Addmission for UG'))

WebUI.click(findTestObject('Object Repository/GACWNLK/Page_Tamil nadu Govt Arts and Science Colle_40400c/span_Overview of Counselling Process'))

WebUI.click(findTestObject('Object Repository/GACWNLK/Page_Tamil nadu Govt Arts and Science Colle_40400c/span_User registration'))

WebUI.click(findTestObject('Object Repository/GACWNLK/Page_Government Arts College For Women Nilakottai/a_IQAC'))

WebUI.closeBrowser()

