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



class DashboardStepDef {

	@Given("I access to https://alta-shop.vercel.app/")
	def I_access_to_the_link() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/')
		WebUI.click(findTestObject('Object Repository/Dashboard/Page_frontend-web/button_AltaShop_v-btn v-btn--icon v-btn--ro_febe25'))
	}

	@And("I enter the (.*) and (.*)")
	def I_enter_the_email_and_password(String email, String password) {
		WebUI.setText(findTestObject('Object Repository/Dashboard/Page_frontend-web/input_Email_input-102'), email)
		WebUI.setText(findTestObject('Object Repository/Dashboard/Page_frontend-web/input_Password_input-105'), password)
	}

	@And("I click the login button")
	def I_enter_the_login_button() {
		WebUI.click(findTestObject('Object Repository/Dashboard/Page_frontend-web/button_Login'))
	}

	@When("I want to buy a something product")
	def I_want_to_buy_a_something_product() {
		WebUI.click(findTestObject('Object Repository/Dashboard/Page_frontend-web/button_Beli'))
	}

	@And("I click beli button")
	def I_click_beli_button() {
		WebUI.click(findTestObject('Object Repository/Dashboard/Page_frontend-web/button_1'))
	}

	@Then("I have list of products on my chart")
	def I_have_list_of_products_on_my_chart() {
		WebUI.click(findTestObject('Object Repository/Dashboard/Page_frontend-web/button_AltaShop_v-btn v-btn--icon v-btn--ro_febe25'))
		WebUI.closeBrowser()
	}
}