/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        TicketMachine ticket = new TicketMachine();
        try {
            double resultado;
            ticket.inserir(20);
    Assert.assertEquals(20, ticket.getSaldo());
        } catch (PapelMoedaInvalidaException ex) {
            Logger.getLogger(Test01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
