package org.medmota.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class MyTabbedPane extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JTabbedPane tabs;
	CoursePanel cource;
	SelectCoursePanel selectCourse;

	MyTabbedPane() {
		super("Tabbed Pane Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Setting the JTabbedPane Position and Layout as Wrap
		tabs = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.WRAP_TAB_LAYOUT);

		cource = new CoursePanel();
		selectCourse = new SelectCoursePanel();

		// Adding user defined pannels to JTabbedPane
		tabs.addTab("Cources", cource);
		tabs.addTab("Select Course", selectCourse);

		// Adding JPanels to JTabbedPane
		tabs.addTab("Listing", new JPanel());
		tabs.addTab("Comment", new JTextArea(10, 40));

		tabs.addTab("Register", new JPanel());
		tabs.addTab("Contact Us", new JPanel());

		tabs.addTab("More..", new JPanel());

		getContentPane().add(tabs);
	}
	

	public static void main(String args[]) throws Exception {
		MyTabbedPane frame = new MyTabbedPane();
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

}

/* Creating CoursePanel by extending JPanel */
class CoursePanel extends JPanel {

	/*JButton addCourse, clear;
	JPanel importfiles = new JPanel(); 
	JButton addImportFile= new JButton("imporet csv file");
	JPanel importfiles2 = new JPanel(); 
	JButton addImportFile2= new JButton("imporet csv file 2");
	CoursePanel() {
		addCourse = new JButton("Add Course");
		clear = new JButton("Clear");

		setLayout(new FlowLayout());

		add(addCourse);
		add(clear);
		
		importfiles.add(addImportFile);
		importfiles2.add(addImportFile2);
		add(importfiles);
		add(importfiles2)*/
	CoursePanel() {
		
		//this.s(new BorderLayout());
		//this.
		this.setLayout(new BorderLayout());

		JPanel paintPanel = new JPanel();
		JButton addImportFile= new JButton("imporet csv file");
		paintPanel.add(addImportFile);
		
		JPanel textPanel = new JPanel();
		JButton addImportFile2= new JButton("imporet csv file 2");
		textPanel.add(addImportFile2);
		
		add(paintPanel, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		
		//mainPanel.setVisible(true);
	}
}

/* Creating SelectCoursePanel by extending JPanel */
class SelectCoursePanel extends JPanel {

	JCheckBox java, swing, hibernate;

	SelectCoursePanel() {
		java = new JCheckBox("Java");
		swing = new JCheckBox("Spring");
		hibernate = new JCheckBox("Hibernate");

		setLayout(new BorderLayout());
		add(java, BorderLayout.NORTH);
		add(swing, BorderLayout.CENTER);
		add(hibernate, BorderLayout.SOUTH);
	}

}
