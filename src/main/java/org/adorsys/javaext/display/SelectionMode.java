package org.adorsys.javaext.display;

/**
 * This will tell the processor how to organize selection of the 
 * referenced entity.
 * 
 * @author francis
 *
 */
public enum SelectionMode {
	/*
	 * Use a combobox to help select the entity to be displayed.
	 */
	COMBOBOX,
	/*
	 * Display the list of referenced entity in a scrolable table.
	 */
	TABLE,
	/*
	 * Forward control to the main display tab of the referenced entity 
	 * for selection. Referenced entity will be selected and sent back to caller
	 * for display.
	 */
	FORWARD,
	
	NONE;
}
