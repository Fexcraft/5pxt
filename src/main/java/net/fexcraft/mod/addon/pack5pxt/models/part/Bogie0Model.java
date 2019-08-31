//FMT-Marker FVTM-1.1
package net.fexcraft.mod.addon.pack5pxt.models.part;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.fexcraft.mod.fvtm.model.PartModel;

/** This file was exported via the FVTM Exporter V1.2 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.9 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "5pxt:models/part/bogie0")
public class Bogie0Model extends PartModel {

	public Bogie0Model(){
		super(); textureX = 32; textureY = 32;
		this.addToCreators("Ferdinand");
		//
		TurboList axle0 = new TurboList("axle0");
		axle0.add(new ModelRendererTurbo(axle0, 22, 8, textureX, textureY).addCylinder(0, 0, 0, 1, 0.5f, 16, 1, 1, 1, null)
			.setRotationPoint(-2.5f, 1, 2.5f).setRotationAngle(0, 0, 0)
		);
		axle0.add(new ModelRendererTurbo(axle0, 16, 6, textureX, textureY).addCylinder(0, 0, 0, 1.125f, 0.125f, 16, 1, 1, 1, null)
			.setRotationPoint(-2.5f, 1, 2.375f).setRotationAngle(0, 0, 0)
		);
		axle0.add(new ModelRendererTurbo(axle0, 11, 6, textureX, textureY).addCylinder(0, 0, 0, 1, 0.5f, 16, 1, 1, 1, null)
			.setRotationPoint(-2.5f, 1, -3).setRotationAngle(0, 0, 0)
		);
		axle0.add(new ModelRendererTurbo(axle0, 5, 6, textureX, textureY).addCylinder(0, 0, 0, 1.125f, 0.125f, 16, 1, 1, 1, null)
			.setRotationPoint(-2.5f, 1, -2.5f).setRotationAngle(0, 0, 0)
		);
		axle0.add(new ModelRendererTurbo(axle0, 8, 20, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 5, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(-2.5f, 1, -2.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(axle0);
		//
		TurboList axle1 = new TurboList("axle1");
		axle1.add(new ModelRendererTurbo(axle1, 0, 6, textureX, textureY).addCylinder(0, 0, 0, 1, 0.5f, 16, 1, 1, 1, null)
			.setRotationPoint(2.5f, 1, 2.5f).setRotationAngle(0, 0, 0)
		);
		axle1.add(new ModelRendererTurbo(axle1, 25, 4, textureX, textureY).addCylinder(0, 0, 0, 1.125f, 0.125f, 16, 1, 1, 1, null)
			.setRotationPoint(2.5f, 1, 2.375f).setRotationAngle(0, 0, 0)
		);
		axle1.add(new ModelRendererTurbo(axle1, 27, 0, textureX, textureY).addCylinder(0, 0, 0, 1, 0.5f, 16, 1, 1, 1, null)
			.setRotationPoint(2.5f, 1, -3).setRotationAngle(0, 0, 0)
		);
		axle1.add(new ModelRendererTurbo(axle1, 21, 0, textureX, textureY).addCylinder(0, 0, 0, 1.125f, 0.125f, 16, 1, 1, 1, null)
			.setRotationPoint(2.5f, 1, -2.5f).setRotationAngle(0, 0, 0)
		);
		axle1.add(new ModelRendererTurbo(axle1, 0, 18, textureX, textureY)
			.addShapeBox(-0.5f, -0.5f, 0, 1, 1, 5, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0)
			.setRotationPoint(2.5f, 1, -2.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(axle1);
		//
		TurboList chassis = new TurboList("chassis");
		chassis.add(new ModelRendererTurbo(chassis, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 8, 1, 4, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-4, 0, -2).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 14, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-1, 0.5f, -3).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 11, 10, textureX, textureY).addBox(-1, -0.125f, -1, 2, 1, 2));
		chassis.add(new ModelRendererTurbo(chassis, 0, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-1, -0.5f, -3).setRotationAngle(0, 0, 0)
		);
		this.groups.add(chassis);
	}

}
