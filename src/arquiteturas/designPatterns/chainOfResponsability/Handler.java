package arquiteturas.designPatterns.chainOfResponsability;

//Interface para os manipuladores
interface Handler {
 void setNextHandler(Handler nextHandler);
 void handleRequest(Request request);
}
