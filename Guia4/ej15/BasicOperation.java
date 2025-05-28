package Guias.Guia4.ej15;

public enum BasicOperation implements Operation{
    SUMA("+"){
        @Override
        public double apply(double x, double y){
            return x + y;
        }
    },

    RESTA("-") {
        @Override
        public double apply(double x, double y){
        return x - y;
        }
    },

    MULTIPLICACION("*"){
      @Override
        public double apply(double x, double y){
          return x * y;
      }
    },

    DIVISION("/"){
      @Override
      public double apply(double x, double y){
          return x / y;
      }
    };


    private String operando;

    BasicOperation(String operando){
        this.operando = operando;
    }

    @Override
    public String toString(){
        return operando;
    }

}
