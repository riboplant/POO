package Parciales.PrimerParcial.Repaso.ej1;

public class UniqueExam extends Exam{

  public UniqueExam(String name){
    super(name);
  }

  protected boolean canEnroll(String student){
    return !isEnrolled(student);
  }

  @Override
  public void enroll(String student){
    if(canEnroll(student))
      enroll(student);
  }
}
