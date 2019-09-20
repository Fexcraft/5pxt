//FMT-Marker FVTM-1.3
package net.fexcraft.mod.addon.pack5pxt.models.gauges;

import net.fexcraft.lib.common.math.Vec3f;
import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.RailGaugeModel;
import net.fexcraft.mod.fvtm.model.TurboList;

/** This file was exported via the FVTM Exporter V1.3 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.9 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "5pxt:models/gauges/standard")
public class StandardRail extends RailGaugeModel {

	public StandardRail(){
		super(); textureX = 16; textureY = 16;
		//
		this.ties_distance = 0.125f;
		this.rails = new Vec3f[][]{
			{ new Vec3f(-0.1875, 0.09375, 0), new Vec3f(-0.15625, 0.09375, 0) },
			{ new Vec3f(0.15625, 0.09375, 0), new Vec3f(0.1875, 0.09375, 0) },
			//
			//{ new Vec3f(-0.1875, 0.125, 0), new Vec3f(-0.1875, 0.0625, 0) },
			{ new Vec3f(-0.1875, 0.0625, 0), new Vec3f(-0.1875, 0.09375, 0) },
			{ new Vec3f(-0.15625, 0.09375, 0), new Vec3f(-0.15625, 0.0625, 0) },
			//
			//{ new Vec3f(0.15625, 0.125, 0), new Vec3f(0.15625, 0.0625, 0) },
			{ new Vec3f(0.15625, 0.0625, 0), new Vec3f(0.15625, 0.09375, 0) },
			{ new Vec3f(0.1875, 0.09375, 0), new Vec3f(0.1875, 0.0625, 0) },
			//
			{ new Vec3f(-0.1875, 0.0625, 0), new Vec3f(-0.15625, 0.0625, 0) },
			{ new Vec3f(0.15625, 0.0625, 0), new Vec3f(0.1875, 0.0625, 0) }
		};
		TurboList ties = new TurboList("ties");
		ties.add(new ModelRendererTurbo(ties, 0, 0, textureX, textureY)
			.addShapeBox(-0.5f, 0, -5, 1, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(0, -1, 0).setRotationAngle(0, 0, 0).setName("ties_uni_piece")
		);
		this.groups.add(ties);
	}

}
