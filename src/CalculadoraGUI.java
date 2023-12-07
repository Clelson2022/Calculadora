import javax.swing.*;
import java.awt.*;
public class CalculadoraGUI {

    JFrame janela = new JFrame("Calculadora"); //Cria uma janela com um título.
    JLabel display = new JLabel(); //Cria um display.
    JButton[] btn = new JButton[20]; //Cria um array de botões com 20 posições.

    public CalculadoraGUI() {
        janela.setLayout(null);
        janela.setSize(250, 400); //Define as dimensões da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Define que a janela ao ser fechada deve encerrar a aplicação.
        janela.setResizable(false); //Define que a janela não será redimensionável.
        janela.setLocationRelativeTo(null); //Define que a janela será aberta no centro da tela.
        janela.setVisible(true); //Define que a janela será visível.

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

        display.setSize(230, 60); //Define o tamanho do display.
        janela.add(display); //Adiciona o display à janela.
        display.setLocation(10, 10); //Define a posição do display.
        display.setOpaque(true);
        display.setBackground(Color.BLACK);

        criarComponente(btn[0],50,50,10,85);
        criarComponente(btn[1],50,50,70,85);
        criarComponente(btn[2],50,50,130,85);
        criarComponente(btn[10],50,50,190,85);
        criarComponente(btn[3],50,50,10,140);
        criarComponente(btn[4],50,50,70,140);
        criarComponente(btn[5],50,50,130,140);
        criarComponente(btn[11],50,50,190,140);
        criarComponente(btn[6],50,50,10,195);
        criarComponente(btn[7],50,50,70,195);
        criarComponente(btn[8], 50,50,130,195);
        criarComponente(btn[15],50,50,190,195);
        criarComponente(btn[13],50,50,10,250);
        criarComponente(btn[9],50,50,70,250);
        criarComponente(btn[14],50,50,130,250);
        criarComponente(btn[12],50,50,190,250);
        criarComponente(btn[17],50,50,10,305);
        criarComponente(btn[16],50,50,70,305);
        criarComponente(btn[18],50,50,130,305);
        criarComponente(btn[19],50,50, 190,305);
    }

    // Método que cria, define a posição e o tamanho dos botões.
    public void criarComponente(Component component, int width, int height, int x, int y) {
        janela.add(component);
        component.setSize(width, height);
        component.setLocation(x, y);
    }
 }