package Lab1.singleresponsibility;


public class SingleResponsibility {

    public SingleResponsibility() {
       doIncorrectImplementation();
       doCorrectImplementation();
    }
    
    
    public void doIncorrectImplementation() {
        /**
         * Considere uma classe que contenha informações sobre um livro.
         * A única função dessa classe deve ser conter dados relacionados a livros 
         * e operações relacionadas a livros. 
         */
        Lab1.singleresponsibility.incorrect.Book book = new Lab1.singleresponsibility.incorrect.Book("Clean Architecture", "Robert Martin", "Science");
        
        
        /**
         * Ter um método que imprime o nome do autor nessa classe viola 
         * o Princípio da Responsabilidade Única (por que?)
         */
        book.printAuthorName();
        
    }
    
    
    public void doCorrectImplementation() {
        /**
         * Adicione aqui seu código refatorado com referências a métodos e classes 
         * contidas no pacote Lab1.singleresponsibility.correct
         */
        Lab1.singleresponsibility.correct.Book book = new Lab1.singleresponsibility.correct.Book("Redes de Computadores", "Martin", "Código Limpo");
        Lab1.singleresponsibility.correct.BookPrinter bookPrinter = new Lab1.singleresponsibility.correct.BookPrinter();
        bookPrinter.printAuthor(book.getAuthor());
    }
    
    public static void main(String [] args ) {
        SingleResponsibility sr = new SingleResponsibility();
      
    }
        
}
