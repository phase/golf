package c;import java.util.*;public class N{static Random r = new Random();static int px, py, ax, ay;public static void main(String[] a){px=r.nextInt(16);py=r.nextInt(5);ax=r.nextInt(16);ay=r.nextInt(5);p();do{Scanner e = new Scanner(System.in);char m = e.next().charAt(0);if(m=='w')py=py>0?py-1:py;if(m=='s')py=py<5?py+1:py;if(m=='a')px=px>0?px-1:px;if(m=='d')px=px<16?px+1:px;p();}while(px!=ax || py!=ay);}static void p(){System.out.println();for(int y=0;y<5;y++){for(int x=0;x<16;x++){if(x==px && y==py)System.out.print('@');else if(x==ax && y==ay)System.out.print('"');else System.out.print('.');}
System.out.println();}}}
