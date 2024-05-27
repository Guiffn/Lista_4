package br.edu.up.controles;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.modelos.Cliente;
import br.edu.up.modelos.ClienteEmpresa;
import br.edu.up.modelos.ClientePessoa;

public class ControleDeClientes {

    private List<Cliente> clientes=new ArrayList<>();

   
    public List<ClientePessoa> gClientePessoa() {
        List<ClientePessoa> lista = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClientePessoa) {
                lista.add((ClientePessoa) cliente);
            }
        }
        return lista;
    }
    public void incluirCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    public List<ClienteEmpresa> gClienteEmpresa() {
        List<ClienteEmpresa> listaEmpresa = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente instanceof ClienteEmpresa) {
                listaEmpresa.add((ClienteEmpresa) cliente);
            }
        }
        return listaEmpresa;
    }
    public void incluirClienteEmpresa(Cliente cliente){
        this.clientes.add(cliente);
    }

    



}
