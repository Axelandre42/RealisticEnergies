package net.axelandre42.realisticenergies.core.asm;

import java.io.File;
import java.util.Map;
import java.util.Set;

import net.minecraftforge.fml.relauncher.IFMLCallHook;
import scala.runtime.VolatileDoubleRef;

public class RECallHook implements IFMLCallHook {

	/**
	 * The location of the coremod, null if in dev env.
	 */
	private File coremodLocation;
	
	/**
	 * The location of Minecraft.
	 */
	private File mcLocation;
	
	@Override
	public Void call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {
		
		this.coremodLocation = (File) data.get("coremodLocation");	// Retrieving coremod location from data.
		this.mcLocation = (File) data.get("mcLocation");			// Retrieving Minecraft location from data.
	}

}
