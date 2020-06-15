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
@fModel(registryname = "5pxt:models/vehicle/loco1")
public class Loco1Diesel extends VehicleModel {

	public Loco1Diesel(){
		super(); textureX = 128; textureY = 64;
		this.addToCreators("Ferdinand (FEX___96)");
		item_scale.setAll(.75f);
		item_translate.setAll(0, -.25f, 0);
		//
		//
		TurboList chassis = new TurboList("chassis");
		chassis.add(new ModelRendererTurbo(chassis, 109, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-3.5f, -2.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 92, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-3.5f, -2.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 22, textureX, textureY).addBox(0, 0, 0, 7, 1.5f, 5)
			.setRotationPoint(-3.5f, -2.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 49, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.5f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(12.5f, -2.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 37, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, 0, 0)
			.setRotationPoint(12.5f, -2.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 20, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-14.5f, -2.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 117, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, -0.25f, 0)
			.setRotationPoint(-14.5f, -2.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 29, 1, 7, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.5f, -3.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 61, 33, textureX, textureY).addBox(0, 0, 2, 1, 1, 2)
			.setRotationPoint(14, -2.5f, -3).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 41, 33, textureX, textureY).addBox(0, 0, 2, 1, 1, 2)
			.setRotationPoint(-15, -2.5f, -3).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 45, 15, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 2, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.5f, -10, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 21, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-10.5f, -10, 1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 70, 10, textureX, textureY).addBox(0, 0, 0, 21, 1, 3)
			.setRotationPoint(-10.5f, -10, -1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 77, 19, textureX, textureY).addBox(0, 0, 0, 17, 6, 5)
			.setRotationPoint(-8.5f, -9, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 66, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0)
			.setRotationPoint(12.5f, -2.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 56, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0)
			.setRotationPoint(-14.5f, -2.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 34, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.9375f, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11.5f, -10, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 54, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11.5f, -10, 1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 111, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-11.5f, -10, -1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 104, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, -0.5f, 0, 0, -0.9375f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.5f, -10, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 97, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.9375f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.5f, -10, 1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 88, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 3, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(10.5f, -10, -1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 86, 31, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(13.75f, -3, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 81, 31, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(13.75f, -3, 1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 31, 31, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-14.75f, -3, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 26, 31, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-14.75f, -3, 1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 121, 30, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-8.5f, -10.25f, -2).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 119, 10, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1, 1, 4, null)
			.setRotationPoint(-6, -10.25f, 0).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 120, 5, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1, 1, 4, null)
			.setRotationPoint(-3, -10.25f, 0).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 115, 4, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1, 1, 4, null)
			.setRotationPoint(0, -10.25f, 0).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 4, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1, 1, 4, null)
			.setRotationPoint(3, -10.25f, 0).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 122, 0, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1, 1, 4, null)
			.setRotationPoint(6, -10.25f, 0).setRotationAngle(0, 0, 0)
		);
		this.groups.add(chassis);
		//
		TurboList lights_front_head = new TurboList("lights_front_head");
		lights_front_head.add(new ModelRendererTurbo(lights_front_head, 21, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(13.625f, -4.5f, -3).setRotationAngle(0, 0, 0)
		);
		lights_front_head.add(new ModelRendererTurbo(lights_front_head, 13, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(13.625f, -4.5f, 2).setRotationAngle(0, 0, 0)
		);
		lights_front_head.addProgram(DefaultPrograms.LIGHTS_FRONT_FORWARD);
		this.groups.add(lights_front_head);
		//
		TurboList lights_front_rear = new TurboList("lights_front_rear");
		lights_front_rear.add(new ModelRendererTurbo(lights_front_rear, 8, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(13.625f, -4.5f, -2).setRotationAngle(0, 0, 0)
		);
		lights_front_rear.add(new ModelRendererTurbo(lights_front_rear, 0, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(13.625f, -4.5f, 1).setRotationAngle(0, 0, 0)
		);
		lights_front_rear.addProgram(DefaultPrograms.LIGHTS_FRONT_BACKWARD);
		this.groups.add(lights_front_rear);
		//
		TurboList lights_rear_head = new TurboList("lights_rear_head");
		lights_rear_head.add(new ModelRendererTurbo(lights_rear_head, 49, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-14.625f, -4.5f, -3).setRotationAngle(0, 0, 0)
		);
		lights_rear_head.add(new ModelRendererTurbo(lights_rear_head, 122, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-14.625f, -4.5f, 2).setRotationAngle(0, 0, 0)
		);
		lights_rear_head.addProgram(DefaultPrograms.LIGHTS_REAR_BACKWARD);
		this.groups.add(lights_rear_head);
		//
		TurboList lights_rear_rear = new TurboList("lights_rear_rear");
		lights_rear_rear.add(new ModelRendererTurbo(lights_rear_rear, 71, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-14.625f, -4.5f, -2).setRotationAngle(0, 0, 0)
		);
		lights_rear_rear.add(new ModelRendererTurbo(lights_rear_rear, 66, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-14.625f, -4.5f, 1).setRotationAngle(0, 0, 0)
		);
		lights_rear_rear.addProgram(DefaultPrograms.LIGHTS_REAR_FORWARD);
		this.groups.add(lights_rear_rear);
		//
		TurboList primary = new TurboList("primary");
		primary.add(new ModelRendererTurbo(primary, 61, 0, textureX, textureY).addBox(0, 0, 0, 29, 2, 1)
			.setRotationPoint(-14.5f, -5, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 0, textureX, textureY).addBox(0, 0, 0, 29, 2, 1)
			.setRotationPoint(-14.5f, -5, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 66, 7, textureX, textureY).addBox(0, 0, 0, 23, 1, 1)
			.setRotationPoint(-11.5f, -9, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 66, 4, textureX, textureY).addBox(0, 0, 0, 23, 1, 1)
			.setRotationPoint(-11.5f, -9, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 13, 30, textureX, textureY).addBox(0, 0, 0, 1, 2, 5)
			.setRotationPoint(-14.5f, -5, -2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 30, textureX, textureY).addBox(0, 0, 0, 1, 2, 5)
			.setRotationPoint(13.5f, -5, -2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 41, 19, textureX, textureY).addBox(0, 0, 0, 19, 3, 1)
			.setRotationPoint(-9.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 17, textureX, textureY).addBox(0, 0, 0, 19, 3, 1)
			.setRotationPoint(-9.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 56, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(12.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 123, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(12.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 27, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, -1, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-14.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 37, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(11.5f, -9, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 25, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 7, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-13.5f, -9, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.addProgram(DefaultPrograms.RGB_PRIMARY);
		this.groups.add(primary);
	}

}
