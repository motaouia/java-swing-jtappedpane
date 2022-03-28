package org.medmota.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class JTabbedPaneSample extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JTabbedPaneSample() throws Exception {
		super( "JTabbedPane sample" );
        this.setSize( 800, 500 );
        this.setLocationRelativeTo( null );
        this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        
        // --- On cr�e le conteneur d'onglets (partie gauche) ---
        JTabbedPane tabs = new JTabbedPane();
        tabs.setPreferredSize( new Dimension( 260, 0 ) );
        tabs.setTabPlacement( JTabbedPane.BOTTOM );

        // --- Premier onglet et son composant associ� ---
        tabs.addTab( "Explorer", new JScrollPane( new JTree() ) );

        // --- Second onglet et son composant associ� ---
        JEditorPane helpPane = new JEditorPane();
        helpPane.setEditable( false );
        //helpPane.setPage( "file:docs/index.html" );
        tabs.addTab( "Help", new JScrollPane( helpPane ) );
        
        // --- On cr�e un �diteur (partie droite) ---
        JTextArea editor = new JTextArea();
        JScrollPane scrollEditor = new JScrollPane( editor );        

        // -- On assemble la partie gauche et la partir droite dans un splitter ---
        JSplitPane splitter = new JSplitPane( JSplitPane.HORIZONTAL_SPLIT, tabs, scrollEditor );
        
        // --- On r�cup�re le contentPane et on y ajoute le splitter ---
        JPanel contentPane = (JPanel) getContentPane();
        contentPane.add( splitter, BorderLayout.CENTER );
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel( new NimbusLookAndFeel() );
        JTabbedPaneSample frame = new JTabbedPaneSample();
        frame.setVisible(true);

	}

}
