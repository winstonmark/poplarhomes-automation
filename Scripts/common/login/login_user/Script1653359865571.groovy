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

WebUI.openBrowser(GlobalVariable.STAGING_URL)

WebUI.maximizeWindow()

if (WebUI.waitForElementClickable(findTestObject('staging/landing_page/a_Login'), 5)) {
    WebUI.click(findTestObject('staging/landing_page/a_Login'), FailureHandling.STOP_ON_FAILURE)
}
if (WebUI.waitForElementVisible(findTestObject('staging/login_page/input_email'), 5, FailureHandling.STOP_ON_FAILURE)) {
	WebUI.setText(findTestObject('staging/login_page/input_email'), GlobalVariable.test_owner1, FailureHandling.STOP_ON_FAILURE)
    WebUI.setText(findTestObject('staging/login_page/input_password'), GlobalVariable.common_pw1, FailureHandling.STOP_ON_FAILURE)
    WebUI.click(findTestObject('staging/login_page/button_login'), FailureHandling.STOP_ON_FAILURE)
}