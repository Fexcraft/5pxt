//FMT-Marker FVTM-1.3
package net.fexcraft.mod.addon.pack5pxt.models.gauges;

import net.fexcraft.lib.common.Static;
import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.DefaultPrograms;
import net.fexcraft.mod.fvtm.model.ModelGroup;
import net.fexcraft.mod.fvtm.model.RailGaugeModel;
import net.fexcraft.mod.fvtm.sys.rail.EntryDirection;
import net.fexcraft.mod.fvtm.sys.rail.Junction;
import net.fexcraft.mod.fvtm.sys.rail.signals.SignalType;

/** This file was exported via the FVTM Exporter V1.3 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.9 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "5pxt:models/gauges/standard")
public class StandardRail extends RailGaugeModel {
	
	public ModelGroup double_base, double_lever0, double_lever1;
	public ModelGroup simple_signal_base, simple_signal_stop, simple_signal_clear;
	public ModelGroup fork2_lever, fork2_base, fork3_lever, fork3_base;

	public StandardRail(){
		super(); tex_width = 64; tex_height = 32;
		this.addToCreators("Ferdinand (FEX___96)");
		//
		this.ties_distance = 0.25f;
		this.buffer_length = 0.4f;
		this.signal_offset = 0.45f;
		this.addRailRect(Static.sixteenth, 2.5f, 1.5f, 0.5f, 0.5f, true);
		ModelGroup ties = new ModelGroup("ties");
		ties.add(new ModelRendererTurbo(ties, 0, 0, tex_width, tex_height)
			.addShapeBox(-0.5f, 0, -5, 1, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, -1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(0, -1, 0).setRotationAngle(0, 0, 0).setName("ties_uni_piece")
		);
		this.groups.add(ties);
		//
		double_base = new ModelGroup("double_base");
		double_base.add(new ModelRendererTurbo(double_base, 13, 0, tex_width, tex_height).addBox(0, 0, 0, 6, 1, 4)
			.setRotationPoint(-3, -1, -2).setRotationAngle(0, 0, 0)
		);
		this.groups.add(double_base);
		//
		double_lever0 = new ModelGroup("double_lever0");
		double_lever0.add(new ModelRendererTurbo(double_lever0, 20, 6, tex_width, tex_height).addBox(0, -1.5f, -0.5f, 2, 2, 1)
			.setRotationPoint(-2.5f, -1, 0).setRotationAngle(0, 0, 0)
		);
		this.groups.add(double_lever0);
		//
		double_lever1 = new ModelGroup("double_lever1");
		double_lever1.add(new ModelRendererTurbo(double_lever1, 45, 0, tex_width, tex_height).addBox(0, -1.5f, -0.5f, 2, 2, 1)
			.setRotationPoint(0.5f, -1, 0).setRotationAngle(0, 0, 0)
		);
		this.groups.add(double_lever1);
		//
		fork2_base = new ModelGroup("fork2_base");
		fork2_base.add(new ModelRendererTurbo(fork2_base, 49, 0, tex_width, tex_height).addBox(0, 0, 0, 3, 1, 4)
			.setRotationPoint(-1.5f, -1, -2).setRotationAngle(0, 0, 0)
		);
		this.groups.add(fork2_base);
		//
		fork2_lever = new ModelGroup("fork2_lever");
		fork2_lever.add(new ModelRendererTurbo(fork2_lever, 30, 0, tex_width, tex_height).addBox(0, -1.5f, -0.5f, 2, 2, 1)
			.setRotationPoint(-1, -1, 0).setRotationAngle(0, 0, 0)
		);
		this.groups.add(fork2_lever);
		//
		fork3_base = new ModelGroup("fork3_base");
		fork3_base.add(new ModelRendererTurbo(fork3_base, 34, 0, tex_width, tex_height).addBox(0, 0, 0, 3, 1, 4)
			.setRotationPoint(-1.5f, -1, -2).setRotationAngle(0, 0, 0)
		);
		this.groups.add(fork3_base);
		//
		fork3_lever = new ModelGroup("fork3_lever");
		fork3_lever.add(new ModelRendererTurbo(fork3_lever, 0, 0, tex_width, tex_height).addCylinder(0, 0, 0, 3, 2, 3, 0.5f, 0.5f, 3, null)
			.setRotationPoint(-1, -1, 0).setRotationAngle(0, 0, 0)
		);
		this.groups.add(fork3_lever);
		//
		simple_signal_base = new ModelGroup("simple_signal_base");
		simple_signal_base.add(new ModelRendererTurbo(simple_signal_base, 37, 6, tex_width, tex_height).addBox(0, 0, 0, 1, 8, 1)
			.setRotationPoint(-0.5f, -8, -0.5f).setRotationAngle(0, 0, 0)
		);
		simple_signal_base.add(new ModelRendererTurbo(simple_signal_base, 13, 6, tex_width, tex_height).addBox(0, 0, 0, 2, 3, 1)
			.setRotationPoint(-1, -9, -0.625f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(simple_signal_base);
		//
		simple_signal_clear = new ModelGroup("simple_signal_clear");
		simple_signal_clear.add(new ModelRendererTurbo(simple_signal_clear, 32, 6, tex_width, tex_height).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-0.5f, -7.25f, -0.75f).setRotationAngle(0, 0, 0)
		);
		simple_signal_clear.addProgram(DefaultPrograms.ALWAYS_GLOW);
		this.groups.add(simple_signal_clear);
		//
		simple_signal_stop = new ModelGroup("simple_signal_stop");
		simple_signal_stop.add(new ModelRendererTurbo(simple_signal_stop, 27, 6, tex_width, tex_height).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-0.5f, -8.75f, -0.75f).setRotationAngle(0, 0, 0)
		);
		simple_signal_stop.addProgram(DefaultPrograms.ALWAYS_GLOW);
		this.groups.add(simple_signal_stop);
		//
		ModelGroup buffer = new ModelGroup("buffer");
		buffer.add(new ModelRendererTurbo(buffer, 32, 9, tex_width, tex_height).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(1.5f, -4.25f, 0).setRotationAngle(0, 0, 0)
		);
		buffer.add(new ModelRendererTurbo(buffer, 27, 9, tex_width, tex_height).addBox(0, 0, 0, 1, 1, 1)
			.setRotationPoint(-2.5f, -4.25f, 0).setRotationAngle(0, 0, 0)
		);
		buffer.add(new ModelRendererTurbo(buffer, 42, 6, tex_width, tex_height)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(2.25f, -4.25f, 1).setRotationAngle(0, 0, 0)
		);
		buffer.add(new ModelRendererTurbo(buffer, 47, 6, tex_width, tex_height)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1)
			.setRotationPoint(-3.25f, -4.25f, 1).setRotationAngle(0, 0, 0)
		);
		buffer.add(new ModelRendererTurbo(buffer, 52, 6, tex_width, tex_height)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, 5, 0, 0, 5)
			.setRotationPoint(2.25f, -4.25f, 1).setRotationAngle(0, 0, 0)
		);
		buffer.add(new ModelRendererTurbo(buffer, 57, 6, tex_width, tex_height)
			.addShapeBox(0, 0, 0, 1, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, 0, -5, 0, 0, 5, 0, 0, 5)
			.setRotationPoint(-3.25f, -4.25f, 1).setRotationAngle(0, 0, 0)
		);
		buffer.add(new ModelRendererTurbo(buffer, 0, 11, tex_width, tex_height).addBox(0, 0, 0, 7, 2, 1)
			.setRotationPoint(-3.5f, -4.75f, 0.5f).setRotationAngle(0, 0, 0)
		);
		this.groups.add(buffer);
	}

	/*@Override
	public void renderDoubleSwitch(JunctionSwitchEntity entity, Junction junction){
		double_base.renderPlain();
		double_lever0.get(0).rotationAngleX = junction.switch0 ? -80 : 80;
		double_lever0.renderPlain();
		double_lever1.get(0).rotationAngleX = junction.switch1 ? -80 : 80;
		double_lever1.renderPlain();
	}

	@Override
	public void renderFork2Switch(JunctionSwitchEntity entity, Junction junction){
		fork2_base.renderPlain();
		fork2_lever.get(0).rotationAngleX = junction.switch0 ? -80 : 80;
		fork2_lever.renderPlain();
	}

	@Override
	public void renderFork3Switch(JunctionSwitchEntity entity, Junction junction){
		fork3_base.renderPlain();
		fork3_lever.get(0).rotationAngleX = junction.switch0 ? -120 : junction.switch1 ? 120 : 0;
		fork3_lever.renderPlain();
	}*/

	@Override
	public void renderSignal(Junction junction, EntryDirection dir, boolean state){
		if(junction.signal == null || junction.signal.type != SignalType.Kind.BLOCK) return;
		simple_signal_base.render();
		if(!state) simple_signal_stop.render(RENDERDATA.clear());
		if(state) simple_signal_clear.render(RENDERDATA.clear());
	}

}
