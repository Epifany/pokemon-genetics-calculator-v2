/**
 * Copyright 2020, Stephen Gung, All rights reserved
 */

package org.epifany.pokemonbreedprobabilitycalculator.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import org.epifany.pokemonbreedprobabilitycalculator.PokemonCommand;

/**
 * This class is responsible for GUI output handling
 * 
 * @author Stephen Gung
 */
public class RadioButtonContainer {
	protected final JRadioButton hp_include_rb;
	protected final JRadioButton atk_include_rb;
	protected final JRadioButton def_include_rb;
	protected final JRadioButton spa_include_rb;
	protected final JRadioButton spd_include_rb;
	protected final JRadioButton spe_include_rb;
	
	protected final JRadioButton hp_exclude_rb;
	protected final JRadioButton atk_exclude_rb;
	protected final JRadioButton def_exclude_rb;
	protected final JRadioButton spa_exclude_rb;
	protected final JRadioButton spd_exclude_rb;
	protected final JRadioButton spe_exclude_rb;
	
	protected final JRadioButton hp_optional_rb;
	protected final JRadioButton atk_optional_rb;
	protected final JRadioButton def_optional_rb;
	protected final JRadioButton spa_optional_rb;
	protected final JRadioButton spd_optional_rb;
	protected final JRadioButton spe_optional_rb;
	
	public RadioButtonContainer( String include, String exclude, String optional){
		hp_include_rb = createJRadioButton( include, true, PokemonCommand.HP_INC);
		atk_include_rb = createJRadioButton( include, true, PokemonCommand.ATK_INC);
		def_include_rb = createJRadioButton( include, true, PokemonCommand.DEF_INC);
		spa_include_rb = createJRadioButton( include, true, PokemonCommand.SPA_INC);
		spd_include_rb = createJRadioButton( include, true, PokemonCommand.SPD_INC);
		spe_include_rb = createJRadioButton( include, true, PokemonCommand.SPE_INC);
		
		hp_exclude_rb = createJRadioButton( exclude, false, PokemonCommand.HP_EXC);
		atk_exclude_rb = createJRadioButton( exclude, false, PokemonCommand.ATK_EXC);
		def_exclude_rb = createJRadioButton( exclude, false, PokemonCommand.DEF_EXC);
		spa_exclude_rb = createJRadioButton( exclude, false, PokemonCommand.SPA_EXC);
		spd_exclude_rb = createJRadioButton( exclude, false, PokemonCommand.SPD_EXC);
		spe_exclude_rb = createJRadioButton( exclude, false, PokemonCommand.SPE_EXC);
		
		hp_optional_rb = createJRadioButton( optional, false, PokemonCommand.HP_OPT);
		atk_optional_rb = createJRadioButton( optional, false, PokemonCommand.ATK_OPT);
		def_optional_rb = createJRadioButton( optional, false, PokemonCommand.DEF_OPT);
		spa_optional_rb = createJRadioButton( optional, false, PokemonCommand.SPA_OPT);
		spd_optional_rb = createJRadioButton( optional, false, PokemonCommand.SPD_OPT);
		spe_optional_rb = createJRadioButton( optional, false, PokemonCommand.SPE_OPT);
		
		ButtonGroup hp_group = new ButtonGroup();
		ButtonGroup atk_group = new ButtonGroup();
		ButtonGroup def_group = new ButtonGroup();
		ButtonGroup spa_group = new ButtonGroup();
		ButtonGroup spd_group = new ButtonGroup();
		ButtonGroup spe_group = new ButtonGroup();
		// RadioButtons for hp
		hp_group.add( hp_include_rb);
		hp_group.add( hp_exclude_rb);
		hp_group.add( hp_optional_rb);
		// RadioButtons for atk
		atk_group.add( atk_include_rb);
		atk_group.add( atk_exclude_rb);
		atk_group.add( atk_optional_rb);
		// RadioButtons for def
		def_group.add( def_include_rb);
		def_group.add( def_exclude_rb);
		def_group.add( def_optional_rb);
		// RadioButtons for spa
		spa_group.add( spa_include_rb);
		spa_group.add( spa_exclude_rb);
		spa_group.add( spa_optional_rb);
		// RadioButtons for spd
		spd_group.add( spd_include_rb);
		spd_group.add( spd_exclude_rb);
		spd_group.add( spd_optional_rb);
		// RadioButtons for spe
		spe_group.add( spe_include_rb);
		spe_group.add( spe_exclude_rb);
		spe_group.add( spe_optional_rb);
	}
	
	// Default panel for RadioButton gui
	public JPanel createRadioButtonPanel(){
		JPanel panel = new JPanel( new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		int width_label = 1;
		int width_rb = 2;
		
		c.gridwidth = width_label;
		c.gridx = 0;
		c.gridy = 0;
		panel.add( new JLabel("HP:"), c);
		c.gridy = 1;
		panel.add( new JLabel("Atk:"), c);
		c.gridy = 2;
		panel.add( new JLabel("Def:"), c);
		c.gridy = 3;
		panel.add( new JLabel("SpA:"), c);
		c.gridy = 4;
		panel.add( new JLabel("SpD:"), c);
		c.gridy = 5;
		panel.add( new JLabel("Spe:"), c);
		
		c.gridwidth = width_rb;
		c.gridx = c.gridx + width_label;
		c.gridy = 0;
		panel.add( hp_include_rb, c);
		c.gridy = 1;
		panel.add( atk_include_rb, c);
		c.gridy = 2;
		panel.add( def_include_rb, c);
		c.gridy = 3;
		panel.add( spa_include_rb, c);
		c.gridy = 4;
		panel.add( spd_include_rb, c);
		c.gridy = 5;
		panel.add( spe_include_rb, c);
		
		c.gridx = c.gridx + width_rb;
		c.gridy = 0;
		panel.add( hp_optional_rb, c);
		c.gridy = 1;
		panel.add( atk_optional_rb, c);
		c.gridy = 2;
		panel.add( def_optional_rb, c);
		c.gridy = 3;
		panel.add( spa_optional_rb, c);
		c.gridy = 4;
		panel.add( spd_optional_rb, c);
		c.gridy = 5;
		panel.add( spe_optional_rb, c);
		
		c.gridx = c.gridx + width_rb;
		c.gridy = 0;
		panel.add( hp_exclude_rb, c);
		c.gridy = 1;
		panel.add( atk_exclude_rb, c);
		c.gridy = 2;
		panel.add( def_exclude_rb, c);
		c.gridy = 3;
		panel.add( spa_exclude_rb, c);
		c.gridy = 4;
		panel.add( spd_exclude_rb, c);
		c.gridy = 5;
		panel.add( spe_exclude_rb, c);

		//panel.setBorder(BorderFactory.createEtchedBorder());
		
		return panel;
	}
	
	public JRadioButton getHPIncludeRB(){	return hp_include_rb;	}
	public JRadioButton getAtkIncludeRB(){	return atk_include_rb;	}
	public JRadioButton getDefIncludeRB(){	return def_include_rb;	}
	public JRadioButton getSpAIncludeRB(){	return spa_include_rb;	}
	public JRadioButton getSpDIncludeRB(){	return spd_include_rb;	}
	public JRadioButton getSpeIncludeRB(){	return spe_include_rb;	}
	
	public JRadioButton getHPExcludeRB(){	return hp_exclude_rb;	}
	public JRadioButton getAtkExcludeRB(){	return atk_exclude_rb;	}
	public JRadioButton getDefExcludeRB(){	return def_exclude_rb;	}
	public JRadioButton getSpAExcludeRB(){	return spa_exclude_rb;	}
	public JRadioButton getSpDExcludeRB(){	return spd_exclude_rb;	}
	public JRadioButton getSpeExcludeRB(){	return spe_exclude_rb;	}
	
	public JRadioButton getHPOptionalRB(){	return hp_optional_rb;	}
	public JRadioButton getAtkOptionalRB(){	return atk_optional_rb;	}
	public JRadioButton getDefOptionalRB(){	return def_optional_rb;	}
	public JRadioButton getSpAOptionalRB(){	return spa_optional_rb;	}
	public JRadioButton getSpDOptionalRB(){	return spd_optional_rb;	}
	public JRadioButton getSpeOptionalRB(){	return spe_optional_rb;	}
	
	// Helper method
	private JRadioButton createJRadioButton( String text, boolean selected, String command){
		JRadioButton jrb = new JRadioButton( text);
		jrb.setActionCommand( command);
		jrb.setSelected(selected);
		return jrb;
	}
}