package Boundary;
import java.util.Scanner;

public class Avaliacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int op=9;
		
		FormularioAvaliacao formulario1 = new FormularioAvaliacao();
		
		do{
			System.out.println("Menu");
			System.out.println("1. Formulario avaliacao");
			System.out.println("2. Cadastro professor");
			System.out.println("3. Cadastro turma");
			System.out.println("4. Cadastro aluno");
			System.out.println("5. Cadastro disciplina");
			System.out.println("6. Cadastro Oferta Disciplina");
			System.out.println("7. Ver alocacoes das Disciplina");
			System.out.println("0. Sair");
			System.out.println("Op��o: ");
			op = in.nextInt();
			if (op==1){
				formulario1.formularioAvaliacao();
			}else if(op==2){
				formulario1.cadastroProfessor();
			}else if(op==3){
				formulario1.cadastroTurma();
			}else if(op==4){				
				formulario1.cadastroAluno();
			}else if(op==5){
				formulario1.cadastroDisciplina();
			}else if(op==6){
				formulario1.cadastroOfertaDisciplina();			
			}else if(op==7){
				formulario1.verAlocacoes();
			}						
			
		}while (op!=0);
	}

}
