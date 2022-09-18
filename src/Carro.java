
public class Carro {
   String cor;
   String modelo;
   int velocidadeAtual;
   int velocidadeMaximaDoCarro ;
   boolean ligado = false;

   void ligar() {
      this.ligado = true;
      
   }
   void desligar(){
      this.ligado = false;
   }

   public int acelerar(int aceleracao) {
      this.velocidadeAtual += aceleracao;
      if (this.velocidadeAtual > this.velocidadeMaximaDoCarro) {
         this.velocidadeAtual = this.velocidadeMaximaDoCarro;
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
