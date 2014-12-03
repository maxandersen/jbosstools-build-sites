package org.jboss.tools.buildsites.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ IDEPropertiesSanityTest.class, P2ReferenceSiteTest.class,
		P2RepositoryTest.class })
public class AllTests {

}
