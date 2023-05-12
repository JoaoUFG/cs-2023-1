package org.test.alunos.joyce_beatriz;

import org.model.*;
import org.util.*;
import org.excecoes.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class ClienteTest {

    Cliente cliente;
    @Before
    public void setup(){
        cliente = new Cliente();
    }
    //Data 
    @Test(expected = DataInvalidaException.class)
    public void testaDataInvalida(){
        cliente.setDataNascimento("31/02/2000");
    }
    //verificar cpf 
    @Test(expected = CpfInvalidoException.class)
    public void testaCpfInvalido(){
        //cliente.setCpf(CpfValidator.isCPF("00119780109"));
        cliente.setCpf("00119780109");
    }

    // estado civil
    @Test(expected = EstadoCivilInvalidoException.class)
    public void testaEstadoCivilInvalido(){
        //cliente.setEstadoCivil(EstadoCivilValidator.isCPF("solteiro"));
        cliente.setEstadoCivil("solteiro");
    }

    // sexo

    @Test(expected = SexoInvalidoException.class)
    public void testaSexoInvalido(){
        //cliente.setSexo(SexoValidator.isCPF("feminino"));
        cliente.setSexo("feminino");
    }

    //Nacionalidade
    @Test(expected = NacionalidadeInvalidaException.class)
    public void testaNacionalidadeInvalida(){
        //cliente.setNacionalidade(EstadoCivilValidator.validaEstadoCivil("solteiro"));
        cliente.setNacionalidade("solteiro");
    }

     //passaporte
     @Test(expected = PassaporteInvalidoException.class)
     public void testaPassaporteInvalido(){
        //cliente.setPassaporte(PassaporteValidator.validaPassaporte("solteiro"));
         cliente.setPassaporte("solteiro");
     }
    

}

//erros em relação à atribuição de valores aos atributos do cliente, com a chamada às classes de validação.
//um caso de teste com falha