/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ferry.test;

import com.mycompany.ferryadminbackend.FerryAdminManager;
import dk.cphbusiness.ferry.ManageFerriesTest;
import dk.cphbusiness.test.FerryManagerHolder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Kasper
 */
@RunWith(org.junit.runners.Suite.class)
@Suite.SuiteClasses({ManageFerriesTest.class})
public class NewTestSuite {
    

    @BeforeClass
    public static void setUpClass() throws Exception {
       FerryManagerHolder.manager = new FerryAdminManager();
        System.out.println("Manager: " + FerryManagerHolder.manager.showFerries());
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
