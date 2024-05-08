package arquiteturas.designPatterns.composite;

//Agora vamos criar uma classe para os componentes individuais.
class Leaf implements Component {
	private String name;

	public Leaf(String name) {
		this.name = name;
	}

	@Override
	public void operation() {
		System.out.println("Leaf " + name + " operation performed.");
	}
}
