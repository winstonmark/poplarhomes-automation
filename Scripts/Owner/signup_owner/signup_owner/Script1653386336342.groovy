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

WebUI.openBrowser(GlobalVariable.STAGING_URL, FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

if (WebUI.waitForElementVisible(findTestObject('staging/landing_page/a_Signup'), 5, FailureHandling.STOP_ON_FAILURE)) {
    WebUI.click(findTestObject('staging/landing_page/a_Signup'), FailureHandling.STOP_ON_FAILURE)
}

if (WebUI.waitForElementVisible(findTestObject('staging/signup_page/a_owner-signup'), 5, FailureHandling.STOP_ON_FAILURE)) {
    WebUI.click(findTestObject('staging/signup_page/a_owner-signup'), FailureHandling.STOP_ON_FAILURE)
}

if (WebUI.waitForElementVisible(findTestObject('staging/owner_signup_page/input__email'), 5, FailureHandling.STOP_ON_FAILURE)) {
    WebUI.setText(findTestObject('staging/owner_signup_page/input__email'), GlobalVariable.test_owner_signup10)

    WebUI.setText(findTestObject('staging/owner_signup_page/input__firstName'), 'Test')

    WebUI.setText(findTestObject('staging/owner_signup_page/input__lastName'), 'Owner Katalon')

    WebUI.setEncryptedText(findTestObject('staging/owner_signup_page/input__password'), 'L2RytoUJxWN6547N/AXOdw==')

    WebUI.setText(findTestObject('staging/owner_signup_page/input__phone'), '5551231232')

    WebUI.click(findTestObject('staging/owner_signup_page/button_Create Account'))
}

if (WebUI.waitForElementPresent(findTestObject('staging/owner_signup_add_new_property/input_address'), 10, FailureHandling.STOP_ON_FAILURE)) {
    if (WebUI.waitForElementVisible(findTestObject('staging/owner_signup_add_new_property/input_address'), 10, FailureHandling.STOP_ON_FAILURE)) {
        
		WebUI.setText(findTestObject('staging/owner_signup_add_new_property/input_address'), '1', FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('staging/owner_signup_add_new_property/p_property-address1'), FailureHandling.STOP_ON_FAILURE)

        WebUI.selectOptionByIndex(findTestObject('staging/owner_signup_add_new_property/select_property-type'), 4)

        WebUI.setText(findTestObject('staging/owner_signup_add_new_property/input_totalArea'), '500')

        WebUI.setText(findTestObject('staging/owner_signup_add_new_property/input_beds'), '1')

        WebUI.setText(findTestObject('staging/owner_signup_add_new_property/input_baths'), '1')

        WebUI.click(findTestObject('staging/owner_signup_add_new_property/button_Next'))
    }
}

if (WebUI.waitForElementPresent(findTestObject('staging/owner_signup_add_new_property2/input_price'), 10, FailureHandling.STOP_ON_FAILURE)) {
    if (WebUI.waitForElementVisible(findTestObject('staging/owner_signup_add_new_property2/input_price'), 10, FailureHandling.STOP_ON_FAILURE)) {
        
		WebUI.setText(findTestObject('staging/owner_signup_add_new_property2/input_price'), '123', FailureHandling.STOP_ON_FAILURE)

        WebUI.selectOptionByIndex(findTestObject('staging/owner_signup_add_new_property2/select_lease-length'), 3, FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('staging/owner_signup_add_new_property2/button_Yes'), FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('staging/owner_signup_add_new_property2/button_submit'), FailureHandling.STOP_ON_FAILURE)
    }
}

