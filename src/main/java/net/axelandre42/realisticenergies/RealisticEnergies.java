package net.axelandre42.realisticenergies;

import org.apache.logging.log4j.Logger;

import com.google.common.eventbus.Subscribe;

import net.axelandre42.realisticenergies.common.CommonProxy;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class RealisticEnergies
{
	private Logger log;
	
	@SidedProxy()
	public static CommonProxy proxy;
	
	@Subscribe
	public void preInit(FMLPreInitializationEvent event) {
		log = event.getModLog();
		log.info("Hello pre-initialization !");
		
	}
	
    @Subscribe
    public void init(FMLInitializationEvent event)
    {
    	log.info("Hello initialization !");
    }
    
    @Subscribe
    public void postInit(FMLPostInitializationEvent event) {
    	log.info("Hello post-initialization !");
    }
}
