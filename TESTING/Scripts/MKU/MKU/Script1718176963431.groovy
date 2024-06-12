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

WebUI.navigateToUrl('https://mkuniversity.ac.in/new/')

WebUI.click(findTestObject('Object Repository/MKU/Page_MADURAI KAMARAJ UNIVERSITY - OFFICIAL SITE/font_University'))

WebUI.click(findTestObject('Object Repository/MKU/Page_MADURAI KAMARAJ UNIVERSITY - OFFICIAL SITE/font_Administration'))

WebUI.click(findTestObject('Object Repository/MKU/Page_MADURAI KAMARAJ UNIVERSITY - OFFICIAL SITE/a_Vice-Chancellor'))

WebUI.click(findTestObject('Object Repository/MKU/Page_MADURAI KAMARAJ UNIVERSITY - OFFICIAL SITE/font_Academics'))

WebUI.click(findTestObject('Object Repository/MKU/Page_MADURAI KAMARAJ UNIVERSITY - OFFICIAL SITE/a_DDE'))

WebUI.click(findTestObject('Object Repository/MKU/Page_MADURAI KAMARAJ UNIVERSITY/div_ABOUT US                               _c379a9'))

WebUI.click(findTestObject('Object Repository/MKU/Page_MADURAI KAMARAJ UNIVERSITY/a_FEE STRUCTURE'))

WebUI.click(findTestObject('Object Repository/MKU/Page_MADURAI KAMARAJ UNIVERSITY/a_ONLINE ADMISSION'))

WebUI.switchToWindowTitle('Admissions | Admissions')

WebUI.click(findTestObject('Object Repository/MKU/Page_Admissions  Admissions/a_Home'))

WebUI.click(findTestObject('Object Repository/MKU/Page_Admissions  Admissions/span_Home_navbar-toggler-icon'))

WebUI.click(findTestObject('Object Repository/MKU/Page_Admissions  Admissions/a_Home'))

WebUI.closeBrowser()

