package es.unileon.prg.tema6;

public class Ecuacion2Grado {

    private int a;
    private int b;
    private int c;

    private double discriminante(){
        return Math.pow(this.b,2) - (4*this.a*this.c);
    } 

    public Ecuacion2Grado(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void setABC(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    public int getC(){
        return c;
    }

public int numeroDeSoluciones(){
    int numeroSoluciones;

    if(discriminante()>0){
        numeroSoluciones= 2;
    }else if(discriminante()<0){
        numeroSoluciones= 0;
    }else{
        numeroSoluciones= 1;
    }
    return numeroSoluciones;
}

public String toString(){
    StringBuffer salida = new StringBuffer();
    double solucion1=0;
    double solucion2=0;
    salida.append("Numero de soluciones reales: "+numeroDeSoluciones());
    if(discriminante() == 0){
        solucion1=(-1*this.b)/(2*this.a);
        salida.append("\nEl valor de la solución real es: "+solucion1);
    }else if(discriminante()>0){
        solucion1=((-1*this.b)+ Math.sqrt(discriminante()))/(2*this.a);
        solucion2=((-1*this.b)- Math.sqrt(discriminante()))/(2*this.a);
        salida.append("\nLos valores de las 2 soluciones reales son: "+solucion1+" "+solucion2);
    }
    return salida.toString();
}

    
}