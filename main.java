import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.*;
import javax.swing.plaf.nimbus.*;
public class main extends JFrame{
    static Container c;
    static float[] hsbc;
    main(){
        try{
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        }catch(Exception e){
            e.printStackTrace();
        }
        setTitle("Color Chooser");
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        c = getContentPane();
        c.setBackground(Color.white);
        c.setLayout(null);
        setResizable(false);
        setVisible(true);
    }
    public static void main(String args[]){
        main m = new main();
        m.colorChooser();
    }
    public static void colorChooser(){
        JLabel rgb = new JLabel("RGB: "+c.getBackground().getRed()+", "+c.getBackground().getGreen()+", "+c.getBackground().getBlue());
        rgb.setSize(400,40);
        rgb.setLocation(30,80);
        rgb.setFont(new Font("",Font.BOLD,35));
        rgb.setForeground(Color.black);
        rgb.setBackground(new Color(c.getBackground().getRed()+30 > 255? c.getBackground().getRed(): c.getBackground().getRed()+30,c.getBackground().getGreen()+30 > 255? c.getBackground().getGreen(): c.getBackground().getGreen()+30,c.getBackground().getBlue()+30 > 255? c.getBackground().getBlue(): c.getBackground().getBlue()+30));
        rgb.setOpaque(true);
        c.add(rgb);
        
        JLabel hex = new JLabel("HEX: #"+Integer.toHexString(c.getBackground().getRGB()).substring(2).toUpperCase());
        hex.setSize(400,40);
        hex.setLocation(30,160);
        hex.setFont(new Font("",Font.BOLD,35));
        hex.setForeground(Color.black);
        hex.setBackground(new Color(c.getBackground().getRed()+30 > 255? c.getBackground().getRed(): c.getBackground().getRed()+30,c.getBackground().getGreen()+30 > 255? c.getBackground().getGreen(): c.getBackground().getGreen()+30,c.getBackground().getBlue()+30 > 255? c.getBackground().getBlue(): c.getBackground().getBlue()+30));
        hex.setOpaque(true);
        c.add(hex);
        
        hsbc = Color.RGBtoHSB(c.getBackground().getRed(), c.getBackground().getGreen(), c.getBackground().getBlue(), null);
        hsbc[0] = Math.round(hsbc[0]*100)/100.00f;
        hsbc[1] = Math.round(hsbc[1]*100)/100.00f;
        hsbc[2] = Math.round(hsbc[2]*100)/100.00f;
        JLabel hsb = new JLabel("HSB: "+hsbc[0]+", "+hsbc[1]+", "+hsbc[2]);
        hsb.setSize(400,40);
        hsb.setLocation(30,240);
        hsb.setFont(new Font("",Font.BOLD,35));
        hsb.setForeground(Color.black);
        hsb.setBackground(new Color(c.getBackground().getRed()+30 > 255? c.getBackground().getRed(): c.getBackground().getRed()+30,c.getBackground().getGreen()+30 > 255? c.getBackground().getGreen(): c.getBackground().getGreen()+30,c.getBackground().getBlue()+30 > 255? c.getBackground().getBlue(): c.getBackground().getBlue()+30));
        hsb.setOpaque(true);
        c.add(hsb);
        
        JButton change = new JButton("Change Colour");
        change.setSize(250,50);
        change.setBackground(new Color(50,50,50));
        change.setForeground(Color.white);
        change.setLocation(30,330);
        change.setFont(new Font("",Font.BOLD,25));
        change.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                c.setBackground(JColorChooser.showDialog(null, "Color Chooser", c.getBackground()));
                rgb.setText("RGB: "+c.getBackground().getRed()+", "+c.getBackground().getGreen()+", "+c.getBackground().getBlue());
                hex.setText("HEX: #"+Integer.toHexString(c.getBackground().getRGB()).substring(2).toUpperCase());
                hsbc = Color.RGBtoHSB(c.getBackground().getRed(), c.getBackground().getGreen(), c.getBackground().getBlue(), null);
                hsbc[0] = Math.round(hsbc[0]*100)/100.00f;
                hsbc[1] = Math.round(hsbc[1]*100)/100.00f;
                hsbc[2] = Math.round(hsbc[2]*100)/100.00f;
                hsb.setText("HSB: "+hsbc[0]+", "+hsbc[1]+", "+hsbc[2]);
                
                rgb.setBackground(new Color(c.getBackground().getRed()+30 > 255? c.getBackground().getRed(): c.getBackground().getRed()+30,c.getBackground().getGreen()+30 > 255? c.getBackground().getGreen(): c.getBackground().getGreen()+30,c.getBackground().getBlue()+30 > 255? c.getBackground().getBlue(): c.getBackground().getBlue()+30));
                hsb.setBackground(new Color(c.getBackground().getRed()+30 > 255? c.getBackground().getRed(): c.getBackground().getRed()+30,c.getBackground().getGreen()+30 > 255? c.getBackground().getGreen(): c.getBackground().getGreen()+30,c.getBackground().getBlue()+30 > 255? c.getBackground().getBlue(): c.getBackground().getBlue()+30));
                hex.setBackground(new Color(c.getBackground().getRed()+30 > 255? c.getBackground().getRed(): c.getBackground().getRed()+30,c.getBackground().getGreen()+30 > 255? c.getBackground().getGreen(): c.getBackground().getGreen()+30,c.getBackground().getBlue()+30 > 255? c.getBackground().getBlue(): c.getBackground().getBlue()+30));
            }
        });
        c.add(change);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        
        JButton copy1 = new JButton("Copy");
        copy1.setSize(150,50);
        copy1.setBackground(new Color(50,50,50));
        copy1.setForeground(Color.white);
        copy1.setLocation(500,80);
        copy1.setFont(new Font("",Font.BOLD,25));
        copy1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Transferable transferableText = new StringSelection(""+c.getBackground().getRed()+", "+c.getBackground().getGreen()+", "+c.getBackground().getBlue());
                clipboard.setContents(transferableText, null);
            }
        });
        c.add(copy1);
        
        JButton copy2 = new JButton("Copy");
        copy2.setSize(150,50);
        copy2.setBackground(new Color(50,50,50));
        copy2.setForeground(Color.white);
        copy2.setLocation(500,160);
        copy2.setFont(new Font("",Font.BOLD,25));
        copy2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Transferable transferableText = new StringSelection(""+Integer.toHexString(c.getBackground().getRGB()).substring(2).toUpperCase());
                clipboard.setContents(transferableText, null);
            }
        });
        c.add(copy2);
        
        JButton copy3 = new JButton("Copy");
        copy3.setSize(150,50);
        copy3.setBackground(new Color(50,50,50));
        copy3.setForeground(Color.white);
        copy3.setLocation(500,240);
        copy3.setFont(new Font("",Font.BOLD,25));
        copy3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Transferable transferableText = new StringSelection(""+hsbc[0]+", "+hsbc[1]+", "+hsbc[2]);
                clipboard.setContents(transferableText, null);
            }
        });
        c.add(copy3);
        
        c.repaint();
    }
}