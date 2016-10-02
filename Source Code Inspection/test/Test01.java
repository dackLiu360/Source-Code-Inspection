/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.calebe.ticketmachine.core.PapelMoeda;
import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.core.Troco;
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
            ticket.inserir(20);
    Assert.assertEquals(20, ticket.getSaldo());
        } catch (PapelMoedaInvalidaException ex) {
            Logger.getLogger(Test01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    @Test
    public void inicializacaoTest() {
        PapelMoeda papelMoeda = new PapelMoeda(50, 3);
        Assert.assertEquals(3, papelMoeda.getQuantidade());
        Assert.assertEquals(50, papelMoeda.getValor());
    }

    
 
    
    @Test
    public void verificarTrocoTest(){
        Troco troco = new Troco(23);
        PapelMoeda[] atual = troco.getPapeisMoeda();
        Assert.assertEquals(troco.getPapeisMoeda(), atual);
    }

        
}
