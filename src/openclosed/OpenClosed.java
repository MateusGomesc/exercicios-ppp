package openclosed;

import openclosed.correct.Circle;
import openclosed.correct.Rectangle;

public class OpenClosed {
    
    public OpenClosed(){
        doIncorrectImplementation();
        doCorrectImplementation();
    }
    
    public void doIncorrectImplementation(){
        
        /**
         * Aqui temos classes Rectangle e Circle que utilizam a classe GeometryOperation 
         * para calculo da area
         */
        openclosed.incorrect.Rectangle rectangle = new openclosed.incorrect.Rectangle(4,3);
        openclosed.incorrect.Circle circle = new openclosed.incorrect.Circle(5);
        
        /**
         * Toda vez que uma nova forma geometrica eh adicionada, precisaremos de uma nova 
         * logica para calculo da area
         * Como precisaremos mudar o codigo existente (GeometryOperation), essa abordagem
         * fere o Principio do Aberto-Fechado
         */
        openclosed.incorrect.GeometryOperation op = new openclosed.incorrect.GeometryOperation();
        System.out.println("Area do retangulo -> " + op.getArea(rectangle));
        System.out.println("Area do circulo -> " + op.getArea(circle));
    }
    
    public void doCorrectImplementation(){
        
        /**
         * Adicione aqui seu código refatorado com referências a métodos e classes
         * contidas no pacote openclosed.correct
         */
        openclosed.correct.Rectangle r = new openclosed.correct.Rectangle(5, 10);
        openclosed.correct.Circle c = new openclosed.correct.Circle(5);
        openclosed.correct.GeometryOperation g = new openclosed.correct.GeometryOperation();
        System.out.println("Area do retangulo -> " + g.getArea(r));
        System.out.println("Area do circulo -> " + g.getArea(c));
    }
    
    public static void main(String [] args ) {
        OpenClosed opClo = new OpenClosed();
      
    }
    
    
}
