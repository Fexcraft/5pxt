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
@fModel(registryname = "5pxt:models/vehicle/wagon1")
public class Wagon1Flatbed extends VehicleModel {

	public Wagon1Flatbed(){
		super(); textureX = 128; textureY = 32;
		this.addToCreators("Ferdinand (FEX___96)");
		gui_scale_x = gui_scale_y = gui_scale_z = .75f; gui_translate_y = -.25f;
		//
		TurboList chassis = new TurboList("chassis");
		chassis.add(new ModelRendererTurbo(chassis, 73, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-7.5f, -2.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 82, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f)
			.setRotationPoint(-7.5f, -2.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 111, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(16.5f, -2.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 121, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(16.5f, -2.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 115, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-18.5f, -2.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-18.5f, -2.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 7, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, -3.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 22, 18, textureX, textureY).addBox(0, 0, 2, 1, 1, 2)
			.setRotationPoint(18, -2.5f, -3).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 15, 18, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-19, -2.5f, -1).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(16.5f, -2.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 101, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-18.5f, -2.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 95, 16, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(17.75f, -3, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 90, 16, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(17.75f, -3, 1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 78, 16, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-18.75f, -3, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 73, 16, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-18.75f, -3, 1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 84, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1.5f, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-7.5f, -2.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 122, 15, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(0, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 117, 15, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(4, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 65, 15, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(8, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 60, 15, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(12, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 55, 15, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(16, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 50, 15, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-4, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 45, 15, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-8, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 40, 15, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-12, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 35, 15, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-16, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 30, 15, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(0, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 25, 15, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(4, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 20, 15, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(8, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 15, 15, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(12, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 10, 15, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(16, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 15, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-4, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 123, 12, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-8, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 118, 12, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-12, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 78, 9, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-16, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(chassis);
		//
		TurboList lights_front_rear = new TurboList("lights_front_rear");
		lights_front_rear.add(new ModelRendererTurbo(lights_front_rear, 73, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(17.625f, -2.75f, -3.25f).setRotationAngle(0, 0, 0)
		);
		lights_front_rear.add(new ModelRendererTurbo(lights_front_rear, 82, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(17.625f, -2.75f, 2.25f).setRotationAngle(0, 0, 0)
		);
		lights_front_rear.addProgram(DefaultPrograms.LIGHTS_FRONT_BACKWARD);
		this.groups.add(lights_front_rear);
		//
		TurboList lights_rear_rear = new TurboList("lights_rear_rear");
		lights_rear_rear.add(new ModelRendererTurbo(lights_rear_rear, 0, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-18.625f, -2.75f, -3.25f).setRotationAngle(0, 0, 0)
		);
		lights_rear_rear.add(new ModelRendererTurbo(lights_rear_rear, 122, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-18.625f, -2.75f, 2.25f).setRotationAngle(0, 0, 0)
		);
		lights_rear_rear.addProgram(DefaultPrograms.LIGHTS_REAR_FORWARD);
		this.groups.add(lights_rear_rear);
		//
		TurboList primary = new TurboList("primary");
		primary.add(new ModelRendererTurbo(primary, 80, 16, textureX, textureY).addBox(0, 0, 0, 1, 1, 7)
			.setRotationPoint(-18.5f, -4, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 35, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-17.5f, -4, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 35, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-17.5f, -4, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 63, 15, textureX, textureY).addBox(0, 0, 0, 1, 1, 7)
			.setRotationPoint(17.5f, -4, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.addProgram(DefaultPrograms.RGB_PRIMARY);
		this.groups.add(primary);
	}

}
