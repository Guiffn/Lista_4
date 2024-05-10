package br.edu.up.telas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.edu.up.modelos.Comercial;
import br.edu.up.modelos.Pessoal;
import br.edu.up.modelos.Contato;
import br.edu.up.controles.ConsultarContato;
import br.edu.up.controles.ExcluirContato;
import br.edu.up.controles.ListarContatos;

public class MenuInicial {

    private Scanner scanner = new Scanner(System.in);
    private List<Contato> contatos = new ArrayList<>();

    public void mostrar() {
        int opcao;

        do {
            System.out.println(" ");
            System.out.println("----------------------------");
            System.out.println("Bem-vindo a agenda de contatos!");
            System.out.println("Escolha a opção desejada: ");
            System.out.println("1 - Incluir um contato pessoal");
            System.out.println("2 - Incluir um contato comercial");
            System.out.println("3 - Excluir um contato pelo código");
            System.out.println("4 - Consultar um contato pelo código");
            System.out.println("5 - Listar todos os contatos");
            System.out.println("6 - Sair do programa");
            System.out.println("----------------------------");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    incluirContatoPessoal();
                    break;
                case 2:
                    incluirContatoComercial();
                    break;
                case 3:
                    excluirContato();
                    break;
                case 4:
                    consultarContato();
                    break;
                case 5:
                    listarContatos();
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 6);
    }

    private void incluirContatoPessoal() {
        System.out.println("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();
        System.out.println("Digite o CPF do contato: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite o código do contato: ");
        int codigo = lerInteiro();
        Pessoal contato = new Pessoal(nome, telefone, cpf, codigo);
        contatos.add(contato);
        System.out.println("Contato pessoal registrado com sucesso!");
    }

    private void incluirContatoComercial() {
        System.out.println("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();
        System.out.println("Digite o CNPJ do contato: ");
        String cnpj = scanner.nextLine();
        System.out.println("Digite o código do contato: ");
        int codigo = lerInteiro();
        Comercial contato = new Comercial(nome, telefone, cnpj, codigo);
        contatos.add(contato);
        System.out.println("Contato comercial registrado com sucesso!");
    }

    private void excluirContato() {
        System.out.println("Digite o código do contato a excluir: ");
        int codigo = lerInteiro();
        ExcluirContato excluirContato = new ExcluirContato();
        excluirContato.excluirContato(contatos, codigo);
    }

    private void consultarContato() {
        System.out.println("Digite o código do contato a consultar: ");
        int codigo = lerInteiro();
        ConsultarContato consultarContato = new ConsultarContato();
        Contato contato = consultarContato.consultarContato(contatos, codigo);
        if (contato != null) {
            System.out.println("Contato encontrado:");
            System.out.println(contato);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    private void listarContatos() {
        ListarContatos listarContatos = new ListarContatos();
        listarContatos.listarContatos(contatos);
        pausa();
    }

    private int lerInteiro() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido.");
            }
        }
    }

    private void pausa() {
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
    }

    public static void main(String[] args) {
        MenuInicial menu = new MenuInicial();
        menu.mostrar();
    }
}
