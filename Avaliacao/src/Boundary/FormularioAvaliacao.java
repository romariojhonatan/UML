package Boundary;
import java.util.Scanner;

import Control.ControlAvaliacao;

public class FormularioAvaliacao {
	ControlAvaliacao controlAvaliacao;
	Scanner in;
	public FormularioAvaliacao(){
		controlAvaliacao = new ControlAvaliacao();
		in= new Scanner(System.in);
	}
	public void formularioAvaliacao() {
		int op, opAluno1, opAluno2;
		System.out.println("== Lista de oferta de disciplinas == ");
		System.out.println("1) Oferta1: ");
		controlAvaliacao.ofertaDisciplina1.VerOfertaDisciplina();
		System.out.println("2) Oferta2: ");
		controlAvaliacao.ofertaDisciplina2.VerOfertaDisciplina();
		System.out.println("3) Oferta3: ");
		controlAvaliacao.ofertaDisciplina3.VerOfertaDisciplina();
		System.out.println("4) Oferta4: ");
		controlAvaliacao.ofertaDisciplina4.VerOfertaDisciplina();
		
		System.out.println("Escolha a oferta para casdatrar alunos: ");
		op = in.nextInt();
		if (op==1){
			System.out.println("Para oferta 1: ");
			controlAvaliacao.verAlunosCadastrados();
			opAluno1 = in.nextInt();
			opAluno2 = in.nextInt();
			if (opAluno1==1){
				controlAvaliacao.ofertaDisciplina1.setAluno1(controlAvaliacao.aluno1);
			}
			else if (opAluno1==2){
				controlAvaliacao.ofertaDisciplina1.setAluno1(controlAvaliacao.aluno2);
			}
			else if (opAluno1==3){
				controlAvaliacao.ofertaDisciplina1.setAluno1(controlAvaliacao.aluno3);
			}			
			else if (opAluno1==4){
				controlAvaliacao.ofertaDisciplina1.setAluno1(controlAvaliacao.aluno4);
			}
			//====================
			if (opAluno2==1){
				controlAvaliacao.ofertaDisciplina1.setAluno2(controlAvaliacao.aluno1);
			}
			else if (opAluno2==2){
				controlAvaliacao.ofertaDisciplina1.setAluno2(controlAvaliacao.aluno2);
			}
			else if (opAluno2==3){
				controlAvaliacao.ofertaDisciplina1.setAluno2(controlAvaliacao.aluno3);
			}			
			else if (opAluno2==4){
				controlAvaliacao.ofertaDisciplina1.setAluno2(controlAvaliacao.aluno4);
			}
		}
		else if (op==2){
			System.out.println("Para oferta 1: ");
			controlAvaliacao.verAlunosCadastrados();
			opAluno1 = in.nextInt();
			opAluno2 = in.nextInt();
			if (opAluno1==1){
				controlAvaliacao.ofertaDisciplina2.setAluno1(controlAvaliacao.aluno1);
			}
			else if (opAluno1==2){
				controlAvaliacao.ofertaDisciplina2.setAluno1(controlAvaliacao.aluno2);
			}
			else if (opAluno1==3){
				controlAvaliacao.ofertaDisciplina2.setAluno1(controlAvaliacao.aluno3);
			}			
			else if (opAluno1==4){
				controlAvaliacao.ofertaDisciplina2.setAluno1(controlAvaliacao.aluno4);
			}
			//====================
			if (opAluno2==1){
				controlAvaliacao.ofertaDisciplina2.setAluno2(controlAvaliacao.aluno1);
			}
			else if (opAluno2==2){
				controlAvaliacao.ofertaDisciplina2.setAluno2(controlAvaliacao.aluno2);
			}
			else if (opAluno2==3){
				controlAvaliacao.ofertaDisciplina2.setAluno2(controlAvaliacao.aluno3);
			}			
			else if (opAluno2==4){
				controlAvaliacao.ofertaDisciplina2.setAluno2(controlAvaliacao.aluno4);
			}
		}		
		else if (op==3){
			System.out.println("Para oferta 1: ");
			controlAvaliacao.verAlunosCadastrados();
			opAluno1 = in.nextInt();
			opAluno2 = in.nextInt();
			if (opAluno1==1){
				controlAvaliacao.ofertaDisciplina3.setAluno1(controlAvaliacao.aluno1);
			}
			else if (opAluno1==2){
				controlAvaliacao.ofertaDisciplina3.setAluno1(controlAvaliacao.aluno2);
			}
			else if (opAluno1==3){
				controlAvaliacao.ofertaDisciplina3.setAluno1(controlAvaliacao.aluno3);
			}			
			else if (opAluno1==4){
				controlAvaliacao.ofertaDisciplina3.setAluno1(controlAvaliacao.aluno4);
			}
			//====================
			if (opAluno2==1){
				controlAvaliacao.ofertaDisciplina3.setAluno2(controlAvaliacao.aluno1);
			}
			else if (opAluno2==2){
				controlAvaliacao.ofertaDisciplina3.setAluno2(controlAvaliacao.aluno2);
			}
			else if (opAluno2==3){
				controlAvaliacao.ofertaDisciplina3.setAluno2(controlAvaliacao.aluno3);
			}			
			else if (opAluno2==4){
				controlAvaliacao.ofertaDisciplina3.setAluno2(controlAvaliacao.aluno4);
			}
		}
		else if (op==4){
			System.out.println("Para oferta 1: ");
			controlAvaliacao.verAlunosCadastrados();
			opAluno1 = in.nextInt();
			opAluno2 = in.nextInt();
			if (opAluno1==1){
				controlAvaliacao.ofertaDisciplina4.setAluno1(controlAvaliacao.aluno1);
			}
			else if (opAluno1==2){
				controlAvaliacao.ofertaDisciplina4.setAluno1(controlAvaliacao.aluno2);
			}
			else if (opAluno1==3){
				controlAvaliacao.ofertaDisciplina4.setAluno1(controlAvaliacao.aluno3);
			}			
			else if (opAluno1==4){
				controlAvaliacao.ofertaDisciplina4.setAluno1(controlAvaliacao.aluno4);
			}
			//====================
			if (opAluno2==1){
				controlAvaliacao.ofertaDisciplina4.setAluno2(controlAvaliacao.aluno1);
			}
			else if (opAluno2==2){
				controlAvaliacao.ofertaDisciplina4.setAluno2(controlAvaliacao.aluno2);
			}
			else if (opAluno2==3){
				controlAvaliacao.ofertaDisciplina4.setAluno2(controlAvaliacao.aluno3);
			}			
			else if (opAluno2==4){
				controlAvaliacao.ofertaDisciplina4.setAluno2(controlAvaliacao.aluno4);
			}
		}
	}
	public void cadastroProfessor() {
		System.out.println("Professor 1 Digite CPF: ");
		controlAvaliacao.professor1.setCpf(in.next());
		System.out.println("Professor1 Digite Nome: ");
		controlAvaliacao.professor1.setNome(in.next());
		System.out.println("Professor 2 Digite CPF: ");
		controlAvaliacao.professor2.setCpf(in.next());
		System.out.println("Professor2 Digite Nome: ");
		controlAvaliacao.professor2.setNome(in.next());		
	}

	public void cadastroTurma() {
		System.out.println("Digite Codigo turma1: ");
		controlAvaliacao.turma1.setCodigo_turma(in.next());
		System.out.println("Digite Nome turma1: ");	
		controlAvaliacao.turma1.setNome_turma(in.next());
		System.out.println("Digite Codigo turma2: ");
		controlAvaliacao.turma2.setCodigo_turma(in.next());
		System.out.println("Digite Nome turma2: ");	
		controlAvaliacao.turma2.setNome_turma(in.next());		
	}

	public void cadastroAluno() {
		System.out.println("Aluno 1 - Digite Matricula: ");
		controlAvaliacao.aluno1.setMatricula(in.next());
		System.out.println("Aluno 1 - Digite Nome: ");
		controlAvaliacao.aluno1.setNome(in.next());
		
		System.out.println("Aluno 2 - Digite Matricula: ");
		controlAvaliacao.aluno2.setMatricula(in.next());
		System.out.println("Aluno 2 - Digite Nome: ");
		controlAvaliacao.aluno2.setNome(in.next());
		
		System.out.println("Aluno 3 - Digite Matricula: ");
		controlAvaliacao.aluno3.setMatricula(in.next());
		System.out.println("Aluno 4 - Digite Nome: ");
		controlAvaliacao.aluno3.setNome(in.next());
		
		System.out.println("Aluno 4 - Digite Matricula: ");
		controlAvaliacao.aluno4.setMatricula(in.next());
		System.out.println("Aluno 4 - Digite Nome: ");
		controlAvaliacao.aluno4.setNome(in.next());		
	}

	public void cadastroDisciplina() {
		System.out.println("Disciplina 1 - Digite Codigo: ");
		controlAvaliacao.disciplina1.setCodigo(in.next());
		System.out.println("Disciplina 1 - Digite Disciplina: ");	
		controlAvaliacao.disciplina1.setNome(in.next());
		System.out.println("Disciplina 2 - Digite Codigo: ");
		controlAvaliacao.disciplina2.setCodigo(in.next());
		System.out.println("Disciplina 2 - Digite Disciplina: ");	
		controlAvaliacao.disciplina2.setNome(in.next());		
	}

	public void cadastroOfertaDisciplina() {
		int op;
		//Parte de escolha dos professores
		System.out.println("=== 1ra oferta de disciplina ===");
		System.out.println("Escolha o professor: ");
		System.out.println("1)- Professor 1");
		System.out.println("2)- Professor 2");
		op = in.nextInt();		
		if (op==1){
			controlAvaliacao.ofertaDisciplina1.setProfessor(controlAvaliacao.professor1);
		}else if (op==2){
			controlAvaliacao.ofertaDisciplina1.setProfessor(controlAvaliacao.professor2);
		}
		//Parte de escolha das disciplinas
		System.out.println("Escolha a disciplina: ");
		System.out.println("1)- Disciplina 1");
		System.out.println("2)- Disciplina 2");
		op = in.nextInt();		
		if (op==1){
			controlAvaliacao.ofertaDisciplina1.setDisciplina(controlAvaliacao.disciplina1);
		}else if (op==2){
			controlAvaliacao.ofertaDisciplina1.setDisciplina(controlAvaliacao.disciplina2);
		}
		//Parte de escolha das turmas
		System.out.println("Escolha a turma : ");
		System.out.println("1)- Turma 1");
		System.out.println("2)- turma 2");
		op = in.nextInt();		
		if (op==1){
			controlAvaliacao.ofertaDisciplina1.setTurma(controlAvaliacao.turma1);
		}else if (op==2){
			controlAvaliacao.ofertaDisciplina1.setTurma(controlAvaliacao.turma2);
		}	
		//----------------------------------------------------------
		//-----------------------------------------------------------
		
		//Parte de escolha dos professores
		System.out.println("=== 2ra oferta de disciplina ===");
		System.out.println("Escolha o professor: ");
		System.out.println("1)- Professor 1");
		System.out.println("2)- Professor 2");
		op = in.nextInt();		
		if (op==1){
			controlAvaliacao.ofertaDisciplina2.setProfessor(controlAvaliacao.professor1);
		}else if (op==2){
			controlAvaliacao.ofertaDisciplina2.setProfessor(controlAvaliacao.professor2);
		}
		//Parte de escolha das disciplinas
		System.out.println("Escolha a disciplina: ");
		System.out.println("1)- Disciplina 1");
		System.out.println("2)- Disciplina 2");
		op = in.nextInt();		
		if (op==1){
			controlAvaliacao.ofertaDisciplina2.setDisciplina(controlAvaliacao.disciplina1);
		}else if (op==2){
			controlAvaliacao.ofertaDisciplina2.setDisciplina(controlAvaliacao.disciplina2);
		}
		//Parte de escolha das turmas
		System.out.println("Escolha a turma : ");
		System.out.println("1)- Turma 1");
		System.out.println("2)- turma 2");
		op = in.nextInt();		
		if (op==1){
			controlAvaliacao.ofertaDisciplina2.setTurma(controlAvaliacao.turma1);
		}else if (op==2){
			controlAvaliacao.ofertaDisciplina2.setTurma(controlAvaliacao.turma2);
		}			
		
		//----------------------------------------------------------
		//-----------------------------------------------------------
		
		//Parte de escolha dos professores
		System.out.println("=== 3ra oferta de disciplina ===");
		System.out.println("Escolha o professor: ");
		System.out.println("1)- Professor 1");
		System.out.println("2)- Professor 2");
		op = in.nextInt();		
		if (op==1){
			controlAvaliacao.ofertaDisciplina3.setProfessor(controlAvaliacao.professor1);
		}else if (op==2){
			controlAvaliacao.ofertaDisciplina3.setProfessor(controlAvaliacao.professor2);
		}
		//Parte de escolha das disciplinas
		System.out.println("Escolha a disciplina: ");
		System.out.println("1)- Disciplina 1");
		System.out.println("2)- Disciplina 2");
		op = in.nextInt();		
		if (op==1){
			controlAvaliacao.ofertaDisciplina3.setDisciplina(controlAvaliacao.disciplina1);
		}else if (op==2){
			controlAvaliacao.ofertaDisciplina3.setDisciplina(controlAvaliacao.disciplina2);
		}
		//Parte de escolha das turmas
		System.out.println("Escolha a turma : ");
		System.out.println("1)- Turma 1");
		System.out.println("2)- turma 2");
		op = in.nextInt();		
		if (op==1){
			controlAvaliacao.ofertaDisciplina3.setTurma(controlAvaliacao.turma1);
		}else if (op==2){
			controlAvaliacao.ofertaDisciplina3.setTurma(controlAvaliacao.turma2);
		}			

		//----------------------------------------------------------
		//-----------------------------------------------------------
		
		//Parte de escolha dos professores
		System.out.println("=== 4ra oferta de disciplina ===");
		System.out.println("Escolha o professor: ");
		System.out.println("1)- Professor 1");
		System.out.println("2)- Professor 2");
		op = in.nextInt();		
		if (op==1){
			controlAvaliacao.ofertaDisciplina4.setProfessor(controlAvaliacao.professor1);
		}else if (op==2){
			controlAvaliacao.ofertaDisciplina4.setProfessor(controlAvaliacao.professor2);
		}
		//Parte de escolha das disciplinas
		System.out.println("Escolha a disciplina: ");
		System.out.println("1)- Disciplina 1");
		System.out.println("2)- Disciplina 2");
		op = in.nextInt();		
		if (op==1){
			controlAvaliacao.ofertaDisciplina4.setDisciplina(controlAvaliacao.disciplina1);
		}else if (op==2){
			controlAvaliacao.ofertaDisciplina4.setDisciplina(controlAvaliacao.disciplina2);
		}
		//Parte de escolha das turmas
		System.out.println("Escolha a turma : ");
		System.out.println("1)- Turma 1");
		System.out.println("2)- turma 2");
		op = in.nextInt();		
		if (op==1){
			controlAvaliacao.ofertaDisciplina4.setTurma(controlAvaliacao.turma1);
		}else if (op==2){
			controlAvaliacao.ofertaDisciplina4.setTurma(controlAvaliacao.turma2);
		}			
						
	}
	
	public void verAlocacoes(){
		System.out.println("Oferta1 : ");
		controlAvaliacao.ofertaDisciplina1.VerAlocacoesDisciplina();
		System.out.println("Oferta2 : ");		
		controlAvaliacao.ofertaDisciplina2.VerAlocacoesDisciplina();
		System.out.println("Oferta3 : ");		
		controlAvaliacao.ofertaDisciplina3.VerAlocacoesDisciplina();
		System.out.println("Oferta4 : ");		
		controlAvaliacao.ofertaDisciplina4.VerAlocacoesDisciplina();
	}
}
