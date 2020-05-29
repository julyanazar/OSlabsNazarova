import java.awt.Color;
import java.awt.Graphics;

public class Containers {
    private int posXShip;
    private int posYShip;
    private Color colorBox;
    private int size;
    private ContainersEnum count;

    public Containers(Color colorBox, int size, ContainersEnum count)
    {
        this.colorBox = colorBox;
        this.size = size;
        this.count = count;
    }

    public void SetPos(int posX, int posY)
    {
        this.posXShip = posX;
        this.posYShip = posY;
    }

    public void Boxes(Graphics g, int y, int x) {
        g.setColor(colorBox);
        g.fillRect(posXShip + x + 10, posYShip - y, size, size);
        g.setColor(Color.black);
        g.drawRect(posXShip + x + 10, posYShip - y, size, size);
    }

    public void PrintBoxes(Graphics g)
    {
        switch(count)
        {
            case box100:
                for(int i = 0; i < 100; i++)
                    Boxes(g, size, i);
                break;
            case box200:
                for(int i = 0; i < 100; i++)
                {
                    Boxes(g, size, i);
                    Boxes(g, size*2, i);
                }
                break;
            case box300:
                for(int i = 0; i<100; i++)
                {
                    Boxes(g, size, i);
                    Boxes(g, size*2, i);
                    Boxes(g, size*3, i);
                }
                break;
        }
    }
}
