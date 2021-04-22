//FMT-Marker FVTM-1.1
package net.fexcraft.mod.addon.pack5pxt.models.vehicles;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.fexcraft.mod.fvtm.model.VehicleModel;

/** This file was exported via the FVTM Exporter V1.2 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.9 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "5pxt:models/vehicle/wagon3")
public class Wagon3Tanker extends VehicleModel {

	public Wagon3Tanker(){
		super(); textureX = 128; textureY = 32;
		this.addToCreators("Ferdinand (FEX___96)");
		item_scale.setAll(.75f);
		item_translate.setAll(0, -.25f, 0);
		//
		TurboList chassis = new TurboList("chassis");
		chassis.add(new ModelRendererTurbo(chassis, 50, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(13.5f, -2.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 14, 11, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(13.5f, -2.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 115, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-14.5f, -2.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 110, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-14.5f, -2.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 100, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.5f, -3.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 120, 8, textureX, textureY).addBox(0, 0, 2, 1, 1, 2)
			.setRotationPoint(14, -2.5f, -3).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 68, 8, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-15, -2.5f, -1).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 73, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1.5f, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(13.5f, -2.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 60, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1.5f, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-14.5f, -2.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 60, 8, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(13.75f, -2.9375f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 55, 8, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(13.75f, -2.9375f, 1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 50, 8, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-14.75f, -2.9375f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 35, 8, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-14.75f, -2.9375f, 1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 14, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 27, 1, 6, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.5f, -3.125f, -3).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 122, 4, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 1, 1, 4, null)
			.setRotationPoint(0, -8.25f, 0).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 75, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11, -7.75f, -2).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 40, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(13.5f, -3.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 122, 0, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 1, 1, 4, null)
			.setRotationPoint(-8, -8.25f, 0).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 14, 0, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 10, 1, 1, 4, null)
			.setRotationPoint(8, -8.25f, 0).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 75, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 22, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-11, -7.75f, 1).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 38, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-2, -7.5f, -2).setRotationAngle(-111, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 29, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.75f, 0)
			.setRotationPoint(-1, -7.5f, 2).setRotationAngle(-111, 180, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 24, 8, textureX, textureY)
			.addShapeBox(0, -1.25f, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-2, -3.5f, -3.3125f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 19, 8, textureX, textureY)
			.addShapeBox(0, -1.25f, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f)
			.setRotationPoint(-2, -3.5f, 3.0625f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(chassis);
		//
		TurboList lights_front_rear = new TurboList("lights_front_rear");
		lights_front_rear.add(new ModelRendererTurbo(lights_front_rear, 14, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(13.625f, -2.75f, -3.25f).setRotationAngle(0, 0, 0)
		);
		lights_front_rear.add(new ModelRendererTurbo(lights_front_rear, 117, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(13.625f, -2.75f, 2.25f).setRotationAngle(0, 0, 0)
		);
		lights_front_rear.addProgram(DefaultPrograms.LIGHTS_RAIL_BACKWARD);
		this.groups.add(lights_front_rear);
		//
		TurboList lights_rear_rear = new TurboList("lights_rear_rear");
		lights_rear_rear.add(new ModelRendererTurbo(lights_rear_rear, 112, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-14.625f, -2.75f, -3.25f).setRotationAngle(0, 0, 0)
		);
		lights_rear_rear.add(new ModelRendererTurbo(lights_rear_rear, 107, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-14.625f, -2.75f, 2.25f).setRotationAngle(0, 0, 0)
		);
		lights_rear_rear.addProgram(DefaultPrograms.LIGHTS_RAIL_FORWARD);
		this.groups.add(lights_rear_rear);
		//
		TurboList primary = new TurboList("primary");
		primary.add(new ModelRendererTurbo(primary, 1, 1, textureX, textureY).addCylinder(0, 0, 0, 3, 24, 16, 1, 1, 3, null)
			.setRotationPoint(-12, -5, 0).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 94, 6, textureX, textureY).addCylinder(0, 0, 0, 3, 1, 16, 0.75f, 1, 3, null)
			.setRotationPoint(-13, -5, 0).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 81, 6, textureX, textureY).addCylinder(0, 0, 0, 3, 1, 16, 1, 0.75f, 3, null)
			.setRotationPoint(12, -5, 0).setRotationAngle(0, 0, 0)
		);
		primary.addProgram(DefaultPrograms.RGB_PRIMARY);
		this.groups.add(primary);
	}

}
