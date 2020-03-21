package milkway.tzz;

import org.testng.annotations.Test;

import utils.Log;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Log4jTest {
  @Test
  public void f() {
	  Log.info("测试执行中");
  }
  @BeforeMethod
  public void beforeMethod() {
	  Log.info("测试开始");
  }

  @AfterMethod
  public void afterMethod() {
	  Log.info("测试结束");
  }

}
