//FMT-Marker FVTM-1.3
package net.fexcraft.mod.addon.pack5pxt.models.part;

import net.fexcraft.lib.mc.api.registry.fModel;
import net.fexcraft.lib.tmt.ModelRendererTurbo;
import net.fexcraft.mod.fvtm.model.ModelGroup;
import net.fexcraft.mod.fvtm.model.PartModel;

/** This file was exported via the FVTM Exporter V1.3 of<br>
 *  FMT (Fex's Modelling Toolbox) v.1.2.9 &copy; 2019 - Fexcraft.net<br>
 *  All rights reserved. For this Model's License contact the Author/Creator.
 */
@fModel(registryname = "5pxt:models/part/dirupgrade")
public class DirectionalUpgrade extends PartModel {

	public DirectionalUpgrade(){
		super(); textureX = 256; textureY = 256;
		//
		ModelGroup group0 = new ModelGroup("group0");
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY).addBox(0, 0, -1, 24, 2, 2)
			.setRotationPoint(-12, -8, 0).setRotationAngle(0, 0, 0).setTextured(false)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, -1, 12, 2, 2, 0, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0)
			.setRotationPoint(0, -5, 0).setRotationAngle(0, 0, 0).setTextured(false)
		);
		group0.add(new ModelRendererTurbo(group0, 0, 0, textureX, textureY)
			.addShapeBox(0, 0, -1, 12, 2, 2, 0, 0, 0, 0, 0, -3, 0, 0, -3, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 0, 0)
			.setRotationPoint(0, -11, 0).setRotationAngle(0, 0, 0).setTextured(false)
		);
		this.groups.add(group0);
	}

}
