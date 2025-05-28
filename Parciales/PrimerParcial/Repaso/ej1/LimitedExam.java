package Parciales.PrimerParcial.Repaso.ej1;

public class LimitedExam extends UniqueExam{

  private String[] queue;
  private int dimQ;
  private static final int INI = 5;
  private final int max;

  public LimitedExam(String student, int max){
    super(student);
    this.max = max;
    this.queue = new String[INI];
  }
  
  private addToQueue(String student){
    if(dimQ == queue.length)
      queueResize();
    queue[dim++] = student;
  }
  
  private queueResize(){
    queue = Arrays.copyOf(queue, queue.length + INI);
  }
  
  @Override
  protected boolean canEnroll(String student){
    return super.canEnroll(student) && dim < max;
  }

  @Override
  public void enroll(String student){
    if(canEnroll(student))
      super.enroll(student);
    addToQueue(student);
  }

  @Override
  public void unenroll(String student){
    super.unenroll(student);
    if(dim < max && dimQ >= 1){
      enroll(queue[0]);
      System.arrayCopy(queue, 1, queue, 0, dimQ-1);
      dimQ--;
     }
  }

  public String[] getPendingStudents(){
    return Arrays.copyof(queue, dimQ);
  }

}
