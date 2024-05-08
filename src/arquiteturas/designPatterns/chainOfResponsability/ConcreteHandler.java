package arquiteturas.designPatterns.chainOfResponsability;

//Implementação concreta do manipulador
class ConcreteHandler implements Handler {
 private Handler nextHandler;

 @Override
 public void setNextHandler(Handler nextHandler) {
     this.nextHandler = nextHandler;
 }

 @Override
 public void handleRequest(Request request) {
     // Lógica para processar a solicitação ou passá-la para o próximo manipulador
     if (canHandle(request)) {
         System.out.println("A solicitação foi tratada por este manipulador.");
     } else if (nextHandler != null) {
         System.out.println("A solicitação foi passada para o próximo manipulador.");
         nextHandler.handleRequest(request);
     } else {
         System.out.println("Nenhum manipulador disponível para lidar com a solicitação.");
     }
 }

 // Lógica para verificar se este manipulador pode lidar com a solicitação
 private boolean canHandle(Request request) {
     // Implementação da lógica de verificação
     return true;
 }
}
