
public class Carro {
   String cor;
   String modelo;
   int velocidadeAtual;
   int velocidadeMaximaDoCarro ;
   boolean ligado;

   public boolean ligar() {
      ligado = true;
      return ligado;
   }

   public int acelerar(int aceleracao) {
      velocidadeAtual += aceleracao;
      if (velocidadeAtual > velocidadeMaximaDoCarro) {
         velocidadeAtual = velocidadeMaximaDoCarro;
      }
      return velocidadeAtual;
   }

   public int pegarMarcha(int velocidade) {
      int marcha;
      if (velocidade <= 20) {
         marcha = 1;
      }else if (velocidade <= 40) {
         marcha = 2;
      }else if (velocidade <= 60) {
         marcha = 3;
      }else if (velocidade <= 100) {
         marcha = 4;
      } else {
         marcha = 5;
      }
      return marcha;
   }

}
