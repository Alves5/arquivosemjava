class Aluno{
  String nome = "";
  String curso = "";
  float ap1 = 0;
  float ap2 = 0;

  float media(){
    return (this.ap1 + this.ap2)/2;
  }
}