package com.brayden.example;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class CustomSword extends ItemSword {
	super(ExampleMod.myToolMaterial);
	this.setRegistryName("my_sword");
	this.setUnlocalizedName("my_sword");
	this.setCreativeTab(CreativeTabs.COMBAT);
}
