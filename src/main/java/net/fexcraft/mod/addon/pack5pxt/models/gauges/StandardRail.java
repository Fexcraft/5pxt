//FMT-Marker FVTM-1.3
package net.fexcraft.mod.addon.pack5pxt.models.gauges;

import net.fexcraft.lib.common.math.Vec3f;
import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelBase;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.entity.JunctionSwitchEntity;
import net.fexcraft.mod.fvtm.model.RailGaugeModel;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.fexcraft.mod.fvtm.sys.rail.Junction;
import net.minecraft.util.ResourceLocation;

/** This file was exported via the FVTM Exporter V1.3 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.9 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "5pxt:models/gauges/standard")
public class StandardRail extends RailGaugeModel {
	
	private TurboList single_switch;
	private static final ResourceLocation sstex = new ResourceLocation("pack5pxt:textures/rails/single_switch.png");//TEMPORARY

	public StandardRail(){
		super(); textureX = 16; textureY = 16;
		this.addToCreators("Ferdinand (FEX___96)");
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
		//
		single_switch = new TurboList("single_switch");
		single_switch.add(new ModelRendererTurbo(single_switch, 2, 3, 16, 8).addBox(0, 0, 0, 3, 1, 4)
			.setRotationPoint(-1.5f, -1, -2).setRotationAngle(0, 0, 0)
		);
		single_switch.add(new ModelRendererTurbo(single_switch, 0, 0, 16, 8).addBox(0, -1.5f, -0.5f, 2, 2, 1)
			.setRotationPoint(-1, -1, 0).setRotationAngle(0, 0, 0)
		);
		this.groups.add(single_switch);
	}
	
	@Override
	public void renderSwitch(JunctionSwitchEntity entity, Junction junction){
		single_switch.get(1).rotationAngleX = junction.switch0 ? -80 : 80;
		ModelBase.bindTexture(sstex); single_switch.renderPlain();
	}

}
