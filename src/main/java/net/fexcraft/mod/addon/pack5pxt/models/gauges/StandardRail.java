//FMT-Marker FVTM-1.3
package net.fexcraft.mod.addon.pack5pxt.models.gauges;

import net.fexcraft.lib.common.math.Vec3f;
import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.mod.fvtm.model.RailGaugeModel;

/** This file was exported via the FVTM Exporter V1.3 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.9 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "5pxt:models/gauges/standard")
public class StandardRail extends RailGaugeModel {

	public StandardRail(){
		super(); textureX = 256; textureY = 256;
		//
		this.rails = new Vec3f[][]{
			{ new Vec3f(-0.1875 , 0.125, 0), new Vec3f(-0.15625, 0.125, 0) },
			{ new Vec3f( 0.15625, 0.125, 0), new Vec3f( 0.1875 , 0.125, 0) },
			//
			/*{ new Vec3f(-0.1875 , 0.0625, 0), new Vec3f(-0.1875 , 0.01, 0) },
			{ new Vec3f(-0.15625, 0.0625, 0), new Vec3f(-0.15625, 0.01, 0) },
			//
			{ new Vec3f( 0.15625, 0.0625, 0), new Vec3f( 0.15625, 0.01, 0) },
			{ new Vec3f( 0.1875 , 0.0625, 0), new Vec3f( 0.1875 , 0.01, 0) },
			//
			{ new Vec3f(-0.1875 , 0.01, 0), new Vec3f(-0.15625, 0.01, 0) },
			{ new Vec3f( 0.15625, 0.01, 0), new Vec3f( 0.1875 , 0.01, 0) }*/
		};
	}

}
