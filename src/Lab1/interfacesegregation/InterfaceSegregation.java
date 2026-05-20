package Lab1.interfacesegregation;

public class InterfaceSegregation {
    
    public InterfaceSegregation() {
        doCorrectImplementation();
    }
    

    public void doIncorrectImplementation() {
        /**
         * Crow e Penguin classes implementam a interface Bird
         */
        Lab1.interfacesegregation.incorrect.Crow crow = new Lab1.interfacesegregation.incorrect.Crow();
        Lab1.interfacesegregation.incorrect.Penguin penguin = new Lab1.interfacesegregation.incorrect.Penguin();
        
        /**
         * Os metodos funcionam bem para um passaro que pode comer, dormir e voar
         */
        crow.eat();
        crow.sleep();
        crow.fly();
        
         /**
         * Os metodos nao funcionam bem para o Penguin que pode comer e dormir, 
         * mas nao pode voar
         */
        penguin.eat();
        penguin.sleep();
        penguin.fly();
    }
    
    public void doCorrectImplementation() {
        
        /**
         * Adicione aqui seu código refatorado com referências a métodos e classes 
         * contidas no pacote Lab1.interfacesegregation.correct
         */
        
        Lab1.interfacesegregation.correct.Crow c = new Lab1.interfacesegregation.correct.Crow();
        Lab1.interfacesegregation.correct.Penguin p = new Lab1.interfacesegregation.correct.Penguin();

        c.eat();
        c.sleep();
        c.fly();

        p.eat();
        p.sleep();
    }
    
    public static void main(String [] args) {
        InterfaceSegregation is = new InterfaceSegregation();
    }
    
}
