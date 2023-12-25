package constants;

public class ConstantPath {
	
	private final static String SRC_MAIN_RESORUCES = ".//src/main/resources";
	private final static String SRC_TEST_RESORUCES = ".//src/test/resources";
	
	public final static String DEV_ENV_FILEPATH = SRC_MAIN_RESORUCES + "/config/dev-env.properties";
	public final static String QA_ENV_FILEPATH = SRC_MAIN_RESORUCES + "/config/qa-env.properties";
	public final static String CHROME_DRIVER_KEY = "webdriver.chrome.driver";
	public final static String CHROME_DRIVER_VALUE = SRC_TEST_RESORUCES + "/chromeDriver/chromedriver.exe";
	public final static int WAIT = 30;
	public final static int FAST_WAIT = 5;
	
	public final static String LOGIN_WORKBOOK_PATH = SRC_TEST_RESORUCES + "/testData/LoginData.xlsx";
}
