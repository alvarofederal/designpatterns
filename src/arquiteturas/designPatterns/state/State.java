package arquiteturas.designPatterns.state;

//Vamos criar uma interface para representar os diferentes estados.
interface State {
 void handle(); // Método para lidar com a operação quando o estado muda.
}
