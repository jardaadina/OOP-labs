import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

class DragBallPanel extends JPanel implements MouseListener, MouseMotionListener {
    private static final int BALL_DIAMETER = 40;
    private int _ballX = 50;
    private int _ballY = 50;
    private int _dragFromX = 0;
    private int _dragFromY = 0;
    private boolean _canDrag = false;
    private boolean _autoMove = false;
    private int _autoMoveDirectionX = 1;
    private int _autoMoveDirectionY = 1;

    Timer timer;

    public DragBallPanel() {
        setPreferredSize(new Dimension(300, 300));
        setBackground(Color.blue);
        setForeground(Color.yellow);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);

        // Inițializare timer în constructor
        timer = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (_autoMove) {
                    moveBallAutomatically();
                    repaint();
                }
            }
        });
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //aici se deseneaza bila
        g.fillOval(_ballX, _ballY, BALL_DIAMETER, BALL_DIAMETER);

       //adaugam coordonatele la mijlocul frame ului sus
        String coordonate = "coordonate: (" + _ballX + ", " + _ballY + ")";
        g.drawString(coordonate, 80, 20);
    }

    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        //verific daca mouse ul se afla in interiorul bilei cu formula distantei dintre 2 puncte
        double distanta = Math.sqrt(Math.pow(x - (_ballX + BALL_DIAMETER / 2), 2) + Math.pow(y - (_ballY + BALL_DIAMETER / 2), 2));

        if (distanta <= BALL_DIAMETER / 2)
        {
            _canDrag = true;
            _dragFromX = x - _ballX;
            _dragFromY = y - _ballY;
            //dezactivarea la un click stanga
            _autoMove = false;
        } else
        {
            _canDrag = false;
            //activarea la un click stanga
            _autoMove = true;
        }
    }

    public void mouseDragged(MouseEvent e) {
        if (_canDrag) {
            _ballX = e.getX() - _dragFromX;
            _ballY = e.getY() - _dragFromY;

            _ballX = Math.max(_ballX, 0);
            _ballX = Math.min(_ballX, getWidth() - BALL_DIAMETER);

            _ballY = Math.max(_ballY, 0);
            _ballY = Math.min(_ballY, getHeight() - BALL_DIAMETER);

            this.repaint();
        }
    }

    public void mouseExited(MouseEvent e) {
        _canDrag = false;
    }

    public void mouseMoved(MouseEvent e) {}
    public void mouseEntered(MouseEvent e)
    {
        _ballX = e.getX() - _dragFromX;
        _ballY = e.getY() - _dragFromY;

        _ballX = Math.max(_ballX, 0);
        _ballX = Math.min(_ballX, getWidth() - BALL_DIAMETER);

        _ballY = Math.max(_ballY, 0);
        _ballY = Math.min(_ballY, getHeight() - BALL_DIAMETER);

        this.repaint();
    }

    public void mouseClicked(MouseEvent e)
    {
        //verific daca am facut click dreapta
        if (e.getButton() == MouseEvent.BUTTON3)
        {
            generateRandomColor();
            repaint();
        }
    }

    private void generateRandomColor() {
        Random rand = new Random();
        int red = rand.nextInt(256);
        int green = rand.nextInt(256);
        int blue = rand.nextInt(256);
        Color randomColor = new Color(red, green, blue);

        setForeground(randomColor);
    }

    public void mouseReleased(MouseEvent e) {}

    private int generateRandomDirection()
    {
        if (Math.random() < 0.5)
        {
            return -1;
        } else
        {
            return 1;
        }
    }

    private void moveBallAutomatically() {
        //actualizez pozitia bilei
        _ballX += _autoMoveDirectionX;
        _ballY += _autoMoveDirectionY;

        //daca mingea atinge marginile
        if (_ballX <= 0 || _ballX >= getWidth() - BALL_DIAMETER) {
            _autoMoveDirectionX *= -1;
        }

        if (_ballY <= 0 || _ballY >= getHeight() - BALL_DIAMETER) {
            _autoMoveDirectionY *= -1;
        }
    }
}
