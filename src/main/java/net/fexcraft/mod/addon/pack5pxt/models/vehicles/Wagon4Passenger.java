//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.pack5pxt.models.vehicles;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.fexcraft.mod.fvtm.model.VehicleModel;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.3.4 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "5pxt:models/vehicle/wagon4")
public class Wagon4Passenger extends VehicleModel {

	public Wagon4Passenger(){
		super(); textureX = 128; textureY = 64;
		this.addToCreators("Ferdinand (FEX___96)");
		item_scale.setAll(.75f);
		item_translate.setAll(0, -.25f, 0);
		//
		TurboList chassis = new TurboList("chassis");
		chassis.add(new ModelRendererTurbo(chassis, 79, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-7.5f, -2.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 82, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f)
			.setRotationPoint(-7.5f, -2.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 35, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(16.5f, -2.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 10, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(16.5f, -2.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 94, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-18.5f, -2.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 120, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-18.5f, -2.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 52, 57, textureX, textureY).addBox(0, 0, 2, 1, 1, 2)
			.setRotationPoint(18, -2.5f, -3).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 45, 57, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-19, -2.5f, -1).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(16.5f, -2.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 104, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-18.5f, -2.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 40, 57, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(17.75f, -3, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 35, 57, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(17.75f, -3, 1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 10, 57, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-18.75f, -3, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 5, 57, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-18.75f, -3, 1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 84, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1.5f, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-7.5f, -2.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 57, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(0, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 122, 56, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(4, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 117, 56, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(8, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 102, 54, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(12, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 97, 54, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(17.5f, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 69, 54, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-4, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 64, 54, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-8, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 59, 54, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-12, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 33, 54, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-17.5f, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 10, 54, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(0, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 5, 54, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(4, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 54, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(8, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 120, 53, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(12, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 92, 53, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(17.5f, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 84, 53, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-4, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 79, 53, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-8, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 28, 53, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-12, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 84, 50, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-17.5f, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 86, 53, textureX, textureY).addBox(0, 0, 0, 1, 5, 3)
			.setRotationPoint(17.625f, -8.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 108, 52, textureX, textureY).addBox(0, 0, 0, 1, 5, 3)
			.setRotationPoint(-18.625f, -8.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(chassis);
		//
		TurboList doors_left = new TurboList("doors_left");
		doors_left.add(new ModelRendererTurbo(doors_left, 87, 39, textureX, textureY).addBox(0, 0, 0, 2, 5, 1)
			.setRotationPoint(14.5f, -8, 2.375f).setRotationAngle(0, 0, 0)
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 80, 39, textureX, textureY).addBox(0, 0, 0, 2, 5, 1)
			.setRotationPoint(-16.5f, -8, 2.375f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(doors_left);
		//
		TurboList doors_right = new TurboList("doors_right");
		doors_right.add(new ModelRendererTurbo(doors_right, 73, 39, textureX, textureY).addBox(0, 0, 0, 2, 5, 1)
			.setRotationPoint(14.5f, -8, -3.375f).setRotationAngle(0, 0, 0)
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 28, 39, textureX, textureY).addBox(0, 0, 0, 2, 5, 1)
			.setRotationPoint(-16.5f, -8, -3.375f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(doors_right);
		//
		TurboList lights_front_rear = new TurboList("lights_front_rear");
		lights_front_rear.add(new ModelRendererTurbo(lights_front_rear, 79, 50, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(17.625f, -2.75f, -3.25f).setRotationAngle(0, 0, 0)
		);
		lights_front_rear.add(new ModelRendererTurbo(lights_front_rear, 101, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(17.625f, -2.75f, 2.25f).setRotationAngle(0, 0, 0)
		);
		lights_front_rear.addProgram(DefaultPrograms.LIGHTS_RAIL_BACKWARD);
		this.groups.add(lights_front_rear);
		//
		TurboList lights_rear_rear = new TurboList("lights_rear_rear");
		lights_rear_rear.add(new ModelRendererTurbo(lights_rear_rear, 114, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-18.625f, -2.75f, -3.25f).setRotationAngle(0, 0, 0)
		);
		lights_rear_rear.add(new ModelRendererTurbo(lights_rear_rear, 77, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-18.625f, -2.75f, 2.25f).setRotationAngle(0, 0, 0)
		);
		lights_rear_rear.addProgram(DefaultPrograms.LIGHTS_RAIL_FORWARD);
		this.groups.add(lights_rear_rear);
		//
		TurboList primary = new TurboList("primary");
		primary.add(new ModelRendererTurbo(primary, 0, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, -10, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, -10, 0.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, -10, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 2, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, -10, -2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 9, textureX, textureY).addBox(0, 0, 0, 37, 1, 1)
			.setRotationPoint(-18.5f, -10, -0.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 7, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, -3.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.addProgram(DefaultPrograms.RGB_PRIMARY);
		this.groups.add(primary);
		//
		TurboList inner_walls = new TurboList("inner_walls");
		inner_walls.add(new ModelRendererTurbo(inner_walls, 23, 39, textureX, textureY).addBox(0, 0, 0, 2, 6, 0)
			.setRotationPoint(-14, -9, 1).setRotationAngle(0, -90, 0)
		);
		inner_walls.add(new ModelRendererTurbo(inner_walls, 82, 4, textureX, textureY).addBox(0, 0, 0, 2, 1, 0)
			.setRotationPoint(-14, -9, -1).setRotationAngle(0, -90, 0)
		);
		inner_walls.add(new ModelRendererTurbo(inner_walls, 18, 39, textureX, textureY).addBox(0, 0, 0, 2, 6, 0)
			.setRotationPoint(14, -9, -3).setRotationAngle(0, -90, 0)
		);
		inner_walls.add(new ModelRendererTurbo(inner_walls, 68, 38, textureX, textureY).addBox(0, 0, 0, 2, 6, 0)
			.setRotationPoint(14, -9, 1).setRotationAngle(0, -90, 0)
		);
		inner_walls.add(new ModelRendererTurbo(inner_walls, 122, 0, textureX, textureY).addBox(0, 0, 0, 2, 1, 0)
			.setRotationPoint(14, -9, -1).setRotationAngle(0, -90, 0)
		);
		inner_walls.add(new ModelRendererTurbo(inner_walls, 0, 0, textureX, textureY).addBox(0, 0, 0, 2, 6, 0)
			.setRotationPoint(-14, -9, -3).setRotationAngle(0, -90, 0)
		);
		this.groups.add(inner_walls);
		//
		TurboList inner_seats = new TurboList("inner_seats");
		inner_seats.add(new ModelRendererTurbo(inner_seats, 59, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(2, -4, -2.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 82, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(2.5f, -3.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 50, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(2, -3.75f, -2.5f).setRotationAngle(0, 0, -99)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 41, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(2, -4, 0.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 75, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(2.5f, -3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 118, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(2, -3.75f, 0.5f).setRotationAngle(0, 0, -99)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 100, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(5, -4, -2.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 54, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(5.5f, -3.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 9, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(5, -3.75f, -2.5f).setRotationAngle(0, 0, -99)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 0, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(5, -4, 0.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 47, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(5.5f, -3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 34, 36, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(5, -3.75f, 0.5f).setRotationAngle(0, 0, -99)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 111, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(8, -4, -2.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 40, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(8.5f, -3.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 93, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(8, -3.75f, -2.5f).setRotationAngle(0, 0, -99)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 84, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(8, -4, 0.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 22, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(8.5f, -3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 75, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(8, -3.75f, 0.5f).setRotationAngle(0, 0, -99)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 25, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(11.75f, -4, -2.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 15, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(12.25f, -3.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 16, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(13.25f, -3.75f, -2.5f).setRotationAngle(0, 0, -83)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 66, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(11.75f, -4, 0.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 117, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(12.25f, -3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 57, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(13.25f, -3.75f, 0.5f).setRotationAngle(0, 0, -83)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 48, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-0.75f, -4, -2.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 99, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-0.25f, -3.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 104, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(0.75f, -3.75f, -2.5f).setRotationAngle(0, 0, -83)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 9, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-0.75f, -4, 0.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 68, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-0.25f, -3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 0, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(0.75f, -3.75f, 0.5f).setRotationAngle(0, 0, -83)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 118, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-3.75f, -4, -2.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 33, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-3.25f, -3.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 41, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-2.25f, -3.75f, -2.5f).setRotationAngle(0, 0, -83)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 32, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-3.75f, -4, 0.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 92, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-3.25f, -3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 97, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-2.25f, -3.75f, 0.5f).setRotationAngle(0, 0, -83)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 88, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-6.75f, -4, -2.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 63, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-6.25f, -3.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 79, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-5.25f, -3.75f, -2.5f).setRotationAngle(0, 0, -83)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 23, 31, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-6.75f, -4, 0.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 56, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-6.25f, -3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 111, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-5.25f, -3.75f, 0.5f).setRotationAngle(0, 0, -83)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 113, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-9.75f, -4, -2.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 49, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-9.25f, -3.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 117, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-8.25f, -3.75f, -2.5f).setRotationAngle(0, 0, -83)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 108, 22, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-9.75f, -4, 0.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 42, 42, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-9.25f, -3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 115, 18, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-8.25f, -3.75f, 0.5f).setRotationAngle(0, 0, -83)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 108, 16, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-13.5f, -4, -2.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 119, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-13, -3.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 119, 14, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-13.5f, -3.75f, -2.5f).setRotationAngle(0, 0, -99)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 112, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-13.5f, -4, 0.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 120, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-13, -3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		inner_seats.add(new ModelRendererTurbo(inner_seats, 115, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-13.5f, -3.75f, 0.5f).setRotationAngle(0, 0, -99)
		);
		this.groups.add(inner_seats);
		//
		TurboList secondary = new TurboList("secondary");
		secondary.add(new ModelRendererTurbo(secondary, 0, 26, textureX, textureY).addBox(0, 0, 0, 14, 2, 1)
			.setRotationPoint(0.5f, -5, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 77, 24, textureX, textureY).addBox(0, 0, 0, 14, 2, 1)
			.setRotationPoint(0.5f, -5, 2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 59, 28, textureX, textureY).addBox(0, 0, 0, 13, 1, 1)
			.setRotationPoint(-6.5f, -9, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 31, 26, textureX, textureY).addBox(0, 0, 0, 13, 1, 1)
			.setRotationPoint(-6.5f, -9, 2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 54, 50, textureX, textureY).addBox(0, 0, 0, 1, 5, 1)
			.setRotationPoint(-0.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 49, 50, textureX, textureY).addBox(0, 0, 0, 1, 5, 1)
			.setRotationPoint(-17.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 79, 20, textureX, textureY).addBox(0, 0, 0, 14, 2, 1)
			.setRotationPoint(-14.5f, -5, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 77, 16, textureX, textureY).addBox(0, 0, 0, 14, 2, 1)
			.setRotationPoint(-14.5f, -5, 2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 54, 31, textureX, textureY).addBox(0, 0, 0, 11, 1, 1)
			.setRotationPoint(6.5f, -9, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 0, 30, textureX, textureY).addBox(0, 0, 0, 11, 1, 1)
			.setRotationPoint(6.5f, -9, 2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 30, 29, textureX, textureY).addBox(0, 0, 0, 11, 1, 1)
			.setRotationPoint(-17.5f, -9, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 88, 28, textureX, textureY).addBox(0, 0, 0, 11, 1, 1)
			.setRotationPoint(-17.5f, -9, 2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 44, 50, textureX, textureY).addBox(0, 0, 0, 1, 5, 1)
			.setRotationPoint(-0.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 39, 50, textureX, textureY).addBox(0, 0, 0, 1, 5, 1)
			.setRotationPoint(16.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 20, 50, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(13.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 15, 50, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(10, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 116, 49, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(6.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 99, 49, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(3, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 71, 49, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-4, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 66, 49, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-7.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 34, 49, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-11, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 10, 49, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-14.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 5, 49, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(13.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 0, 49, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(10, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 123, 48, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(6.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 94, 48, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(3, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 89, 48, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-4, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 29, 48, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-7.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 111, 47, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-11, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 0, 41, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-14.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 106, 47, textureX, textureY).addBox(0, 0, 0, 1, 5, 1)
			.setRotationPoint(-17.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 61, 47, textureX, textureY).addBox(0, 0, 0, 1, 5, 1)
			.setRotationPoint(16.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 69, 50, textureX, textureY).addBox(0, 0, 0, 1, 6, 7)
			.setRotationPoint(-18.5f, -9, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 18, 50, textureX, textureY).addBox(0, 0, 0, 1, 6, 7)
			.setRotationPoint(17.5f, -9, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.addProgram(DefaultPrograms.RGB_SECONDARY);
		this.groups.add(secondary);
		//
	}

}
