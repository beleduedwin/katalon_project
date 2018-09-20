import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/TestSuitComplet')

suiteProperties.put('name', 'TestSuitComplet')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\ib\\Katalon Studio\\katalon_project\\Reports\\TestSuitComplet\\20180920_160306\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/TestSuitComplet', suiteProperties, [new TestCaseBinding('Test Cases/TestComplet - Iteration 1', 'Test Cases/TestComplet',  [ 'demo_usn' : 'admin' , 'demo_pwd' : 'adc123' ,  ]), new TestCaseBinding('Test Cases/TestComplet - Iteration 2', 'Test Cases/TestComplet',  [ 'demo_usn' : 'John Doe' , 'demo_pwd' : 'ThisIsNotAPassword' ,  ]), new TestCaseBinding('Test Cases/TestComplet - Iteration 3', 'Test Cases/TestComplet',  [ 'demo_usn' : 'tester' , 'demo_pwd' : 'qwerty' ,  ])])
