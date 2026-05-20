package Lab1.openclosed;

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
        Lab1.openclosed.incorrect.Rectangle rectangle = new Lab1.openclosed.incorrect.Rectangle(4,3);
        Lab1.openclosed.incorrect.Circle circle = new Lab1.openclosed.incorrect.Circle(5);
        
        /**
         * Toda vez que uma nova forma geometrica eh adicionada, precisaremos de uma nova 
         * logica para calculo da area
         * Como precisaremos mudar o codigo existente (GeometryOperation), essa abordagem
         * fere o Principio do Aberto-Fechado
         */
        Lab1.openclosed.incorrect.GeometryOperation op = new Lab1.openclosed.incorrect.GeometryOperation();
        System.out.println("Area do retangulo -> " + op.getArea(rectangle));
        System.out.println("Area do circulo -> " + op.getArea(circle));
    }
    
    public void doCorrectImplementation(){
        
        /**
         * Adicione aqui seu código refatorado com referências a métodos e classes
         * contidas no pacote Lab1.openclosed.correct
         */
        Lab1.openclosed.correct.Rectangle r = new Lab1.openclosed.correct.Rectangle(5, 10);
        Lab1.openclosed.correct.Circle c = new Lab1.openclosed.correct.Circle(5);
        Lab1.openclosed.correct.GeometryOperation g = new Lab1.openclosed.correct.GeometryOperation();
        System.out.println("Area do retangulo -> " + g.getArea(r));
        System.out.println("Area do circulo -> " + g.getArea(c));
    }
    
    public static void main(String [] args ) {
        OpenClosed opClo = new OpenClosed();
      
    }
    
    
}
