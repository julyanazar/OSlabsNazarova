import java.awt.Color;
import java.awt.Graphics;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class ContainerShipProj {

    private JFrame frame;
    private ContainerShip ship = new ContainerShip(10, Color.red, Color.black, true, true, 20);
    private Containers containers = new Containers(Color.red, 5, ContainersEnum.containers300);

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ContainerShipProj window = new ContainerShipProj();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public ContainerShipProj() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 665, 549);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new ShipPanel(ship, containers);
        panel.setBounds(0, 0, 649, 510);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        Random r = new Random();
        ship.SetPosition(r.nextInt(100), r.nextInt(100), frame.getWidth(), frame.getHeight());
        containers.SetPos(ship.get_startPosX(), ship.get_startPosY());

        JButton btnNewButton = new JButton("U");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ship.MoveTransport(MoveEnum.Up);
                containers.SetPos(ship.get_startPosX(), ship.get_startPosY());
                panel.repaint();
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 8));
        btnNewButton.setBounds(544, 386, 39, 34);
        panel.add(btnNewButton);

        JButton btnL = new JButton("L");
        btnL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ship.MoveTransport(MoveEnum.Left);
                containers.SetPos(ship.get_startPosX(), ship.get_startPosY());
                panel.repaint();
            }
        });

        btnL.setFont(new Font("Tahoma", Font.PLAIN, 8));
        btnL.setBounds(496, 426, 39, 34);
        panel.add(btnL);

        JButton btnR = new JButton("R");
        btnR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ship.MoveTransport(MoveEnum.Right);
                containers.SetPos(ship.get_startPosX(), ship.get_startPosY());
                panel.repaint();
            }
        });
        btnR.setFont(new Font("Tahoma", Font.PLAIN, 8));
        btnR.setBounds(588, 426, 39, 34);
        panel.add(btnR);

        JButton btnD = new JButton("D");
        btnD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ship.MoveTransport(MoveEnum.Down);
                containers.SetPos(ship.get_startPosX(), ship.get_startPosY());
                panel.repaint();
            }
        });
        btnD.setFont(new Font("Tahoma", Font.PLAIN, 8));
        btnD.setBounds(544, 465, 39, 34);
        panel.add(btnD);

        JButton btnSpawn = new JButton("Spawn");
        btnSpawn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ship.SetPosition(r.nextInt(100), r.nextInt(100), frame.getWidth(), frame.getHeight());
                containers.SetPos(ship.get_startPosX(), ship.get_startPosY());
                panel.repaint();
            }
        });
        btnSpawn.setBounds(519, 51, 89, 23);
        panel.add(btnSpawn);
    }
}
