//FMT-Marker FVTM-1.5
package net.fexcraft.mod.addon.pack5pxt.models.vehicles;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.fexcraft.mod.fvtm.model.VehicleModel;

/** This file was exported via the FVTM Exporter v1.5 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.6.6 &copy; 2021 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "5pxt:models/vehicle/cabinwagon1")
public class CabinWagon1 extends VehicleModel {

	public CabinWagon1(){
		super(); textureX = 128; textureY = 64;
		this.addToCreators("Ferdinand (FEX___96)");
		item_scale.setAll(.75f);
		item_translate.setAll(0, -.25f, 0);
		//
		TurboList chassis = new TurboList("chassis");
		chassis.add(new ModelRendererTurbo(chassis, 71, 10, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-7.5f, -2.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 87, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 15, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-7.5f, -2.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 80, 0, textureX, textureY).addBox(0, 0, 0, 15, 1.5f, 5)
			.setRotationPoint(-7.5f, -2.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 32, 60, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.375f, -0.5f, 0, -0.125f, 0, 0, 0, 0)
			.setRotationPoint(16.5f, -2.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 49, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0, 0, 0, -0.25f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-18.5f, -2.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 98, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.25f, -0.5f, 0, 0, 0, 0, -0.25f, 0)
			.setRotationPoint(-18.5f, -2.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 91, 48, textureX, textureY).addBox(0, 0, 2, 1, 1, 2)
			.setRotationPoint(18, -2.5f, -3).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 33, 48, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-19, -2.5f, -1).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 22, 54, textureX, textureY).addBox(0, 0, 0, 0, 6, 2)
			.setRotationPoint(13, -9, -3).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 109, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0)
			.setRotationPoint(16.5f, -2.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 94, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1.5f, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0)
			.setRotationPoint(-18.5f, -2.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 27, 60, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(17.75f, -3, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 103, 59, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(17.75f, -3, 1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 92, 59, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-18.75f, -3, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 79, 59, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-18.75f, -3, 1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 70, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1.5f, 1, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.375f, -0.5f, 0, -0.5f, -0.75f, 0, -0.25f, 0, 0, -0.125f, 0)
			.setRotationPoint(17.5f, -2.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 9, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.375f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(16.5f, -2.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 4, 59, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1.5f, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0, 0, -0.125f, 0, 0, -0.25f, 0, 0, -0.5f, -0.75f, 0, -0.375f, -0.5f)
			.setRotationPoint(17.5f, -2.25f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 47, 54, textureX, textureY).addBox(0, 0, 0, 0, 6, 2)
			.setRotationPoint(13, -9, 1).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 111, 56, textureX, textureY).addBox(0, 0, 0, 0, 1, 2)
			.setRotationPoint(13, -9, -1).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 111, 57, textureX, textureY).addBox(0, 0, -2, 0, 5, 2)
			.setRotationPoint(13, -8, 1).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 98, 58, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(0, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 52, 58, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(4, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 42, 58, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(8, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 37, 58, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(12, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 14, 58, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-4, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 122, 57, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-8, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 117, 57, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-12, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 88, 57, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f)
			.setRotationPoint(-17.5f, -3.25f, 2.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 83, 57, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(0, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 75, 57, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(4, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 32, 57, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(8, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 27, 57, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(12, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 57, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-4, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 106, 56, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-8, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 94, 56, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-12, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 70, 56, textureX, textureY)
			.addShapeBox(-0.5f, 0, 0, 1, 1, 1, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.125f, 0, -0.5f, -0.125f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-17.5f, -3.25f, -3.75f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 108, 42, textureX, textureY).addBox(0, 0, 0, 1, 5, 3)
			.setRotationPoint(-18.625f, -8.5f, -1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 47, 56, textureX, textureY).addBox(0, 0, 0, 2, 6, 0)
			.setRotationPoint(-14, -9, 1).setRotationAngle(0, -90, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 104, 10, textureX, textureY).addBox(0, 0, 0, 2, 1, 0)
			.setRotationPoint(-14, -9, -1).setRotationAngle(0, -90, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 22, 56, textureX, textureY).addBox(0, 0, 0, 2, 6, 0)
			.setRotationPoint(-14, -9, -3).setRotationAngle(0, -90, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 9, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(14, -4, -0.875f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 26, 48, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(14.5f, -3.5f, -0.875f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 84, 47, textureX, textureY).addBox(0, -2, 0, 0.5f, 2, 1.75f)
			.setRotationPoint(14, -3.75f, -0.875f).setRotationAngle(0, 0, -5)
		);
		chassis.add(new ModelRendererTurbo(chassis, 73, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.75f, -5, -2.5f).setRotationAngle(0, 0, -10)
		);
		chassis.add(new ModelRendererTurbo(chassis, 99, 42, textureX, textureY).addCylinder(0.4f, -0, 4, 2, 1, 8, 0.125f, 0.125f, 4, null)
			.setRotationPoint(16.75f, -5, -2.5f).setRotationAngle(0, 0, -15)
		);
		chassis.add(new ModelRendererTurbo(chassis, 90, 42, textureX, textureY).addCylinder(0.4f, 0, 3.5f, 2, 1, 8, 0.125f, 0.125f, 4, null)
			.setRotationPoint(16.75f, -5, -2.5f).setRotationAngle(0, 0, -15)
		);
		chassis.add(new ModelRendererTurbo(chassis, 81, 41, textureX, textureY).addCylinder(0.4f, 0, 1, 2, 1, 8, 0.125f, 0.125f, 4, null)
			.setRotationPoint(16.75f, -5, -2.5f).setRotationAngle(0, 0, -15)
		);
		chassis.add(new ModelRendererTurbo(chassis, 72, 41, textureX, textureY).addCylinder(0.4f, 0, 1.5f, 2, 1, 8, 0.125f, 0.125f, 4, null)
			.setRotationPoint(16.75f, -5, -2.5f).setRotationAngle(0, 0, -15)
		);
		chassis.add(new ModelRendererTurbo(chassis, 10, 56, textureX, textureY)
			.addShapeBox(0.2f, -0.4f, 1.9f, 0.1f, 0.3f, 0.1f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.75f, -5, -2.5f).setRotationAngle(0, 0, 20)
		);
		chassis.add(new ModelRendererTurbo(chassis, 113, 55, textureX, textureY)
			.addShapeBox(0.2f, -0.4f, 3, 0.1f, 0.3f, 0.1f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.75f, -5, -2.5f).setRotationAngle(0, 0, 20)
		);
		chassis.add(new ModelRendererTurbo(chassis, 123, 0, textureX, textureY)
			.addShapeBox(0.2f, 0, 2.1f, 0.8f, 0, 0.8f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(16.65f, -5, -2.5f).setRotationAngle(0, 0, -10)
		);
		this.groups.add(chassis);
		//
		TurboList lights_front_head = new TurboList("lights_front_head");
		lights_front_head.add(new ModelRendererTurbo(lights_front_head, 101, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(17.625f, -4.5f, -3).setRotationAngle(0, 0, 0)
		);
		lights_front_head.add(new ModelRendererTurbo(lights_front_head, 79, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(17.625f, -4.5f, 2).setRotationAngle(0, 0, 0)
		);
		lights_front_head.addProgram(DefaultPrograms.LIGHTS_RAIL_FORWARD);
		this.groups.add(lights_front_head);
		//
		TurboList lights_front_rear = new TurboList("lights_front_rear");
		lights_front_rear.add(new ModelRendererTurbo(lights_front_rear, 42, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(17.625f, -4.5f, -2).setRotationAngle(0, 0, 0)
		);
		lights_front_rear.add(new ModelRendererTurbo(lights_front_rear, 37, 55, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(17.625f, -4.5f, 1).setRotationAngle(0, 0, 0)
		);
		lights_front_rear.addProgram(DefaultPrograms.LIGHTS_RAIL_BACKWARD);
		this.groups.add(lights_front_rear);
		//
		TurboList lights_rear_rear = new TurboList("lights_rear_rear");
		lights_rear_rear.add(new ModelRendererTurbo(lights_rear_rear, 120, 54, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f)
			.setRotationPoint(-18.625f, -2.75f, -3.25f).setRotationAngle(0, 0, 0)
		);
		lights_rear_rear.add(new ModelRendererTurbo(lights_rear_rear, 123, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.5f, 0, -0.5f, -0.5f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-18.625f, -2.75f, 2.25f).setRotationAngle(0, 0, 0)
		);
		lights_rear_rear.addProgram(DefaultPrograms.LIGHTS_RAIL_FORWARD);
		this.groups.add(lights_rear_rear);
		//
		TurboList primary = new TurboList("primary");
		primary.add(new ModelRendererTurbo(primary, 100, 21, textureX, textureY).addBox(0, 0, 0, 10, 1, 1)
			.setRotationPoint(6.5f, -9, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 77, 47, textureX, textureY).addBox(0, 0, 0, 2, 2, 0.875f)
			.setRotationPoint(14.5f, -5, 2.5625f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 68, 25, textureX, textureY).addBox(0, 0, 0, 14, 2, 1)
			.setRotationPoint(0.5f, -5, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 65, 54, textureX, textureY).addBox(0, 0, 0, 1, 5, 1)
			.setRotationPoint(-17.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 69, 21, textureX, textureY).addBox(0, 0, 0, 14, 2, 1)
			.setRotationPoint(-14.5f, -5, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 100, 18, textureX, textureY).addBox(0, 0, 0, 10, 1, 1)
			.setRotationPoint(6.5f, -9, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 102, 15, textureX, textureY).addBox(0, 0, 0, 11, 1, 1)
			.setRotationPoint(-17.5f, -9, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 60, 54, textureX, textureY).addBox(0, 0, 0, 1, 5, 1)
			.setRotationPoint(-0.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 55, 54, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(16.5f, -5, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 5, 54, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(13.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 90, 52, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(10, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 85, 52, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(6.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 32, 52, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(3, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 27, 52, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-4, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 52, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-7.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 109, 51, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-11, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 97, 51, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-14.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 80, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0)
			.setRotationPoint(17.5f, -5, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 29, textureX, textureY).addBox(0, 0, 0, 1, 2, 5)
			.setRotationPoint(17.5f, -5, -2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 75, 51, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(12.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 70, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, -0.25f, 1, 0, 0, -1, 0, 0)
			.setRotationPoint(16.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 50, 51, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0, -1, 0, 0, 1, 0, 0, 1, 0, -0.25f, -1, 0, 0)
			.setRotationPoint(16.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 56, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, 0, 0, 0, -0.75f, -0.25f, 0, -0.75f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0)
			.setRotationPoint(16.5f, -9, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 22, 51, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(12.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 70, 47, textureX, textureY).addBox(0, 0, 0, 2, 2, 0.875f)
			.setRotationPoint(14.5f, -5, -3.4375f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 69, 17, textureX, textureY).addBox(0, 0, 0, 14, 2, 1)
			.setRotationPoint(0.5f, -5, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 26, textureX, textureY).addBox(0, 0, 0, 13, 1, 1)
			.setRotationPoint(-6.5f, -9, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 17, 51, textureX, textureY).addBox(0, 0, 0, 1, 5, 1)
			.setRotationPoint(-0.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 71, 13, textureX, textureY).addBox(0, 0, 0, 14, 2, 1)
			.setRotationPoint(-14.5f, -5, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 103, 12, textureX, textureY).addBox(0, 0, 0, 11, 1, 1)
			.setRotationPoint(-17.5f, -9, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 12, 51, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(13.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 116, 50, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(10, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 104, 50, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(6.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 45, 50, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(3, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 123, 49, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-4, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 7, 49, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-7.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 123, 33, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-11, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 0, 29, textureX, textureY).addBox(0, 0, 0, 1, 3, 1)
			.setRotationPoint(-14.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 40, 48, textureX, textureY).addBox(0, 0, 0, 1, 5, 1)
			.setRotationPoint(-17.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 123, 18, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(16.5f, -5, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 39, 26, textureX, textureY).addBox(0, 0, 0, 1, 6, 7)
			.setRotationPoint(-18.5f, -9, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 80, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(17.5f, -5, -3.5f).setRotationAngle(0, 0, 0)
		);
		primary.add(new ModelRendererTurbo(primary, 99, 24, textureX, textureY).addBox(0, 0, 0, 13, 1, 1)
			.setRotationPoint(-6.5f, -9, 2.5f).setRotationAngle(0, 0, 0)
		);
		primary.addProgram(DefaultPrograms.RGB_PRIMARY);
		this.groups.add(primary);
		//
		TurboList secondary = new TurboList("secondary");
		secondary.add(new ModelRendererTurbo(secondary, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 36, 1, 7, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, -3.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 0, 41, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, -0.25f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.5f, -10, -2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 43, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.5f, -10, 0.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 49, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, 0, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.5f, -10, -0.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 32, 30, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.25f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.5f, -10, 2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 90, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 1, 0, 0, -0.75f, 0, 0, -0.9375f, 0, 0, -0.9375f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(14.5f, -10, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 22, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 7, 0, 0, -0.25f, 0, 0, -0.25f, -0.25f, 0, -0.25f, -0.25f, 0, -0.25f, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0)
			.setRotationPoint(17.5f, -3.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 0, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 33, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, -10, 2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 0, 13, textureX, textureY)
			.addShapeBox(0, 0, 0, 33, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, -10, 0.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 0, 20, textureX, textureY)
			.addShapeBox(0, 0, 0, 33, 1, 1, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, -10, -3.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 0, 9, textureX, textureY)
			.addShapeBox(0, 0, 0, 33, 1, 2, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-18.5f, -10, -2.5f).setRotationAngle(0, 0, 0)
		);
		secondary.add(new ModelRendererTurbo(secondary, 0, 17, textureX, textureY).addBox(0, 0, 0, 33, 1, 1)
			.setRotationPoint(-18.5f, -10, -0.5f).setRotationAngle(0, 0, 0)
		);
		secondary.addProgram(DefaultPrograms.RGB_SECONDARY);
		this.groups.add(secondary);
		//
		TurboList door_right = new TurboList("door_right");
		door_right.add(new ModelRendererTurbo(door_right, 63, 47, textureX, textureY).addBox(0, 0, 0, 2, 5, 1)
			.setRotationPoint(-16.5f, -8, -3.375f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(door_right);
		//
		TurboList door_left = new TurboList("door_left");
		door_left.add(new ModelRendererTurbo(door_left, 56, 47, textureX, textureY).addBox(0, 0, 0, 2, 5, 1)
			.setRotationPoint(-16.5f, -8, 2.375f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(door_left);
		//
		TurboList seats_interior = new TurboList("seats_interior");
		seats_interior.add(new ModelRendererTurbo(seats_interior, 34, 40, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(2, -4, -2.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 49, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(2.5f, -3.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 63, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(2, -3.75f, -2.5f).setRotationAngle(0, 0, -99)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 54, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(2, -4, 0.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 19, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(2.5f, -3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 25, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(2, -3.75f, 0.5f).setRotationAngle(0, 0, -99)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 16, 39, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(5, -4, -2.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 12, 47, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(5.5f, -3.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 117, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(5, -3.75f, -2.5f).setRotationAngle(0, 0, -99)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 108, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(5, -4, 0.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 117, 46, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(5.5f, -3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 99, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(5, -3.75f, 0.5f).setRotationAngle(0, 0, -99)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 90, 38, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(8, -4, -2.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 44, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(8.5f, -3.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 81, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(8, -3.75f, -2.5f).setRotationAngle(0, 0, -99)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 72, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(8, -4, 0.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 7, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(8.5f, -3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 9, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(8, -3.75f, 0.5f).setRotationAngle(0, 0, -99)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 0, 37, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-0.75f, -4, -2.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 0, 45, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-0.25f, -3.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 65, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(0.75f, -3.75f, -2.5f).setRotationAngle(0, 0, -83)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 56, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-0.75f, -4, 0.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 37, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-0.25f, -3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 29, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(0.75f, -3.75f, 0.5f).setRotationAngle(0, 0, -83)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 20, 35, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-3.75f, -4, -2.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 30, 44, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-3.25f, -3.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 113, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-2.25f, -3.75f, -2.5f).setRotationAngle(0, 0, -83)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 104, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-3.75f, -4, 0.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 64, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-3.25f, -3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 95, 34, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-2.25f, -3.75f, 0.5f).setRotationAngle(0, 0, -83)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 86, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-6.75f, -4, -2.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 57, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-6.25f, -3.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 13, 33, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-5.25f, -3.75f, -2.5f).setRotationAngle(0, 0, -83)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 81, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-6.75f, -4, 0.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 50, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-6.25f, -3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 66, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-5.25f, -3.75f, 0.5f).setRotationAngle(0, 0, -83)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 17, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-9.75f, -4, -2.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 23, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-9.25f, -3.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 8, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-8.25f, -3.75f, -2.5f).setRotationAngle(0, 0, -83)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 119, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-9.75f, -4, 0.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 16, 43, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-9.25f, -3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 104, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-8.25f, -3.75f, 0.5f).setRotationAngle(0, 0, -83)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 49, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-13.5f, -4, -2.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 56, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-13, -3.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 32, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f)
			.setRotationPoint(-13.5f, -3.75f, -2.5f).setRotationAngle(0, 0, -99)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 118, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-13.5f, -4, 0.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 39, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-13, -3.5f, 0.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 116, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 2, 0, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.5f, -0.25f, 0, -0.5f, -0.25f, 0, -0.5f, 0, 0, -0.5f, 0)
			.setRotationPoint(-13.5f, -3.75f, 0.5f).setRotationAngle(0, 0, -99)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 117, 42, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(11, -4.5f, -2.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 121, 4, textureX, textureY).addBox(0, 0, 0, 2.5f, 0.5f, 1.5f)
			.setRotationPoint(10.5f, -5, -2.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 0, 3, textureX, textureY).addBox(0, 0, 0, 2, 2, 1)
			.setRotationPoint(11, -4.5f, 1.5f).setRotationAngle(0, 0, 0)
		);
		seats_interior.add(new ModelRendererTurbo(seats_interior, 0, 0, textureX, textureY).addBox(0, 0, 0, 2.5f, 0.5f, 1.5f)
			.setRotationPoint(10.5f, -5, 1).setRotationAngle(0, 0, 0)
		);
		this.groups.add(seats_interior);
		//
		TurboList markers = new TurboList("markers");
		markers.add(new ModelRendererTurbo(markers, -1, -1, textureX, textureY)/* An exporter for the polygon type MARKER was not made yet. */
			.setRotationPoint(0, -4, -1.6f).setRotationAngle(0, 0, 0)
		);
		markers.add(new ModelRendererTurbo(markers, -1, -1, textureX, textureY)/* An exporter for the polygon type MARKER was not made yet. */
			.setRotationPoint(0, -4, 1.6f).setRotationAngle(0, 0, 0)
		);
		markers.add(new ModelRendererTurbo(markers, -1, -1, textureX, textureY)/* An exporter for the polygon type MARKER was not made yet. */
			.setRotationPoint(-3, -4, -1.6f).setRotationAngle(0, 0, 0)
		);
		markers.add(new ModelRendererTurbo(markers, -1, -1, textureX, textureY)/* An exporter for the polygon type MARKER was not made yet. */
			.setRotationPoint(-3, -4, 1.6f).setRotationAngle(0, 0, 0)
		);
		markers.add(new ModelRendererTurbo(markers, -1, -1, textureX, textureY)/* An exporter for the polygon type MARKER was not made yet. */
			.setRotationPoint(-6, -4, -1.6f).setRotationAngle(0, 0, 0)
		);
		markers.add(new ModelRendererTurbo(markers, -1, -1, textureX, textureY)/* An exporter for the polygon type MARKER was not made yet. */
			.setRotationPoint(-6, -4, 1.6f).setRotationAngle(0, 0, 0)
		);
		markers.add(new ModelRendererTurbo(markers, -1, -1, textureX, textureY)/* An exporter for the polygon type MARKER was not made yet. */
			.setRotationPoint(-9, -4, -1.6f).setRotationAngle(0, 0, 0)
		);
		markers.add(new ModelRendererTurbo(markers, -1, -1, textureX, textureY)/* An exporter for the polygon type MARKER was not made yet. */
			.setRotationPoint(-9, -4, 1.6f).setRotationAngle(0, 0, 0)
		);
		markers.add(new ModelRendererTurbo(markers, -1, -1, textureX, textureY)/* An exporter for the polygon type MARKER was not made yet. */
			.setRotationPoint(-12.3f, -4, -1.6f).setRotationAngle(0, 0, 0)
		);
		markers.add(new ModelRendererTurbo(markers, -1, -1, textureX, textureY)/* An exporter for the polygon type MARKER was not made yet. */
			.setRotationPoint(-12.3f, -4, 1.6f).setRotationAngle(0, 0, 0)
		);
		markers.add(new ModelRendererTurbo(markers, -1, -1, textureX, textureY)/* An exporter for the polygon type MARKER was not made yet. */
			.setRotationPoint(3.3f, -4, -1.6f).setRotationAngle(0, 0, 0)
		);
		markers.add(new ModelRendererTurbo(markers, -1, -1, textureX, textureY)/* An exporter for the polygon type MARKER was not made yet. */
			.setRotationPoint(3.3f, -4, 1.6f).setRotationAngle(0, 0, 0)
		);
		markers.add(new ModelRendererTurbo(markers, -1, -1, textureX, textureY)/* An exporter for the polygon type MARKER was not made yet. */
			.setRotationPoint(6.3f, -4, -1.6f).setRotationAngle(0, 0, 0)
		);
		markers.add(new ModelRendererTurbo(markers, -1, -1, textureX, textureY)/* An exporter for the polygon type MARKER was not made yet. */
			.setRotationPoint(6.3f, -4, 1.6f).setRotationAngle(0, 0, 0)
		);
		markers.add(new ModelRendererTurbo(markers, -1, -1, textureX, textureY)/* An exporter for the polygon type MARKER was not made yet. */
			.setRotationPoint(9.3f, -4, -1.6f).setRotationAngle(0, 0, 0)
		);
		markers.add(new ModelRendererTurbo(markers, -1, -1, textureX, textureY)/* An exporter for the polygon type MARKER was not made yet. */
			.setRotationPoint(9.3f, -4, 1.6f).setRotationAngle(0, 0, 0)
		);
		markers.add(new ModelRendererTurbo(markers, -1, -1, textureX, textureY)/* An exporter for the polygon type MARKER was not made yet. */
			.setRotationPoint(15.25f, -4, 0).setRotationAngle(0, 0, 0).setName("driver")
		);
		this.groups.add(markers);
		//
	}

}
