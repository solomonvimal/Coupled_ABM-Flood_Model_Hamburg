/**
 * Copyright (c) [2018] [Yared Abayneh Abebe]
 *
 * This file is part of Coupled_ABM-Flood_Model for Wilhelmsburg, Hamburg, Germany.
 * Coupled_ABM-Flood_Model is free software licensed under the CC BY-NC-SA 4.0
 * You are free to:
 *	Share � copy and redistribute the material in any medium or format
 *   Adapt � remix, transform, and build upon the material
 * The licensor cannot revoke these freedoms as long as you follow the license terms.
 *	Attribution � You must give appropriate credit, provide a link to the license, 
 *				  and indicate if changes were made. You may do so in any reasonable 
 *				  manner, but not in any way that suggests the licensor endorses you 
 *				  or your use.
 *	NonCommercial � You may not use the material for commercial purposes.
 *	ShareAlike � If you remix, transform, or build upon the material, you must distribute 
 *				 your contributions under the same license as the original. 
 *  Full license description: https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
 
package aggregateDataCollection;

import physicalStructure.House;
import repast.simphony.data2.AggregateDataSource;
import wilhelmsburg.GlobalVariables;

/**
 * This class records the cumulative number of flooded houses at each time step.
 */
public class Measure4Implemented implements AggregateDataSource{
	@Override
	public String getId() {
		return "FB2 (cum)";
	}

	@Override
	public Class<?> getDataType() {
		return Integer.class;
	}

	@Override
	public Class<?> getSourceType() {
		return House.class;
	}

	@Override
	public Object get(Iterable<?> objs, int size) {
		int count = 0;
		for (Object o: objs) {
			if (((House) o).getPrimaryMeasure().equals(GlobalVariables.getMeasure4())) {
				count++;
			}
		}
		return count;
	}

	@Override
	public void reset() {
	}
}
