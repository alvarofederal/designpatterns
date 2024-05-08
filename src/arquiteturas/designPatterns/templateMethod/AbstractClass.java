package arquiteturas.designPatterns.templateMethod;

//Vamos criar uma classe abstrata que define o template do algoritmo.
abstract class AbstractClass {
	// Método template que define o esqueleto do algoritmo.
	public void templateMethod() {
		// Etapa 1: Executar uma operação comum a todas as subclasses.
		commonOperation();

		// Etapa 2: Executar uma operação específica implementada pelas subclasses.
		specificOperation();

		// Etapa 3: Executar outra operação comum a todas as subclasses.
		anotherCommonOperation();
	}

	// Método comum a todas as subclasses.
	private void commonOperation() {
		System.out.println("AbstractClass: Performing common operation.");
	}

	// Método abstrato que deve ser implementado pelas subclasses.
	protected abstract void specificOperation();

	// Outro método comum a todas as subclasses.
	private void anotherCommonOperation() {
		System.out.println("AbstractClass: Performing another common operation.");
	}
}
