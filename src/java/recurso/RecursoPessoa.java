/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recurso;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import model.Pessoa;

/**
 * REST Web Service
 *
 * @author caioc
 */
@Path("rest")
public class RecursoPessoa {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RecursoPessoa
     */
    public RecursoPessoa() {}

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getImc(Pessoa pessoa) {
        double imc;
        imc = pessoa.getPeso()/(pessoa.getAltura() * pessoa.getAltura());
        return String.valueOf(imc);
    }

    
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    public void setPessoa(Pessoa pessoa) {
        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Peso: "+pessoa.getPeso());
        System.out.println("Altura: "+pessoa.getAltura());
    }
}
