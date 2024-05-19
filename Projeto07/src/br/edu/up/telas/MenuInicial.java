    package br.edu.up.telas;
    import java.util.Arrays;
    import java.util.Scanner;

import br.edu.up.controles.ControleDeAluno;
import br.edu.up.controles.ControleDeDisciplina;
import br.edu.up.controles.ControleDeProfessor;
import br.edu.up.modelos.Aluno;
import br.edu.up.modelos.Disiciplina;
import br.edu.up.modelos.Professor;

    public class MenuInicial {
    Scanner leitor= new Scanner(System.in);
    private ControleDeDisciplina controleDeDisciplina;
    private ControleDeAluno controleDeAluno;
    private ControleDeProfessor controleDeProfessor;

        public MenuInicial(){
        controleDeDisciplina=new ControleDeDisciplina(10);
        controleDeAluno=new ControleDeAluno(10);
        controleDeProfessor=new ControleDeProfessor(10);


        }
        
        public void mostrar() {
            int opcao;
            do {
                System.out.println("\n----------------");
                System.out.println("  MENU PEDIDOS");
                System.out.println("----------------");
                System.out.println("Digite a opção desejada:");
                System.out.println("1. Incluir Disciplina");
                System.out.println("2. Listar Disciplina");
                System.out.println("3. Incluir Aluno");
                System.out.println("4. Listar Alunos");
                System.out.println("5. Incluir Professor");
                System.out.println("6. Listar Professores");
                System.out.println("7. Calcular Competências de Aluno");
                System.out.println("8. Sair");
                opcao = leitor.nextInt();
                leitor.nextLine(); // Consumir a quebra de linha após nextInt()
    
                switch (opcao) {
                    case 1:
                        incluirDisciplina();
                        break;
                    case 2:
                        listarDisciplina();
                        break;
                    case 3:
                        incluirAluno();
                        break;
                    case 4:
                        listarAlunos();
                        break;
                    case 5:
                        incluirProfessor();
                        break;
                    case 6:
                        listarProfessores();
                        break;
                    case 7:
                        calculoCompetencias();
                        break;
                    case 8:
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 8);
        }
    

        public void incluirDisciplina(){
            System.out.println("Digite o nome da disciplina: ");
            String nome = leitor.nextLine();
        
            System.out.println("Digite o número de identificação: ");
            int identificacao = leitor.nextInt();
            leitor.nextLine(); // Consumir a nova linha deixada pelo nextInt
        
            System.out.println("Digite o título do currículo: ");
            String curriculo = leitor.nextLine();
        
            System.out.println("Digite a quantidade de competências: ");
            int quantComp = leitor.nextInt();
            leitor.nextLine(); 
        
            String[] CompNecessaria = new String[quantComp];
            String[] CompComplementar = new String[quantComp];
        
            for(int i = 0; i < quantComp; i++) {
                System.out.println("Digite competência necessária: ");
                CompNecessaria[i] = leitor.nextLine();
                System.out.println("Digite as competências complementares: ");
                CompComplementar[i] = leitor.nextLine();
            }
        
            Disiciplina disiciplina = new Disiciplina(nome, curriculo, identificacao, quantComp, CompNecessaria, CompComplementar);
            controleDeDisciplina.adicionarDisiciplinas(disiciplina);
        }
        public void listarDisciplina() {
            Disiciplina[] disiciplinas = controleDeDisciplina.getDisiciplinas();
            if (disiciplinas != null && disiciplinas.length > 0) {
                System.out.println("Listagem de disciplinas");
                for (Disiciplina disiciplina : disiciplinas) {
                    if (disiciplina != null) {
                        System.out.println("Disciplina: " + disiciplina.getNome());
                        System.out.println("Numero de identificação: " + disiciplina.getIdentificação());
                        System.out.println("Curriculo: " + disiciplina.getCurriculo());
                        for (String CompNecessaria : disiciplina.getCompNecessaria()) {
                            System.out.println("-" + CompNecessaria);
                        }
                        for (String CompComplementar : disiciplina.getCompComplementar()) {
                            System.out.println("-" + CompComplementar);
                        }
                    }
                }
            } else {
                System.out.println("Não há disciplinas cadastradas");
            }
        }
        public void incluirProfessor() {
        System.out.println("Digite o RG do professor:");
        Double rg = leitor.nextDouble();
        leitor.nextLine(); // Consumir a quebra de linha

        System.out.println("Digite o nome do professor:");
        String nome = leitor.nextLine();

        System.out.println("Digite a matrícula do professor:");
        String matricula = leitor.nextLine();

        System.out.println("Digite a identificação do currículo:");
        int curriIdentificacao = leitor.nextInt();
        leitor.nextLine(); // Consumir a quebra de linha

        System.out.println("Digite o nome da instituição:");
        String nomeInstituicao = leitor.nextLine();

        System.out.println("Digite o ano de conclusão:");
        int anoConclusao = leitor.nextInt();
        leitor.nextLine(); // Consumir a quebra de linha

        System.out.println("Digite o nome do título:");
        String nomeTitulo = leitor.nextLine();

        System.out.println("Digite o título de conclusão:");
        String tituloConclusao = leitor.nextLine();

        Professor professor = new Professor(rg, nome, matricula, curriIdentificacao, nomeInstituicao, anoConclusao, nomeTitulo, tituloConclusao);
        controleDeProfessor.adicionarProfessores(professor);
        System.out.println("Professor cadastrado com sucesso!");
    }
    public void listarProfessores() {
        Professor[] professores = controleDeProfessor.getProfessores();
        if (professores.length > 0) {
            System.out.println("Listagem de Professores:");
            for (Professor professor : professores) {
                System.out.println("Nome: " + professor.getNome());
                System.out.println("RG: " + professor.getRg());
                System.out.println("Matrícula: " + professor.getMatricula());
                System.out.println("Identificação do currículo: " + professor.getCurriIdentificação());
                System.out.println("Nome da Instituição: " + professor.getNomeInstitição());
                System.out.println("Ano de Conclusão: " + professor.getAnoConclu());
                System.out.println("Nome do Título: " + professor.getNomeTitulo());
                System.out.println("Título de Conclusão: " + professor.getTituloConclu());
                System.out.println();
            }
        } else {
            System.out.println("Nenhum professor cadastrado.");
        }
    }
    public void incluirAluno() {
        System.out.println("Digite o RG do aluno:");
        Double rg = leitor.nextDouble();
        leitor.nextLine(); // Consumir a quebra de linha

        System.out.println("Digite o nome do aluno:");
        String nome = leitor.nextLine();

        System.out.println("Digite a matrícula do aluno:");
        String matricula = leitor.nextLine();

        System.out.println("Digite o ano de ingresso do aluno:");
        int anoIngresso = leitor.nextInt();
        leitor.nextLine(); // Consumir a quebra de linha

        System.out.println("Digite o nome do curso do aluno:");
        String nomeCurso = leitor.nextLine();

        System.out.println("Digite o turno do aluno:");
        String turno = leitor.nextLine();

        Aluno aluno = new Aluno(rg, nome, matricula, anoIngresso, nomeCurso, turno);
        controleDeAluno.adicionarAlunos(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }
    public void listarAlunos() {
        Aluno[] alunos = controleDeAluno.getAlunos();
        if (alunos.length > 0) {
            System.out.println("Listagem de Alunos:");
            for (Aluno aluno : alunos) {
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("RG: " + aluno.getRg());
                System.out.println("Matrícula: " + aluno.getMatricula());
                System.out.println("Ano de Ingresso: " + aluno.getAnoingresso());
                System.out.println("Nome do Curso: " + aluno.getNomeCurso());
                System.out.println("Turno: " + aluno.getTurno());
                System.out.println();
            }
        } else {
            System.out.println("Nenhum aluno cadastrado.");
        }
    }
    public void calculoCompetencias() {
        System.out.println("Digite o nome do aluno:");
        String nomeAluno = leitor.nextLine();
        Aluno aluno = controleDeAluno.buscarAluno(nomeAluno);
    
        if (aluno != null) {
            Disiciplina disciplina = obterDisciplinaDoAluno();
            if (disciplina != null) {
                String[] competenciasNecessarias = disciplina.getCompNecessaria();
                String[] competenciasComplementares = disciplina.getCompComplementar();
    
                System.out.println("Digite as competências do aluno (separadas por vírgula):");
                String entradaCompetenciasAluno = leitor.nextLine();
                String[] competenciasAluno = entradaCompetenciasAluno.split(",");
    
                double percentualNecessarias = calcularPercentualDeAtingidas(competenciasAluno, competenciasNecessarias);
                double percentualComplementares = calcularPercentualDeAtingidas(competenciasAluno, competenciasComplementares);
    
                if (percentualNecessarias == 100 && percentualComplementares >= 50) {
                    System.out.println("Aluno " + aluno.getNome() + " está aprovado!");
                } else if (percentualNecessarias < 50 || percentualComplementares < 50) {
                    System.out.println("Aluno " + aluno.getNome() + " está reprovado!");
                } else {
                    System.out.println("Aluno " + aluno.getNome() + " está pendente.");
                }
            } else {
                System.out.println("Disciplina não encontrada.");
            }
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
    private Disiciplina obterDisciplinaDoAluno() {
        System.out.println("Digite o nome da disciplina:");
        String nomeDisciplina = leitor.nextLine();
        Disiciplina[] disciplinas = controleDeDisciplina.getDisiciplinas();
    
        for (Disiciplina disciplina : disciplinas) {
            if (disciplina != null && disciplina.getNome().equalsIgnoreCase(nomeDisciplina)) {
                return disciplina;
            }
        }
    
        return null;
    }
    private double calcularPercentualDeAtingidas(String[] competenciasAluno, String[] competenciasCurso) {
        int totalNecessarias = competenciasCurso.length;
        int totalAtingidas = 0;
    
        for (String competenciaCurso : competenciasCurso) {
            if (Arrays.asList(competenciasAluno).contains(competenciaCurso)) {
                totalAtingidas++;
            }
        }
    
        return (totalAtingidas * 100.0) / totalNecessarias;
    }
}

    
