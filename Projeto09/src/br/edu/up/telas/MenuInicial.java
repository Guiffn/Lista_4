package br.edu.up.telas;

import java.util.List;
import java.util.Scanner;
import br.edu.up.controles.ControleDeClientes;
import br.edu.up.modelos.Cidade;
import br.edu.up.modelos.ClienteEmpresa;
import br.edu.up.modelos.ClientePessoa;


public class MenuInicial {
Scanner leitor=new Scanner(System.in);
ControleDeClientes controleDeClientes=new ControleDeClientes();


public void mostrar(){

    int opcao;
            do {
                System.out.println("\n----------------");
                System.out.println("  MENU PEDIDOS");
                System.out.println("----------------");
                System.out.println("Digite a opção desejada:");
                System.out.println("1. Incluir Pessoa");
                System.out.println("2. Listar  Pessoa");
                System.out.println("3. Incluir Empresa");
                System.out.println("4. Listar  Empresa");
                System.out.println("5. Emprestar Pessoa");
                System.out.println("6. Emprestar Empresa");
                System.out.println("7. Calcular Competências de Aluno");
                System.out.println("8. Sair");
                opcao = leitor.nextInt();
                leitor.nextLine(); // Consumir a quebra de linha após nextInt()
    
                switch (opcao) {
                    case 1:adicionarPessoa();
                      
                        break;
                    case 2:
                    List<ClientePessoa> clientePessoas=controleDeClientes.gClientePessoa();
                           System.out.println("");
                           System.out.println("LISTAR PESSOA");
                           for(ClientePessoa clientePessoa:clientePessoas){
                            System.out.println(""+clientePessoa);
                           }System.out.println("");


                      
                        break;
                    case 3:adicionarEmpresa();
                      
                        break;
                    case 4:List<ClienteEmpresa>clienteEmpresas=controleDeClientes.gClienteEmpresa();
                           System.out.println("");
                           System.out.println("LISTAR PESSOA");
                           for(ClienteEmpresa clienteEmpresa:clienteEmpresas){
                            System.out.println(""+clienteEmpresa);
                           }System.out.println("");

                        break;
                    case 5:emprestarParaPessoa();
                        
                        break;
                    case 6:emprestarParaEmpresa();
                       
                        break;
                    case 7:devolverParaPessoa();
                        
                        break;
                    case 8:devolverParaEmpresa();
                        
                        break;
                        case 9:System.out.println("Programa encerrado");
                        
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 9);
        }

        public void adicionarPessoa(){
            System.out.println("Digite o nome");
            String nome=leitor.nextLine();
            System.out.println("Digite o telefone");
            String telefone=leitor.nextLine();
            System.out.println("Digite o email");
            String email=leitor.nextLine();
            System.out.println("Digite cpf: ");
            String cpf=leitor.nextLine();
            System.out.println("Digite a peso");
            String peso=leitor.nextLine();
            System.out.println("Digite altura");
            String altura=leitor.nextLine();
            //Endereço
            System.out.println("Rua: ");
            String rua=leitor.nextLine();
            System.out.println("Numero: ");
            String numero=leitor.nextLine();
            System.out.println("Bairro: ");
            String bairro=leitor.nextLine();
            System.out.println("Cep:");
            String cep=leitor.nextLine();
            //cidade
            System.out.println("Nome da cidade");
            String nomeCidade=leitor.nextLine();
            System.out.println("Digite UF");
            String uf=leitor.nextLine();
            Cidade cidadeEndereco=new Cidade(rua, numero, bairro, cep, null, nomeCidade, uf);
            
            ClientePessoa clientePessoa = new ClientePessoa(nome, telefone, email, 0, 0, cidadeEndereco, cpf, peso, altura);
            controleDeClientes.incluirCliente(clientePessoa);
        }
        public void adicionarEmpresa(){
            System.out.println("Digite o nome");
            String nome=leitor.nextLine();
            System.out.println("Digite o telefone");
            String telefone=leitor.nextLine();
            System.out.println("Digite o email");
            String email=leitor.nextLine();
            System.out.println("Digite cnpj: ");
            String cnpj=leitor.nextLine();
            System.out.println("Digite a Incrição Estadual");
            String inscEstadual =leitor.nextLine();
            System.out.println("Digite o ano de fundação");
            int anoFundacao=leitor.nextInt();
             //Endereço
             System.out.println("Rua: ");
             String rua=leitor.nextLine();
             System.out.println("Numero: ");
             String numero=leitor.nextLine();
             System.out.println("Bairro: ");
             String bairro=leitor.nextLine();
             System.out.println("Cep:");
             String cep=leitor.nextLine();
             //cidade
             System.out.println("Nome da cidade");
             String nomeCidade=leitor.nextLine();
             System.out.println("Digite UF");
             String uf=leitor.nextLine();

             Cidade cidadeEndereco=new Cidade(rua, numero, bairro, cep, null, nomeCidade, uf);
             ClienteEmpresa clienteEmpresa=new ClienteEmpresa(nome, telefone, email, 0, 0, cidadeEndereco, cnpj, inscEstadual, anoFundacao);
            controleDeClientes.incluirClienteEmpresa(clienteEmpresa);

        }
        public void emprestarParaPessoa() {
            System.out.println("Digite o nome da pessoa:");
            String nome = leitor.nextLine();
            ClientePessoa clientePessoa = findClientePessoa(nome);
            if (clientePessoa != null) {
                System.out.println("Digite o valor do empréstimo:");
                double valor = leitor.nextDouble();
                clientePessoa.emprestar(valor);
            } else {
                System.out.println("Pessoa não encontrada.");
            }
        }
        public void emprestarParaEmpresa() {
            System.out.println("Digite o nome da empresa:");
            String nome = leitor.nextLine();
            ClienteEmpresa clienteEmpresa = findClienteEmpresa(nome);
            if (clienteEmpresa != null) {
                System.out.println("Digite o valor do empréstimo:");
                double valor = leitor.nextDouble();
                clienteEmpresa.emprestar(valor);
            } else {
                System.out.println("Empresa não encontrada.");
            }
        }


        private ClientePessoa findClientePessoa(String nome) {
            for (ClientePessoa cliente : controleDeClientes.gClientePessoa()) {
                if (cliente.getNome().equals(nome)) {
                    return cliente;
                }
            }
            return null;
        }
    
        private ClienteEmpresa findClienteEmpresa(String nome) {
            for (ClienteEmpresa cliente : controleDeClientes.gClienteEmpresa()) {
                if (cliente.getNome().equals(nome)) {
                    return cliente;
                }
            }
            return null;
        }
        public void devolverParaPessoa() {
            System.out.println("Digite o nome da pessoa:");
            String nome = leitor.nextLine();
            ClientePessoa clientePessoa = findClientePessoa(nome);
            if (clientePessoa != null) {
                System.out.println("Digite o valor da devolução:");
                double valor = leitor.nextDouble();
                clientePessoa.devolver(valor);
            } else {
                System.out.println("Pessoa não encontrada.");
            }
        }
        public void devolverParaEmpresa() {
            System.out.println("Digite o nome da empresa:");
            String nome = leitor.nextLine();
            ClienteEmpresa clienteEmpresa = findClienteEmpresa(nome);
            if (clienteEmpresa != null) {
                System.out.println("Digite o valor da devolução:");
                double valor = leitor.nextDouble();
                clienteEmpresa.devolver(valor);
            } else {
                System.out.println("Empresa não encontrada.");
            }
        }


 }
