package Aplicacao;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno aluno = null;
        AlunoMonitoria monitoria = null;
        AlunoIniciacaoCientifica iniciacao = null;
        int opcao;
        
        do {
            System.out.println("==== Menu Alunos ====");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Aluno Monitoria");
            System.out.println("3 - Cadastrar Aluno Iniciação Científica");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            
            opcao = teclado.nextInt();
            teclado.nextLine(); 
            
            try {
                switch (opcao) {
                    case 1:
                        System.out.println("====Cadastro Aluno Regular====");
                        System.out.print("Nome: ");
                        aluno.setNome(teclado.nextLine());
                        
                        System.out.print("Matrícula: ");
                        aluno.setMatricula(teclado.nextInt());
                        
                        System.out.print("Período: ");
                        aluno.setPeriodo(teclado.nextInt());
                        break;
                        
                    case 2:
                        System.out.println("====Cadastro Aluno Monitoria====");
                        System.out.print("Nome: ");
                        monitoria.setNome(teclado.nextLine());
                        
                        System.out.print("Matrícula: ");
                        monitoria.setMatricula(teclado.nextInt());
                        
                        System.out.print("Período: ");
                        monitoria.setPeriodo(teclado.nextInt());
                        teclado.nextLine();
                        
                        System.out.print("Área: ");
                        monitoria.setArea(teclado.nextLine());
                        
                        System.out.print("Valor Bolsa: ");
                        monitoria.setValor(teclado.nextDouble());
                        teclado.nextLine();
                        
                        System.out.print("Disciplina: ");
                        monitoria.setDisciplina(teclado.nextLine());
                        
                        break;
                        
                    case 3:
                        System.out.println("====Cadastro Iniciação Científica====");
                        System.out.print("Nome: ");
                        iniciacao.setNome(teclado.nextLine());
                        
                        System.out.print("Matrícula: ");
                        iniciacao.setMatricula(teclado.nextInt());
                        
                        System.out.print("Período: ");
                        iniciacao.setPeriodo(teclado.nextInt());
                        teclado.nextLine();
                        
                        System.out.print("Área: ");
                        iniciacao.setArea(teclado.nextLine());
                        
                        System.out.print("Valor Bolsa: ");
                        iniciacao.setValor(teclado.nextDouble());
                        teclado.nextLine();
                        
                        System.out.print("Projeto: ");
                        iniciacao.setNomeProjeto(teclado.nextLine());
                        
                        break;
                        
                    case 4:
                        System.out.println("Saindo...");
                        break;
                        
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (ExcecaoDadoInvalido e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro inesperado!");
                teclado.nextLine();
            }
        } while (opcao != 4);
        
        teclado.close();
    }
}