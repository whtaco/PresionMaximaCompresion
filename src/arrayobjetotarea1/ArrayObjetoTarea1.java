/*
Diseñe un algortimo de tal manera, que le permita crear una matriz de objetos como 
una matriz de elementos de datos primitivos.
 */
package arrayobjetotarea1;

/**
 *
 * @author WILLIAM HERNAN TACO TACO
 */
 class PresionMaximaCompresion{
    public int presion;
    public String cilindro;
    public int voltaje;
    
    PresionMaximaCompresion(int presion,String cilindro,int voltaje){
        this.presion=presion;
        this.cilindro=cilindro;
        this.voltaje=voltaje;
    }

class VoltajeMaximo{
    public int volt;
    public String cilindro2;
    
    VoltajeMaximo(int volt,String cilindro2){
        this.volt=volt;
        this.cilindro2=cilindro2;
    }
}
public class ArrayObjetoTarea1 {

    /**
     * @param args the command line arguments
     */
   
}
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-L");
        System.out.println("--------------------------");
        System.out.println("NOMBRE: WILLIAM TACO");
        System.out.println("FECHA: 17-07-2020");
        System.out.println("CARRERA: ING. AUTOMOTRIZ");
        System.out.println("--------------------------");
        
        PresionMaximaCompresion[]arreglo;
        
        arreglo=new PresionMaximaCompresion[4];
        
        arreglo[0]=new PresionMaximaCompresion(122,"CILINDRO 1",0);
        arreglo[1]=new PresionMaximaCompresion(123,"CILINDRO 2",0);
        arreglo[2]=new PresionMaximaCompresion(126,"CILINDRO 3",0);
        arreglo[3]=new PresionMaximaCompresion(121,"CILINDRO 4",0);
 
        for(int i=0; i<arreglo.length;i++){
            System.out.println("El "+arreglo[i].cilindro+" posee una presión de: "+arreglo[i].presion+" psi");
        }
        System.out.println("--------------------------");
        PresionMaximaCompresion[]arreglo2;
        
        arreglo2=new PresionMaximaCompresion[4];
        
        arreglo2[0]=new PresionMaximaCompresion(0,"CILINDRO 1",5000);
        arreglo2[1]=new PresionMaximaCompresion(0,"CILINDRO 2",4800);
        arreglo2[2]=new PresionMaximaCompresion(0,"CILINDRO 3",4500);
        arreglo2[3]=new PresionMaximaCompresion(0,"CILINDRO 4",5000);
        
        for(int i=0; i<arreglo.length;i++){
            System.out.println("El "+arreglo2[i].cilindro+" posee una chispa de : "+arreglo2[i].voltaje+" voltios");
        }
    
    }
    
}
