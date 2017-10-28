package net.eldariel23.tutorial;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Tutorial.MOD_ID, name = Tutorial.MOD_NAME, version = Tutorial.VERSION, dependencies = Tutorial.DEPENDENCIES)
public class Tutorial {

	//Constants
	public static final String MOD_ID = "tutorial";
	public static final String MOD_NAME = "Eldariel learns to code";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDENCIES = "required-after: forge@[14.23.0.2491,)";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";
	
	//Variables
	public static Random random = new Random();
	
	@Instance(MOD_ID)
	public static Tutorial instance;
	
	@SidedProxy(clientSide = "net.eldariel23.tutorial.ClientProxy", serverSide = "net.eldariel23.tutorial.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		proxy.postInit(event);
	}
	
	
}
