/**
 * Copyright (c) [2019] [Yared Abayneh Abebe]
 *
 * This file is part of Coupled_ABM-Flood_Model for Wilhelmsburg, Hamburg, Germany.
 * Coupled_ABM-Flood_Model is free software licensed under the CC BY-NC-SA 4.0
 * You are free to:
 *	 Share � copy and redistribute the material in any medium or format
 *   Adapt � remix, transform, and build upon the material
 * The licensor cannot revoke these freedoms as long as you follow the license terms.
 *	 Attribution � You must give appropriate credit, provide a link to the license, 
 *				  and indicate if changes were made. You may do so in any reasonable 
 *				  manner, but not in any way that suggests the licensor endorses you 
 *				  or your use.
 *	 NonCommercial � You may not use the material for commercial purposes.
 *	 ShareAlike � If you remix, transform, or build upon the material, you must distribute 
 *				 your contributions under the same license as the original. 
 *   Full license description: https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package collectiveStructure;

import physicalStructure.House;

/**
 * This class is not used in the model due to lack of data regarding businesses in Wilhelmsburg.
 *
 */
public class Businesses {
	// declaring and putting House object under Household Class guarantees a one to one relationship between them
	private House house; 

	public void Household(House house) {
		this.house = house;
	}

	/***********************************************************************************************
	 *********************************** Getters and Setters ****************************************
	 ***********************************************************************************************/

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}
}
