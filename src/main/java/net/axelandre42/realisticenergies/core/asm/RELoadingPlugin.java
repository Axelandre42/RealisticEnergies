package net.axelandre42.realisticenergies.core.asm;

import java.util.Map;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

public class RELoadingPlugin implements IFMLLoadingPlugin {

	@Override
	public String[] getASMTransformerClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getModContainerClass() {
		return "net.axelandre42.realisticenergies.core.asm.REModContainer";
	}

	@Override
	public String getSetupClass() {
		return "net.axelandre42.realisticenergies.core.asm.RECallHook";
	}

	@Override
	public void injectData(Map<String, Object> data) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAccessTransformerClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
