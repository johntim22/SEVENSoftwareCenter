import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Entered Main");
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //Changing theme
            //UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        } catch(Exception ignored){}
        //JOptionPane.showMessageDialog(null,"ATTENTION! The current application is still under development and can be used only for testing purposes!","SEVEN Software Center",JOptionPane.WARNING_MESSAGE);
        //Creaing the window
        JFrame mainwindow = new JFrame("SEVEN CHC Software Center v1.0");
        mainwindow.setSize(500,400);
        mainwindow.setResizable(false);
        mainwindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Image icon = Toolkit.getDefaultToolkit().getImage("mainicon.png");
        mainwindow.setIconImage(icon);
        //Menubar
        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu help = new JMenu("Help");
        mb.add(file);
        mb.add(help);
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        file.add(exit);
        //Center
        JPanel banner = new JPanel();
        Color qatar = new Color(6,78,64);
        banner.setBackground(qatar);
        JLabel welcomemessage = new JLabel("SEVEN CHC Software Center");
        welcomemessage.setFont(new Font("Segoe UI Light", Font.PLAIN,25));
        JLabel wlecomesubtitle = new JLabel("Simple. Direct. Efficient.");
        wlecomesubtitle.setFont(new Font("Segoe Script", Font.PLAIN,15));
        wlecomesubtitle.setForeground(Color.white);
        welcomemessage.setForeground(Color.white);
        banner.add(welcomemessage);
        banner.add(wlecomesubtitle);
       JTabbedPane centermenu = new JTabbedPane();
        JPanel officetab = new JPanel();
        JButton msoffic = new JButton("Microsoft Office");
        File msdir = new File("C:\\Program Files (x86)\\Microsoft Office");
        if (msdir.exists()){
          msoffic.setBackground(Color.green);
          msoffic.setEnabled(false);
        }
        else {
            msoffic.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start;winget install 9WZDNCRD29V9"});
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
        }
        JButton liboffi = new JButton("Libre Office");
        File liboffice = new File("C:\\Program Files (x86)\\LibreOffice");
        File liboffice2 = new File("C:\\Program Files\\LibreOffice");
        if (liboffice.exists() || liboffice2.exists()){
            liboffi.setBackground(Color.green);
            liboffi.setEnabled(false);
        }
        else {
            liboffi.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start;winget install TheDocumentFoundation.LibreOffice"});
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
        }
        JButton openoffice = new JButton("Open Office");
        File openoffice1 = new File("C:\\Program Files (x86)\\OpenOffice 4");
        File openoffice2 = new File("C:\\Program Files\\OpenOffice");
        if (openoffice1.exists() || openoffice2.exists()){
            openoffice.setBackground(Color.green);
            openoffice.setEnabled(false);
        }
        else {
            openoffice.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start;winget install Apache.OpenOffice"});
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
        }
        officetab.add(msoffic);
        officetab.add(liboffi);
        officetab.add(openoffice);
        officetab.setLayout(new GridLayout(1,3));
        JPanel browsertab = new JPanel();
        JButton sevzip = new JButton("7Zip");
        File sezip1 = new File("C:\\Program Files\\7-Zip");
        File sezip2 = new File("C:\\Program Files (x86)\\7-Zip");
        if (sezip1.exists() || sezip2.exists()){
            sevzip.setBackground(Color.green);
            sevzip.setEnabled(false);
        }
        else {
            sevzip.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start;winget install 7zip.7zip"});
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
        }
        JButton winzip = new JButton("WinRAR");
        File winzip1 = new File("C:\\Program Files (x86)\\WinRAR");
        File winzip2 = new File("C:\\Program Files\\WinRAR");
        if (winzip1.exists() || winzip2.exists()){
            winzip.setBackground(Color.green);
            winzip.setEnabled(false);
        }
        else {
            winzip.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start;winget install RARLab.WinRAR"});
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
        }
        JButton ditto = new JButton("Ditto");
        File ditto1 = new File("C:\\Program Files (x86)\\Ditto");
        File ditto2 = new File("C:\\Program Files\\Ditto");
        if (ditto1.exists() || ditto2.exists()){
            ditto.setBackground(Color.green);
            ditto.setEnabled(false);
        }
        else {
            ditto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start;winget install Ditto.Ditto"});
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
        }
        JButton lightshot = new JButton("LightShot");
        File light1 = new File("C:\\Program Files (x86)\\Skillbrains\\lightshot");
        File light2 = new File("C:\\Program Files\\Skillbrains\\lightshot");
        if (light2.exists() || light1.exists()){
            lightshot.setBackground(Color.green);
            lightshot.setEnabled(false);
        }
        else {
            lightshot.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start;winget install Skillbrains.Lightshot"});
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
        }
        JButton foxitreader = new JButton("Foxit Reader PDF");
        File foxit1 = new File("C:\\Program Files (x86)\\Foxit Software\\Foxit PDF Reader");
        File foxit2 = new File("C:\\Program Files\\Foxit Software\\Foxit PDF Reader");
        if (foxit1.exists() || foxit2.exists()){
            foxitreader.setBackground(Color.green);
            foxitreader.setEnabled(false);
        }
        else {
            foxitreader.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start;winget install Foxit.FoxitReader"});
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
        }
        JButton utorrent = new JButton("QBitTorrent");
        File ytor1 = new File("C:\\Program Files\\qBittorrent");
        File ytor2 = new File("C:\\Program Files (x86)\\qBittorrent");
        if (ytor1.exists() || ytor2.exists()){
            utorrent.setBackground(Color.green);
            utorrent.setEnabled(false);
        }
        else {
            utorrent.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start;winget install  qBittorrent.qBittorrent"});
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
        }
        JButton emule = new JButton("E-mule");
        File emule1 = new File("C:\\Program Files (x86)\\eMule");
        File emule2 = new File("C:\\Program Files\\eMule");
        if (emule2.exists() || emule1.exists()){
            emule.setBackground(Color.green);
            emule.setEnabled(false);
        }
        else {
            emule.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start;winget install eMule.eMule.community"});
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
        }
        JButton jdownl = new JButton("JDownloader");
        File j1 = new File("C:\\Program Files\\JDownloader");
        File j2 = new File("C:\\Program Files (x86)\\JDownloader");
        if (j1.exists() || j2.exists()){
            jdownl.setBackground(Color.green);
            jdownl.setEnabled(false);
        }
        else {
            jdownl.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start;winget install AppWork.JDownloader"});
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
        }
        JPanel utilitiestab = new JPanel();
        utilitiestab.add(sevzip);
        utilitiestab.add(winzip);
        utilitiestab.add(ditto);
        utilitiestab.add(lightshot);
        utilitiestab.add(foxitreader);
        utilitiestab.add(utorrent);
        utilitiestab.add(emule);
        utilitiestab.add(jdownl);
        utilitiestab.setLayout(new GridLayout(4,4));
        JPanel gamestab = new JPanel();
       centermenu.add("Office", officetab);
       JButton chrome = new JButton("Google Chrome");
        File chrome1 = new File("C:\\Program Files\\Google\\Chrome");
        File chrome2 = new File("C:\\Program Files (x86)\\Google\\Chrome");
        if (chrome2.exists() || chrome1.exists()){
            chrome.setBackground(Color.green);
            chrome.setEnabled(false);
        }
        else {
            chrome.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start;winget install Google.Chrome"});
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
        }
       JButton firefox = new JButton("Mozilla Firefox");
        File fir1 = new File("C:\\Program Files\\Mozilla Firefox");
        File fir2 = new File("C:\\Program Files (x86)\\Mozilla Firefox");
        if (fir2.exists() || fir1.exists()){
            firefox.setBackground(Color.green);
            firefox.setEnabled(false);
        }
        else {
            firefox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start;winget install Mozilla.Firefox"});
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
        }
       JButton edge = new JButton("Microsoft Edge");
        File edge1 = new File("C:\\Program Files (x86)\\Microsoft\\Edge");
        File edge2 = new File("C:\\Program Files\\Microsoft\\Edge");
        if (edge1.exists() || edge2.exists()){
            edge.setBackground(Color.green);
            edge.setEnabled(false);
        }
        else {
            edge.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start;winget install Microsoft.Edge"});
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
        }
       JButton opera = new JButton("Opera");
        File op1 = new File("C:\\Program Files (x86)\\Opera");
        File op2 = new File("C:\\Program Files\\Opera");
        if (op1.exists() || op2.exists()){
            opera.setBackground(Color.green);
            opera.setEnabled(false);
        }
        else {
            opera.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        JOptionPane.showMessageDialog(mainwindow,"Application may be already installed. Please check before you proceed.\n" +
                                "To cancel installation press CTRL+C on the next window (command line).");
                        Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start;winget install Opera.Opera"});
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
        }
       JButton brave = new JButton("Brave Browser");
        File brave1 = new File("C:\\Program Files (x86)\\Brave");
        File brave2 = new File("C:\\Program Files\\Brave");
        if (brave1.exists() || brave2.exists()){
            brave.setBackground(Color.green);
            brave.setEnabled(false);
        }
        else {
            brave.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        JOptionPane.showMessageDialog(mainwindow,"Application may be already installed. Please check before you proceed.\n" +
                                "To cancel installation press CTRL+C on the next window (command line).");
                        Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start;winget install Brave.Brave"});
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
        }
       JButton operagx = new JButton("Maxthon Browser");
        File operagx1 = new File("C:\\Program Files (x86)\\Maxthon");
        File operagx2 = new File("C:\\Program Files\\Maxthon");
        if (operagx1.exists() || operagx2.exists()){
            operagx.setBackground(Color.green);
            operagx.setEnabled(false);
        }
        else {
            operagx.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        JOptionPane.showMessageDialog(mainwindow,"Application may be already installed. Please check before you proceed.\n" +
                                "To cancel installation press CTRL+C on the next window (command line).");
                        Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start;winget install Maxthon.Maxthon"});
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            });
        }
       browsertab.add(chrome);
       browsertab.add(firefox);
       browsertab.add(edge);
       browsertab.add(opera);
       browsertab.add(brave);
       browsertab.add(operagx);
       browsertab.setLayout(new GridLayout(3,3));
       JPanel autoconfigtab = new JPanel();
       JLabel messageafvt = new JLabel("<html>Auto configuration will install automatically Libre Office,<br>" +
               " WinRAR, Google Chrome and Foxit PDF Reader</html>");
       JButton autoconfigok = new JButton("Start");
       autoconfigok.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(mainwindow,"Auto Configuration will begin now!\nPlease close any other application you may have open.","Auto Configuration Start",JOptionPane.INFORMATION_MESSAGE);
               if (foxit1.exists() || foxit2.exists()){
                   JOptionPane.showMessageDialog(null,"Foxit PDF Reader is already installed.\n" +
                           "Setup will proceed with the next programs.");
               }
               else {
                   try {
                       Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start;winget install Foxit.FoxitReader"});
                   } catch (IOException ex) {
                       throw new RuntimeException(ex);
                   }
               }
               if (liboffice2.exists() || liboffice.exists()){
                   JOptionPane.showMessageDialog(null,"Libre Office is already installed.\n" +
                           "Setup will proceed with the next programs.");
               }
               else {
                   try {
                       Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start;winget install TheDocumentFoundation.LibreOffice"});
                   } catch (IOException ex) {
                       throw new RuntimeException(ex);
                   }
               }
               if (winzip2.exists() || winzip1.exists()){
                   JOptionPane.showMessageDialog(null,"WinRAR is already installed.\n" +
                           "Setup will proceed with the next programs.");
               }
               else {
                   try {
                       Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start;winget install RARLab.WinRAR"});
                   } catch (IOException ex) {
                       throw new RuntimeException(ex);
                   }
               }
               if (chrome1.exists() || chrome2.exists()){
                   JOptionPane.showMessageDialog(null,"Google Chrome is already installed.\n" +
                           "Setup will proceed with the next programs.");
               }
               else {
                   try {
                       Runtime.getRuntime().exec(new String[] {"cmd", "/C", "Start;winget install Google.Chrome"});
                   } catch (IOException ex) {
                       throw new RuntimeException(ex);
                   }
               }
           }
       });
       autoconfigtab.add(messageafvt);
       autoconfigtab.add(autoconfigok);
       centermenu.add("Browsers",browsertab);
        centermenu.add("Utilities",utilitiestab);
        centermenu.add("Games",gamestab);
        JButton callofatl = new JButton("Call of Atlantis");
        callofatl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(mainwindow,"Download and installation of this software must be done manually.");
                Desktop desktop = java.awt.Desktop.getDesktop();
                try {
                    //specify the protocol along with the URL
                    URI oURL = new URI("https://www.gametop.com/download-free-games/call-of-atlantis/download.html");
                    desktop.browse(oURL);
                } catch (URISyntaxException | IOException e2) {
                    e2.printStackTrace();
                }
            }
        });
        JButton mcfesp = new JButton("Mystery Case Files");
        mcfesp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Desktop desktop = java.awt.Desktop.getDesktop();
                try {
                    //specify the protocol along with the URL
                    URI oURL = new URI("https://www.bigfishgames.com/us/en/games/6958/mystery-case-files-escape-from-ravenhearst/?pc&lang=en");
                    desktop.browse(oURL);
                } catch (URISyntaxException | IOException e3) {
                    e3.printStackTrace();
                }
            }
        });
        gamestab.add(callofatl);
        gamestab.add(mcfesp);
        gamestab.setLayout(new GridLayout());
        centermenu.add("Auto Configuration", autoconfigtab);
        JPanel centergrid = new JPanel();
        centergrid.setLayout(new GridLayout(2,1));
        centergrid.add(banner);
        centergrid.add(centermenu);
        //South
        JPanel bottom = new JPanel();
        //bottom.setBackground(Color.red);
        JLabel message = new JLabel("Disabled applications are already installed!");
        //message.setForeground(Color.white);
        bottom.add(message);
        //Organizing the window
        mainwindow.getContentPane().add(BorderLayout.CENTER,centergrid);
        mainwindow.getContentPane().add(BorderLayout.NORTH, mb);
        mainwindow.getContentPane().add(BorderLayout.SOUTH, bottom);
        mainwindow.setVisible(true);
        }
    }