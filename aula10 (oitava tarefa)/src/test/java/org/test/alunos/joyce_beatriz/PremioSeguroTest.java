package org.test.alunos.joyce_beatriz;
import org.model.Cliente;
import org.model.PremioSeguro;
import org.util.DataUtils;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class PremioSeguroTest {
    PremioSeguro Premio;

    @Test
    public void teste01(){

        Cliente cliente = new Cliente();
        cliente.setNome("Robert Amadeu Andrade");
        cliente.setSexo("Feminino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Solteira");
        cliente.setDataNascimento("20/10/2000");
        cliente.setCpf("191");

        PremioSeguro ps = new PremioSeguro(cliente);
        ps.setValorSeguro(100.0);
        ps.obtemPercentualDesconto();
        ps.calculaValorComDesconto();
        double actuals = ps.getValorSeguroComDesconto();
        double esperado = 95.00;
        //assertEquals(esperado, actuals);
        assertTrue(esperado == actuals);
    }

    @Test
    public void teste02(){

        Cliente cliente = new Cliente();
        cliente.setNome("Robert Amadeu Andrade");
        cliente.setSexo("Feminino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Solteira");
        cliente.setDataNascimento("20/10/1995");
        cliente.setCpf("191");

        PremioSeguro ps = new PremioSeguro(cliente);
        ps.setValorSeguro(100.0);
        ps.obtemPercentualDesconto();
        ps.calculaValorComDesconto();
        double actuals = ps.getValorSeguroComDesconto();
        double esperado = 85.00;
        //assertEquals(esperado, actuals);
        assertTrue(esperado == actuals);
    }

    @Test
    public void teste03(){

        Cliente cliente = new Cliente();
        cliente.setNome("Robert Amadeu Andrade");
        cliente.setSexo("Feminino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Casada");
        cliente.setDataNascimento("20/10/2000");
        cliente.setCpf("191");

        PremioSeguro ps = new PremioSeguro(cliente);
        ps.setValorSeguro(100.0);
        ps.obtemPercentualDesconto();
        ps.calculaValorComDesconto();
        double actuals = ps.getValorSeguroComDesconto();
        double esperado = 90.00;
        //assertEquals(esperado, actuals);
        assertTrue(esperado == actuals);

    }

    @Test
    public void teste04(){

        Cliente cliente = new Cliente();
        cliente.setNome("Robert Amadeu Andrade");
        cliente.setSexo("Feminino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Casada");
        cliente.setDataNascimento("20/10/1995");
        cliente.setCpf("191");

        PremioSeguro ps = new PremioSeguro(cliente);
        ps.setValorSeguro(100.0);
        ps.obtemPercentualDesconto();
        ps.calculaValorComDesconto();
        double actuals = ps.getValorSeguroComDesconto();
        double esperado = 70.00;
        //assertEquals(esperado, actuals);
        assertTrue(esperado == actuals);

    }

    @Test
    public void teste05(){

        Cliente cliente = new Cliente();
        cliente.setNome("Robert Amadeu Andrade");
        cliente.setSexo("Masculino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Solteiro");
        cliente.setDataNascimento("20/10/2000");
        cliente.setCpf("191");

        PremioSeguro ps = new PremioSeguro(cliente);
        ps.setValorSeguro(100.0);
        ps.obtemPercentualDesconto();
        ps.calculaValorComDesconto();
        double actuals = ps.getValorSeguroComDesconto();
        double esperado = 100.00;
        //assertEquals(esperado, actuals);
        assertTrue(esperado == actuals);
    }

    @Test
    public void teste06(){

        Cliente cliente = new Cliente();
        cliente.setNome("Robert Amadeu Andrade");
        cliente.setSexo("Masculino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Solteiro");
        cliente.setDataNascimento("20/10/1995");
        cliente.setCpf("191");

        PremioSeguro ps = new PremioSeguro(cliente);
        ps.setValorSeguro(100.0);
        ps.obtemPercentualDesconto();
        ps.calculaValorComDesconto();
        double actuals = ps.getValorSeguroComDesconto();
        double esperado = 90.00;
        //assertEquals(esperado, actuals);
        assertTrue(esperado == actuals);

    }

    @Test
    public void teste07(){

        Cliente cliente = new Cliente();
        cliente.setNome("Robert Amadeu Andrade");
        cliente.setSexo("Masculino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Casado");
        cliente.setDataNascimento("20/10/2000");
        cliente.setCpf("191");

        PremioSeguro ps = new PremioSeguro(cliente);
        ps.setValorSeguro(100.0);
        ps.obtemPercentualDesconto();
        ps.calculaValorComDesconto();
        double actuals = ps.getValorSeguroComDesconto();
        double esperado = 95.00;
        //assertEquals(esperado, actuals);
        assertTrue(esperado == actuals);

    }

    @Test
    public void teste08(){

        Cliente cliente = new Cliente();
        cliente.setNome("Robert Amadeu Andrade");
        cliente.setSexo("Masculino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Casado");
        cliente.setDataNascimento("20/10/1995");
        cliente.setCpf("191");

        PremioSeguro ps = new PremioSeguro(cliente);
        ps.setValorSeguro(100.0);
        ps.obtemPercentualDesconto();
        ps.calculaValorComDesconto();
        double actuals = ps.getValorSeguroComDesconto();
        double esperado = 80.00;
        //assertEquals(esperado, actuals);
        assertTrue(esperado == actuals);

    }
}

//todos os casos de teste falharam por erro no assert
//apos correção, todos passaram