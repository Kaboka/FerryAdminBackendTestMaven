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
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kasper
 */
public class NewEmptyJUnitTest extends ManageFerriesTest {

    @Override
    @Before
    public void setUp() {
              FerryManagerHolder.manager = new FerryAdminManager();
              super.setUp();
    }
  
   
}
