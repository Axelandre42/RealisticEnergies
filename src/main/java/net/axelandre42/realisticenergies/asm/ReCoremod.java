package net.axelandre42.realisticenergies.asm;

import java.io.File;
import java.util.Map;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.MCVersion;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.Name;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.TransformerExclusions;

@Name("Realistic Energies Coremod")
@MCVersion("1.10")
@TransformerExclusions({"package net.axelandre42.realisticenergies.asm"})
public class ReCoremod implements IFMLLoadingPlugin {

	public static File coremodLocation;
	
	@Override
	public String[] getASMTransformerClass() {
		return null;
	}

	@Override
	public String getModContainerClass() {
		return "net.axelandre42.realisticenergies.asm.ReModContainer";
	}

	@Override
	public String getSetupClass() {
		// TODO Create setup class.
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {
		// TODO Retrieve data.
		this.coremodLocation = (File) data.get("coremodLocation");
	}

	@Override
	public String getAccessTransformerClass() {
		return null;
	}

}
