package arquiteturas.designPatterns.chainOfResponsability;

import java.util.Date;

//Classe que representa a solicitação
class Request {
	private String type;
	private String description;
	private String author;
	private Date creationDate;

	public Request(String type, String description, String author) {
		this.type = type;
		this.description = description;
		this.author = author;
		this.creationDate = new Date(); // Definindo a data de criação como a data atual
	}

	public Request() {
		super();
	}

// Getters para os campos da solicitação
	public String getType() {
		return type;
	}

	public String getDescription() {
		return description;
	}

	public String getAuthor() {
		return author;
	}

	public Date getCreationDate() {
		return creationDate;
	}
}
