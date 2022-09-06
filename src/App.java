import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro();
        carro.cor = JOptionPane.showInputDialog("Informe a cor do carro: ");
        carro.modelo = JOptionPane.showInputDialog("Informe o modelo do carro: ");
        carro.velocidadeMaximaDoCarro =Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade maxima do seu carro Atual:"));
        carro.velocidadeAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade Atual:"));
        int aceleracao;
        int velocidade;
        aceleracao = Integer.parseInt(JOptionPane.showInputDialog("Informe quanto voce quer acelerar(saiba velocidade maxima do seu carro é:200):"));
        velocidade=  carro.acelerar(aceleracao);
        System.out.println(" A cor do seu carro e: " + 
        carro.cor + " o modelo do seu carro e: "+ 
        carro.modelo + " sua aceleracao apos acelerar e: " + 
        velocidade + " aseu carro esta na marcha: " +carro.pegarMarcha(velocidade));

    }
}
