package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Main extends JFrame
{

    private JLabel result = new JLabel("Result: 0 X 0");
    private JLabel lastscore = new JLabel("Last Scorer N/A");
    private JLabel winner = new JLabel("Winner: DRAW");
    private JButton milan = new JButton("AC Milan");
    private JButton madrid = new JButton("Real Madrid");
    private int milanscore = 0;
    private int madridscore = 0;
    public Main()
    {
        super("Football");
        this.setBounds(0,0,1000,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container=this.getContentPane();
        container.setLayout(null);
        class ButtonEventListener1 implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                milanscore++;
                String res="Result: "+milanscore+" X "+madridscore;
                result.setText(res);
                lastscore.setText("Last Soccer: AC Milan");
                if(madridscore<milanscore){
                    winner.setText("Winner: AC Milan");
                }
                if(madridscore==milanscore){
                    winner.setText("Winner: DRAW");
                }
            }
        }
        class ButtonEventListener2 implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                madridscore++;
                String res="Result: "+milanscore+" X "+madridscore;
                result.setText(res);
                lastscore.setText("Last Soccer: Madrid");
                if(madridscore>milanscore){
                    winner.setText("Winner: Madrid");
                }
                if(madridscore==milanscore){
                    winner.setText("Winner: DRAW");
                }
            }
        }
        milan.addActionListener(new ButtonEventListener1());
        madrid.addActionListener(new ButtonEventListener2());
        container.add(milan);
        container.add(madrid);
        container.add(result);
        container.add(lastscore);
        container.add(winner);
        milan.setSize(500,200);
        milan.setLocation(0,0);
        madrid.setSize(500,200);
        madrid.setLocation(500,0);
        result.setSize(500,200);
        result.setLocation(210,200);
        lastscore.setSize(500,200);
        lastscore.setLocation(700,200);
        winner.setSize(1000,200);
        winner.setLocation(455,400);
        setSize(1000,600);
    }
    public static void main(String[]args)
    {
        new Main().setVisible(true);
    }
}