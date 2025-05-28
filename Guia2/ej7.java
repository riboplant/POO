package Guias.Guia2;

public class ej7 {
    public static void main(String[] args) {
        int[] boxes = new int[10];
        int max = 0;
        for (String s : args){
            int v = Integer.valueOf(s) / 10;
            boxes[v]++;
            if (boxes[v] > max){
                max = boxes[v];
            }
        }
        printH(boxes, max);
    }

    private static void printH(int[] boxes, int max){
        for(int i=max; i > 0; i--){
            System.out.print("| ");
            for(int b : boxes){
                System.out.print(b >= i ? '*' : ' ');
                System.out.print(" | ");
            }
            System.out.println();
            for(int b : boxes){
                System.out.print("+---");
            }
            System.out.print("+\n");
        }
    }
}