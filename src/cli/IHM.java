package cli;

import javax.swing.*;

import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class IHM implements Runnable, ActionListener {

    private JButton pwdBtn, lsBtn, userBtn, passBtn, getBtn, storBtn, cdBtn, rmdirBtn, mkdirBtn, validerBtn;
    private JTextField inputField, outputField;
    //socket
    private String serverName = "localhost";
    private int serverPort = 2121;
    
    public void run() {
        JFrame frame = new JFrame("My FTP Client");

        // Création des boutons
        pwdBtn = new JButton("PWD");
        lsBtn = new JButton("LS");
        userBtn = new JButton("USER");
        passBtn = new JButton("PASS");
        getBtn = new JButton("GET");
        storBtn = new JButton("STOR");
        cdBtn = new JButton("CD");
        rmdirBtn = new JButton("RMDIR");
        mkdirBtn = new JButton("MKDIR");
        validerBtn = new JButton("VALIDER");

        // Ajout des écouteurs d'événements aux boutons
        pwdBtn.addActionListener(this);
        lsBtn.addActionListener(this);
        userBtn.addActionListener(this);
        passBtn.addActionListener(this);
        getBtn.addActionListener(this);
        storBtn.addActionListener(this);
        cdBtn.addActionListener(this);
        rmdirBtn.addActionListener(this);
        mkdirBtn.addActionListener(this);
        validerBtn.addActionListener(this);

        // Création des champs de texte
        inputField = new JTextField(50);
        outputField = new JTextField(30);

        // Création du conteneur pour les boutons
        JPanel buttonPanelHaut = new JPanel();
        buttonPanelHaut.add(pwdBtn);
        buttonPanelHaut.add(lsBtn);
        buttonPanelHaut.add(userBtn);
        buttonPanelHaut.add(passBtn);
        buttonPanelHaut.add(getBtn);
        buttonPanelHaut.add(storBtn);
        buttonPanelHaut.add(cdBtn);
        buttonPanelHaut.add(rmdirBtn);
        buttonPanelHaut.add(mkdirBtn);
        buttonPanelHaut.add(validerBtn);

        // Ajout des composants à la fenêtre
        frame.getContentPane().add(buttonPanelHaut, "North");
        frame.getContentPane().add(inputField, "Center" );
        frame.getContentPane().add(outputField, "South");
        
        
         // Configuration de la fenêtre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pwdBtn) {
            // Code pour le bouton PWD
        } else if (e.getSource() == lsBtn) {
            // Code pour le bouton LS
        } else if (e.getSource() == userBtn) {
            // Code pour le bouton USER
        } else if (e.getSource() == passBtn) {
            // Code pour le bouton PASS
        } else if (e.getSource() == getBtn) {
            /*Thread t = new Thread(new Runnable() {
                public void run() {
                    try {
                        // Connexion à la socket FTP
                        Socket socket = new Socket(serverName, serverPort);
                        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

                        // Envoi de la commande GET
                        writer.println("GET " + inputField.getText());
                        reader.readLine();

                        // Fermeture de la socket
                        socket.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            });
            t.start();*/
        } else if (e.getSource() == storBtn) {
            // Code pour le bouton STOR
        } else if (e.getSource() == cdBtn) {
            // Code pour le bouton CD
        } else if (e.getSource() == rmdirBtn) {
            // Code pour le bouton RMDIR
        } else if (e.getSource() == mkdirBtn) {
            // Code pour le bouton MKDIR
        } else if (e.getSource() == validerBtn) {
        
        
        
        }

    }
    public static void main(String[] args) {
        // Crée et affiche la fenêtre
    	IHM ui = new IHM();
        SwingUtilities.invokeLater(ui);    
    }
}
