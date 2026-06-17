// public class digitalclock {
    import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class digitalclock extends JFrame {

    JLabel timeLabel;
    SimpleDateFormat timeFormat;

    public digitalclock() {
        // Clock ka format
        timeFormat = new SimpleDateFormat("hh:mm:ss a");

        // Label for time display
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.BOLD, 50));
        timeLabel.setForeground(Color.green);
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        // Frame settings
        this.setTitle("Digital Clock");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(400, 150);
        this.add(timeLabel);
        this.setVisible(true);

        // Time update function
        setTime();
    }

    public void setTime() {
        Timer timer = new Timer(1000, e -> {
            String time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
        });
        timer.start();
    }

    public static void main(String[] args) {
        new digitalclock();
    }
}

// }
