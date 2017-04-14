import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;

public class EditorUI extends JFrame {
    private DocDisplay docDisplay = new DocDisplay(this);
    private JTextArea docArea = docDisplay.getArea(20,120);
	private JFileChooser dialog = new JFileChooser(System.getProperty("user.dir"));
	private String currentFile = "Untitled";
	private boolean changed = false;

    public EditorUI(){
        docArea.setFont(new Font("Monospaced",Font.PLAIN,12)); //default font
		add(BorderLayout.CENTER);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		menuBar.add(fileMenu); menuBar.add(editMenu);
    }





}
