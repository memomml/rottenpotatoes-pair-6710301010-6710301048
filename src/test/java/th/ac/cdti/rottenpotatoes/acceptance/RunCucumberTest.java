package th.ac.cdti.rottenpotatoes.acceptance;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

/** Runs Cucumber acceptance scenarios on the JUnit Platform. */
@Suite
@IncludeEngines("cucumber")
@SelectPackages("features")
public class RunCucumberTest {
}
