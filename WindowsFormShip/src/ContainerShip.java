mport java.awt.Color;
import java.awt.Graphics;

public class ContainerShip {
    private int _startPosX;
    private int _startPosY;
    private int _pictureWidth;
    private int _pictureHeight;
    private final static int _shipWidth = 90;
    private final static int _shipHeight = 10;
    private int MaxSpeed;
    private Color MainColor;
    private Color SecondColor;
    private boolean Line;
    private boolean Crane;
    private int SizeOfBooth;
    public boolean IsDead = true;

    public ContainerShip(int maxSpeed, Color mainColor, Color secondColor, boolean line, boolean crane, int sizeofBooth){
        this.MaxSpeed = maxSpeed;
        this.MainColor = mainColor;
        this.SecondColor = secondColor;
        this.Line = line;
        this.Crane = crane;
        this.SizeOfBooth = sizeofBooth;
    }

    public void SetPosition(int x, int y, int width, int height){
        _startPosX = x;
        _startPosY = y;
        _pictureWidth = width;
        _pictureHeight = height;
    }

    public void MoveTransport(MoveEnum direction){
        float step = MaxSpeed;
        switch (direction)
        {
            case Right:
                if (_startPosX + step < _pictureWidth - _shipWidth + 15)
                {
                    _startPosX += step;
                }
                break;
            case Left:
                if (_startPosX - step > 0)
                {
                    _startPosX -= step;
                }
                break;
            case Up:
                if (_startPosY - step > 15)
                {
                    _startPosY -= step;
                }
                break;
            case Down:
                if (_startPosY + step < _pictureHeight - _shipHeight - 40)
                {
                    _startPosY += step;
                }
                break;
        }
    }
    public void DrawShip(Graphics g){
        g.setColor(MainColor);
        int startposX = (int)_startPosX;
        int startposY = (int)_startPosY;
        int[] arrx = new int[] { startposX, startposX + _shipWidth, startposX + _shipWidth - 10, startposX + 10, startposX};
        int[] arry = new int[] { startposY, startposY, startposY + _shipHeight, startposY + _shipHeight, startposY};
        g.fillPolygon(arrx, arry, 5);

        g.setColor(SecondColor);
        g.fillRect(startposX + 3, startposY - SizeOfBooth, SizeOfBooth, SizeOfBooth);

        g.setColor(Color.white);
        g.fillRect(startposX + 10, startposY - SizeOfBooth + 3, 10, 2);

        if (Line)
        {
            g.setColor(Color.black);
            g.fillRect(startposX + 5, startposY + 5, 45, 2);
        }

        if (Crane)
        {
            g.setColor(Color.black);
            g.drawLine(startposX + 40, startposY, startposX + 40, startposY - 15);
            g.drawLine(startposX + 40, startposY - 15, startposX + 50, startposY - 15);

        }
    }

    public int get_startPosX() {
        return _startPosX;
    }

    public int get_startPosY() {
        return _startPosY;
    }

}