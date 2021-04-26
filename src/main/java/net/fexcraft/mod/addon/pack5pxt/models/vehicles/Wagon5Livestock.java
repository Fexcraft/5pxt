//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.pack5pxt.models.vehicles;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.fexcraft.mod.fvtm.model.VehicleModel;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.5 &copy; 2021 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "5pxt:models/vehicle/wagon5")
public class Wagon5Livestock extends VehicleModel {

	public Wagon5Livestock(){
		super(); textureX = 128; textureY = 64;
		this.addToCreators("Ferdinand (FEX___96)");
		item_scale.setAll(.75f);
		item_translate.setAll(0, -.25f, 0);
		//
		TurboList chassis = new TurboList("chassis");
		chassis.add(new ModelRendererTurbo(chassis, 79, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-7.5f, -2.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 89, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, -0.5f, -0.75f, -0.5f, -0.5f)
			.setRotationPoint(-7.5f, -2.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 118, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(16.5f, -2.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 112, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(16.5f, -2.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 121, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-18.5f, -2.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-18.5f, -2.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 7, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, -3.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 118, 0, textureX, textureY).addBox(0, 0, 2, 1, 1, 2)
			.setRotationPoint(18, -2.5f, -3).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 0, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-19, -2.5f, -1).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 108, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(16.5f, -2.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 104, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-18.5f, -2.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 41, 53, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(17.75f, -3, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 36, 53, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(17.75f, -3, 1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 96, 49, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-18.75f, -3, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 105, 48, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-18.75f, -3, 1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 82, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1.5f, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0, -0.75f, -0.5f, 0)
			.setRotationPoint(-7.5f, -2.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 65, 45, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(8, -9.125f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 60, 45, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(8, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 52, 45, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(16, -9.125f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 119, 44, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(16, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 47, 44, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-8, -9.125f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 39, 44, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-8, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 34, 44, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-16, -9.125f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 26, 44, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-16, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 21, 43, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(8, -9.125f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 13, 43, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(8, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 8, 43, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(16, -9.125f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 43, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(16, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 102, 42, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-8, -9.125f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 97, 42, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-8, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 89, 42, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-16, -9.125f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 84, 42, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-16, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 111, 41, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(0, -9.125f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 105, 16, textureX, textureY).addBox(0, 0, 0, 9, 0.5f, 1)
			.setRotationPoint(-4.5f, -2.875f, -3.625f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 107, 34, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(0, -9.125f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 106, 13, textureX, textureY).addBox(0, 0, 0, 9, 0.5f, 1)
			.setRotationPoint(-4.5f, -2.875f, 2.625f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(chassis);
		//
		TurboList doors_left = new TurboList("doors_left");
		doors_left.add(new ModelRendererTurbo(doors_left, 110, 50, textureX, textureY).addBox(0, 0, 0, 5, 5, 0.75f)
			.setRotationPoint(0, -8, 2.625f).setRotationAngle(0, 0, 0)
		);
		doors_left.add(new ModelRendererTurbo(doors_left, 13, 50, textureX, textureY).addBox(0, 0, 0, 5, 5, 0.75f)
			.setRotationPoint(-5, -8, 2.625f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(doors_left);
		//
		TurboList doors_right = new TurboList("doors_right");
		doors_right.add(new ModelRendererTurbo(doors_right, 0, 50, textureX, textureY).addBox(0, 0, 0, 5, 5, 0.75f)
			.setRotationPoint(0, -8, -3.375f).setRotationAngle(0, 0, 0)
		);
		doors_right.add(new ModelRendererTurbo(doors_right, 78, 49, textureX, textureY).addBox(0, 0, 0, 5, 5, 0.75f)
			.setRotationPoint(-5, -8, -3.375f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(doors_right);
		//
		TurboList lights_front_rear = new TurboList("lights_front_rear");
		lights_front_rear.add(new ModelRendererTurbo(lights_front_rear, 114, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(17.625f, -2.75f, -3.25f).setRotationAngle(0, 0, 0)
		);
		lights_front_rear.add(new ModelRendererTurbo(lights_front_rear, 104, 19, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(17.625f, -2.75f, 2.25f).setRotationAngle(0, 0, 0)
		);
		lights_front_rear.addProgram(DefaultPrograms.LIGHTS_RAIL_BACKWARD);
		this.groups.add(lights_front_rear);
		//
		TurboList lights_rear_rear = new TurboList("lights_rear_rear");
		lights_rear_rear.add(new ModelRendererTurbo(lights_rear_rear, 123, 4, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-18.625f, -2.75f, -3.25f).setRotationAngle(0, 0, 0)
		);
		lights_rear_rear.add(new ModelRendererTurbo(lights_rear_rear, 82, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-18.625f, -2.75f, 2.25f).setRotationAngle(0, 0, 0)
		);
		lights_rear_rear.addProgram(DefaultPrograms.LIGHTS_RAIL_FORWARD);
		this.groups.add(lights_rear_rear);
		//
		TurboList primary = new TurboList("primary");
		primary.add(new ModelRendererTurbo(primary, 54, 40, textureX, textureY).addBox(0, 0, 0, 12, 3, 1)
			.setRotationPoint(5.5f, -6, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 27, 39, textureX, textureY).addBox(0, 0, 0, 12, 3, 1)
			.setRotationPoint(5.5f, -6, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 29, textureX, textureY).addBox(0, 0, 0, 35, 1, 1)
			.setRotationPoint(-17.5f, -9, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 26, textureX, textureY).addBox(0, 0, 0, 35, 1, 1)
			.setRotationPoint(-17.5f, -9, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 70, 52, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-18.5f, -9, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 65, 52, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(17.5f, -9, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 38, textureX, textureY).addBox(0, 0, 0, 12, 3, 1)
			.setRotationPoint(-17.5f, -6, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 81, 37, textureX, textureY).addBox(0, 0, 0, 12, 3, 1)
			.setRotationPoint(-17.5f, -6, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 54, 37, textureX, textureY).addBox(0, 0, 0, 12, 0.25f, 1)
			.setRotationPoint(5.5f, -6.375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 27, 36, textureX, textureY).addBox(0, 0, 0, 12, 0.25f, 1)
			.setRotationPoint(5.5f, -6.375f, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 35, textureX, textureY).addBox(0, 0, 0, 12, 0.25f, 1)
			.setRotationPoint(-17.5f, -6.375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 80, 34, textureX, textureY).addBox(0, 0, 0, 12, 0.25f, 1)
			.setRotationPoint(-17.5f, -6.375f, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 53, 34, textureX, textureY).addBox(0, 0, 0, 12, 0.25f, 1)
			.setRotationPoint(5.5f, -6.875f, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 27, 32, textureX, textureY).addBox(0, 0, 0, 12, 0.25f, 1)
			.setRotationPoint(5.5f, -6.875f, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 32, textureX, textureY).addBox(0, 0, 0, 12, 0.25f, 1)
			.setRotationPoint(-17.5f, -6.875f, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 99, 31, textureX, textureY).addBox(0, 0, 0, 12, 0.25f, 1)
			.setRotationPoint(-17.5f, -6.875f, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 72, 31, textureX, textureY).addBox(0, 0, 0, 12, 0.25f, 1)
			.setRotationPoint(5.5f, -7.375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 100, 28, textureX, textureY).addBox(0, 0, 0, 12, 0.25f, 1)
			.setRotationPoint(5.5f, -7.375f, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 73, 28, textureX, textureY).addBox(0, 0, 0, 12, 0.25f, 1)
			.setRotationPoint(-17.5f, -7.375f, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 76, 25, textureX, textureY).addBox(0, 0, 0, 12, 0.25f, 1)
			.setRotationPoint(-17.5f, -7.375f, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 77, 22, textureX, textureY).addBox(0, 0, 0, 12, 0.25f, 1)
			.setRotationPoint(5.5f, -7.875f, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 77, 19, textureX, textureY).addBox(0, 0, 0, 12, 0.25f, 1)
			.setRotationPoint(5.5f, -7.875f, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 78, 16, textureX, textureY).addBox(0, 0, 0, 12, 0.25f, 1)
			.setRotationPoint(-17.5f, -7.875f, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 79, 13, textureX, textureY).addBox(0, 0, 0, 12, 0.25f, 1)
			.setRotationPoint(-17.5f, -7.875f, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 31, 51, textureX, textureY).addBox(0, 0, 0, 1, 5, 1)
			.setRotationPoint(4.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 26, 51, textureX, textureY).addBox(0, 0, 0, 1, 5, 1)
			.setRotationPoint(-5.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 123, 49, textureX, textureY).addBox(0, 0, 0, 1, 5, 1)
			.setRotationPoint(-5.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 91, 49, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(-18.5f, -9, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 123, 37, textureX, textureY).addBox(0, 0, 0, 1, 6, 1)
			.setRotationPoint(17.5f, -9, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 97, 48, textureX, textureY).addBox(0, 0, 0, 1, 1, 5)
			.setRotationPoint(-18.5f, -9, -2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 65, 45, textureX, textureY).addBox(0, 0, 0, 1, 1, 5)
			.setRotationPoint(17.5f, -9, -2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 52, 45, textureX, textureY).addBox(0, 0, 0, 1, 3, 5)
			.setRotationPoint(-18.5f, -6, -2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 39, 44, textureX, textureY).addBox(0, 0, 0, 1, 3, 5)
			.setRotationPoint(17.5f, -6, -2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 26, 44, textureX, textureY).addBox(0, 0, 0, 1, 0.25f, 5)
			.setRotationPoint(-18.5f, -7.875f, -2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 111, 43, textureX, textureY).addBox(0, 0, 0, 1, 0.25f, 5)
			.setRotationPoint(-18.5f, -7.375f, -2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 13, 43, textureX, textureY).addBox(0, 0, 0, 1, 0.25f, 5)
			.setRotationPoint(-18.5f, -6.875f, -2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 43, textureX, textureY).addBox(0, 0, 0, 1, 0.25f, 5)
			.setRotationPoint(-18.5f, -6.375f, -2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 89, 42, textureX, textureY).addBox(0, 0, 0, 1, 0.25f, 5)
			.setRotationPoint(17.5f, -7.875f, -2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 76, 42, textureX, textureY).addBox(0, 0, 0, 1, 0.25f, 5)
			.setRotationPoint(17.5f, -7.375f, -2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 103, 41, textureX, textureY).addBox(0, 0, 0, 1, 0.25f, 5)
			.setRotationPoint(17.5f, -6.875f, -2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 114, 21, textureX, textureY).addBox(0, 0, 0, 1, 0.25f, 5)
			.setRotationPoint(17.5f, -6.375f, -2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 122, 19, textureX, textureY).addBox(0, 0, 0, 1, 5, 1)
			.setRotationPoint(4.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.addProgram(DefaultPrograms.RGB_PRIMARY);
		this.groups.add(primary);
		//
		TurboList secondary = new TurboList("secondary");
		secondary.add(new ModelRendererTurbo(secondary, 0, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, -10, 2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 0, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, -10, 0.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 0, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, -10, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 0, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 37, 1, 2, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, -10, -2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 0, 17, textureX, textureY).addBox(0, 0, 0, 37, 1, 1)
			.setRotationPoint(-18.5f, -10, -0.5f).setRotationAngle(0, 0, 0)
		);
		secondary.addProgram(DefaultPrograms.RGB_SECONDARY);
		this.groups.add(secondary);
		//
	}

}
