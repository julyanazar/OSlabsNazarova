9 lines (16 sloc)  361 Bytes


import java.awt.Graphics;
import javax.swing.JPanel;

public class ShipPanel extends JPanel {
    private ContainerShip ship;
    private Containers box;
    public ShipPanel(ContainerShip ship, Containers box) {
        this.ship = ship;
        this.box = box;
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        ship.DrawShip(g);
        box.PrintBoxes(g);
    }

}