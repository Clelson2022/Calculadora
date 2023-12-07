import javax.swing.*;
import java.awt.*;
public class CalculadoraGUI {
    //Cria uma janela já com um título.
    JFrame janela = new JFrame("Calculadora");
    //Cria um visor.
    JLabel display = new JLabel();
    //Cria um array de botões com 18 posições.
    JButton[] btn = new JButton[20];
    public CalculadoraGUI() {
        janela.setLayout(null);
        //Define as dimensões da janela
        janela.setSize(250, 400);
        //Define que a janela ao ser fechada deve encerrar a aplicação.
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Define que a janela não será redimensionável.
        janela.setResizable(false);
        //Define que a janela será aberta no centro da tela.
        janela.setLocationRelativeTo(null);
        //Define que a janela será visível.
        janela.setVisible(true);

        //Instancia os botões.
        btn[0] = new JButton("9");
        btn[1] = new JButton("8");
        btn[2] = new JButton("7");
        btn[3] = new JButton("6");
        btn[4] = new JButton("5");
        btn[5] = new JButton("4");
        btn[6] = new JButton("3");
        btn[7] = new JButton("2");
        btn[8] = new JButton("1");
        btn[9] = new JButton("0");
        btn[10] = new JButton("C");
        btn[11] = new JButton("+");
        btn[12] = new JButton("/");
        btn[13] = new JButton("<-");
        btn[14] = new JButton(",");
        btn[15] = new JButton("-");
        btn[16] = new JButton("()");
        btn[17] = new JButton("%");
        btn[18] = new JButton("+");
        btn[19] = new JButton("=");

        //Define o tamanho do display e dos botões.
        display.setSize(230, 60);
        btn[0].setSize(50, 50);
        btn[1].setSize(50, 50);
        btn[2].setSize(50, 50);
        btn[3].setSize(50, 50);
        btn[4].setSize(50, 50);
        btn[5].setSize(50, 50);
        btn[6].setSize(50, 50);
        btn[7].setSize(50, 50);
        btn[8].setSize(50, 50);
        btn[9].setSize(50, 50);
        btn[10].setSize(50, 50);
        btn[11].setSize(50, 50);
        btn[12].setSize(50, 50);
        btn[13].setSize(50, 50);
        btn[14].setSize(50, 50);
        btn[15].setSize(50, 50);
        btn[16].setSize(50, 50);
        btn[17].setSize(50, 50);
        btn[18].setSize(50, 50);
        btn[19].setSize(50, 50);

        //Adiciona o display e os botões a janela.
        janela.add(display);
        janela.add(btn[0]);
        janela.add(btn[1]);
        janela.add(btn[2]);
        janela.add(btn[3]);
        janela.add(btn[4]);
        janela.add(btn[5]);
        janela.add(btn[6]);
        janela.add(btn[7]);
        janela.add(btn[8]);
        janela.add(btn[9]);
        janela.add(btn[10]);
        janela.add(btn[11]);
        janela.add(btn[12]);
        janela.add(btn[13]);
        janela.add(btn[14]);
        janela.add(btn[15]);
        janela.add(btn[16]);
        janela.add(btn[17]);
        janela.add(btn[18]);
        janela.add(btn[19]);

        //Define a posição dos botões.
        display.setLocation(10, 10);
        btn[0].setLocation(10, 85);
        btn[1].setLocation(70, 85);
        btn[2].setLocation(130, 85);
        btn[10].setLocation(190, 85);
        btn[3].setLocation(10, 140);
        btn[4].setLocation(70, 140);
        btn[5].setLocation(130, 140);
        btn[11].setLocation(190, 140);
        btn[6].setLocation(10, 195);
        btn[7].setLocation(70, 195);
        btn[8].setLocation(130, 195);
        btn[15].setLocation(190, 195);
        btn[13].setLocation(10, 250);
        btn[9].setLocation(70, 250);
        btn[14].setLocation(130, 250);
        btn[12].setLocation(190, 250);
        btn[17].setLocation(10, 305);
        btn[16].setLocation(70, 305);
        btn[18].setLocation(130, 305);
        btn[19].setLocation(190, 305);

        display.setOpaque(true);
        display.setBackground(Color.BLACK);
    }
 }