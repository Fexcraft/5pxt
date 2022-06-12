//FMT-Marker FVTM-1.1
package net.fexcraft.mod.addon.pack5pxt.models.vehicles;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.ModelGroup;
import net.fexcraft.mod.fvtm.model.VehicleModel;

/** This file was exported via the FVTM Exporter V1.2 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.9 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "5pxt:models/vehicle/wagon2")
public class Wagon2Box extends VehicleModel {

	public Wagon2Box(){
		super(); textureX = 128; textureY = 64;
		this.addToCreators("Ferdinand (FEX___96)");
		item_scale.setAll(.75f);
		item_translate.setAll(0, -.25f, 0);
		//
		ModelGroup chassis = new ModelGroup("chassis");
		chassis.add(new ModelRendererTurbo(chassis, 79, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-7.5f, -2.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 77, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f)
			.setRotationPoint(-7.5f, -2.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(16.5f, -2.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 121, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(16.5f, -2.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 114, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-18.5f, -2.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 77, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-18.5f, -2.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 7, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, -3.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 34, 37, textureX, textureY).addBox(0, 0, 2, 1, 1, 2)
			.setRotationPoint(18, -2.5f, -3).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 27, 37, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-19, -2.5f, -1).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 100, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(16.5f, -2.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 90, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-18.5f, -2.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 10, 37, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(17.75f, -3, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 120, 36, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(17.75f, -3, 1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 115, 36, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-18.75f, -3, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 81, 36, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-18.75f, -3, 1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 79, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1.5f, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-7.5f, -2.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 76, 36, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(0, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 71, 36, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(4, -9.125f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 19, 36, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(8, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 67, 34, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(12, -9.125f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 62, 34, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(16, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 57, 34, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-4, -9.125f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 52, 34, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-8, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 47, 34, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-12, -9.125f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 42, 34, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-16, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 37, 34, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(0, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 32, 34, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(4, -9.125f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 27, 34, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(8, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 15, 34, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(12, -9.125f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 10, 34, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(16, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 105, 30, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-4, -9.125f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 100, 30, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-8, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 90, 30, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-12, -9.125f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 119, 26, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-16, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(chassis);
		//
		ModelGroup dl0 = new ModelGroup("dl0");
		dl0.add(new ModelRendererTurbo(dl0, 113, 29, textureX, textureY).addBox(0, 0, 0, 6, 5, 1)
			.setRotationPoint(1, -8, 2.375f).setRotationAngle(0, 0, 0)
		);
		dl0.add(new ModelRendererTurbo(dl0, 75, 29, textureX, textureY).addBox(0, 0, 0, 6, 5, 1)
			.setRotationPoint(-7, -8, 2.375f).setRotationAngle(0, 0, 0)
		);
		dl0.addPrograms(DefaultPrograms.RGB_PRIMARY);
		this.groups.add(dl0);
		//
		ModelGroup dr0 = new ModelGroup("dr0");
		dr0.add(new ModelRendererTurbo(dr0, 111, 15, textureX, textureY).addBox(0, 0, 0, 6, 5, 1)
			.setRotationPoint(1, -8, -3.375f).setRotationAngle(0, 0, 0)
		);
		dr0.add(new ModelRendererTurbo(dr0, 112, 8, textureX, textureY).addBox(0, 0, 0, 6, 5, 1)
			.setRotationPoint(-7, -8, -3.375f).setRotationAngle(0, 0, 0)
		);
		dr0.addPrograms(DefaultPrograms.RGB_PRIMARY);
		this.groups.add(dr0);
		//
		ModelGroup lights_front_rear = new ModelGroup("lights_front_rear");
		lights_front_rear.add(new ModelRendererTurbo(lights_front_rear, 114, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(17.625f, -2.75f, -3.25f).setRotationAngle(0, 0, 0)
		);
		lights_front_rear.add(new ModelRendererTurbo(lights_front_rear, 80, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(17.625f, -2.75f, 2.25f).setRotationAngle(0, 0, 0)
		);
		lights_front_rear.addProgram(DefaultPrograms.LIGHTS_RAIL_BACKWARD);
		this.groups.add(lights_front_rear);
		//
		ModelGroup lights_rear_rear = new ModelGroup("lights_rear_rear");
		lights_rear_rear.add(new ModelRendererTurbo(lights_rear_rear, 75, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-18.625f, -2.75f, -3.25f).setRotationAngle(0, 0, 0)
		);
		lights_rear_rear.add(new ModelRendererTurbo(lights_rear_rear, 115, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-18.625f, -2.75f, 2.25f).setRotationAngle(0, 0, 0)
		);
		lights_rear_rear.addProgram(DefaultPrograms.LIGHTS_RAIL_FORWARD);
		this.groups.add(lights_rear_rear);
		//
		ModelGroup primary = new ModelGroup("primary");
		primary.add(new ModelRendererTurbo(primary, 50, 26, textureX, textureY).addBox(0, 0, 0, 11, 6, 1)
			.setRotationPoint(6.5f, -9, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 25, 26, textureX, textureY).addBox(0, 0, 0, 11, 6, 1)
			.setRotationPoint(6.5f, -9, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 82, 19, textureX, textureY).addBox(0, 0, 0, 13, 1, 1)
			.setRotationPoint(-6.5f, -9, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 82, 16, textureX, textureY).addBox(0, 0, 0, 13, 1, 1)
			.setRotationPoint(-6.5f, -9, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 17, textureX, textureY).addBox(0, 0, 0, 2, 5, 1)
			.setRotationPoint(-1, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 120, 0, textureX, textureY).addBox(0, 0, 0, 2, 5, 1)
			.setRotationPoint(-1, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 17, 34, textureX, textureY).addBox(0, 0, 0, 1, 6, 7)
			.setRotationPoint(-18.5f, -9, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 34, textureX, textureY).addBox(0, 0, 0, 1, 6, 7)
			.setRotationPoint(17.5f, -9, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 26, textureX, textureY).addBox(0, 0, 0, 11, 6, 1)
			.setRotationPoint(-17.5f, -9, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 89, 22, textureX, textureY).addBox(0, 0, 0, 11, 6, 1)
			.setRotationPoint(-17.5f, -9, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.addProgram(DefaultPrograms.RGB_PRIMARY);
		this.groups.add(primary);
		//
		ModelGroup secondary = new ModelGroup("secondary");
		secondary.add(new ModelRendererTurbo(secondary, 0, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, -10, 2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 0, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, -10, 0.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 0, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, -10, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 0, 3, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 2, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, -10, -2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 0, 0, textureX, textureY).addBox(0, 0, 0, 37, 1, 1)
			.setRotationPoint(-18.5f, -10, -0.5f).setRotationAngle(0, 0, 0)
		);
		secondary.addProgram(DefaultPrograms.RGB_SECONDARY);
		this.groups.add(secondary);
	}

}
