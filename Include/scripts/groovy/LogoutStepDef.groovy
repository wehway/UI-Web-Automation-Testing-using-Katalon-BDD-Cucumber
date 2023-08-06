import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LogoutStepDef {

	@Given("I enter the link https://alta-shop.vercel.app/")
	def I_enter_the_link() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/')
		WebUI.click(findTestObject('Object Repository/Logout/Page_frontend-web/button_AltaShop_v-btn v-btn--icon v-btn--ro_febe25'))
	}

	@When("I input my (.*) and my (.*)")
	def I_input_my_email_and_my_password(String email, String password) {
		WebUI.setText(findTestObject('Object Repository/Logout/Page_frontend-web/input_Email_input-102'), 'wahyu@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Logout/Page_frontend-web/input_Password_input-105'), 'Password123')
	}
	
	@And("I tap the login button")
	def I_tap_the_login_button() {
		WebUI.click(findTestObject('Object Repository/Logout/Page_frontend-web/button_Login'))
	}
	
	@And("I want to change account")
	def I_want_to_change_account() {
		WebUI.click(findTestObject('Object Repository/Logout/Page_frontend-web/button_AltaShop_v-btn v-btn--icon v-btn--ro_febe25'))
		WebUI.click(findTestObject('Object Repository/Logout/Page_frontend-web/div_Logout'))
	}

	@Then("I success logout")
	def I_success_logout() {
		WebUI.click(findTestObject('Object Repository/Logout/Page_frontend-web/input_Email_input-275'))
		WebUI.closeBrowser()
	}
}