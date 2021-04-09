//FMT-Marker FVTM-1.3
package net.fexcraft.mod.addon.pack5pxt.models.gauges;

import net.fexcraft.lib.common.Static;
import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.entity.JunctionSwitchEntity;
import net.fexcraft.mod.fvtm.model.RailGaugeModel;
import net.fexcraft.mod.fvtm.model.TurboList;
import net.fexcraft.mod.fvtm.sys.rail.Junction;

/** This file was exported via the FVTM Exporter V1.3 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.9 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "5pxt:models/gauges/standard")
public class StandardRail extends RailGaugeModel {

	public StandardRail(){
		super(); textureX = 64; textureY = 32;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		this.ties_distance = 0.25f;
		this.buffer_length = 0.4f;
		this.addRailRect(Static.sixteenth, 2.5f, 1.5f, 0.5f, 0.5f, true);
		TurboList ties = new TurboList("ties");
		ties.add(new ModelRendererTurbo(ties, 0, 0, textureX, textureY)
			.addShapeBox(-0.5f, 0, -5, 1, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(0, -1, 0).setRotationAngle(0, 0, 0).setName("ties_uni_piece")
		);
		this.groups.add(ties);
		//
		double_base = new TurboList("double_base");
		double_base.add(new ModelRendererTurbo(double_base, 13, 0, textureX, textureY).addBox(0, 0, 0, 6, 1, 4)
			.setRotationPoint(-3, -1, -2).setRotationAngle(0, 0, 0)
		);
		this.groups.add(double_base);
		//
		double_lever0 = new TurboList("double_lever0");
		double_lever0.add(new ModelRendererTurbo(double_lever0, 20, 6, textureX, textureY).addBox(0, -1.5f, -0.5f, 2, 2, 1)
			.setRotationPoint(-2.5f, -1, 0).setRotationAngle(0, 0, 0)
		);
		this.groups.add(double_lever0);
		//
		double_lever1 = new TurboList("double_lever1");
		double_lever1.add(new ModelRendererTurbo(double_lever1, 45, 0, textureX, textureY).addBox(0, -1.5f, -0.5f, 2, 2, 1)
			.setRotationPoint(0.5f, -1, 0).setRotationAngle(0, 0, 0)
		);
		this.groups.add(double_lever1);
		//
		fork2_base = new TurboList("fork2_base");
		fork2_base.add(new ModelRendererTurbo(fork2_base, 49, 0, textureX, textureY).addBox(0, 0, 0, 3, 1, 4)
			.setRotationPoint(-1.5f, -1, -2).setRotationAngle(0, 0, 0)
		);
		this.groups.add(fork2_base);
		//
		fork2_lever = new TurboList("fork2_lever");
		fork2_lever.add(new ModelRendererTurbo(fork2_lever, 30, 0, textureX, textureY).addBox(0, -1.5f, -0.5f, 2, 2, 1)
			.setRotationPoint(-1, -1, 0).setRotationAngle(0, 0, 0)
		);
		this.groups.add(fork2_lever);
		//
		fork3_base = new TurboList("fork3_base");
		fork3_base.add(new ModelRendererTurbo(fork3_base, 34, 0, textureX, textureY).addBox(0, 0, 0, 3, 1, 4)
			.setRotationPoint(-1.5f, -1, -2).setRotationAngle(0, 0, 0)
		);
		this.groups.add(fork3_base);
		//
		fork3_lever = new TurboList("fork3_lever");
		fork3_lever.add(new ModelRendererTurbo(fork3_lever, 0, 0, textureX, textureY).addCylinder(0, 0, 0, 3, 2, 3, 0.5f, 0.5f, 3, null)
			.setRotationPoint(-1, -1, 0).setRotationAngle(0, 0, 0)
		);
		this.groups.add(fork3_lever);
		//
		simple_signal_base = new TurboList("simple_signal_base");
		simple_signal_base.add(new ModelRendererTurbo(simple_signal_base, 37, 6, textureX, textureY).addBox(0, 0, 0, 1, 8, 1)
			.setRotationPoint(-0.5f, -8, -0.5f).setRotationAngle(0, 0, 0)
		);
		simple_signal_base.add(new ModelRendererTurbo(simple_signal_base, 13, 6, textureX, textureY).addBox(0, 0, 0, 2, 3, 1)
			.setRotationPoint(-1, -9, -0.625f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(simple_signal_base);
		//
		simple_signal_clear = new TurboList("simple_signal_clear");
		simple_signal_clear.add(new ModelRendererTurbo(simple_signal_clear, 32, 6, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-0.5f, -7.25f, -0.75f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(simple_signal_clear);
		//
		simple_signal_stop = new TurboList("simple_signal_stop");
		simple_signal_stop.add(new ModelRendererTurbo(simple_signal_stop, 27, 6, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-0.5f, -8.75f, -0.75f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(simple_signal_stop);
		//
		TurboList buffer = new TurboList("buffer");
		buffer.add(new ModelRendererTurbo(buffer, 32, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(1.5f, -4.25f, 0).setRotationAngle(0, 0, 0)
		);
		buffer.add(new ModelRendererTurbo(buffer, 27, 9, textureX, textureY).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-2.5f, -4.25f, 0).setRotationAngle(0, 0, 0)
		);
		buffer.add(new ModelRendererTurbo(buffer, 42, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(2.25f, -4.25f, 1).setRotationAngle(0, 0, 0)
		);
		buffer.add(new ModelRendererTurbo(buffer, 47, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-3.25f, -4.25f, 1).setRotationAngle(0, 0, 0)
		);
		buffer.add(new ModelRendererTurbo(buffer, 52, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, 5, 0, 0, 5)
			.setRotationPoint(2.25f, -4.25f, 1).setRotationAngle(0, 0, 0)
		);
		buffer.add(new ModelRendererTurbo(buffer, 57, 6, textureX, textureY)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, 5, 0, 0, 5)
			.setRotationPoint(-3.25f, -4.25f, 1).setRotationAngle(0, 0, 0)
		);
		buffer.add(new ModelRendererTurbo(buffer, 0, 11, textureX, textureY).addBox(0, 0, 0, 7, 2, 1)
			.setRotationPoint(-3.5f, -4.75f, 0.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(buffer);
	}
	
	@Override
	public void renderSwitch(JunctionSwitchEntity entity, Junction junction){
		switch(junction.type){
			case DOUBLE:{
				double_base.renderPlain();
				double_lever0.get(0).rotationAngleX = junction.switch0 ? -80 : 80;
				double_lever0.renderPlain();
				double_lever1.get(0).rotationAngleX = junction.switch1 ? -80 : 80;
				double_lever1.renderPlain();
				break;
			}
			case FORK_2:{
				fork2_base.renderPlain();
				fork2_lever.get(0).rotationAngleX = junction.switch0 ? -80 : 80;
				fork2_lever.renderPlain();
				break;
			}
			case FORK_3:{
				fork3_base.renderPlain();
				fork3_lever.get(0).rotationAngleX = junction.switch0 ? -120 : junction.switch1 ? 120 : 0;
				fork3_lever.renderPlain();
				break;
			}
			case CROSSING: case STRAIGHT: default: return;
		}
	}

}
