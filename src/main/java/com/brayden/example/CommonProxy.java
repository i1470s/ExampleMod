package com.brayden.example;

import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(ExampleMod.mySword);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, ModelResourseLocation( item.getRegistryName(), "inventory"));
	}
	
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ExampleMod.mySword);
	}
}
