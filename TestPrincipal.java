import Animales.Perro;
import FigurasGeometricas.Circulo;
import FigurasGeometricas.Punto;
import FigurasGeometricas.Rectangulo;
import FigurasGeometricas.Triangulo;
import Otros.Automovil;
import Otros.Celular;
import Otros.Mesa;
import Otros.Pelota;
import Personas.Empleado;
import Personas.Estudiante;

/**
 *
 * @author ivann
 */
public class TestPrincipal {
    
    public static void main(String[] args) {
        
        //Circulo 
        
        Punto punto1 = new Punto(3, 2);
            
            Circulo circulo1 = new Circulo(3, punto1);
            
            double area = circulo1.getArea();
        System.out.println("Área del círculo: " + area);
            
            double perimetro = circulo1.getPerimetro();
            System.out.println("Perimetro del círculo: " + perimetro);
            
             //Punto
        
        Punto punto2 = new Punto(3, 2);
        
        System.out.println ("La coordenada X es: " + punto2.getCoordenadaX());
        
        System.out.println ("La coordenada Y es: " + punto2.getCoordenadaY());
        
        //Rectangulo
        
        Rectangulo rectangulo1 = new Rectangulo(1.0f, 1.0f);
        
        double area2 = rectangulo1.getArea();

        System.out.println("El área del rectángulo es: " + area2);
        
        //Triangulo
        
         Triangulo triangulo1 = new Triangulo(punto1, punto2, punto2);
         
         double perimetro1 = triangulo1.getPerimetro();
         System.out.println ("El perimetro del triangulo es: " + perimetro1);
         
         String tipo = triangulo1.getTipo();
         System.out.println ("El triangulo es de tipo: " + tipo) ;
   
        
        //Automovil
         Automovil auto1 = new Automovil("REJ-256", "Chevrolet", "Sedán", "Amarillo", "Auto");
        
        System.out.println ("La marca del automovil es: " + auto1.getMarca());
        System.out.println ("El modelo del automovil es: " + auto1.getModelo());
        
        //celular
        
        Celular celular1 = new Celular(993668270, "Xiaomi", "Plomo", "A10", "Prepago");
        
        System.out.println ("El modelo del celular es: " + celular1.getModelo());
        System.out.println ("La marca del celular es: " + celular1.getMarca());
        
        //Mesa
        
         Mesa mesa1 =new Mesa(6.0f, 10.0f, "Marrón", "Madera", "Rectangular");
        
        System.out.println ("El material de la mesa es: " + mesa1.getMaterial());
        System.out.println ( "La forma de la mesa es: " + mesa1.getForma());
        
        //Pelota
        
        Pelota pelota1 = new Pelota(6.0f, "Roja");
        
        System.out.println ("El tamaño de la pelota es: " + pelota1.getTamaño());
        
        //Empleado
        
         Empleado empleado1 = new Empleado(6542, "Raul", "Torres", 1800);
        
        System.out.println("El salario es: " + empleado1.getSalario());

        System.out.println("El salario anual es: " + empleado1.getSalarioAnual());
                
        //Estudiante
        Estudiante estudiante1 = new Estudiante(2310153 , "Jose","Cordova",18,"Programación orientada a objetos",15.0f);
        
        System.out.println ("La calificación del estudiante es: " + estudiante1.getNota());
        System.out.println ("El curso del estudiante es: " + estudiante1.getCurso());
        
        //Perro
        Perro perro1 = new Perro("Milu", "Puddle", "Blanco", 1);
        
        System.out.println ("La raza del perro es: " + perro1.getTipoRaza());
        
        System.out.println("La edad del perro es: " + perro1.getEdad());

    }
}