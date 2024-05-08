package arquiteturas.designPatterns.abstractFactory;

//O padrão Abstract Factory é usado para fornecer uma interface para criar famílias de objetos 
//relacionados ou dependentes sem especificar suas classes concretas. Aqui está a implementação:

//Exemplo de uso
public class AbstractFactoryPatternExample {
	public static void main(String[] args) {
		// Usando a fábrica concreta 1 para criar produtos da primeira família
		AbstractFactory factory1 = new ConcreteFactory1();
		AbstractProductA productA1 = factory1.createProductA();
		AbstractProductB productB1 = factory1.createProductB();

		// Usando a fábrica concreta 2 para criar produtos da segunda família
		AbstractFactory factory2 = new ConcreteFactory2();
		AbstractProductA productA2 = factory2.createProductA();
		AbstractProductB productB2 = factory2.createProductB();

		// Usando os produtos criados
		productA1.operationA();
		productB1.operationB();
		productA2.operationA();
		productB2.operationB();
	}
}


//Nesta implementação, temos a interface AbstractFactory, que define métodos para criar produtos de uma 
//família específica. As classes ConcreteFactory1 e ConcreteFactory2 implementam essa 
//interface e fornecem implementações concretas para criar produtos de suas respectivas famílias.

//Temos também as interfaces AbstractProductA e AbstractProductB, que definem métodos para os produtos das famílias 
//A e B, respectivamente. As classes ConcreteProductA1, ConcreteProductB1, ConcreteProductA2 e 
//ConcreteProductB2 implementam essas interfaces e fornecem implementações concretas dos produtos.

//No exemplo de uso, criamos fábricas concretas para criar produtos de duas famílias diferentes (ConcreteFactory1 
//e ConcreteFactory2). Em seguida, usamos essas fábricas para criar produtos específicos (AbstractProductA 
//e AbstractProductB) e executar operações sobre eles. Isso demonstra como o padrão Abstract Factory 
//permite criar famílias de objetos relacionados sem especificar suas classes concretas.