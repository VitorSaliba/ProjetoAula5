package FranquiaAcai;

import java.awt.Container;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.text.MaskFormatter;


public class PontoAcai {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Informe o pedido");

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tamanho do Açaí desejado: \n 1. 300ml \n 2. 500ml \n 3. 700ml"));
        boolean adicional = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Gostaria de acrécimo de sorvete?"));

        Acai acai = new Acai();

        switch (opcao){
            case 1:
                acai.tamanho = 300;
                break;
            case 2:
                acai.tamanho = 500;
                break;
            case 3:
                acai.tamanho = 700;
                break;
        }
        acai.acrecimo = adicional;
        acai.calculaValor();
        JOptionPane.showMessageDialog(null, "O seu açai ficou no valor de: R$"+acai.valor);
    }
}
