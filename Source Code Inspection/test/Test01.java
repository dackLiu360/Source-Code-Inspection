/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31437974
 */
public class Test01 {
    
    public Test01() {
    
    }
    
    @Test
    public void hello() {
    int a = 10;
    int b = 10;
    
    Assert.assertEquals(b, a);
    }
}
