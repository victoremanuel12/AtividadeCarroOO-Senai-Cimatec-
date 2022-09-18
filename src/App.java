import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro();
        carro.cor = JOptionPane.showInputDialog("Informe a cor do carro: ");
        carro.modelo = JOptionPane.showInputDialog("Informe o modelo do carro: ");
        carro.ligar();
        carro.velocidadeMaximaDoCarro =Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade máxima do seu carro:"));
        carro.velocidadeAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade Atual:"));
        int aceleracao;
        aceleracao = Integer.parseInt(JOptionPane.showInputDialog("Informe quanto você quer acelerar:"));
        int velocidade;
        velocidade = carro.acelerar(aceleracao);
        JOptionPane.showMessageDialog(null,"A cor do seu carro é: " + 
        carro.cor + "\n O modelo do seu carro é: "+ 
        carro.modelo + "\n Sua aceleracao está em: " + 
        velocidade + "km/h" + "\n Seu carro está na marcha: " +carro.pegarMarcha(velocidade)  + " o carro está ligado ligado ?" + carro.ligado);

    }
}
