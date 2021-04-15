import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Aluno turma[] = new Aluno[4];
    Scanner leia = new Scanner(System.in); 
    //recebendo  
    System.out.println("============ALUNOS============");
    for(int i=0;i<turma.length;i++){
      Aluno aluno = new Aluno();
      System.out.println("Qual o nome do "+(i+1)+"º Aluno?");
      aluno.nome = leia.next();
      System.out.println("Qual o curso do "+(i+1)+"º Aluno?");
      aluno.curso = leia.next();
      System.out.println("Qual a nota da AP1 do "+(i+1)+"º Aluno?");
      aluno.ap1 = leia.nextFloat();
      System.out.println("Qual a nota da AP2 do "+(i+1)+"º Aluno?");
      aluno.ap2 = leia.nextFloat();
      turma[i] = aluno;
    }
    //retornando  
    System.out.println("============Resultado============");
    for(Aluno aluno: turma) {
      System.out.print("Nome: "+aluno.nome+"; Curso:"+aluno.curso);
      System.out.println("; AP1: "+aluno.ap1+"; AP2:"+aluno.ap2+"; Média: "+aluno.media());
    }
  }
}