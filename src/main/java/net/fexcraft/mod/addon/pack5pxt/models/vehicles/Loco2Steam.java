//FMT-Marker FVTM-1.4
package net.fexcraft.mod.addon.pack5pxt.models.vehicles;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.fexcraft.mod.fvtm.model.VehicleModel;

/** This file was exported via the FVTM Exporter V1.4 of<br>
 *  FMT (Fex's Modelling Toolbox) v.2.1.0 &copy; 2020 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "5pxt:models/vehicle/loco2")
public class Loco2Steam extends VehicleModel {

	public Loco2Steam(){
		super(); textureX = 128; textureY = 64;
		this.addToCreators("Ferdinand (FEX___96)");
		item_scale.setAll(.75f);
		item_translate.setAll(0, -.25f, 0);
		//
		TurboList axle0 = new TurboList("axle0");
		axle0.add(new ModelRendererTurbo(axle0, 58, 17, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 16, 1, 1, 1, new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(-7.125f, -2, 2).setRotationAngle(0, 0, 0)
		);
		axle0.add(new ModelRendererTurbo(axle0, 49, 17, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 16, 1.0625f, 1.0625f, 1, new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(-7.125f, -2, 1.5f).setRotationAngle(0, 0, 0)
		);
		axle0.add(new ModelRendererTurbo(axle0, 40, 17, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 16, 1, 1, 1, new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(-7.125f, -2, -3.5f).setRotationAngle(0, 0, 0)
		);
		axle0.add(new ModelRendererTurbo(axle0, 31, 17, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 16, 1.0625f, 1.0625f, 1, new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(-7.125f, -2, -3.375f).setRotationAngle(0, 0, 0)
		);
		axle0.add(new ModelRendererTurbo(axle0, 13, 33, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 5)
			.setRotationPoint(-7.125f, -2, -2.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(axle0);
		//
		TurboList axle1 = new TurboList("axle1");
		axle1.add(new ModelRendererTurbo(axle1, 68, 13, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 16, 1, 1, 1, new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(-2.6875f, -2, 2).setRotationAngle(0, 0, 0)
		);
		axle1.add(new ModelRendererTurbo(axle1, 22, 12, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 16, 1.0625f, 1.0625f, 1, new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(-2.6875f, -2, 1.5f).setRotationAngle(0, 0, 0)
		);
		axle1.add(new ModelRendererTurbo(axle1, 13, 12, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 16, 1, 1, 1, new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(-2.6875f, -2, -3.5f).setRotationAngle(0, 0, 0)
		);
		axle1.add(new ModelRendererTurbo(axle1, 118, 11, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 16, 1.0625f, 1.0625f, 1, new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(-2.6875f, -2, -3.375f).setRotationAngle(0, 0, 0)
		);
		axle1.add(new ModelRendererTurbo(axle1, 0, 33, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 5)
			.setRotationPoint(-2.6875f, -2, -2.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(axle1);
		//
		TurboList axle2 = new TurboList("axle2");
		axle2.add(new ModelRendererTurbo(axle2, 109, 11, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 16, 1, 1, 1, new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(1.75f, -2, 2).setRotationAngle(0, 0, 0)
		);
		axle2.add(new ModelRendererTurbo(axle2, 100, 11, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 16, 1.0625f, 1.0625f, 1, new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(1.75f, -2, 1.5f).setRotationAngle(0, 0, 0)
		);
		axle2.add(new ModelRendererTurbo(axle2, 91, 11, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 16, 1, 1, 1, new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.5))
			.setRotationPoint(1.75f, -2, -3.5f).setRotationAngle(0, 0, 0)
		);
		axle2.add(new ModelRendererTurbo(axle2, 64, 7, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 16, 1.0625f, 1.0625f, 1, new net.fexcraft.lib.common.math.Vec3f(0.0, 0.0, 0.875))
			.setRotationPoint(1.75f, -2, -3.375f).setRotationAngle(0, 0, 0)
		);
		axle2.add(new ModelRendererTurbo(axle2, 103, 32, textureX, textureY).addBox(-0.5f, -0.5f, 0, 1, 1, 5)
			.setRotationPoint(1.75f, -2, -2.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(axle2);
		//
		TurboList chassis = new TurboList("chassis");
		chassis.add(new ModelRendererTurbo(chassis, 9, 20, textureX, textureY).addBox(0, 0, 0, 7, 1, 4)
			.setRotationPoint(6.5f, -3, -2).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 80, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.125f)
			.setRotationPoint(4.5f, -3, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 110, 32, textureX, textureY).addBox(0, 0, 0, 1, 2, 7)
			.setRotationPoint(15.5f, -3.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 93, 32, textureX, textureY).addBox(-1, 0, 0, 1, 2, 7)
			.setRotationPoint(-15.5f, -3.25f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 39, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 5, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f)
			.setRotationPoint(-9.5f, -3, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, 0, 14, 1, 5, 0, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(-9.5f, -2, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 37, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 5, 0, 0, 0, -0.125f, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.125f, 0, 0, -0.5f, -1, 0, -0.5f, -1, 0, -0.5f, 0, 0, -0.5f)
			.setRotationPoint(4.5f, -2, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 13, 7, textureX, textureY).addBox(0, 0, 0, 12, 1, 3)
			.setRotationPoint(2, -4, -1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 51, 24, textureX, textureY)
			.addShapeBox(0, 0, 0, 2, 1, 6, 0, 0, 0, -1, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -1, 0, 0, -1, 0, 0, -0.125f, 0, 0, -0.125f, 0, 0, -1)
			.setRotationPoint(13.5f, -3, -3).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 58, 32, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 6, 0, 0, -0.25f, -1, 0, -0.25f, -0.125f, 0, -0.25f, -0.125f, 0, -0.25f, -1, 0, -0.7f, -1, 0, 0, -0.125f, 0, 0, -0.125f, 0, -0.7f, -1)
			.setRotationPoint(14.5f, -2.25f, -3).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 57, 32, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(16, -2.5f, -1).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 52, 32, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(15.75f, -3, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 95, 31, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(15.75f, -3, 1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 120, 29, textureX, textureY).addBox(0, 0, 0, 1, 1, 2)
			.setRotationPoint(-17, -2.5f, -1).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 115, 29, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-16.75f, -3, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 110, 29, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-16.75f, -3, 1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 104, 8, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(-7.75f, -1.75f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 110, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.25f, 0, 0, 2, 0, 0, 2, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -2.5f, 0, 0, -2.5f, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(2.25f, -1.75f, -3.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 11, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.25f, -0.5f, 0, -2.5f, -0.5f, 0, -2.5f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, 2, -0.5f, 0, 2, 0, 0, -0.25f, 0)
			.setRotationPoint(2.25f, -5.75f, -3).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 0, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.25f, 0, 0, -2.5f, 0, 0, -2.5f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, 2, 0, 0, 2, -0.5f, 0, -0.25f, -0.5f)
			.setRotationPoint(2.25f, -5.75f, 2).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 41, 7, textureX, textureY)
			.addShapeBox(0, 0, 0, 10, 1, 1, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -0.25f, -0.5f, 0, -0.25f, 0, 0, -0.25f, 0)
			.setRotationPoint(-7.75f, -1.75f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 110, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 4, 1, 1, 0, 0, -0.25f, -0.5f, 0, 2, -0.5f, 0, 2, 0, 0, -0.25f, 0, 0, -0.25f, -0.5f, 0, -2.5f, -0.5f, 0, -2.5f, 0, 0, -0.25f, 0)
			.setRotationPoint(2.25f, -1.75f, 2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 52, 23, textureX, textureY).addCylinder(0, 0, 0, 1, 4, 6, 1.5f, 1.5f, 3, null)
			.setRotationPoint(6, -3.5f, 2.5f).setRotationAngle(-20, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 47, 23, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1.5f, 1, 3, null)
			.setRotationPoint(10, -3.5f, -2.5f).setRotationAngle(20, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 42, 23, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 6, 1.5f, 1, 3, null)
			.setRotationPoint(10, -3.5f, 2.5f).setRotationAngle(-20, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 37, 23, textureX, textureY).addCylinder(0, 0, 0, 1, 4, 6, 1.5f, 1.5f, 3, null)
			.setRotationPoint(6, -3.5f, -2.5f).setRotationAngle(20, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 29, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.25f, -4, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 47, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, -0.25f, -0.25f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(15.25f, -4, 1.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 32, 23, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 0.75f, 1, 9, 0, 0.5f, 0.5f, 3, new net.fexcraft.lib.common.math.Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(15.5f, -5.5f, 0).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 117, 0, textureX, textureY).addCylinder(0, 0, 0, 2, 1, 16, 0.75f, 0.625f, 2, new net.fexcraft.lib.common.math.Vec3f(0.75, 0.0, 0.0))
			.setRotationPoint(-10.75f, -4.5f, 0).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 29, 29, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 5, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0)
			.setRotationPoint(-10.5f, -7, -2.5f).setRotationAngle(0, 0, 0)
		);
		chassis.add(new ModelRendererTurbo(chassis, 68, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 3, 0, -0.75f, 0, -0.5f, 0, 0, -0.5f, 0, 0, -0.5f, -0.75f, 0, -0.5f, -0.75f, 0, 1, 0, 0, 1, 0, 0, 1, -0.75f, 0, 1)
			.setRotationPoint(-10.5f, -9, -1.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(chassis);
		//
		TurboList cabin = new TurboList("cabin");
		cabin.add(new ModelRendererTurbo(cabin, 10, 29, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-10.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		cabin.add(new ModelRendererTurbo(cabin, 5, 29, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-14.5f, -8, -3.5f).setRotationAngle(0, 0, 0)
		);
		cabin.add(new ModelRendererTurbo(cabin, 0, 29, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-10.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		cabin.add(new ModelRendererTurbo(cabin, 105, 28, textureX, textureY).addBox(0, 0, 0, 1, 2, 1)
			.setRotationPoint(-14.5f, -8, 2.5f).setRotationAngle(0, 0, 0)
		);
		cabin.add(new ModelRendererTurbo(cabin, 39, 10, textureX, textureY).addBox(0, 0, 0, 9, 1, 5)
			.setRotationPoint(-17, -10, -2.5f).setRotationAngle(0, 0, 0)
		);
		cabin.add(new ModelRendererTurbo(cabin, 85, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, -1, 0)
			.setRotationPoint(-15.5f, -6, 2.5f).setRotationAngle(0, 0, 0)
		);
		cabin.add(new ModelRendererTurbo(cabin, 62, 21, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 1, 5, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-15.5f, -3, -2.5f).setRotationAngle(0, 0, 0)
		);
		cabin.add(new ModelRendererTurbo(cabin, 94, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, -10, 2.5f).setRotationAngle(0, 0, 0)
		);
		cabin.add(new ModelRendererTurbo(cabin, 111, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 6, 4, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0)
			.setRotationPoint(-15.5f, -6, -3.5f).setRotationAngle(0, 0, 0)
		);
		cabin.add(new ModelRendererTurbo(cabin, 77, 17, textureX, textureY)
			.addShapeBox(0, 0, 0, 7, 2, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
			.setRotationPoint(-16, -10, -3.5f).setRotationAngle(0, 0, 0)
		);
		cabin.add(new ModelRendererTurbo(cabin, 100, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0)
			.setRotationPoint(-17, -10, 2.5f).setRotationAngle(0, 0, 0)
		);
		cabin.add(new ModelRendererTurbo(cabin, 77, 28, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0)
			.setRotationPoint(-17, -10, -3.5f).setRotationAngle(0, 0, 0)
		);
		cabin.add(new ModelRendererTurbo(cabin, 95, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(-9, -10, 2.5f).setRotationAngle(0, 0, 0)
		);
		cabin.add(new ModelRendererTurbo(cabin, 90, 27, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 2, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.75f, 0, 0, -0.75f, 0, 0, 0, 0)
			.setRotationPoint(-9, -10, -3.5f).setRotationAngle(0, 0, 0)
		);
		cabin.add(new ModelRendererTurbo(cabin, 17, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 3, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -0.5f, 0, 0, -0.5f, 0, 0, 0, 0)
			.setRotationPoint(-15.5f, -2.25f, -2.5f).setRotationAngle(0, 0, 0)
		);
		cabin.addProgram(DefaultPrograms.RGB_PRIMARY);
		this.groups.add(cabin);
		//
		TurboList chimneys = new TurboList("chimneys");
		chimneys.add(new ModelRendererTurbo(chimneys, 80, 21, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1, 1, 4, null)
			.setRotationPoint(4.5f, -8.5f, 0).setRotationAngle(0, 0, 0)
		);
		chimneys.add(new ModelRendererTurbo(chimneys, 31, 12, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 1, 4, new net.fexcraft.lib.common.math.Vec3f(0.0, -0.5, 0.0))
			.setRotationPoint(4.5f, -9, 0).setRotationAngle(0, 0, 0)
		);
		chimneys.add(new ModelRendererTurbo(chimneys, 73, 7, textureX, textureY).addCylinder(0, 0, 0, 1, 2, 8, 1, 1, 4, null)
			.setRotationPoint(7.5f, -8.5f, 0).setRotationAngle(0, 0, 0)
		);
		chimneys.add(new ModelRendererTurbo(chimneys, 73, 0, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 8, 0.5f, 1, 4, new net.fexcraft.lib.common.math.Vec3f(0.0, -0.5, 0.0))
			.setRotationPoint(7.5f, -9, 0).setRotationAngle(0, 0, 0)
		);
		chimneys.add(new ModelRendererTurbo(chimneys, 105, 21, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 0.75f, 2, 8, 0, 1.25f, 1.25f, 4, null)
			.setRotationPoint(11.5f, -8.5f, 0).setRotationAngle(0, 0, 0)
		);
		chimneys.add(new ModelRendererTurbo(chimneys, 39, 0, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 0.75f, 1, 8, 0, 0.75f, 1.25f, 4, null)
			.setRotationPoint(11.5f, -9.5f, 0).setRotationAngle(0, 0, 0)
		);
		chimneys.add(new ModelRendererTurbo(chimneys, 100, 21, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 0.75f, 2, 8, 0, 0.75f, 0.75f, 4, null)
			.setRotationPoint(11.5f, -11.5f, 0).setRotationAngle(0, 0, 0)
		);
		chimneys.add(new ModelRendererTurbo(chimneys, 34, 0, textureX, textureY).addHollowCylinder(0, 0, 0, 1, 0.75f, 1, 8, 0, 1, 1, 4, null)
			.setRotationPoint(11.5f, -11.5f, 0).setRotationAngle(0, 0, 0)
		);
		this.groups.add(chimneys);
		//
		TurboList boiler = new TurboList("boiler");
		boiler.add(new ModelRendererTurbo(boiler, 0, 7, textureX, textureY).addCylinder(0, 0, 0, 3, 10, 9, 1.0625f, 1.0625f, 3, null)
			.setRotationPoint(-9.5f, -5.75f, 0).setRotationAngle(0, 0, 0)
		);
		boiler.add(new ModelRendererTurbo(boiler, 104, 0, textureX, textureY).addCylinder(0, 0, 0, 3, 1, 9, 0.875f, 0.5f, 3, null)
			.setRotationPoint(14.5f, -5.5f, 0).setRotationAngle(0, 0, 0)
		);
		boiler.add(new ModelRendererTurbo(boiler, 91, 0, textureX, textureY).addCylinder(0, 0, 0, 3, 4, 9, 1.0625f, 0.875f, 3, new net.fexcraft.lib.common.math.Vec3f(0.0, 0.25, 0.0))
			.setRotationPoint(0.5f, -5.75f, 0).setRotationAngle(0, 0, 0)
		);
		boiler.add(new ModelRendererTurbo(boiler, 78, 0, textureX, textureY).addCylinder(0, 0, 0, 3, 10, 9, 0.875f, 0.875f, 3, null)
			.setRotationPoint(4.5f, -5.5f, 0).setRotationAngle(0, 0, 0)
		);
		boiler.addProgram(DefaultPrograms.RGB_SECONDARY);
		this.groups.add(boiler);
		//
		TurboList lights_front_forward = new TurboList("lights_front_forward");
		lights_front_forward.add(new ModelRendererTurbo(lights_front_forward, 121, 26, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.75f, -0.125f, -0.125f, -0.75f, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, -0.75f, -0.375f, -0.125f)
			.setRotationPoint(15.375f, -4, -2.5f).setRotationAngle(0, 0, 0)
		);
		lights_front_forward.add(new ModelRendererTurbo(lights_front_forward, 0, 0, textureX, textureY).addCylinder(0, 0, 0, 1, 1, 9, 0.25f, 0.25f, 3, new net.fexcraft.lib.common.math.Vec3f(-0.875, 0.0, 0.0))
			.setRotationPoint(15.5f, -5.5f, 0).setRotationAngle(0, 0, 0)
		);
		lights_front_forward.addProgram(DefaultPrograms.LIGHTS_RAIL_FORWARD);
		this.groups.add(lights_front_forward);
		//
		TurboList lights_front_backward = new TurboList("lights_front_backward");
		lights_front_backward.add(new ModelRendererTurbo(lights_front_backward, 121, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, -0.75f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.125f, -0.125f, -0.75f, -0.125f, -0.125f, -0.75f, -0.375f, -0.125f, 0, -0.375f, -0.125f, 0, -0.375f, -0.125f, -0.75f, -0.375f, -0.125f)
			.setRotationPoint(15.375f, -4, 1.5f).setRotationAngle(0, 0, 0)
		);
		lights_front_backward.addProgram(DefaultPrograms.LIGHTS_RAIL_BACKWARD);
		this.groups.add(lights_front_backward);
		//
		TurboList lights_rear_forward = new TurboList("lights_rear_forward");
		lights_rear_forward.add(new ModelRendererTurbo(lights_rear_forward, 62, 23, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.75f, -0.125f, -0.125f, -0.75f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.375f, -0.125f, -0.75f, -0.375f, -0.125f, -0.75f, -0.375f, -0.125f, 0, -0.375f, -0.125f)
			.setRotationPoint(-15.625f, -4, -3.5f).setRotationAngle(0, 0, 0)
		);
		lights_rear_forward.addProgram(DefaultPrograms.LIGHTS_RAIL_FORWARD);
		this.groups.add(lights_rear_forward);
		//
		TurboList lights_rear_backward = new TurboList("lights_rear_backward");
		lights_rear_backward.add(new ModelRendererTurbo(lights_rear_backward, 36, 12, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 1, 1, 0, 0, -0.125f, -0.125f, -0.75f, -0.125f, -0.125f, -0.75f, -0.125f, -0.125f, 0, -0.125f, -0.125f, 0, -0.375f, -0.125f, -0.75f, -0.375f, -0.125f, -0.75f, -0.375f, -0.125f, 0, -0.375f, -0.125f)
			.setRotationPoint(-15.625f, -4, 2.5f).setRotationAngle(0, 0, 0)
		);
		lights_rear_backward.addProgram(DefaultPrograms.LIGHTS_RAIL_BACKWARD);
		this.groups.add(lights_rear_backward);
		//
	}

}
