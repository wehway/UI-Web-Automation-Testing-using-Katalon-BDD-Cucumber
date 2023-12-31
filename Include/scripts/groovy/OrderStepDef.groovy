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



class OrderStepDef {

	@Given("I want order something product")
	def I_want_order_something_product() {
		WebUI.openBrowser('')
	}

	@And("I go to the link https://alta-shop.vercel.app/")
	def I_go_to_the_link() {
		WebUI.navigateToUrl('https://alta-shop.vercel.app/')
		WebUI.click(findTestObject('Object Repository/Order/Page_frontend-web/button_AltaShop_v-btn v-btn--icon v-btn--ro_febe25'))
	}

	@And("I enter my (.*) and (.*)")
	def I_enter_my_email_password(String email, String password) {
		WebUI.setText(findTestObject('Object Repository/Order/Page_frontend-web/input_Email_input-102'), email)
		WebUI.setText(findTestObject('Object Repository/Order/Page_frontend-web/input_Password_input-105'), password)
		WebUI.click(findTestObject('Object Repository/Order/Page_frontend-web/button_Login'))
	}
	
	@When("I click beli button a product")
	def I_click_beli_button_a_product() {
		WebUI.click(findTestObject('Object Repository/Order/Page_frontend-web/button_Beli'))
		WebUI.click(findTestObject('Object Repository/Order/Page_frontend-web/button_1'))
	}

	@And("I want to set the amount that I will buy")
	def I_want_to_set_the_amount_that_I_will_buy() {
		WebUI.click(findTestObject('Object Repository/Order/Page_frontend-web/button_'))
		WebUI.click(findTestObject('Object Repository/Order/Page_frontend-web/button_'))
		WebUI.click(findTestObject('Object Repository/Order/Page_frontend-web/button_-'))
	}

	@Then("I click bayar button")
	def I_click_bayar_button() {
		WebUI.click(findTestObject('Object Repository/Order/Page_frontend-web/button_Bayar'))
		WebUI.closeBrowser()
	}
}