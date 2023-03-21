package FranquiaAcai;

import java.awt.Container;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;

public class Acai {
    public Integer tamanho;
    public Double valor;
    public Boolean acrecimo;

    public void calculaValor(){
        if(tamanho == 300){
            valor = 8.0;
        } else if (tamanho == 500){
            valor = 10.0;
        } else if (tamanho == 700){
            valor = 12.0;
        }
        if (acrecimo){
            valor += 2;
        }
    }
}
