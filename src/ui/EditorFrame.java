package ui;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;

public class EditorFrame extends JFrame {
    private DisplayBase docDisplay = new DocDisplay(this);
	private JFileChooser dialog = new JFileChooser(System.getProperty("user.dir"));
	private String currentFile = "Untitled";//TODO dynamic?
	private boolean changed = false;

    public EditorFrame(){
        docDisplay.draw();
        JEditorPane docArea = docDisplay.getArea();
        docArea.setFont(new Font("Monospaced",Font.PLAIN,12)); //default font
        //Buidling a menu bar
        JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		menuBar.add(fileMenu); menuBar.add(editMenu);
        //TODO add JMenuItems for these
        //create menu items
        JMenuItem newMenuItem = new JMenuItem("New");
        newMenuItem.setMnemonic(KeyEvent.VK_N);
        newMenuItem.setActionCommand("New");

        JMenuItem openMenuItem = new JMenuItem("Open");
        openMenuItem.setActionCommand("Open");

        JMenuItem saveMenuItem = new JMenuItem("Save");
        saveMenuItem.setActionCommand("Save");

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setActionCommand("Exit");

        JMenuItem cutMenuItem = new JMenuItem("Cut");
        cutMenuItem.setActionCommand("Cut");

        JMenuItem copyMenuItem = new JMenuItem("Copy");
        copyMenuItem.setActionCommand("Copy");

        JMenuItem pasteMenuItem = new JMenuItem("Paste");
        pasteMenuItem.setActionCommand("Paste");

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
		fileMenu.addSeparator();
		for(int i=0; i<4; i++)
			fileMenu.getItem(i).setIcon(null);
		editMenu.add(Cut);
        editMenu.add(Copy);
        editMenu.add(Paste);
		editMenu.getItem(0).setText("Cut");
		editMenu.getItem(1).setText("Copy");
		editMenu.getItem(2).setText("Paste");

        //Building the toolbar
        JToolBar tool = new JToolBar();
		add(tool,BorderLayout.NORTH);
		tool.add(New);tool.add(Open);tool.add(Save);
		tool.addSeparator();

		JButton cut = tool.add(Cut);
        JButton copy = tool.add(Copy);
        JButton paste = tool.add(Paste);

		cut.setText(null); cut.setIcon(new ImageIcon("cut.gif"));
		copy.setText(null); copy.setIcon(new ImageIcon("copy.gif"));
		paste.setText(null); paste.setIcon(new ImageIcon("paste.gif"));

		Save.setEnabled(false);
		SaveAs.setEnabled(false);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		area.addKeyListener(k1);
		setTitle(currentFile);
		setVisible(true);
    }





}
