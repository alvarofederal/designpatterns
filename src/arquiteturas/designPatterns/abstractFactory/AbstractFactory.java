package arquiteturas.designPatterns.abstractFactory;

//Interface para a fábrica abstrata
interface AbstractFactory {
	AbstractProductA createProductA();

	AbstractProductB createProductB();
}
