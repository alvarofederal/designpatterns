package arquiteturas.designPatterns.proxy;

//Vamos criar uma classe proxy que age como um intermediário entre o cliente e o objeto real.
class Proxy implements Subject {
	private RealSubject realSubject;

	// Método para realizar uma solicitação, delegando-a ao objeto real quando
	// necessário.
	@Override
	public void request() {
		if (realSubject == null) {
			// Lazy initialization: criando o objeto real apenas quando necessário.
			realSubject = new RealSubject();
		}
		// Encaminhando a solicitação para o objeto real.
		realSubject.request();
	}
}
